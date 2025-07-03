package Middlewares;

import Abstracts.Middleware;
import Server.AppServer;

public class UserExistsMiddleware extends Middleware {
    private AppServer server;

    public UserExistsMiddleware(AppServer server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return this.checkNext(email, password);
    }
}
