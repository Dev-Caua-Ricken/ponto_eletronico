import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class usuario {

    public List<String> lerUsuarios() throws IOException {
        List<String> usuarios = new ArrayList<>();
        File arquivo = new File("usuários.txt");

        if (arquivo.exists()) {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                usuarios.add(linha);
            }

            leitor.close();
        } else {
            System.out.println("Arquivo de usuários não encontrado.");
        }

        return usuarios;
    }
}

