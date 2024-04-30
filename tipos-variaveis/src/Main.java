public class Main {
    public static void main(String[] args) {
        // Data types
        byte a = 127;
        short b = 32767;
        int c = 2147483647; // ~= 2^31 / 32 bits
        long d = 9223372036854775807L; // ~= 2^63 / 64 bits

        float e = 1.1234567f;
        System.out.println(e);
        double f = 1.123456789012345d;
        System.out.println(f);
        double g = 2E4d;
        System.out.println(g);

        boolean h = true; //or false

        char i = 'A'; // Pode-se usar a tabela ASCII
        String j = "Cadeia de caracteres";



        // Casting automático
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        System.out.println(numeroNormal);

        // Casting manual
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        // Variável
        int numero = 1;
        numero = 2;
        System.out.println(numero);

        // Constante
        final int NUMERO_CONSTANTE = 10;
        System.out.println(NUMERO_CONSTANTE);
    }
}