package bai5_access_modifier_static_method_static_property.bai_tap;

class A {
    int data = 40;
    private void msg(){
        System.out.println("Hello java");
    }
}

public class Simple{
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
    }
}
