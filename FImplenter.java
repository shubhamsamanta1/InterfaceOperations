public class FImplenter implements MyFunctionalInterface{

    @Override
    public void functionA(String value) {
        System.out.println("Functional-Interface method overridden "+value);
    }


    //             @Override
//             static void staticPrinter(String value){
//                 System.out.println("Overriding static class "+ value);
//             }  - this will give compilation error because static method defined in interface cannot be overridden.


         // default method defined in interface can be overridden. 
         @Override
         public void defaultPrinter(String value){
             System.out.println("Overriding  default method of F-interface "+ value);
         }

                       //You can also call the original default method form this implementation class
                       public void callSuperDefault(String value){
                       MyFunctionalInterface.super.defaultPrinter(value);
                    }


                    static void display(String value){
                        //calling static methods from interface - It should be called inside a method defined in implemtation class
                        //but it cannot be called directly from implementation class , object of an implementation class needs to be crated for call to work 
                        Interfacer.staticPrinter(value);
                        }
                        
       //not possible this way                  
        // MyFunctionalInterface abc = () -> System.out.println("i am trying lamda");
        // MyFunctionalInterface.functionA(abc);  
}
