package uz.friday;

public class NotSingletonService {
    private static NotSingletonService instance;

    private NotSingletonService() {
    }

    public static NotSingletonService getInstance() {
        if (instance == null) {
            synchronized (NotSingletonService.class) {
                if (instance == null)
                    instance = new NotSingletonService();
            }
        }
        return instance;
    }
}
