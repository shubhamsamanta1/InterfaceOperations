/**
 * AbstractClass
 */

 // abstract class can implement interface 
abstract class AbstractClass implements Interfacer{

    //static method in abstract class
    static void staticCall(String value){
        System.out.println("Abstract Class "+value);
    }

    //not possile becase default methods are only there on interfaces
   // default void defaultCall(String value){
    //     System.out.println("Abstract Class "+value);
    // }

    // normal methods are alloweded  
    int add(int a , int b){
        return a+b;
    }

    @Override
    public String multiply(int a, int b){
      return "its multiply from interface implemented by abstract class "+ a*b;
    }
    
    //overriding default method for interface in abstract class
    @Override
    public void defaultPrinter(String value){
        System.out.println("this is from default method defined interface and is called "+ value);
    }

    abstract void hello(String value);

}