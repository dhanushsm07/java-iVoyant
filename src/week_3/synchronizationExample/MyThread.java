package week_3.synchronizationExample;

public class MyThread extends Thread{

    public Count count;

    public MyThread(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            count.counter();
        }
    }
}
