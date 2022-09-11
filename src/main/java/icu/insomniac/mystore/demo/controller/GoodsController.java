package icu.insomniac.mystore.demo.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import icu.insomniac.mystore.demo.dao.GoodsDao;
import icu.insomniac.mystore.demo.model.Goods;
import icu.insomniac.mystore.demo.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author kelex
 * @since 2022-09-10
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsDao goodsDao;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/all")
    public Object allGoods(){ return goodsDao.selectList(null); }

    @GetMapping("/page")
    public Object showPage(int page, HttpRequest request){
        return goodsDao.selectByPage(page*5-5);
    }

    @PostMapping("/add")
    public String addGoods(Model model, Goods goods){
        goodsDao.insert(goods);
        model.addAttribute("addStatus", "success");
        return "Status:success<br>"+goods.toString();
    }

    @GetMapping("/delete")
    public String deleteGoods(Integer id){
        Goods goods = goodsDao.selectById(id);
        goodsDao.deleteById(id);
        goodsDao.resetAutoincrement(id);
        return "Status: success<br>"+goods;
    }

    @PostMapping("/update")
    public String updateGoods(Goods goods){
        goodsDao.updateById(goods);
        Goods g = goodsDao.selectById(goods.getId());
        return "Status:success<br>"+g;
    }

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/search")
    public Object searchGoods(String name){
        System.out.println(name);
        List<Goods> list = goodsService.lambdaQuery().like(Goods::getName, name).list();
        System.out.println(list);
        return list;
    }
}
