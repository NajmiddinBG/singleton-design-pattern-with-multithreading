package uz.friday;

/**
 * Singleton service first
 */
public class Service {

    private static Service instance;

    private Service() {
    }

    public static Service getInstance() {
        if (instance == null) {
            synchronized (Service.class) {
                if (instance == null)
                    instance = new Service();
            }
        }
        return instance;
    }
}
