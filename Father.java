public class Father{
    public int x;
	public void clean(Daughter x) throws CloneNotSupportedException {
		System.out.println("Bye!");
	}
    public Father clone() throws CloneNotSupportedException {
        return (Father) super.clone();
    }
    public void f() {
        System.out.println("Father's method");
    }
}
