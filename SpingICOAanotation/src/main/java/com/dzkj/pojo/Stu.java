package com.dzkj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//创建注解	注解名默认为类名
@Component
//作用域 prototype多例
@Scope("prototype")
public class Stu {
	@Value("111")
	private Integer id;
	@Value("hjssb")
	private String name;
	@Value("妖")
	private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stu(Integer id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	
}
