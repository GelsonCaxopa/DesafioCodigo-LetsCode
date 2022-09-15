import java.util.Scanner;

public class ListaComprados {

    public static void listaComprados(String[] args) throws Exception {

        int tam = ListaCompras.tam;
        System.out.println(tam);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos itens foram comprados?");

        int qtdItens1 = sc.nextInt();

        String[] comprados = new String[qtdItens1];
        for (int i = 0; i < comprados.length; i++) {
            System.out.println("Entre com um item:");
            comprados[i] = sc.next();

        }
        int itensComprados = comprados.length;

        int c = (itensComprados * 100) / tam;

        if (c < 75) {
            System.out.printf("Correspondência de %d%%, gorjeta de R$3,00\n", c);
        } else if (c < 90) {
            System.out.printf("Correspondência de %d%%, gorjeta de R$5,00\n", c);
        } else {
            System.out.printf("Correspondência de %d%%, gorjeta de R$10,00\n", c);
        }

    }

}
