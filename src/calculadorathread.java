public class calculadorathread {
    
    private int soma;

    public synchronized int somaArray(int[] array){

        soma=0;

        for(int i=0; i<array.length;i++){
            soma += array[i];

            System.out.println("executando a soma" + Thread.currentThread().getName() + array[i] + "total de" + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return soma;
    }

}
