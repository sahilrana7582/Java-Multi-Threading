package Odd_Even_With_Two_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable oddRun = () -> System.out.println("Odd");
        Runnable evenRun = () -> System.out.println("Even");

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
            if (i % 2 == 1) { // Correct check for odd numbers.
                Thread oddThread = new Thread(oddRun, "Odd_Thread");
                oddThread.start();
                oddThread.join();
            } else {
                Thread evenThread = new Thread(evenRun, "Even_Thread");
                evenThread.start();
                evenThread.join();
            }
        }


        long Threading = (System.currentTimeMillis() - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
            if (i % 2 == 1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");

            }
        }
        System.out.println("Finished Simple in " + (System.currentTimeMillis() - startTime) + " Finished Multi-Thread in " + Threading);
    }
}
