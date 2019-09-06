package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	
	//private static final String URL = "http://localhost:8001";
	private static final String URL = "http://microservicecloud-dept";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/consumer/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(URL+"/dept/add", dept, Boolean.class);
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/list")
	public List<Dept> list(){
		return restTemplate.getForObject(URL+"/dept/list", List.class);
	}
	@RequestMapping("/consumer/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return restTemplate.getForObject(URL+"/dept/get/"+id, Dept.class);
	}
}
