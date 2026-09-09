package Oficina;
import java.util.Scanner;

public class Cofre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Cofre Di carlos";
        String senhaCorreta = "1234";

        int limiteTentativas = 3;
        int tentativas = 0;

        boolean cofreAberto = false;


        System.out.println("=================================");
        System.out.println("        " + nome);
        System.out.println("=================================");

        System.out.println("Sistema de segurança ativado.");
        System.out.println("Você possui " + limiteTentativas + " tentativas.");



        while (tentativas < limiteTentativas && !cofreAberto) {

            System.out.print("\nDigite a senha: ");
            String senha = scanner.nextLine();

            // Verifica a senha
            if (senha.equals(senhaCorreta)) {

                cofreAberto = true;

                System.out.println("\n=================================");
                System.out.println("        COFRE ABERTO!");
                System.out.println("=================================");
                System.out.println("Acesso autorizado.");
            } else {

                tentativas++;

                System.out.println("\n❌ Senha incorreta!");

                int restantes = limiteTentativas - tentativas;

                if (restantes > 0) {

                    System.out.println(
                        "Tentativas restantes: " + restantes
                    );

                } else {

                    System.out.println("\n🚨 COFRE BLOQUEADO!");
                    System.out.println("Número máximo de tentativas atingido.");
                }
            }
        }

        if (cofreAberto) {

            System.out.println("\nObrigado por utilizar o sistema!");

        } else {

            System.out.println("\nSistema encerrado.");
        }

        scanner.close();
    }
}