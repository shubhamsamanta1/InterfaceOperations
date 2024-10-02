/**
 * AnonymousClass
 */
public interface AnonymousClass {

    void displayAnonymous();

    default void display(){
        System.out.println("I am displaying default anonymous");
    }

    static void sdisplay(){
        System.out.println("I am displaying static anonymous");
    }
    
}
