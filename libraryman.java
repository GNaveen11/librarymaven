package Libraryhiber.maven;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class libraryman {
	public static SessionFactory provideSessionfactory() {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		return conf.buildSessionFactory();
	}
}
