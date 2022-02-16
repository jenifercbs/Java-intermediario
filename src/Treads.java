public class Treads extends Thread{

    private String nome;
    public Treads(String nome){
        this.nome = nome;
        start();//startar a thread
        
    }
        
    public void run(){

        for(int i=0; i<6; i++){
        System.out.println(nome + "contador" + i);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        }
    }
    
}
