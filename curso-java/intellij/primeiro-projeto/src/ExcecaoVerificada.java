import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecaoVerificada {
    public static void main(String[] args) {
        //Exceção Verificada é quando o compilador de obrigar a ter tratamento de erro
        //Leitor de arquivos
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\sousa\\Documents\\Projetos\\java\\java\\intellij\\Texto.txt"));
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo "+ e.getMessage());
            throw new RuntimeException(e);
        }

        //Ler linha por linha

    }
}
