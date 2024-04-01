package com.chirango.TaskTrekbackend.service.impl;

import com.chirango.TaskTrekbackend.entity.Notification;
import com.chirango.TaskTrekbackend.repository.NotificationRepository;
import com.chirango.TaskTrekbackend.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification sendNotification(Notification notification) {
        return saveNotification(notification);
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

}
