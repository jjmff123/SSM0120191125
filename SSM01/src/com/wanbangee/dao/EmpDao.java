package com.wanbangee.dao;

import java.util.List;

import com.wanbangee.entities.Emp;

public interface EmpDao {
	//���ݹ�Ա����ģ����ѯ���еĹ�Ա������Ҫ���з�ҳ[start:��ʼ��ѯ�����ݱ�����size���ܹ���ѯ�����ݱ���]
	public List<Emp> getEmpByLastNameLike(String lastName,int start,int size);
	
	//��ѯ���ݱ���
	public int getCountByLastNameLike(String lastName);
}
