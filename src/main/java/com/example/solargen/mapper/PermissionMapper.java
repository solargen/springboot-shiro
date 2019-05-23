package com.example.solargen.mapper;

import com.example.solargen.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author solargen
 * @since 2019-04-26
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectByEmpId(Long empId);
}
