import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TesteTreeMap {
    public static void main(String[] args) {
        //Diferente do HashMap o TreeMap mantem a ordem

        TreeMap<String, Double> resultado = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        int seguir = 1;

        do {
            System.out.println("Digite o nome do aluno e a nota: ");
            resultado.put(scanner.nextLine(), scanner.nextDouble());

            System.out.println("Digite 1 para cadastrar ou 0 para sair: ");
            seguir = scanner.nextInt();
            scanner.nextLine();
        } while (seguir == 1);
//        for (String nome : resultado.keySet()){
//            double nota = resultado.get(nome);
//            System.out.print(nome + " : " + nota);
//        }

            //ou
        for (Map.Entry<String, Double> nota : resultado.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        System.out.println("1° chave: "+resultado.firstKey());
        System.out.println("Ultima chave: "+resultado.lastKey());
    }
}
