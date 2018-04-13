package event.server.Event.Service;

import event.server.Event.Domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User create (User user);
    User find (Long id);
    User update (User user);
    void delete (Long id);
}
