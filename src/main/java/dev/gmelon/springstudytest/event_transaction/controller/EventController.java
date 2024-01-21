package dev.gmelon.springstudytest.event_transaction.controller;

import dev.gmelon.springstudytest.event_transaction.service.EventSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EventController {
    private final EventSender eventSender;

    @PostMapping("/event/send")
    public ResponseEntity<String> sendAndSave() {
        eventSender.saveAndSend();
        return ResponseEntity.ok("OK");
    }
}
