package sk.waybehind.task_management_system.api;

import sk.waybehind.task_management_system.api.request.UserAddRequest;
import sk.waybehind.task_management_system.domain.User;

import java.util.List;

public interface UserService {
    long add(UserAddRequest request);

    User get(long id);

    List<User> getAll();

    void delete(long id);
}
