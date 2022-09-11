package icu.insomniac.mystore.demo.service.impl;

import icu.insomniac.mystore.demo.model.Goods;
import icu.insomniac.mystore.demo.dao.GoodsDao;
import icu.insomniac.mystore.demo.service.GoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsDao, Goods> implements GoodsService {
}
