package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController 
{
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept){ 
		return 	deptService.add(dept);
	}
	//@GetMapping("/get/{id}")
	@RequestMapping(value = "/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id){
	    return	deptService.get(id);
	}
	//@GetMapping("/list")
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public List<Dept> list(){
	    return	deptService.list();
	}
}
