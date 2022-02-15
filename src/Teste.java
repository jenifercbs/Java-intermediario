public class Teste {

    public static void main (String[]args){

        usandoconstantes();

        System.out.println();
        
        usandoenum();

    }

    public static void usandoconstantes(){
        int segunda =diasdasemanaconstante.SEGUNDA;
        int terca =diasdasemanaconstante.TERCA;
        int quarta =diasdasemanaconstante.QUARTA;
        int quinta =diasdasemanaconstante.QUINTA;
        int sexta =diasdasemanaconstante.SEXTA;
        int sabado =diasdasemanaconstante.SABADO;
        int domingo =diasdasemanaconstante.DOMINGO;

        System.out.println("teste constante java");
        imprimediasemana(segunda);
        imprimediasemana(terca);
        imprimediasemana(quarta);
        imprimediasemana(quinta);
        imprimediasemana(sexta);
        imprimediasemana(sabado);
        imprimediasemana(domingo);
    }

    private static void imprimediasemana(int dia){
        switch (dia){
            case 1 :
            System.out.println("Segunda-feira");
            break;

            case 2 :
            System.out.println("Terça-feira");
            break;

            case 3 :
            System.out.println("Quarta-feira");
            break;

            case 4 :
            System.out.println("Quinta-feira");
            break;

            case 5 :
            System.out.println("Sexta-feira");
            break;

            case 6 :
            System.out.println("Sábado");
            break;

            case 7 :
            System.out.println("Domingo");
            break;
        }
    }

    public static void usandoenum(){
        Diasemana segunda = Diasemana.SEGUNDA;
        Diasemana terca = Diasemana.TERCA;
        Diasemana quarta = Diasemana.QUARTA;
        Diasemana quinta = Diasemana.QUINTA;
        Diasemana sexta = Diasemana.SEXTA;
        Diasemana sabado = Diasemana.SABADO;
        Diasemana domingo = Diasemana.DOMINGO;
        
        System.out.println("teste Enum java");
        imprimediasemana(segunda);
        imprimediasemana(terca);
        imprimediasemana(quarta);
        imprimediasemana(quinta);
        imprimediasemana(sexta);
        imprimediasemana(sabado);
        imprimediasemana(domingo);
    }

    public static void imprimediasemana(Diasemana dia){
        switch (dia){
            case SEGUNDA :
            System.out.println("Segunda-feira");
            break;

            case TERCA:
            System.out.println("Terça-feira");
            break;

            case QUARTA :
            System.out.println("Quarta-feira");
            break;

            case QUINTA :
            System.out.println("Quinta-feira");
            break;

            case SEXTA :
            System.out.println("Sexta-feira");
            break;

            case SABADO :
            System.out.println("Sábado");
            break;

            case DOMINGO :
            System.out.println("Domingo");
            break;
            
          }
          
        }

    }
