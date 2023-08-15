import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um cep:  ");
        var cep = leitura.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraArquivoJson(novoEndereco);
        }catch (RuntimeException | IOException e ){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}