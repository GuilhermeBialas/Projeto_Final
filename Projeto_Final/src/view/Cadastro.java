/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Guilherme Bialas(guilhermebialas31@gmail.com)
 * @author Marcio Pedro Schiehl(mpschiehl@outlook.com)
 * @date 2018-08-27
 */
public class Cadastro implements BaseInterfaceJava {

    private JFrame jFrameCadastro;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao, jLabelAplicacao,
            jLabelUnidadeDeMedida, jLabelLocalizacao, jLabelStatusPeca, jLabelPeso,
            jLabelCategoria, jLabelAutoSystems, jLabelRadioButtonNovo, jLabelRadioButtonSemiNovo;
    private JTextField jTextFieldQuantiade, jTextFieldValor, jTextFieldDescricao,
             jTextFieldPeso;
    private JButton jButtonSair, jButtonLimpar, jButtonAdicionar;
    private JRadioButton jRadioButtonNovo, jRadioButtonSemiNovo;
    private JComboBox jComboBoxLocalizacao, jComboBoxCategoria, jComboBoxUnidadeDeMedida;
    private JTextArea jTextAreaAplicacao;
    private JScrollPane jScrollPaneAplicacao;
    private ButtonGroup buttonGroup;

    public Cadastro() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoBotaoAdicionar();
        adicionarComboBoxLocalizacao();
        adicionarComboBoxCategoria();
        acaoBotaoLimpar();
        limparCampos();
        acaoSair();
        configurarJScrollPane();
        adicionarComboBoxUnidadeDeMedida();
        jFrameCadastro.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrameCadastro = new JFrame("Cadastro");
        jFrameCadastro.setSize(650, 400);
        jFrameCadastro.setLayout(null);
        jFrameCadastro.setLocationRelativeTo(null);
        jFrameCadastro.setResizable(false);
        jFrameCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        //jLabel's
        jFrameCadastro.add(jLabelQuantidade);
        jFrameCadastro.add(jLabelValor);
        jFrameCadastro.add(jLabelDescricao);
        jFrameCadastro.add(jLabelAplicacao);
        jFrameCadastro.add(jLabelUnidadeDeMedida);
        jFrameCadastro.add(jLabelLocalizacao);
        
        jFrameCadastro.add(jLabelStatusPeca);
        jFrameCadastro.add(jLabelPeso);
        jFrameCadastro.add(jLabelCategoria);
        jFrameCadastro.add(jLabelAutoSystems);
        jFrameCadastro.add(jLabelRadioButtonNovo);
        jFrameCadastro.add(jLabelRadioButtonSemiNovo);

        //JTextField's
        jFrameCadastro.add(jTextFieldQuantiade);
        jFrameCadastro.add(jTextFieldValor);
        jFrameCadastro.add(jTextFieldDescricao);

       

        jFrameCadastro.add(jTextFieldPeso);

        //JButton's
        jFrameCadastro.add(jButtonSair);
        jFrameCadastro.add(jButtonLimpar);
        jFrameCadastro.add(jButtonAdicionar);

        //CheckBox
        jFrameCadastro.add(jRadioButtonNovo);
        jFrameCadastro.add(jRadioButtonSemiNovo);

        //ComboBox
        jFrameCadastro.add(jComboBoxLocalizacao);
        jFrameCadastro.add(jComboBoxCategoria);
        jFrameCadastro.add(jComboBoxUnidadeDeMedida);

        //TextArea
        jFrameCadastro.add(jTextAreaAplicacao);

