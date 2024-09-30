public class Implementer implements Interfacer{


            static void display(String value){
            //calling static methods from interface - It should be called inside a method defined in implemtation class
            //but it cannot be called directly from implementation class , object of an implementation class needs to be crated for call to work 
            Interfacer.staticPrinter(value);
            }
            
//             @Override
//             static void staticPrinter(String value){
//                 System.out.println("Overriding static class "+ value);
//             }  - this will give compilation error because static method defined in interface cannot be overridden. 


         // default method defined in interface can be overridden. 
            @Override
            public void defaultPrinter(String value){
                System.out.println("Overriding  default method of interface "+ value);
            }

              //You can also call the original default method form this implementation class
            public void callSuperDefault(String value){
                Interfacer.super.defaultPrinter(value);
            }

            //implement the abstaract method in interface
            @Override
            public String multiply(int a, int b){
              return "its multiply from interface "+ a+b;
            }
}
