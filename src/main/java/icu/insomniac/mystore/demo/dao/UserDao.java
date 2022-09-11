package icu.insomniac.mystore.demo.dao;

import icu.insomniac.mystore.demo.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kelex
 * @since 2022-09-10
 */
@Repository
public interface UserDao extends BaseMapper<User> {

}
