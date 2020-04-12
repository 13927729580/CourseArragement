package com.lyk.coursearrange.dao;

import com.lyk.coursearrange.entity.ClassTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lequal
 * @since 2020-04-06
 */
@Component
@Mapper
public interface ClassTaskDao extends BaseMapper<ClassTask> {

    // 查询指定学期的开课任务
//    @Select("SELECT * FROM tb_class_task where semester = #{semester}")
    List<ClassTask> selectBySemester(ClassTask classTask);

    @Select("SELECT distinct class_no FROM tb_class_task")
    List<String> selectClassNo();

}
