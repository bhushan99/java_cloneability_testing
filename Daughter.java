public class Daughter implements  Cloneable{
    public int z;
    public Daughter clone() {
        Daughter d=new Daughter();
        d.z=z;
        return d;
    }
}

