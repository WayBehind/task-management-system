package sk.waybehind.task_management_system.implementation.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEditRequest {
    private String name;
    private String description;
}
