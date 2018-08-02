package com.hlc.FirstWeb.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hlc.FirstWeb.entity.SysPermissionInit;
import com.hlc.FirstWeb.mapper.SysPermissionInitMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author z77z
 * @since 2017-02-16
 */
@Service
public class SysPermissionInitService extends ServiceImpl<SysPermissionInitMapper, SysPermissionInit>{
	
	public List<SysPermissionInit> selectAll() {
		return baseMapper.selectAll();
	}
}
