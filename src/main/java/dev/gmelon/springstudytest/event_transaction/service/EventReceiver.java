package dev.gmelon.springstudytest.event_transaction.service;

import dev.gmelon.springstudytest.event_transaction.dto.EventDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventReceiver {
    @Transactional
    @EventListener(EventDto.class)
    public void receive() {
        log.info("EventReceiver 호출");

        throw new RuntimeException("EventReceiver Exception");
    }
}
