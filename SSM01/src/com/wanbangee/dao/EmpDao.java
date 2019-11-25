package com.wanbangee.dao;

import java.util.List;

import com.wanbangee.entities.Emp;

public interface EmpDao {
	//根据雇员名称模糊查询所有的雇员，并且要进行分页[start:起始查询的数据笔数，size，总共查询的数据笔数]
	public List<Emp> getEmpByLastNameLike(String lastName,int start,int size);
	
	//查询数据笔数
	public int getCountByLastNameLike(String lastName);
}
