 public class Main {
    public static void main(String[] args) {

        // Aritméticos
        double soma = 10.5 + 15.7; // 26.2
        int subtração = 113 - 25; // 88
        int multiplicação = 20 * 7; // 140
        int divisão = 15 / 3; // 5
        int modulo = 18 % 3; // 0
        double resultado = (10 * 7) + (20/4); // 35

        // Concatenação
        String concatenacao1 = "LINGUAGEM " + "JAVA";
        System.out.println(concatenacao1); // LINGUAGEM JAVA
        String concatenacao2 = 1+1+1+"1";
        System.out.println(concatenacao2); // 31

        // Incrementação
        int num = 5;
        num = num + 1;
        System.out.println(num); // 6
        num++;
        System.out.println(num); // 7

        // Negação
        boolean var = true;
        var = !var;
        System.out.println(var); // false

        // Ternário
        int a = 6;
        int b = 6;
        String result = a == b ? "true" : "false";
        System.out.println(result);

        // Relacionais
        String nomeUm = "MURILLO";
        String nomeDois = "MATHEUS";
        System.out.println(nomeUm != nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        // Lógicos

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }
        System.out.println("Fim");
    }
}