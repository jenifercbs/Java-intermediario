public class calculadora {

    enum Operacao{//escreva um enum contendo as 4 operações matemáticas
        SOMAR("+") {//construtor recebendo operação
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {//construtor recebendo operação
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        },MUTIPLICAR("*") {//construtor recebendo operação
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        },DIVIDIR("/") {//construtor recebendo operação
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo){
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);//método abstrato

        public String toString(){//metodo toString que retorna no símbolo da operação
            return this.simbolo;
        }
    }

    public static void main(String[]args){//método main para testar os operadores
        double x = 2.0;
        double y = 3.0;

        for(Operacao op : Operacao.values()){//usando método values para iterar o enum e testar todas as operações
            System.out.print(x + " ");
            System.out.print(op.toString()+ " ");
            System.out.print(y + " ");
            System.out.print(op.executarOperacao(x, y));
        }

    }

}
