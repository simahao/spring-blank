package hz.springblank.web.service;

import org.springframework.stereotype.Service;

import hz.springblank.web.model.User;

@Service
public interface UserService {
    public User selectUserById(Integer id);
}
