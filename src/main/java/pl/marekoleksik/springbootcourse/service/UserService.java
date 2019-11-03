package pl.marekoleksik.springbootcourse.service;

import pl.marekoleksik.springbootcourse.model.UserDTO;
import pl.marekoleksik.springbootcourse.persistence.model.User;
import pl.marekoleksik.springbootcourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}
