package com.ming.service;

import java.util.List;
import java.util.Map;

import com.ming.entity.Permission;

public interface IPermissionService {
	public List<Map<String, Object>> load();
	public List<Map<String, Object>> load(String condition);
	public List<Map<String, Object>> load(String[] params, String condition);
	public List<Map<String, Object>> load(String[] params, String condition, int curPage, int limit);
	public Map<String, Object> loadOne(String condition);
	public Map<String, Object> loadOne(String[] params, String condition);
	public boolean save(Permission obj);
	public boolean update(Permission obj);
	public boolean delete(Permission obj);
	public boolean deleteByCondition(String condition);
	public int count();
	public int count(String condition);
}
