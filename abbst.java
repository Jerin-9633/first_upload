abstract class set {
    abstract public void driving();

    abstract public void fly();

    public void hi() {
        System.out.println("driving");
    }
}

abstract class setup extends set {
    public void driving() {
        System.out.println("cycling");
    }
}

class setuup extends setup
{ 
    public void fly(){
        System.out.println("climbing");
    }
    }

public class abbst {

    public static void main(String[] args) {
        set obj = new setuup();
        obj.driving();
        obj.hi();
        obj.fly();
    }
}