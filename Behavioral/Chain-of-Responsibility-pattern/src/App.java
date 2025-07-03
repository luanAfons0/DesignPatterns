import java.io.BufferedReader;
import java.io.InputStreamReader;

import Abstracts.Middleware;
import Middlewares.ThrottlingMiddleware;
import Middlewares.UserExistsMiddleware;
import Server.AppServer;

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static AppServer server;

    public static void init(){
        server = new AppServer();

        server.register("luan.afonso@teste.com", "luan123");
        server.register("loren.ipsum@teste.com", "loren123");

        Middleware middleware = Middleware.createChain(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server)
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws Exception {
        init();

        boolean success = false;

        do{
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        }while(!success);
    }
}
