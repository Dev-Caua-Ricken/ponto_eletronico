import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cadastro {

    public String cadastrarNome ( String nome) throws IOException {

        nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Cadastro de Usuário");

        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!\nNome: " + nome);

            FileWriter fileWriter = new FileWriter("usuários.txt", true);
            BufferedWriter escritor = new BufferedWriter(fileWriter);

            escritor.write(nome + "\n");
            escritor.close();

            return nome;

        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado ou nome inválido.");
            return null;
        }

    }
}
