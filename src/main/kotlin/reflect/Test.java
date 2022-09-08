package reflect;

public class Test {
    private Test() {

    }

    private volatile static Test sInstance;

    public synchronized static Test getInstance() {
        if (sInstance == null) {
            sInstance = new Test();
        }
        return sInstance;
    }
}
