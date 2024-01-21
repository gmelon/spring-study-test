package dev.gmelon.springstudytest.event_transaction.service;

import dev.gmelon.springstudytest.event_transaction.domain.EventRepository;
import dev.gmelon.springstudytest.event_transaction.dto.EventDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventSender {
    private final EventRepository eventRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void saveAndSend() {
        EventDto eventDto = new EventDto("이벤트 내용");

        log.info("Event 저장");
        eventRepository.save(eventDto.toEntity());

        log.info("Event 발행");
        eventPublisher.publishEvent(eventDto);
    }
}
