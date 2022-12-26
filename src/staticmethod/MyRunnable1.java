package staticmethod;

public class MyRunnable1 implements Runnable {

    private final MyClass myClass;
    private final String threadName;

    public MyRunnable1(MyClass myClass, String threadName) {
        this.myClass = myClass;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        MyClass.method1(threadName);
    }

}