        //JScrollPane
        jFrameCadastro.add(jScrollPaneAplicacao);

    }

    @Override
    public void gerarLocalizacoes() {

        //Descricao
        jLabelDescricao.setLocation(20, 35);
        jTextFieldDescricao.setLocation(20, 60);

        //Quantidade
        jLabelQuantidade.setLocation(20, 85);
        jTextFieldQuantiade.setLocation(20, 110);

        //Valor
        jLabelValor.setLocation(20, 135);
        jTextFieldValor.setLocation(20, 160);

        //Aplicacao
        jLabelAplicacao.setLocation(20, 185);
        jTextAreaAplicacao.setLocation(20, 210);

        //UnidadeDeMedida
        jLabelUnidadeDeMedida.setLocation(190, 85);
        jComboBoxUnidadeDeMedida.setLocation(190, 110);

        //Localizacao
        jLabelLocalizacao.setLocation(420, 85);
        jComboBoxLocalizacao.setLocation(420, 110);

        //ValorUnitario
       

        //StatusPeca
        jLabelStatusPeca.setLocation(420, 35);
        jRadioButtonNovo.setLocation(420, 60);
        jRadioButtonSemiNovo.setLocation(500, 60);
        jLabelRadioButtonNovo.setLocation(450, 60);
        jLabelRadioButtonSemiNovo.setLocation(530, 60);

        //Peso
        jLabelPeso.setLocation(300, 85);
        jTextFieldPeso.setLocation(300, 110);

        //BotaoSair
        jButtonSair.setLocation(320, 300);

        //BotaoLimpar
        jButtonLimpar.setLocation(180, 300);

        //BotaoAdicionar
        jButtonAdicionar.setLocation(40, 300);

        //Categoria
        jLabelCategoria.setLocation(190, 135);
        jComboBoxCategoria.setLocation(190, 160);

        jLabelAutoSystems.setLocation(10, 10);

        //SCrollPane
        jScrollPaneAplicacao.setLocation(20, 210);
    }

    @Override
    public void gerarDimensoes() {

        //JButton's
        jButtonSair.setSize(100, 35);
        jButtonLimpar.setSize(100, 35);
        jButtonAdicionar.setSize(100, 35);
        //JTextField's
        jTextFieldQuantiade.setSize(150, 20);
        jTextFieldValor.setSize(150, 20);
        jTextFieldDescricao.setSize(350, 20);

        jComboBoxUnidadeDeMedida.setSize(100, 20);

      

        jTextFieldPeso.setSize(110, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(150, 20);
        jLabelAplicacao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelLocalizacao.setSize(100, 20);
        
        jLabelStatusPeca.setSize(100, 20);
        jLabelPeso.setSize(100, 20);
        jLabelCategoria.setSize(100, 20);

        jLabelRadioButtonNovo.setSize(50, 20);
        jLabelRadioButtonSemiNovo.setSize(100, 20);
        //RadioButton
        jRadioButtonNovo.setSize(20, 20);
        jRadioButtonSemiNovo.setSize(20, 20);
        //  jLabelAutoSystems.setSize(200, 200);

        //ComboBox
        jComboBoxCategoria.setSize(200, 20);
        jComboBoxLocalizacao.setSize(200, 20);

        //TextArea
        jTextAreaAplicacao.setSize(600, 80);

        //ScrollPane
        jScrollPaneAplicacao.setSize(600, 80);
    }

    @Override
    public void instanciarComponentes() {
        //JLabel's 
        jLabelQuantidade = new JLabel("Quantidade: ");
        jLabelValor = new JLabel("Valor: ");
        jLabelDescricao = new JLabel("Descrição do produto: ");
        jLabelAplicacao = new JLabel("Aplicação: ");
        jLabelUnidadeDeMedida = new JLabel("Und Medida: ");
        jLabelLocalizacao = new JLabel("Localização: ");
      
        jLabelStatusPeca = new JLabel("Status da Peça: ");
        jLabelPeso = new JLabel("Peso: ");
        jLabelCategoria = new JLabel("Categoria: ");
        jLabelRadioButtonNovo = new JLabel("Novo: ");
        jLabelRadioButtonSemiNovo = new JLabel("Semi Novo: ");

        //JTextField's
        jTextFieldQuantiade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");

      

        jTextFieldPeso = new JTextField("");

        //JButton's
        jButtonSair = new JButton("Sair");
        jButtonLimpar = new JButton("Limpar");
        jButtonAdicionar = new JButton("Adicionar");

        buttonGroup = new ButtonGroup();

        //RadioButton
        jRadioButtonNovo = new JRadioButton("Novo");
        jRadioButtonSemiNovo = new JRadioButton("");

        buttonGroup.add(jRadioButtonNovo);
        buttonGroup.add(jRadioButtonSemiNovo);

        //ComboBox
        jComboBoxLocalizacao = new JComboBox();
        jComboBoxCategoria = new JComboBox();
        jComboBoxUnidadeDeMedida = new JComboBox();

        jLabelAutoSystems = new JLabel("");

        jTextAreaAplicacao = new JTextArea();

        //SCrollPane
        jScrollPaneAplicacao = new JScrollPane();
    }

    private void adicionarComboBoxCategoria() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Acessórios e acabamento", "Injeção e carburador",
            "Motor", "Polias e tensores", "Retentor e junta", "Supenção e freios", "Correas e corrente de comando"
        });
        jComboBoxCategoria.setModel(modelo);
        jComboBoxCategoria.setSelectedIndex(-1);
    }

    private void adicionarComboBoxLocalizacao() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia",
            "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais,"
            + "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia",
            "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"});
        jComboBoxLocalizacao.setModel(modelo);
        jComboBoxLocalizacao.setSelectedIndex(-1);
    }

    private void adicionarComboBoxUnidadeDeMedida() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{"Kit", "Peça"});
        jComboBoxUnidadeDeMedida.setModel(modelo);
        jComboBoxUnidadeDeMedida.setSelectedIndex(-1);
    }

    private void acaoBotaoAdicionar() {
        jButtonAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                validacao();

            }
        });

    }

    private void limparCampos() {
        jTextFieldQuantiade.setText("");
        jTextFieldValor.setText("");
        jTextFieldDescricao.setText("");
        jTextAreaAplicacao.setText("");
        jComboBoxUnidadeDeMedida.setSelectedIndex(-1);
        jComboBoxLocalizacao.setSelectedIndex(-1);
       
        jTextFieldPeso.setText("");
        jComboBoxCategoria.setSelectedIndex(-1);
        buttonGroup.clearSelection();
        jTextFieldDescricao.requestFocus();
    }

    private void acaoBotaoLimpar() {
        jButtonLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
    }

    private void acaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?"
                                                                  +"\nSe você não salvou perderá todo o cadastro","Aviso",JOptionPane.ERROR_MESSAGE);
                if (resposta == 0) {
                    jFrameCadastro.dispose();
                }
                                                              
            }
        });
    }

    private void configurarJScrollPane() {
        jScrollPaneAplicacao.setViewportView(jTextAreaAplicacao);
        jScrollPaneAplicacao.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneAplicacao.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaAplicacao.setLineWrap(true);

    }

    private void validacao() {
        if (jTextFieldDescricao.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null,
                    "A descricao deve conter no mínimo três caracteres", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
            return;
        }
        if (!jRadioButtonNovo.isSelected() && !jRadioButtonSemiNovo.isSelected()) {
            JOptionPane.showMessageDialog(null,
                    "Deve ser selecionado se é novo ou semi novo", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;

        }

        if (jTextFieldQuantiade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Quantidade deve ser informada", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldQuantiade.requestFocus();
            return;
        }

        if (Float.parseFloat(jTextFieldQuantiade.getText()) <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Quantidade deve ser no minímo uma unidade", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldQuantiade.requestFocus();
            return;
        }
        if (jComboBoxUnidadeDeMedida.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "Unidade de Medida deve ser Preenchida", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxUnidadeDeMedida.requestFocus();
            return;
        }
        if (jTextFieldPeso.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "O Peso deve ser Informado", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldPeso.requestFocus();
            return;
        }
        if (jComboBoxLocalizacao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A Localização deve ser Informado", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxLocalizacao.requestFocus();
            return;
        }
        if (jTextFieldValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Valor deve ser informado.", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldValor.requestFocus();
            return;

        }
        if (Float.parseFloat(jTextFieldValor.getText()) <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Valor deve ser maior que 0", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldValor.requestFocus();
            return;
        }
        if (jComboBoxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null,
                    "A Categoria deve ser Informado", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jComboBoxCategoria.requestFocus();
            return;
        }
      
        if (jTextAreaAplicacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A Aplicacao deve ser preenchida", "Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
            return;
        }

    }
}
