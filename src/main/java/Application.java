import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.ServletAssets;
import servlets.ServletLogin;
import servlets.ServletRegister;

public class Application {
    public static void main(String[] args) throws Exception {

        ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet(ServletAssets.class, "/assets/*");
        handler.addServlet(new ServletHolder(new ServletLogin()),  "/login");
        handler.addServlet(new ServletHolder(new ServletRegister()),  "/reg");

        Server server = new Server(81);
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
