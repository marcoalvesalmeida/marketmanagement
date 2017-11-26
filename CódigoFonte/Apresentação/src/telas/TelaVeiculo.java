/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import br.edu.ifnmg.marketmanagement.aplicacao.RepositorioBuilder;
import br.edu.ifnmg.marketmanagement.aplicacao.Veiculo;
import br.edu.ifnmg.marketmanagement.aplicacao.VeiculoRepositorio;
import br.edu.ifnmg.marketmanagement.aplicacao.ViolacaoRegraNegocioException;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author marco
 */
public class TelaVeiculo extends javax.swing.JInternalFrame {
    private MaskFormatter maskPlaca;
    private MaskFormatter maskAno;
    private MaskFormatter maskModelo;
    private MaskFormatter maskMarca;

    
    /**
     * Creates new form TelaVeiculoInternal
     */
    public TelaVeiculo() throws ParseException {
        initComponents();
        rdGrupo.add(rdPlaca);
        rdGrupo.add(rdAno);
        rdGrupo.add(rdModelo);
        rdGrupo.add(rdMarca);
        
    }

    public final void setMascara(String mascara) throws ParseException {
        txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter(mascara)));
    }

    public final void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdPlaca = new javax.swing.JRadioButton();
        rdModelo = new javax.swing.JRadioButton();
        rdMarca = new javax.swing.JRadioButton();
        rdAno = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResultado = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("Editar");

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton3.setText("Novo");
        
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setText("Relatório");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar Veiculo por Placa:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 158, 158)), "Modos de Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(5, 0, 0))); // NOI18N

        rdPlaca.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rdPlaca.setText("Placa");
        
        rdModelo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rdModelo.setText("Modelo");
        
        rdMarca.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rdMarca.setText("Marca");

        rdAno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rdAno.setText("Ano");
        
        // cria as mascaras e já a deixa pronta pra uso
        try {
            maskPlaca = new MaskFormatter("UUU-####");
            maskAno = new MaskFormatter("####");
            maskMarca = new MaskFormatter("*****");
            maskModelo = new MaskFormatter("*****");
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        // adiciona um listener aos radiobuttons
        rdPlaca.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    txtPesquisa.setValue(null);
                    txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(maskPlaca));
                }
            }
        });

        rdAno.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    txtPesquisa.setValue(null);
                    txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(maskAno));
                }
            }
        });
        
        rdMarca.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    txtPesquisa.setValue(null);
                    txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(maskMarca));
                }
            }
        });

        rdModelo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    txtPesquisa.setValue(null);
                    txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(maskModelo));
                }
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdPlaca)
                    .addComponent(rdModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMarca)
                    .addComponent(rdAno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdAno))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdModelo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPesquisar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabResultado.setBorder(null);
        tabResultado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tabResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabResultado.setGridColor(new java.awt.Color(254, 254, 254));
        tabResultado.setRowMargin(0);
        jScrollPane1.setViewportView(tabResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed
/*
    private void rdAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAnoActionPerformed
        try {
            //setMascara("****");
            txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("####")));
        } catch (ParseException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdAnoActionPerformed

    private void rdPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPlacaActionPerformed
        txtPesquisa.setText("");
        try {
            //setMascara("UUU-####");
            txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("UUU-####")));
        } catch (ParseException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdPlacaActionPerformed

    private void rdModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdModeloActionPerformed
        txtPesquisa.setText("");
        try {
            //setMascara("**********");
            txtPesquisa.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("*********")));
        } catch (ParseException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rdModeloActionPerformed
    */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        System.out.println(txtPesquisa);
        try {
            VeiculoRepositorio veiculos = RepositorioBuilder.getVeiculoRepositorio();
            
            Veiculo filtro = new Veiculo();
            
            if(!txtPesquisa.getText().isEmpty() && txtPesquisa!=null){
                if(rdPlaca.isSelected())
                    filtro.setPlaca(txtPesquisa.getText());
                else if(rdAno.isSelected())
                    filtro.setAnoFab(Integer.parseInt(txtPesquisa.getText()));
                //else if(rdMarca.isSelected())
                    //filtro.setMarca(txtPesquisa.getText());
                else if(rdModelo.isSelected())
                    filtro.setModelo(txtPesquisa.getText());  
            }
           
            List<Veiculo> resultado = (List<Veiculo>) veiculos.buscar(filtro);
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("ID");
            modelo.addColumn("Placa");
            modelo.addColumn("Modelo");
            
            for(Veiculo v : resultado){
                Vector valores = new Vector();
                valores.add(v.getId());
                valores.add(v.getPlaca());
                valores.add(v.getModelo());                
                modelo.addRow(valores);
            }
            
            tabResultado.setModel(modelo);
            
        } catch (ViolacaoRegraNegocioException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdAno;
    private javax.swing.ButtonGroup rdGrupo;
    private javax.swing.JRadioButton rdMarca;
    private javax.swing.JRadioButton rdModelo;
    private javax.swing.JRadioButton rdPlaca;
    private javax.swing.JTable tabResultado;
    private javax.swing.JFormattedTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

}
