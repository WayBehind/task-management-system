package domain;

import java.time.OffsetDateTime;

public class User {
    private final long id;
    private final String name;
    private final String email;
    private final OffsetDateTime createdAt;

    public User(long id, String name, String email, OffsetDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }
}
