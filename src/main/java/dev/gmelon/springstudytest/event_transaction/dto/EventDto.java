package dev.gmelon.springstudytest.event_transaction.dto;

import dev.gmelon.springstudytest.event_transaction.domain.EventRecord;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class EventDto {
    private String value;

    public EventRecord toEntity() {
        return EventRecord.builder()
                .content(value)
                .build();
    }
}
