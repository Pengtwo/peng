package com.dzkj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GongRen {
	//自动装配	required=false 可以为空
	@Autowired(required=false)
	@Qualifier("b")
	private Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}
	public void clean() {
		System.out.println(stu.getName()+"帮我扫地");
	}
}
