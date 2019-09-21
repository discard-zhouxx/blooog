package top.vanbyz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.vanbyz.pojo.PostType;
import top.vanbyz.pojo.PostTypeExample;

public interface PostTypeMapper {
    long countByExample(PostTypeExample example);

    int deleteByExample(PostTypeExample example);

    int deleteByPrimaryKey(Byte postTypeId);

    int insert(PostType record);

    int insertSelective(PostType record);

    List<PostType> selectByExample(PostTypeExample example);

    PostType selectByPrimaryKey(Byte postTypeId);

    int updateByExampleSelective(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByExample(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByPrimaryKeySelective(PostType record);

    int updateByPrimaryKey(PostType record);
}