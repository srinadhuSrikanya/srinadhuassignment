package Com.java.org;

public class APP {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Applicationclass n = (Applicationclass) context.getBean("noob");

		n.walk();

		Build a = (Build) context.getBean("pro");
		a.Slow();

	}

}

