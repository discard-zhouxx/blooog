package top.vanbyz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.vanbyz.pojo.Post;
import top.vanbyz.pojo.PostExample;

public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer postId);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExampleWithBLOBs(PostExample example);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(Integer postId);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExampleWithBLOBs(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKeyWithBLOBs(Post record);

    int updateByPrimaryKey(Post record);
}