package dao.generico;
import java.io.IOException;

import javax.servlet.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


/**
 * Implementacion del patron OpenSessionInView
 * @author JavAdicto
 * @author Eduardo Ochoa
 * @version 1.2 
 * @email elos3000@gmail.com
 */
public class SessionManager implements Filter
{
    private static  SessionFactory sessionFactory;
    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
    private  static Configuration configuration = new Configuration();
    private static String configFile = CONFIG_FILE_LOCATION;

    static
    {
        try
        {
            //Aqui creamos una session de la fabrica de session usando
            //el archivo de configuracion hibernate.cfg.xml      	
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        catch (Throwable ex)
        {
           
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

   //Aqui en donde deberia crear una session de la fabrica de sessiones por que es el metodo init y este metodo se hizo para
   //inicializar valores o solicitar recursos, pero eso ya lo hice arriba.
    public void init(FilterConfig filterConfig) throws ServletException
    {        
        System.out.println("algo");
    }

    //Este metodo se debe declarar por que viene especificado en la interfaz y es donde se deberia asignar una session
    //a un thread local, pero eso ya viene especificado en el archivo de configuracion hibernate.cfg.xml
    //<property name="hibernate.current_session_context_class">thread</property>
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    {

    	        try {
    	        	
					chain.doFilter(request, response);
					 try
				        {      	
						   sessionFactory.getCurrentSession().close();
				        }
				        catch (HibernateException ex)
				        {
				            throw new RuntimeException(ex);
				        } 
				      
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        
    	        // Commit any pending database transaction.
    	        // No matter what happens, close the Session.
    	

    }

    //Para obtener una session
    public static Session getSession()
    {   
//    	try {
    		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    		//AnnotationConfiguration().configure().buildSessionFactory();
//            
//    	} catch (Exception e) {
//			// TODO: handle exception
//    		e.printStackTrace();
//		}
    	//return sessionFactory.getCurrentSession();
    	
			//rebuildSessionFactory();
		
    	sessionFactory.openSession();
    	return sessionFactory.getCurrentSession();		
    	
    }
    
    public static void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);
			
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err
					.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}



   // El metodo destroy se manda a llamar automaticamente al terminar el request, de esta manera
   //aseguramos no dejar la session abierta
    public void destroy()
    {
    	 try
	        {      	
			   sessionFactory.close();
			   System.out.println("session cerrada");
	        }
	        catch (HibernateException ex)
	        {
	            throw new RuntimeException(ex);
	        } 
    	
    }
}
