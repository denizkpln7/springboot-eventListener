package com.denizkpln.applicationevent.event.listener;

import com.denizkpln.applicationevent.event.configuration.MyEvent;
import com.denizkpln.applicationevent.event.configuration.YourEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class YourEventListener  {

    private final ConfigurableApplicationContext configurableApplicationContext;


    @EventListener
    public void onApplicationEvent(YourEvent event) {
//       log.info("MyEventListener received event: {}", event.getMessage());
//       configurableApplicationContext.close();
        log.info("bitti");
    }

}
