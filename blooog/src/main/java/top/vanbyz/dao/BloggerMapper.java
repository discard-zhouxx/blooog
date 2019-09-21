package top.vanbyz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.vanbyz.pojo.Blogger;
import top.vanbyz.pojo.BloggerExample;

public interface BloggerMapper {
    long countByExample(BloggerExample example);

    int deleteByExample(BloggerExample example);

    int insert(Blogger record);

    int insertSelective(Blogger record);

    List<Blogger> selectByExample(BloggerExample example);

    int updateByExampleSelective(@Param("record") Blogger record, @Param("example") BloggerExample example);

    int updateByExample(@Param("record") Blogger record, @Param("example") BloggerExample example);
}