public class threadteste {

    private static final int NUM = 0;
    tictac tt;
    private Thread t;

    public threadteste(String nome, tictac tt){
        this.tt = tt;

        new Thread((Runnable) this, nome).start();
    }

    @Override
    public void run(){

        if (t.getName().equals("Tique")){
            for(int i=0; i<NUM; i++){
                tt.tique(true);
            
            }

            
        }
    }
    
}
