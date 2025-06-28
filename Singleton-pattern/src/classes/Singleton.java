package classes;

public class Singleton {
    private static Singleton instance = null;
    private String value;

    public void getStringValue(){
        System.out.println(this.value);
    }

    private Singleton(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    };

    public static Singleton getInstance(String value) {
        if(instance == null)
            instance = new Singleton(value);
        
        return instance;
    }
}
