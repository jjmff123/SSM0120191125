package com.wanbangee.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanbangee.dao.EmpDao;
import com.wanbangee.entities.Emp;
import com.wanbangee.service.EmpService;

@Service
public class EmpServiceImp implements EmpService {

	@Autowired
	private EmpDao empDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Emp> getEmpByLastNameLike(String lastName, int pageCurrent, int pageSize) {
		List<Emp> emps = null;
		try {
			emps =  empDao.getEmpByLastNameLike("%"+lastName+"%", (pageCurrent-1)*pageSize, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return emps;
	}
	
	@Transactional(readOnly = true)
	@Override
	public int getCountByLastNameLike(String lastName) {
		int count = 0;
		try {
			count = empDao.getCountByLastNameLike("%"+lastName+"%");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
