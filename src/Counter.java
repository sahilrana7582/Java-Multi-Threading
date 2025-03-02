import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private int count = 0;
    private int otherCount = 0;

    Lock lock = new ReentrantLock();


    public void getCount() {
        if(lock.tryLock()){
            System.out.println("Printing The Resource.");
            System.out.println(Thread.currentThread().getName());
        }else{

        }
    }
    public void increament(){
            this.count += 1;
    }
}
