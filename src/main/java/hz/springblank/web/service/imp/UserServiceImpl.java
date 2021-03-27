package hz.springblank.web.service.imp;


import org.springframework.stereotype.Service;

import hz.springblank.web.model.User;
import hz.springblank.web.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    // @Autowired
    // private UserDao userDao;

    @Override
    public User selectUserById(Integer id) {
        // return userDao.selectUserById(id);
        User user = new User();
        user.setId(1);;
        user.setName("hz");
        return user;
    }
}
