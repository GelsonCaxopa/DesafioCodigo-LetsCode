import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int tam = ListaCompras.tam;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a operação que gostaria de executar?\n");
        System.out.println("1: Lançar lista de Compras \n2: Lançar Compras \n3: Fechar Programa");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:

                ListaCompras.listaCompras();

                main(args);

            case 2:
                if (tam == 0) {
                    System.out.println("Favor lançar lista de compras!");

                    main(args);
                } else {
                    ListaComprados.listaComprados(args);
                    main(args);
                }

            case 3:
                break;

        }

    }

}
