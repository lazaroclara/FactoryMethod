package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //menu de opções
        System.out.println("Tipos de notificação:\n" +
                "1 - E-mail \n" +
                "2 - SMS \n" +
                "3 - Push \n " +
                "Escolha o tipo desejado: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Mensagem a ser enviada: ");
        String mensagem = scanner.nextLine();

        //declaração de uma variável do tipo Notification para podermos manipular de acordo com a escolha do tipo de mensagem do usuário
        Notification notification;

        //utilização do switch para manipular a mensagem escolhida pelo usuário
        switch (escolha) {
            case 1:
                notification = NotificationFactory.createNotification("email");
                break;
            case 2:
                notification = NotificationFactory.createNotification("sms");
                break;
            case 3:
                notification = NotificationFactory.createNotification("push");
                break;
            default:
                System.out.println("Opção inválida!");

                return;
        }
        notification.send(mensagem);
        scanner.close();
    }
}