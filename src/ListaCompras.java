import java.util.Scanner;

public class ListaCompras {

    static int tam = 0;

    public static void listaCompras() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos itens gostaria de comprar?");

        int qtdItens = sc.nextInt();

        String[] lista = new String[qtdItens];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Entre com um item:");
            lista[i] = sc.next();

        }

        tam = lista.length;

        System.out.println(tam);

    }

}
