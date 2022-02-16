public class Testeautoboxing {

    public static void main(String[] args) {
        
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = (long) 10000;
        Float num11 = 3.5f;
        Double num12 = 3.55555;
        Boolean flag2 = true;
        Character b = 'b';

        //auto un=boxing
        int num13 = num9;//num9.intValue();

        num9++;//autoboxing em expressões

        System.out.println(num9);

        //auto unboxing num9 -> autoboxing num13/num9 -> num14
        Integer num14 = num13/num9;
    }
    
}
