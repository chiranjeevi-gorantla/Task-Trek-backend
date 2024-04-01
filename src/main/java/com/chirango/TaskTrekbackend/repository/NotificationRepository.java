package com.chirango.TaskTrekbackend.repository;

import com.chirango.TaskTrekbackend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
