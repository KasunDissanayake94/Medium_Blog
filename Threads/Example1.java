package threadtutorial;
/**
 *
 * @author Kasun Dissanayake
 */
class Multi extends Thread{
    @Override
    public void run(){
//your code here
        System.out.println("thread is running...");
    }
}
public class Example1 {
    public static void main(String[] args) {
            Multi t1 = new Multi();  
            t1.start();
    }
    
}