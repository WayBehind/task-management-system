package sk.waybehind.task_management_system.domain;

import lombok.Value;

import java.time.OffsetDateTime;

@Value
public class User {
    long id;
    String name;
    String email;
    OffsetDateTime createdAt;
}