public class F{
    public int x;
    public void f() {
        System.out.println("F's method");
    }
    public F clone() {
        F d=new F();
        d.x=x;
        return d;
    }
}
