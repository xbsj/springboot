package com.xbsj.mapper;

import com.xbsj.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<SysUser> selectUserAll();
}