package Config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Details.Classdetails;
import Details.Studentdetails;
import Details.Subjectdetails;
import Details.Teacherdetails;
public class Util {
	private static SessionFactory factory;
	
	public static SessionFactory buildConnection() {
		
		factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Studentdetails.class)	
				.addAnnotatedClass(Teacherdetails.class)
				.addAnnotatedClass(Classdetails.class)
				.addAnnotatedClass(Subjectdetails.class)
				.buildSessionFactory();
		
		return factory;
	}
}
