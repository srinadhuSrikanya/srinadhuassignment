package Com.java.org;

import javax.swing.text.AbstractDocument.Content;

public class Build implements ApplicationContextAware {
	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public void Slow() {

		Application a = (Application) context.getBean("app");

		a.go();

	}
	


}
