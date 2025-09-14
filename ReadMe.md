# Spring Boot Notification System

## Overview
This project demonstrates a simple **Notification System** using **Spring Boot** and the principles of **Inversion of Control (IoC)** and **Dependency Injection (DI)**.  
The system supports multiple notification channels (Email and SMS) and allows swapping implementations without changing the core application logic.

Notifications are **simulated** using `System.out.println()` statements (no real messages are sent).

---

## Features
- **Interface-based design** with `NotificationService`
- **Two implementations**:
    - `EmailNotificationService` (default / primary)
    - `SMSNotificationService` (can be selected with `@Qualifier("sms")`)
- **NotificationManager** class to handle notifications
- **Spring IoC** manages bean creation and injection
- Configurable **server port**

---

## Technologies Used
- Java 21
- Spring Boot 3
- Maven
- IntelliJ IDEA 2025

---

