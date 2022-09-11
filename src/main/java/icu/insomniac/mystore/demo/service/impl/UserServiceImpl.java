package icu.insomniac.mystore.demo.service.impl;

import icu.insomniac.mystore.demo.model.User;
import icu.insomniac.mystore.demo.dao.UserDao;
import icu.insomniac.mystore.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kelex
 * @since 2022-09-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
