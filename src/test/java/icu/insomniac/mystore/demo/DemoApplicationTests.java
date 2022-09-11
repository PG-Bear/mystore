package icu.insomniac.mystore.demo;

import icu.insomniac.mystore.demo.dao.GoodsDao;
import icu.insomniac.mystore.demo.dao.UserDao;
import icu.insomniac.mystore.demo.model.Goods;
import icu.insomniac.mystore.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<Goods> goods = goodsDao.selectList(null);
        goods.forEach(System.out::println);

        List<User> users = userDao.selectList(null);
        users.forEach(System.out::println);
    }

}
