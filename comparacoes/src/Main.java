public class Main {
    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;
        double d1 = 59.6d;
        double d2 = 70.9d;
        float f1 = 4.5f;
        float f2 = 3.5f;
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = true;
        long l1 = 1597l;
        long l2 = 8997l;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 > i2 = " + (i1>i2));
        System.out.println("i1 < i2 = " + (i1<i2));
        
        System.out.println("f1 > f2 " + (f1>f2));
        System.out.println("f1 <= f2 " + (f1<=f2));

        System.out.println("d1 <= d2 " + (d1 <=d2));
        System.out.println("d1 >= d2 " + (d1 >=d2));

        //System.out.println("s1 > s2" + (s1>s2)); //Strings não podem serem comparadas desta maneira

        System.out.println("b1 == b2" + (b1 == b2));
        //System.out.println("b1 > b2" + (b1>b2)); //Tipo booleano não pode ser comparado desta maneira
        
        System.out.println("l1 != l2 " + (l1!=l2));
        System.out.println("l1 <= l2 " + (l1<=l2));

        System.out.println("y1 <= h1 " + (y1 <= h1));



    }
}
