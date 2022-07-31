package Chapter33.Lamda;

public class RunLamda {
    public static void main(String[] args) {
        RunLamda sample = new RunLamda();
//        sample.calculateLamda();
        sample.runThread();
    }

    public void calculateLamda() {
        Calculate calculateAdd = (a, b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));
        Calculate calculateSubtract = (a, b) -> a-b;
        System.out.println(calculateSubtract.operation(1,2));
    }

    public void runCommonThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }

    public void runThread() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
