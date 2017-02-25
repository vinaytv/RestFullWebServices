import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;


@path("/rest")
public class MyApplication extends ResourceConfig{

	MyApplication(){
		
		packages("resources");
	}
	
	
}
