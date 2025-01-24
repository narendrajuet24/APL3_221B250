
public class Child extends Mother {
    public Child() {
        super();  
    }
    @Override
    public void show() {
        System.out.println("Child's inherited value of x: " + x);
    }
}
