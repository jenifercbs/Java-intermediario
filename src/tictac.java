public class tictac {
    boolean tique;

    synchronized void tique(boolean estaexecutando){
        if (!estaexecutando){ //enquanto o tique estiver executando não passa por aqui
            tique=true;
            notify();
            return;
        }

        System.out.println("Tique");

        tique = true;
        notify();

        while(tique){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        
    } 

    synchronized void taque(boolean estaexecutando){
        if (!estaexecutando){ //enquanto o tique estiver executando não passa por aqui
            tique=false;
            notify();
            return;
        }

        System.out.println("Tique");

        tique = false;
        notify();

        while(!tique){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        
    } 

}
