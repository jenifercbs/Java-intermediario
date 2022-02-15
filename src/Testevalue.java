public class Testevalue{

    public static void main(String[] args) {
        
        Diasemana[] dias = Diasemana.values();//obter todos os valores dentro de um enumerador forma 1
        for (int i=0; i<dias.length;i++){
            System.out.println(dias[i]);
        }

        for(Diasemana dia : Diasemana.values()){//obter todos os valores dentro de um enumerador forma 2
            System.out.println(dia);
        }
    }
}