

public class AbsImplementer extends AbstractClass{

    @Override
    public void hello(String value) {
     
        System.out.println("Hi "+value);
    }

    @Override
                                  //static metod in interface - call from extending abstract class
    public void defaultPrinter(String value){
       System.out.println("call from extending abstract class "+ value);
    
}

   

}
