package com.cloud.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
