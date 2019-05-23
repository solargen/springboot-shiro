package com.example.solargen.service;

import com.example.solargen.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author solargen
 * @since 2019-04-26
 */
public interface IPermissionService extends IService<Permission> {

    List<Permission> getByEmpId(Long empId);
}
