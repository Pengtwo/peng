import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.pojo.GongRen;
import com.dzkj.pojo.Stu;

public class SpingTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//按类型找
//		Stu s = ac.getBean(Stu.class);
//		//按名字找
////	Stu s = (Stu) ac.getBean("stu2");
//		System.out.println(s);
//		System.out.println(ac.isSingleton("stu"));
		GongRen gr = ac.getBean(GongRen.class);
		gr.clean();
	}
}
