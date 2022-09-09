public class EvaluacionTecnicaPil {
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirConsigna(1);

        int num1;
        double num2;
        boolean val3;

        imprimirConsigna(2);

        num1 = 46;
        num2 = 56.5;
        val3 = true;

        int resultado1 = num1*num1;
        double resultado2 = num2 * num2 + num1;

        // Desarrollo de la consigna 3.
        if(resultado1 > 100){
            System.out.println("resultado1 = " + resultado1);
            System.out.println("resultado2 = " + resultado2);
        }
        else{
            System.err.println("Error, condición falsa");
        }

        imprimirConsigna(3);

        int valor = 10;
        System.out.println("Valor inicial= " + valor);

        int dobleValorInicial = (valor*2);
        while (valor<dobleValorInicial){
            valor++;
        }

        System.out.println("Valor final= " + valor);

        float valorTercio = (float)valor/3;
        for (int i = 0;i < valorTercio; i++){
            System.out.println("Iteración N°: " + i);
        }



    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
