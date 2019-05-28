package threadtutorial;
/**
 *
 * @author Kasun Dissanayake
 */
class Test extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
            Test test = new Test();
            test.start();
    }    
}