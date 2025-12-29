import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteHashMap {
    public static void main(String[] args) {
        //HashMap = Key, value (chave, valor)
        //Ele aramazena dados em pares de chave-valor, cada chave é única para um valor

        HashMap<String, Double> resultado = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno e a nota: ");
        resultado.put(scanner.nextLine(), scanner.nextDouble());

//        for (String nome : resultado.keySet()){
//            double nota = resultado.get(nome);
//            System.out.print(nome + " : " + nota);
//        }

        //ou

        for (Map.Entry<String, Double> nota : resultado.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }
    }
}
