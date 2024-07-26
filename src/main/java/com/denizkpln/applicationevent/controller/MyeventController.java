package com.denizkpln.applicationevent.controller;


import com.denizkpln.applicationevent.event.configuration.ExecutersServiceMy;
import com.denizkpln.applicationevent.event.configuration.MyAsyncEvent;
import com.denizkpln.applicationevent.event.configuration.MyEvent;
import com.denizkpln.applicationevent.event.configuration.YourEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trigger")
@Slf4j
public class MyeventController {

    private final ApplicationEventPublisher publisher;
    private final ExecutersServiceMy executersServiceMy;

    public MyeventController(ApplicationEventPublisher publisher, ExecutersServiceMy executersServiceMy) {
        this.publisher = publisher;
        this.executersServiceMy = executersServiceMy;
    }

    @GetMapping
    public ResponseEntity<String> trigger() {
        publisher.publishEvent(new MyEvent(this, "message" ));
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/listener")
    public ResponseEntity<String> triggerListener() {
        log.info("başladı");
        publisher.publishEvent(new YourEvent(this, "message" ));
        log.info("async bitti");
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/listener/async")
    public ResponseEntity<String> triggerListenerAsync() {
        log.info("başladı");
        executersServiceMy.executersService().execute(() -> publisher.publishEvent(new MyAsyncEvent(this, "message" )));
       log.info("async bitti");
        return ResponseEntity.ok("Hello World");
    }
}
