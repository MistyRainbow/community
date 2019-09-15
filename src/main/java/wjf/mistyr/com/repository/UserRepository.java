package wjf.mistyr.com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import wjf.mistyr.com.domain.User;

import java.util.List;

/**
 * @Author wjf
 * @date 2019/8/30 14:06
 */
public interface UserRepository extends JpaRepository<User,Integer> {
   User findByUsernameAndPassword(String username,String password);
}
