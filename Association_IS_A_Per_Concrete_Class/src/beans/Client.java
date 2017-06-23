package beans;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		//Session s=SessionFactoryUtil.getSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		semployee semp=new semployee(1, "Rajesh", "ab@gmail.com", 500, "RAD");
		hemployee hemp=new hemployee(2, "Suresh", "raj@yahoo.com", 900, 34);
		admin ad=new admin(3, "DX"," tripleh@dx.com", 56000, "CE");

		s.save(semp);
		s.save(hemp);
		s.save(ad);

		t.commit();
		s.close();
		sf.close();

	}

}
