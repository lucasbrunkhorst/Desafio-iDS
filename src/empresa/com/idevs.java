package empresa.com;

public class idevs {

        static int calcularDivisores(int numero) {
            int quantidadeDeDivisores = 0;

            for (int i = 1; i <= numero; i++) {

                if(numero % i == 0){

                    quantidadeDeDivisores++;
                }
            }
            return quantidadeDeDivisores;
        }

        public static void main(String[] args) {

            Integer qtdDivisoresNumeroAnterior = null;

            for (int i = 1; i <= 10000; i++){

                int qtdDivisoresNumeroAtual = calcularDivisores(i);

                if(qtdDivisoresNumeroAnterior != null){

                    if(qtdDivisoresNumeroAnterior == qtdDivisoresNumeroAtual){

                        System.out.println(i - 1);
                    }
                }
                qtdDivisoresNumeroAnterior = qtdDivisoresNumeroAtual;
            }

        }













}