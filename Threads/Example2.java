package threadtutorial;
/**
 *
 * @author Kasun Dissanayake
 */
class Test extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                stop();
            }
            System.out.println(i);
        }
    }
}
public class Example2 {
    public static void main(String[] args) {
            Test test = new Test();
            test.start();
    }    
}