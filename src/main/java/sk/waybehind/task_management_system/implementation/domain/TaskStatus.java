package sk.waybehind.task_management_system.implementation.domain;

public enum TaskStatus {
    NEW,
    DONE;

    public static TaskStatus statusFromString(String status) {
        return switch (status) {
            case "NEW" -> NEW;
            case "DONE" -> DONE;
            default -> throw new IllegalArgumentException("Unknown task status" + status);
        };
    }
}
