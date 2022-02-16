public class minhathreadrunnable implements Runnable{
      private String nome;
      private int[] tempo;

     public minhathreadrunnable(String nome, int[] array){
         this.nome= nome;
         this.tempo = array;
     }

    @Override
    public void run() {
        
      
            for(int i=0; i<6; i++){
                System.out.println(nome + "contador" +i);
                sleep(tempo);
            }
        
    
    }

    private void sleep(int[] tempo2) {
    }
    
}
