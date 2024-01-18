package com.schoolManagementSystem.notificationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @GetMapping("/")
    public String getMessage() {
        return "Notification microservice basic endpoint";
    }
}
