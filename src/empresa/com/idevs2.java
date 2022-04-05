package empresa.com;

import java.util.List;
import java.util.Scanner;

public class idevs2 {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha uma Palavra");

            String palavra = sc.next().toLowerCase();

            int quantidadeDePontos = 0;

                for (int i = 0; i < palavra.length(); i++) {

                    if (List.of('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't').contains(palavra.charAt(i))){
                        quantidadeDePontos += 1;
                    }
                        if (List.of('d', 'g').contains(palavra.charAt(i))){
                            quantidadeDePontos += 2;
                        }

                        if (List.of('b', 'c', 'm', 'p').contains(palavra.charAt(i))){
                            quantidadeDePontos += 3;
                        }

                        if (List.of('f', 'h', 'v', 'w', 'y').contains(palavra.charAt(i))){
                            quantidadeDePontos += 4;
                        }

                        if (List.of('k').contains(palavra.charAt(i))){
                            quantidadeDePontos += 5;
                        }

                        if (List.of('j', 'x').contains(palavra.charAt(i))){
                            quantidadeDePontos += 8;
                        }

                        if (List.of('q', 'z').contains(palavra.charAt(i))){
                            quantidadeDePontos += 10;
                        }
                }

            System.out.println("Essa palavra contém " + quantidadeDePontos + " pontos");

        }

}
