package com.hlc.FirstWeb.mapper;

import java.util.List;

import com.hlc.FirstWeb.entity.SysPermissionInit;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author z77z
 * @since 2017-02-16
 */
public interface SysPermissionInitMapper extends BaseMapper<SysPermissionInit> {

	List<SysPermissionInit> selectAll();

}