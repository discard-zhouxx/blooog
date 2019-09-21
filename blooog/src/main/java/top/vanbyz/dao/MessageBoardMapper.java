package top.vanbyz.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.vanbyz.pojo.MessageBoard;
import top.vanbyz.pojo.MessageBoardExample;

public interface MessageBoardMapper {
    long countByExample(MessageBoardExample example);

    int deleteByExample(MessageBoardExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(MessageBoard record);

    int insertSelective(MessageBoard record);

    List<MessageBoard> selectByExample(MessageBoardExample example);

    MessageBoard selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByExample(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByPrimaryKeySelective(MessageBoard record);

    int updateByPrimaryKey(MessageBoard record);
}