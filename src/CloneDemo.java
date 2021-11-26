//Demostrate the clone method
class TestClone implements Cloneable{
    int a;
    double b;
    //this method calls Object's clone()
    TestClone cloneTest()
    {
        try {
            //call clone in object
            return (TestClone) super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Cloning not allowed");
            return this;
        }
    }
}
public class CloneDemo {
    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2=new TestClone();
        x1.a = 10;
        x2.b = 20.98;
        x2 = x1.cloneTest();//clone x1
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}