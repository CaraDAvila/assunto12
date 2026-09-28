import java.util.Scanner;

public class Menu {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int opcao=0;
        ArvoreAVL avl = new ArvoreAVL();

        do {
            System.out.println("---MENU---");
            System.out.println("0 - Sair do programa\n" +
                    "1 - Insere 1 valor na AVL;\n" +
                    "2 - Apresenta pós ordem os nós da árvore apresentando também o FB do nó;\n" +
//                    "3- Remove um nó escolhido por seu conteúdo\n" +
//                    "4- Apresenta o número de nós presentes na árvore\n");

            switch (opcao) {
                case 0 -> {
                    System.out.println("ENCERRANDO PROGRAMA...");
                }
                case 1-> { System.out.println("\t Digite o valor a ser inserido na AVL");
                    int valor = sc.nextInt();
                    avl.root = avl.inserirH(avl.root,valor);}

                case 2-> {
                    System.out.println("\t Apresentando AVL");
                }
//                case 3->{
//
//                }
//                case 4->{
//                }
                default->{
                    System.out.println("\t OPCAO INVALIDA");
                }
            }
        }while (opcao!=0);
    }
}
