/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Interface.BaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo Moreira
 */
public class Vendas implements BaseInterfaceJava {

    private JFrame jFrameVendas;
    private JLabel jLabelQuantidade, jLabelValor, jLabelDescricao,
            jLabelUnidadeDeMedida, jLabelValorUnitario, jLabelStatusPeca, jLabelPeso;
    private JTextField jTextFieldQuantiade, jTextFieldValor, jTextFieldDescricao, jTextFieldAplicacao, jTextFieldUnidadeDeMedida,
            jTextFieldLocalizacao, jTextFieldValorUnitario, jTextFieldStatusPeca, jTextFieldPeso;
    private JButton jButtonVender, jButtonExcluir, jButtonSair;
    private DefaultTableModel dtm;
    private JScrollPane jScrollPane;
    private JTable jTablePedido;

    public Vendas() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configuarJTable();
        acaoBotaoSair();
        acaoBotaoVender();
        jFrameVendas.setVisible(true);

    }

    @Override
    public void instanciarComponentes() {
        jLabelQuantidade = new JLabel("Quantidade");
        jLabelValor = new JLabel("Valor");
        jLabelDescricao = new JLabel("Descricao");
        jLabelUnidadeDeMedida = new JLabel("Unidade De medida");
        jLabelValorUnitario = new JLabel("ValorUnitario");
        jLabelStatusPeca = new JLabel("Status da Peça");
        jLabelPeso = new JLabel("Peso");

        //JTextField's
        jTextFieldQuantiade = new JTextField("");
        jTextFieldValor = new JTextField("");
        jTextFieldDescricao = new JTextField("");
        jTextFieldAplicacao = new JTextField("");
        jTextFieldUnidadeDeMedida = new JTextField("");
        jTextFieldLocalizacao = new JTextField("");
        jTextFieldValorUnitario = new JTextField("");
        jTextFieldStatusPeca = new JTextField("");
        jTextFieldPeso = new JTextField("");

        //JButton's
        jButtonVender = new JButton("Vender");
        jButtonExcluir = new JButton("Cancelar");
        jButtonSair = new JButton("Sair");
        
        //JTable's
        jTablePedido = new JTable();
        configuarJTable();
        jScrollPane = new JScrollPane(jTablePedido);
    }

    @Override
    public void gerarTela() {
        jFrameVendas = new JFrame("Venda de Produtos");
        jFrameVendas.setSize(800, 600);
        jFrameVendas.setLayout(null);
        jFrameVendas.setLocationRelativeTo(null);
        jFrameVendas.setResizable(false);
        jFrameVendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrameVendas.add(jLabelQuantidade);
        jFrameVendas.add(jLabelValor);
        jFrameVendas.add(jLabelDescricao);
        jFrameVendas.add(jLabelUnidadeDeMedida);
        jFrameVendas.add(jLabelValorUnitario);
        jFrameVendas.add(jLabelStatusPeca);
        jFrameVendas.add(jLabelPeso);

        //JTextField's
        jFrameVendas.add(jTextFieldQuantiade);
        jFrameVendas.add(jTextFieldValor);
        jFrameVendas.add(jTextFieldDescricao);
        jFrameVendas.add(jTextFieldAplicacao);
        jFrameVendas.add(jTextFieldUnidadeDeMedida);
        jFrameVendas.add(jTextFieldLocalizacao);
        jFrameVendas.add(jTextFieldValorUnitario);
        jFrameVendas.add(jTextFieldStatusPeca);
        jFrameVendas.add(jTextFieldPeso);

        //JButton's
        jFrameVendas.add(jButtonVender);
        jFrameVendas.add(jButtonExcluir);
        jFrameVendas.add(jButtonSair);
        
        //JTable's
        jFrameVendas.add(jScrollPane);
    }

    @Override
    public void gerarDimensoes() {
        //JButton's
        jButtonVender.setSize(100, 50);
        jButtonExcluir.setSize(100, 50);
        jButtonSair.setSize(100, 50);

        //JTextField's
        jTextFieldQuantiade.setSize(100, 20);
        jTextFieldValor.setSize(100, 20);
        jTextFieldDescricao.setSize(100, 20);
        jTextFieldAplicacao.setSize(100, 20);
        jTextFieldUnidadeDeMedida.setSize(100, 20);
        jTextFieldLocalizacao.setSize(100, 20);
        jTextFieldValorUnitario.setSize(100, 20);
        jTextFieldStatusPeca.setSize(100, 20);
        jTextFieldPeso.setSize(100, 20);

        //JLabel's
        jLabelQuantidade.setSize(100, 20);
        jLabelValor.setSize(100, 20);
        jLabelDescricao.setSize(100, 20);
        jLabelUnidadeDeMedida.setSize(100, 20);
        jLabelValorUnitario.setSize(100, 20);
        jLabelStatusPeca.setSize(100, 20);
        jLabelPeso.setSize(100, 20);
        
        //JTable's
        jScrollPane.setSize(400,400);

    }

    @Override
    public void gerarLocalizacoes() {
        //Descricao
        jLabelDescricao.setLocation(10, 10);
        jTextFieldDescricao.setLocation(120, 10);

        //Quantidade
        jLabelQuantidade.setLocation(10, 40);
        jTextFieldQuantiade.setLocation(120, 40);

        //Valor
        jLabelValor.setLocation(10, 70);
        jTextFieldValor.setLocation(120, 70);

        //Aplicacao
        jTextFieldAplicacao.setLocation(120, 100);

        //UnidadeDeMedida
        jLabelUnidadeDeMedida.setLocation(10, 140);
        jTextFieldUnidadeDeMedida.setLocation(120, 140);

        //Localizacao
        jTextFieldLocalizacao.setLocation(120, 180);

        //ValorUnitario
        jLabelValorUnitario.setLocation(10, 210);
        jTextFieldValorUnitario.setLocation(120, 210);

        //StatusPeca
        jLabelStatusPeca.setLocation(10, 240);
        jTextFieldStatusPeca.setLocation(120, 240);

        //Peso
        jLabelPeso.setLocation(10, 280);
        jTextFieldPeso.setLocation(120, 280);

        //BotaoSalvar
        jButtonVender.setLocation(10, 320);

        //BotaoExcluir
        jButtonExcluir.setLocation(120, 320);

        //BotaoSair
        jButtonSair.setLocation(230, 320);
        
        //Jtable
        jScrollPane.setLocation(340,10);
    }

    private void acaoBotaoVender() {
        jButtonVender.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void acaoBotaoSair() {
        jButtonSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jFrameVendas.dispose();
            }
        });
    }

    private void configuarJTable() {
        dtm = new DefaultTableModel();
        dtm.addColumn("Descrição");
        dtm.addColumn("Quantidade");
        dtm.addColumn("Valor unitario");
        dtm.addColumn("Valor Total");
        jTablePedido.setModel(dtm);
    }

}
