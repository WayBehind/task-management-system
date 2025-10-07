package sk.waybehind.task_management_system.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.waybehind.task_management_system.domain.TaskStatus;

public class TaskEditRequest {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class TaskAddRequest {
        private String name;
        private String description;
        private TaskStatus status;
    }
}