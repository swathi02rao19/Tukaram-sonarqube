/**
 * Project Name    : sonarqube-example
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 8/8/2019
 * Time            : 4:28 PM
 * Description     :
 **/

public class HelloWorld {

    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("Hello World from Docker Container");
            Thread.sleep(5000);
        }
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
