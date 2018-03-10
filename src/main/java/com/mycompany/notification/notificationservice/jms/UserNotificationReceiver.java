/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.notification.notificationservice.jms;

import com.mycompany.notification.notificationservice.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserNotificationReceiver {

    private static final Logger LOG = LoggerFactory.getLogger(UserNotificationReceiver.class);

    @JmsListener(destination = "user-notification-queue")
    public void receiveMessage(UserDto userDto){
        LOG.info("Received user notification message from user-notification-queue");

        // TODO here we're going to process however we like
        // not going to implement this part - leaving it as future work to do
    }
}
