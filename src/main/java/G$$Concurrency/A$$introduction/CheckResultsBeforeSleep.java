package G$$Concurrency.A$$introduction;

public class CheckResultsBeforeSleep {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5000; i++) CheckResultsBeforeSleep.counter++;
        }).start();
        while (CheckResultsBeforeSleep.counter < 1600) {
            System.out.println("Not reached yet"+ CheckResultsBeforeSleep.counter);
        }
        System.out.println("Reached!");
    }
}