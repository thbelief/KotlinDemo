import jvm.objectClass;

public class Main {
    public static void main(String[] args) {
//        Test test = new Test(2);

        new Thread(()->{
            objectClass.log("1");
        }).start();
        new Thread(()->{
            objectClass.log("2");
        }).start();
    }
}
