package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@SuppressWarnings("serial")
@AllArgsConstructor  //提供全参构造函数
@NoArgsConstructor   //提供无参构造函数
//@Accessors(chain=true)  //链式编程
@Data  //提供get set 方法
@Accessors(chain = true)
public class Dept implements Serializable
{
  private Long deptno; //部门id
  
  private String dname; // 部门名称
  
  private String db_source; //存放数据源位置


}
