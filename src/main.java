import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        cadastro cadastro = new cadastro();
        usuario usuario = new usuario();


        String tabela = "escolha uma opção" +
                "\n 1 - cadastrar usuário " +
                "\n 2 - mostrar usuarios " +
                "\n 3 - excluir usuarios " +
                "\n 0 - sair";

        String opcao = "";

        do {
            opcao = JOptionPane.showInputDialog(null, tabela);

            if (opcao == null) {
                break;
            }

            switch (opcao) {
                case "1":
                    cadastro.cadastrarNome("");
                    break;

                 case "2":
                        List<String> nomes = usuario.lerUsuarios();
                            StringBuilder lista = new StringBuilder("Usuários cadastrados:\n");
                            for (String nome : nomes) {
                                lista.append("- ").append(nome).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, lista.toString());
                        break;

                        case "3":
                            excluirUsuario excl = new excluirUsuario();
                            excl.excluirUsuario();
                            break;

                        case "0":
                            JOptionPane.showMessageDialog(null, "Saindo...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                            break;
                    }

            }
            while (!"0".equals(opcao)) ;

    }












    }

