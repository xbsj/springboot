package com.xbsj.mapper;

import com.xbsj.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> selectUserAll();
}
