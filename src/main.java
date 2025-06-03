import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        cadastro cadastro = new cadastro();

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
                    JOptionPane.showMessageDialog(null, "Mostrando usuários...");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Excluindo usuários...");
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }

        } while (!"0".equals(opcao));
    }












    }

