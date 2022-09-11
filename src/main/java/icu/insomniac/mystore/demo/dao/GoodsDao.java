package icu.insomniac.mystore.demo.dao;

import icu.insomniac.mystore.demo.model.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kelex
 * @since 2022-09-10
 */
@Repository
public interface GoodsDao extends BaseMapper<Goods> {
    @Select("select * from goods limit #{page}, 5")
    List<Goods> selectByPage(@Param("page") int page);

    @Update("alter table goods auto_increment=#{id}")
    void resetAutoincrement(@Param("id") int id);
}
