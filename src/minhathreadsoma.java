public class minhathreadsoma {

    private String nome;
    private int [] nums;
    private static calculadorathread calc = new calculadorathread();

    public minhathreadsoma(String nome, int[] nums){
        this.nome=nome;
        this.nums=nums;
        new Thread((Runnable) this,nome).start();
    }

    public void run(){

        System.out.println(this.nome + "iniciada");
        int soma = calc.somaArray(this.nums);

        System.out.println(this.nome + "resultado" + this.nome + "é" + soma);
        System.out.println(this.nome + "terminada");
    }
    
}
