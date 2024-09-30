 // abstract class can implement F-interface 
abstract class FAbstractClass implements MyFunctionalInterface {

    
    //static method in abstract class
    static void staticCall(String value){
        System.out.println("F-Abstract Class "+value);
    }

    //not possile becase default methods are only there on interfaces
   // default void defaultCall(String value){
    //     System.out.println("Abstract Class "+value);
    // }

    // normal methods are alloweded  

    
    int add(int a , int b){
        return a+b;
    }

    abstract void hello(String value);

    abstract String helper(int value);
    
}
