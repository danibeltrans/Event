package event.server.Event.Service.Impl;

import event.server.Event.Domain.User;
import event.server.Event.repository.UserRepository;
import event.server.Event.Domain.Enum.RoleEnum;
import event.server.Event.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User create(User user) {
        user.setIdRole(RoleEnum.USER.getIndex());
        User persistedUser = userRepository.save(user);
        return persistedUser;
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
