 abstract class Animal{
    //abstract method
    public abstract void sound();

    //NON-ABSTRACT METHOD 
    //concrete method
    public void sleep(){
        System.out.println("Sleeping...");
    }

}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bow Bow");
    }
}

public class Abstraction {
   public Abstraction() {
   }

   public static void main(String[] var0) {
      Dog var1 = new Dog();
    //calling abstract method
    //implementation of abstract method  
     //runtime polymorphism
     // dynamic method dispatch
      var1.sound();   //output: Bow Bow
      var1.sleep();    //output: Sleeping...
   }
}
