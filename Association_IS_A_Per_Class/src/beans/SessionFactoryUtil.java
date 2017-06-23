package beans;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

class SessionFactoryUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory(){
		try {
			if(sessionFactory==null){
				Configuration cfg=new Configuration().configure("resources/hibernate.cfg.xml");
				StandardServiceRegistryBuilder sgb=new StandardServiceRegistryBuilder();
				sgb.applySettings(cfg.getProperties());
				StandardServiceRegistry sg= sgb.build();
				sessionFactory=cfg.buildSessionFactory(sg);
			}
			return sessionFactory;

		}catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	public static void shutdown()
	{
		getSessionFactory().close();
	}

}
