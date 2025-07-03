package Middlewares;

import Abstracts.Middleware;

public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int requests;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > this.currentTime + 60_000){
            this.requests = 0;
            this.currentTime = System.currentTimeMillis();
        }

        this.requests++;

        if(this.requests > this.requestPerMinute) {
            System.out.println("Request limit reached!");
            throw new UnsupportedOperationException("Cannot continue");
        }

        return this.checkNext(email, password);
    }
    
}
