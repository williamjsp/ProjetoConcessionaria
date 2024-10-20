package Utilidades;

import java.util.Scanner;

public class Verificadores {
    static Scanner scan = new Scanner(System.in);

    public static String verificacaoCPF(String cpf){
        String cpfRegex = "\\d{3}\\d{3}\\d{3}\\d{2}";

        while(!cpf.matches(cpfRegex)) {
            System.out.println("CPF no formato incorreto, digite novamente: ");
            cpf = scan.nextLine();
        }
        return cpf;
    }
    public static String verificacaoTelefone(String telefone){
        String telefoneRegex = "9\\d{4}\\d{4}";

        while(!telefone.matches(telefoneRegex)) {
            System.out.println("Telefone no formato incorreto, digite novamente: ");
            telefone = scan.nextLine();
        }
        return telefone;
    }

    public static String verificacaoEmail(String email){
        String emailRegex = "^[\\w-.]+@[\\w-.]+\\.[a-zA-Z]{2,}$";

        while(!email.matches(emailRegex)){
            System.out.println("Digite novamente, o email não está no formato correto");
            email = scan.nextLine();
        }
        return email;
    }

    public static String verificacaoPlaca(String placa) {
        String placaRegex = "^[A-Za-z0-9]{7}$";
        while (!placa.matches(placaRegex)) {

            System.out.println("Máximo de 7 digitos, digite novamente: ");
            placa = scan.nextLine().toUpperCase();
        }
        return placa;
    }
    public static char verificacaoAdminOuCliente(){

        System.out.println("Você é admin ou cliente?");
        System.out.println("Digite 'c' se for cliente e digite 'a' se for admin");
        String funcionarioOuCliente = scan.nextLine();
        char verificacaoFuncionarioOuCliente = funcionarioOuCliente.charAt(0);

        while (!(verificacaoFuncionarioOuCliente == 'c' ||
                verificacaoFuncionarioOuCliente == 'a')){
            System.out.println("Entrada inválida! Digite novamente, apenas 'c' ou 'a'.");
            funcionarioOuCliente = scan.nextLine();
            verificacaoFuncionarioOuCliente = funcionarioOuCliente.charAt(0);
        }

        return verificacaoFuncionarioOuCliente;
    }
}
