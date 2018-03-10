/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.notification.notificationservice.jms;

import com.mycompany.notification.notificationservice.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserNotificationReceiver {

    @JmsListener(destination = "${notification.user.queue.name}")
    public void receiveMessage(UserDto userDto){
        log.info("Received user notification message from user notification queue");

        // TODO here we're going to process however we like
        // not going to implement this part - leaving it as future work to do
        // for now just log it

        log.info("Received: {}", userDto);
    }
}
