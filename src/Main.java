import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Long startTime = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for(int i=0; i< 10; i++){
            Thread thread = new Thread();

        }
        System.out.println(System.currentTimeMillis() - startTime);





    }
}