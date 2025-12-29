import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteArrayList {
    public static void main(String[] args) {
        //Array = .length
        //ArrayList = .size()

        //ArrayList = Wrapper Classes Integer/Double/Float/String/Long/Boolean/Byte/Short/Character
        //obs: ArrayList não aceita tipo primitivo

        List<String> listaNome = new ArrayList<>();
        List<Integer> listaIdade = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        listaNome.add(scanner.nextLine());

        System.out.print("Digite sua idade: ");
        listaIdade.add(scanner.nextInt());

        for (int i = 0; i < listaIdade.size(); i++) {
            System.out.println(listaNome.get(i) + " - " + listaIdade.get(i) + " anos");
        }
    }
}
