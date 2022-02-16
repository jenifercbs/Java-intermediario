public class TesteWraper{
    
    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        Short num7 = new Short((short)1);
        Byte num8 = new Byte((byte)10);
        Integer num9 = new Integer((int)100);
        Long num10 = new Long((long)1000);
        Float num11 = new Float((float)3.5f);
        Double num12 = new Double((double)3.55555);
        Boolean flag2 = new Boolean((boolean)true);
        Character b = new Character('b');

        Integer num13 = new Integer(10000);
        Double num14 = new Double("3.5");

        System.out.println(num13.intValue());

        Integer num18 = Integer.valueOf(3500);
        System.out.println(num18);

        System.out.println(num9 == num13);//comparar variáveis
    }
}

    