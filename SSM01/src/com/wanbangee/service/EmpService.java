package com.wanbangee.service;

import java.util.List;

import com.wanbangee.entities.Emp;

public interface EmpService {
	// ���ݹ�Ա����ģ����ѯ���еĹ�Ա������Ҫ���з�ҳ��pageCurrent ��ǰ��ʾ��ҳ����pageSize�� ÿҳ��ʾ�ı�����
	public List<Emp> getEmpByLastNameLike(String lastName, int pageCurrent, int pageSize);

	// ��ѯ���ݱ���
	public int getCountByLastNameLike(String lastName);
}
