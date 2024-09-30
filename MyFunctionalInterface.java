import java.lang.*;;
/**
 * FunctionalInterface
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    //Mandatory one abstract method,  only one 
    void functionA(String value);

        //static method in F-interface
        static void staticPrinter(String value){
            System.out.println("this is from static method defined F-interface and is called "+ value);
        }
    
         //static method in F-interface
         default void defaultPrinter(String value){
            System.out.println("this is from default method defined F-interface and is called "+ value);
        }
    
           // normal methods are not alloweded  
        //    int add(int a , int b){
        //     return a+b;
        // }

        

    
}