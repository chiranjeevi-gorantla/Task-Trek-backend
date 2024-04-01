package com.chirango.TaskTrekbackend.service;

import com.chirango.TaskTrekbackend.entity.Notification;

public interface NotificationService {
    Notification sendNotification(Notification notification);

    Notification saveNotification(Notification notification);
}
