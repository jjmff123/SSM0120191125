package com.wanbangee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wanbangee.entities.Emp;
import com.wanbangee.service.EmpService;

@RequestMapping("/emp")
@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@ResponseBody
	@RequestMapping("/query")
	public List<Emp> getEmpByLastNameLike(String lastName,Integer pageCurrent,Integer pageSize){
		return this.empService.getEmpByLastNameLike(lastName, pageCurrent, pageSize);
	}
	
	@ResponseBody
	@RequestMapping("/queryCount")
	public int getCountByLastNameLike(String lastName) {
		return this.empService.getCountByLastNameLike(lastName);
	}
}
