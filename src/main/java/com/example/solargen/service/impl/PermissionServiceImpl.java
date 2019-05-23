package com.example.solargen.service.impl;

import com.example.solargen.entity.Permission;
import com.example.solargen.mapper.PermissionMapper;
import com.example.solargen.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-04-26
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getByEmpId(Long empId) {
        return permissionMapper.selectByEmpId(empId);
    }
}
