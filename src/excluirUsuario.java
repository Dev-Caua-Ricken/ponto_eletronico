import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class excluirUsuario {

    public void excluirUsuario() throws IOException {

        usuario usuario = new usuario();
        List<String> usuarios = usuario.lerUsuarios();

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
            return;
        }

        String nomeParaExcluir = JOptionPane.showInputDialog("Digite o nome que deseja excluir:");

        if (nomeParaExcluir != null && !nomeParaExcluir.trim().isEmpty()) {
            if (usuarios.remove(nomeParaExcluir)) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter("usuários.txt"));
                for (String nome : usuarios) {
                    escritor.write(nome + "\n");
                }
                escritor.close();
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido ou exclusão cancelada.");
        }
    }

}
