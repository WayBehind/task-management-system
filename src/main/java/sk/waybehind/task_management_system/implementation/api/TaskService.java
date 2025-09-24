package sk.waybehind.task_management_system.implementation.api;

import sk.waybehind.task_management_system.implementation.api.request.TaskAddRequest;
import sk.waybehind.task_management_system.implementation.api.request.TaskEditRequest;
import sk.waybehind.task_management_system.implementation.domain.Task;
import sk.waybehind.task_management_system.implementation.domain.TaskStatus;

import java.util.List;

public interface TaskService {
    long add(TaskAddRequest request);

    Task get(long id);

    List<Task> getAll();

    List<Task> getAllByUser(long userId);

    List<Task> getAllByProject(long projectId);

    void edit(TaskEditRequest request);

    void changeStatus(long id, TaskStatus status);

    void assignProject(long id, long projectId);

    void delete(long id);
}
