package threadtutorial;
/**
 *
 * @author Kasun Dissanayake
 */
class Test implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
public class Example5 {
    public static void main(String[] args) {
            Test test = new Test();
            Thread thread = new Thread(test);
            thread.start();
    }    
}