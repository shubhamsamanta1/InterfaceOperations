/**
 * Interfacer
 */
interface Interfacer{

    //static metod in interface
    static void staticPrinter(String value){
        System.out.println("this is from static method defined interface and is called "+ value);
    }

     //static metod in interface
     default void defaultPrinter(String value){
        System.out.println("this is from default method defined interface and is called "+ value);
    }

       // normal methods are not alloweded  
    //    int add(int a , int b){
    //     return a+b;
    // }

    //abstract method
    String multiply (int a, int b);


} 