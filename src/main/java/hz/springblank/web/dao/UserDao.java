package hz.springblank.web.dao;


import org.apache.ibatis.annotations.Mapper;

import hz.springblank.web.model.User;


@Mapper
public interface UserDao {
    public User selectUserById(Integer id);
}
