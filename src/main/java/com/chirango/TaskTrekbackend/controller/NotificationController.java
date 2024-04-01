package com.chirango.TaskTrekbackend.controller;

import com.chirango.TaskTrekbackend.entity.Notification;
import com.chirango.TaskTrekbackend.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notifications")
    public Notification sendNotification(@RequestBody Notification notification) {
        return notificationService.sendNotification(notification);
    }

    @PostMapping("/notificationtest")
    public String sendTestNotification() {
        return notificationService.sendTestNotification();
    }


}
