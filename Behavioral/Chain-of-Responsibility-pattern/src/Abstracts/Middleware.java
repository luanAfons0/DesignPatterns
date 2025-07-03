package Abstracts;

public abstract class Middleware {
    private Middleware next;

    public static Middleware createChain(Middleware first, Middleware ...rest){
        Middleware head = first;

        for (Middleware nextInChain : rest) {
            head.next = nextInChain;
            // head = nextInChain;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String passowrd){
        if(this.next == null) return true;

        return this.next.check(email, passowrd);
    }
}
