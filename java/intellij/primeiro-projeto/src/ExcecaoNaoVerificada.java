import java.util.Scanner;

public class ExcecaoNaoVerificada {
    public static void main(String[] args) {
        //Exceção NÃO Verificada é quando o compilador NÃO te obrigar a ter tratamento de erro

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        String verificarCPF = verificarCPF(scanner.nextLine());
        System.out.println(verificarCPF);
    }

    public static String verificarCPF(String cpf) {
        try {
            if (cpf.equals("00012345600")) {
                throw new ConflictException("CPF já cadastrado " + cpf);
            } else {
                return "CPF válidado, usuário cadastrado";
            }
        } catch (ConflictException e){
            throw new ConflictException("CPF já cadastrado " + cpf);
        }
    }

    //API = ponte
    //REST = padrão
    //HTTP = ação
    //JSON/XML = dados
}
