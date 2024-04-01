package com.chirango.TaskTrekbackend.service.impl;

import com.chirango.TaskTrekbackend.entity.Notification;
import com.chirango.TaskTrekbackend.repository.NotificationRepository;
import com.chirango.TaskTrekbackend.service.NotificationService;
import com.chirango.TaskTrekbackend.util.Constants;
import org.simplejavamail.api.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;
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

    @Override
    public String sendTestNotification() {
        Email email = EmailBuilder.startingBlank()
                .from("TaskTrek", Constants.FROM_EMAIL)
                .to("Me", Constants.TO_EMAIL1)
                .withSubject(Constants.EMAIL_SUBJECT)
                .withPlainText("Hello User!")
                .withHTMLText("<p>Hello Satheesh,<br>" +
                        "<br>" +
                        "Here’s the cooking schedule for the upcoming week.<br>" +
                        "1. Monday - Date - User1 - Dish1<br>" +
                        "2. Tuesday - Date - User2 - Dish2<br>" +
                        "3. Wednesday - Date - User3 - Dish3<br>" +
                        "4. Thursday - Date - User4 - Dish4<br>" +
                        "5. Friday - Date - User5 - Dish5<br>" +
                        "6. Saturday - Date - User6 - Dish6<br>" +
                        "7. Sunday - Date - User7 - Dish7<br>" +
                        "<br>" +
                        "Please review your assignment and ensure you are prepared for your cooking activities accordingly.<br>" +
                        "If you have any questions or concerns, reach out to <a href=\"mailto:tasktrek.app@gmail.com\">tasktrek.app@gmail.com</a><br>" +
                        "<br>" +
                        "Thank You,<br>" +
                        "TaskTrek</p><br>")
                .buildEmail();

        MailerBuilder
                .withSMTPServer(Constants.SMTP_SERVER, Constants.SMTP_PORT, Constants.SMTP_USERNAME, Constants.SMTP_PASSWORD)
                .buildMailer()
                .sendMail(email);
        return "Email Sent Successfully!";
    }

}
