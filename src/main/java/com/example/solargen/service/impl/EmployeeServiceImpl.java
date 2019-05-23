package com.example.solargen.service.impl;

import com.example.solargen.entity.Employee;
import com.example.solargen.mapper.EmployeeMapper;
import com.example.solargen.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-04-26
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
