public class OtherThread extends Thread{

    private final Counter count;
    public OtherThread(Counter count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            count.increament();
        }
    }
}
