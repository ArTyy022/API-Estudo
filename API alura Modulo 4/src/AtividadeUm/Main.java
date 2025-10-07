package AtividadeUm;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String conteudo = "Conteúdo a ser gravado no arquivo.";

        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write(conteudo);
        escrita.close();
    }
}
