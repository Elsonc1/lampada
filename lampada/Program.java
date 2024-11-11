package lampada;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println(">>> INÍCIO DO SOFTWARE DA LÂMPADA <<<");
        System.out.print("COR: ");
        String cor = scanner.nextLine();

        System.out.print("MARCA: ");
        String marca = scanner.nextLine();

        System.out.print("MODELO: ");
        String modelo = scanner.nextLine();

        System.out.print("VOLTAGEM: ");
        String voltagem = scanner.nextLine();

        System.out.print("TIPO: ");
        String tipo = scanner.nextLine();
        
        int garantiaMeses;
        System.out.printf("GARANTIA: %n");
        garantiaMeses = scanner.nextInt();
        scanner.nextLine();
        String garantia = garantiaMeses + " meses";

        System.out.print("PREÇO - R$: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Lampada lampada = new Lampada(marca, voltagem, tipo, modelo, cor, preco, garantia);

        System.out.println("STATUS: " + lampada.mostrarStatus());

        while (true) {
            System.out.println("Ligar/Desligar lâmpada? 0 – Sair / 1 – Sim / 2 – Não");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("*** Você encerrou o software. ***");
                break;
            } else if (opcao == 1) {
                lampada.mudarStatus();
                System.out.println("# Lâmpada " + lampada.mostrarStatus() + " #");
            } else if (opcao == 2) {
                System.out.println("# Lâmpada " + lampada.mostrarStatus() + " #");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}