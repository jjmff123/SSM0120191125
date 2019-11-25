package com.wanbangee.service;

import java.util.List;

import com.wanbangee.entities.Emp;

public interface EmpService {
	// 根据雇员名称模糊查询所有的雇员，并且要进行分页【pageCurrent 当前显示的页数，pageSize， 每页显示的笔数】
	public List<Emp> getEmpByLastNameLike(String lastName, int pageCurrent, int pageSize);

	// 查询数据笔数
	public int getCountByLastNameLike(String lastName);
}
