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
