package sk.waybehind.task_management_system.api;

import sk.waybehind.task_management_system.api.request.TaskAddRequest;
import sk.waybehind.task_management_system.api.request.TaskEditRequest;
import sk.waybehind.task_management_system.domain.Task;
import sk.waybehind.task_management_system.domain.TaskStatus;

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
