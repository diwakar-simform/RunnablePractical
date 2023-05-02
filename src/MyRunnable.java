import java.util.Scanner;

/*
Runnable - Practical
- Create class which implement runnable interface and  override run method.

- Create main class and create object of class. Create multiple thread and run the thread.

- Print message should be display on console for each thread.
*/

public class MyRunnable implements Runnable {

    public void currentlyExecutingThread() {
        System.out.println("Currently Executing Thread : "+Thread.currentThread().getName());
    }
    @Override
    public void run() {
        currentlyExecutingThread();
    }
}

class Main {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        System.out.println("Hi, How many threads you want to create?");
        Scanner sc = new Scanner(System.in);
        int totalThread = sc.nextInt();

        for (int i = 0; i<totalThread; i++) {
            Thread t1 = new Thread(r);
            t1.start();
        }

    }
}
