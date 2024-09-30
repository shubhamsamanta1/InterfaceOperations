public class main {
    
    public static void main(String[] args) {
        
        //calling static methods from interface name (Recomended way)
        Interfacer.staticPrinter("directly from main class");

         //calling static methods from interface (Not Recomended way)
            //but it cannot be called directly from implementation class , object/instance of an implementation class needs to be created for call to work 
        Implementer impl = new Implementer();
        impl.display("indirectly from main method via creating object of implementation class of the interface.");

        //but it cannot be called directly from implementation class , or second way is by Calling the method in implemantation class directly by declaring implemenation
        //class call to work (Not Recomended way)

        Implementer.display("indirectly from main method via calling the method defined implementation class by directly by declaring implemenation class of the interface.");

        // impl.printer("HI"); - this will give compilation error because static method defined in interface cannot be overridden. 


        //calling default methods from interface name cannot be possible because default methods are instance methods 
        //Interfacer.defaultPrinter("directly from main class");
        //Interfacer.super.defaultPrinter("I AM Default from interface");

        //calling overriden method also not possble directly by class name a instance has to be there.
        //Implementer.defaultPrinter("indirectly from main method via calling the method defined implementation class by directly by declaring implemenation class of the interface.");

       // calling default methods from interface
       //but it cannot be called directly from implementation class , object/instance of an implementation class needs to be created for call to work 

        impl.defaultPrinter("indirectly from main method via creating object of implementation class of the interface.");
        
        // calling the super default method - the original one defined in interface not the overridden one 
        impl.callSuperDefault("I am calling the default method not overridden");


        //cannot create object of abstract or  interface can't be created 
        //AbstractClass abs = new AbstractClass();
        //nterfacer itf = new Interfacer();

        //calling abstaract method form interface 
        System.out.println(impl.multiply(2, 4));

        //only static methods in interface or abstract class can be called this way
        AbstractClass.staticCall("Static method from abstract class");

        // rest all methods using instance 
        AbsImplementer abs = new AbsImplementer();

        System.out.println(abs.add(10, 10));

        System.out.println(abs.multiply(50, 50));

        abs.hello("I am Anstract class implementer");
    }
}
