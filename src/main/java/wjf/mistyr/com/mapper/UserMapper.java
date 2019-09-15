package wjf.mistyr.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import wjf.mistyr.com.domain.User;

import java.util.List;

/**
 * @Author wjf
 * @date 2019/8/29 20:31
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
