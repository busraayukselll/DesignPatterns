package design.patterns.Structural.Adapter;

public class Test {
    public static  void main (String[] args){

        Priz priz=new Priz();
        Utu utu = new Utu();
        dolap dolap=new dolap();
        priz.elektirikVer(utu);
        priz.elektirikVer(dolap);
samsungtel samsungtel= new samsungtel();
priz.elektirikVer(samsungtel);
    }
}
