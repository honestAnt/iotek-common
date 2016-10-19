package com.iotekclass.service.user;

import com.iotekclass.model.user.ModuleInfo;

import java.util.List;

public interface ModuleService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
