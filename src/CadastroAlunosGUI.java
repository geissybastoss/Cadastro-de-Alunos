import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroAlunosGUI {
    
    private ArrayList<Aluno> listaAlunos = new ArrayList<>(); // Lista para armazenar os alunos cadastrados

    // Componentes da interface gráfica
    private JFrame frame;
    private JTextArea textArea;

    
    public CadastroAlunosGUI() { // Construtor da classe GUI
        // Configurações da janela
        frame = new JFrame("Cadastro de Alunos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do painel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel); // Método para adicionar componentes à interface

        frame.setVisible(true); // Torna a janela visível
    }

    // Método para adicionar componentes à interface
    /**
     * @param panel
     */
    private void placeComponents(JPanel panel) {
        panel.setLayout(null); 

        textArea = new JTextArea();
        textArea.setBounds(10, 10, 360, 200);
        panel.add(textArea);

        
        JButton addButton = new JButton("Adicionar Aluno"); // Botão para adicionar um novo aluno
        addButton.setBounds(10, 220, 150, 30);
        panel.add(addButton);

        
        JButton viewButton = new JButton("Visualizar Alunos"); // Botão para visualizar os alunos cadastrados
        viewButton.setBounds(170, 220, 150, 30);
        panel.add(viewButton);

        
        addButton.addActionListener(new ActionListener() { // ação para o botão de adicionar aluno
            public void actionPerformed(ActionEvent e) {
                // Solicita informações do aluno ao usuário
                String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
                String matricula = JOptionPane.showInputDialog("Digite a matricula do aluno:");
                
                Aluno aluno = new Aluno(nome, idade, matricula); // Cria um objeto Aluno com as informações fornecidas e adiciona à lista
                listaAlunos.add(aluno);
                
                JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!"); // Exibe mensagem de sucesso
            }
        });

        // ação para o botão de visualizar alunos
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                // Constroi uma string com os detalhes de todos os alunos na lista
                StringBuilder sb = new StringBuilder();
                for (Aluno aluno : listaAlunos) {
                    sb.append(aluno.toString()).append("\n");
                }
                
                textArea.setText(sb.toString()); // Exibe a lista na area de texto
            }
        });
    }

    // Metodo principal para iniciar o aplicativo
    public static void main(String[] args) {
        new CadastroAlunosGUI();
    }
}
