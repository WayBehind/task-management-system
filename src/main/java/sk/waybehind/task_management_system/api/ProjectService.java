package sk.waybehind.task_management_system.api;

import sk.waybehind.task_management_system.api.request.ProjectAddRequest;
import sk.waybehind.task_management_system.api.request.ProjectEditRequest;
import sk.waybehind.task_management_system.domain.Project;

import java.util.List;

public interface ProjectService {
    long add(ProjectAddRequest request);

    Project get(long id);

    List<Project> getAll();

    List<Project> getAllByUser(long userId);

    void edit(long id, ProjectEditRequest request);

    void delete(long id);
}
