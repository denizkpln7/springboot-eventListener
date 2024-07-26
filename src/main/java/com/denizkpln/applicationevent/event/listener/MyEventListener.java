package com.denizkpln.applicationevent.event.listener;

import com.denizkpln.applicationevent.event.configuration.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class MyEventListener implements ApplicationListener<MyEvent> {

    private final ConfigurableApplicationContext configurableApplicationContext;

    @Override
    public void onApplicationEvent(MyEvent event) {
       log.info("MyEventListener received event: {}", event.getMessage());
       configurableApplicationContext.close();
    }

    @Override
    public boolean supportsAsyncExecution() {
        return ApplicationListener.super.supportsAsyncExecution();
    }
}
