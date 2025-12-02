package week_3.threadImplementation;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        for( ; ;){
            System.out.println("runnable interface");
        }
    }
}
