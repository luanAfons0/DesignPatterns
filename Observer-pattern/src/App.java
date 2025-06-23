import Models.StoreObserver;
import Models.StoreSubject;

public class App {
    public static void main(String[] args) throws Exception {
        StoreSubject centralStore = new StoreSubject();

        StoreObserver shopBranch1 = new StoreObserver(centralStore);
        StoreObserver shopBranch2 = new StoreObserver(centralStore);
        StoreObserver shopBranch3 = new StoreObserver(centralStore);

        centralStore.updateFlaskPrice(200);
        centralStore.updateMousePrice(300);
        centralStore.updateChairPrice(100);
    }
}
