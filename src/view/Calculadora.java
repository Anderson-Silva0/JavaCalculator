/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Conexao;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.JFrame;
import model.Historico;

/**
 *
 * @author anrde
 */
public class Calculadora extends javax.swing.JFrame {

    private java.awt.event.ActionEvent evt1;

    float[] vt = new float[51];
    float[] vtt = new float[51];
    float result = 1f;
    String sinal;
    DecimalFormat df = new DecimalFormat();
    Historico historico = new Historico();
    float calculo = 0;
    int tamanho = 0;

    public Calculadora() {
        setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        for (int c = 0; c < vtt.length; c++) {
            vtt[c] = 1f;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn1 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        TxtResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnApagarCE = new javax.swing.JButton();
        btnApagarC = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Anderson");
        setAlwaysOnTop(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.setMaximumSize(new java.awt.Dimension(75, 22));
        btn1.setMinimumSize(new java.awt.Dimension(75, 22));
        btn1.setPreferredSize(new java.awt.Dimension(75, 22));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.setMaximumSize(new java.awt.Dimension(75, 22));
        btn7.setMinimumSize(new java.awt.Dimension(75, 22));
        btn7.setPreferredSize(new java.awt.Dimension(75, 22));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.setMaximumSize(new java.awt.Dimension(75, 22));
        btn4.setMinimumSize(new java.awt.Dimension(75, 22));
        btn4.setPreferredSize(new java.awt.Dimension(75, 22));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(75, 22));
        btn5.setMinimumSize(new java.awt.Dimension(75, 22));
        btn5.setPreferredSize(new java.awt.Dimension(75, 22));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setMaximumSize(new java.awt.Dimension(75, 22));
        btn0.setMinimumSize(new java.awt.Dimension(75, 22));
        btn0.setPreferredSize(new java.awt.Dimension(75, 22));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.setMaximumSize(new java.awt.Dimension(75, 22));
        btn9.setMinimumSize(new java.awt.Dimension(75, 22));
        btn9.setPreferredSize(new java.awt.Dimension(75, 22));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setAutoscrolls(true);

        TxtResultado.setEditable(false);
        TxtResultado.setBackground(new java.awt.Color(204, 204, 204));
        TxtResultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TxtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("    Calculadora Anderson");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtResultado)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.setMaximumSize(new java.awt.Dimension(75, 22));
        btn6.setMinimumSize(new java.awt.Dimension(75, 22));
        btn6.setPreferredSize(new java.awt.Dimension(75, 22));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setMaximumSize(new java.awt.Dimension(75, 22));
        btn2.setMinimumSize(new java.awt.Dimension(75, 22));
        btn2.setPreferredSize(new java.awt.Dimension(75, 22));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.setMaximumSize(new java.awt.Dimension(75, 22));
        btn8.setMinimumSize(new java.awt.Dimension(75, 22));
        btn8.setPreferredSize(new java.awt.Dimension(75, 22));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.setMaximumSize(new java.awt.Dimension(75, 22));
        btn3.setMinimumSize(new java.awt.Dimension(75, 22));
        btn3.setPreferredSize(new java.awt.Dimension(75, 22));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setMaximumSize(new java.awt.Dimension(75, 22));
        btnIgual.setMinimumSize(new java.awt.Dimension(75, 22));
        btnIgual.setPreferredSize(new java.awt.Dimension(75, 22));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnAdicao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdicao.setText("+");
        btnAdicao.setMaximumSize(new java.awt.Dimension(75, 22));
        btnAdicao.setMinimumSize(new java.awt.Dimension(75, 22));
        btnAdicao.setPreferredSize(new java.awt.Dimension(75, 22));
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSubtracao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.setMaximumSize(new java.awt.Dimension(75, 22));
        btnSubtracao.setMinimumSize(new java.awt.Dimension(75, 22));
        btnSubtracao.setPreferredSize(new java.awt.Dimension(75, 22));
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnDivisao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDivisao.setText("÷");
        btnDivisao.setMaximumSize(new java.awt.Dimension(75, 22));
        btnDivisao.setMinimumSize(new java.awt.Dimension(75, 22));
        btnDivisao.setPreferredSize(new java.awt.Dimension(75, 22));
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMultiplicacao.setText("×");
        btnMultiplicacao.setMaximumSize(new java.awt.Dimension(75, 22));
        btnMultiplicacao.setMinimumSize(new java.awt.Dimension(75, 22));
        btnMultiplicacao.setPreferredSize(new java.awt.Dimension(75, 22));
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnVirgula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVirgula.setText(",");
        btnVirgula.setMaximumSize(new java.awt.Dimension(75, 22));
        btnVirgula.setMinimumSize(new java.awt.Dimension(75, 22));
        btnVirgula.setPreferredSize(new java.awt.Dimension(75, 22));
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });

        btnApagarCE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnApagarCE.setText("CE");
        btnApagarCE.setMaximumSize(new java.awt.Dimension(75, 22));
        btnApagarCE.setMinimumSize(new java.awt.Dimension(75, 22));
        btnApagarCE.setPreferredSize(new java.awt.Dimension(75, 22));
        btnApagarCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCEActionPerformed(evt);
            }
        });

        btnApagarC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnApagarC.setText("C");
        btnApagarC.setMaximumSize(new java.awt.Dimension(75, 22));
        btnApagarC.setMinimumSize(new java.awt.Dimension(75, 22));
        btnApagarC.setPreferredSize(new java.awt.Dimension(75, 22));
        btnApagarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApagarCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApagarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarCE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCEActionPerformed
        TxtResultado.setText("");
    }//GEN-LAST:event_btnApagarCEActionPerformed

    private void btnApagarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCActionPerformed
        TxtResultado.setText("");

        for (int d = 0; d < vtt.length; d++) {
            vtt[d] = 1f;
        }

        for (int d = 0; d < vtt.length; d++) {
            vt[d] = 0f;
        }
        result = 0f;
        tamanho = 0;
    }//GEN-LAST:event_btnApagarCActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed

        if (tamanho < vt.length) {
            vt[tamanho] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));
            TxtResultado.setText("");
            tamanho++;
        } else {
            JOptionPane.showMessageDialog(this, "O vetor já está cheio, não é possível adicionar mais elementos");
        }
        sinal = "+";
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        TxtResultado.setText(TxtResultado.getText() + ",");
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            if (sinal.equals("+") || sinal.equals("-")) {
                vt[50] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));
            }
            vtt[50] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));

            if (sinal.equals("+")) {
                calculo = vt[0] + vt[1] + vt[2] + vt[3] + vt[4] + vt[5] + vt[6] + vt[7] + vt[8] + vt[9] + vt[10] + vt[11] + vt[12] + vt[13] + vt[14] + vt[15] + vt[16] + vt[17] + vt[18] + vt[19] + vt[20] + vt[21] + vt[22] + vt[23] + vt[24] + vt[25] + vt[26] + vt[27] + vt[28] + vt[29] + vt[30] + vt[31] + vt[32] + vt[33] + vt[34] + vt[35] + vt[36] + vt[37] + vt[38] + vt[39] + vt[40] + vt[41] + vt[42] + vt[43] + vt[44] + vt[45] + vt[46] + vt[47] + vt[48] + vt[49] + vt[50];

                TxtResultado.setText(String.valueOf(df.format(calculo)));

                for (int d = 0; d < vtt.length; d++) {
                    vt[d] = 0f;
                }
            }

            if (sinal.equals("-")) {
                calculo = vt[0] - vt[1] - vt[2] - vt[3] - vt[4] - vt[5] - vt[6] - vt[7] - vt[8] - vt[9] - vt[10] - vt[11] - vt[12] - vt[13] - vt[14] - vt[15] - vt[16] - vt[17] - vt[18] - vt[19] - vt[20] - vt[21] - vt[22] - vt[23] - vt[24] - vt[25] - vt[26] - vt[27] - vt[28] - vt[29] - vt[30] - vt[31] - vt[32] - vt[33] - vt[34] - vt[35] - vt[36] - vt[37] - vt[38] - vt[39] - vt[40] - vt[41] - vt[42] - vt[43] - vt[44] - vt[45] - vt[46] - vt[47] - vt[48] - vt[49] - vt[50];

                TxtResultado.setText(String.valueOf(df.format(calculo)));

                for (int d = 0; d < vtt.length; d++) {
                    vt[d] = 0f;
                }
            }

            if (sinal.equals("X")) {

                calculo = vtt[0] * vtt[1] * vtt[2] * vtt[3] * vtt[4] * vtt[5] * vtt[6] * vtt[7] * vtt[8] * vtt[9] * vtt[10] * vtt[11] * vtt[12] * vtt[13] * vtt[14] * vtt[15] * vtt[16] * vtt[17] * vtt[18] * vtt[19] * vtt[20] * vtt[21] * vtt[22] * vtt[23] * vtt[24] * vtt[25] * vtt[26] * vtt[27] * vtt[28] * vtt[29] * vtt[30] * vtt[31] * vtt[32] * vtt[33] * vtt[34] * vtt[35] * vtt[36] * vtt[37] * vtt[38] * vtt[39] * vtt[40] * vtt[41] * vtt[42] * vtt[43] * vtt[44] * vtt[45] * vtt[46] * vtt[47] * vtt[48] * vtt[49] * vtt[50];

                TxtResultado.setText(String.valueOf(df.format(calculo)));

                for (int d = 0; d < vtt.length; d++) {
                    vtt[d] = 1f;
                }
            }

            if (sinal.equals("/")) {

                calculo = vtt[0] / vtt[1] / vtt[2] / vtt[3] / vtt[4] / vtt[5] / vtt[6] / vtt[7] / vtt[8] / vtt[9] / vtt[10] / vtt[11] / vtt[12] / vtt[13] / vtt[14] / vtt[15] / vtt[16] / vtt[17] / vtt[18] / vtt[19] / vtt[20] / vtt[21] / vtt[22] / vtt[23] / vtt[24] / vtt[25] / vtt[26] / vtt[27] / vtt[28] / vtt[29] / vtt[30] / vtt[31] / vtt[32] / vtt[33] / vtt[34] / vtt[35] / vtt[36] / vtt[37] / vtt[38] / vtt[39] / vtt[40] / vtt[41] / vtt[42] / vtt[43] / vtt[44] / vtt[45] / vtt[46] / vtt[47] / vtt[48] / vtt[49] / vtt[50];

                TxtResultado.setText(String.valueOf(df.format(calculo)));

                for (int d = 0; d < vtt.length; d++) {
                    vtt[d] = 1f;
                }
            }

            tamanho = 0;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Insira um número no campo!");
        }

        try {
            Historico historico = new Historico();
            Conexao con = new Conexao();

            historico.setResultado(String.valueOf(TxtResultado.getText()));
            con.inserir(historico);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        TxtResultado.setText(TxtResultado.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        if (tamanho < vt.length) {
            vt[tamanho] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));
            TxtResultado.setText("");
            tamanho++;
        } else {
            JOptionPane.showMessageDialog(this, "O vetor já está cheio, não é possível adicionar mais elementos");
        }
        sinal = "-";
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if (tamanho < vtt.length) {
            vtt[tamanho] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));
            TxtResultado.setText("");
            tamanho++;
        } else {
            JOptionPane.showMessageDialog(this, "O vetor já está cheio, não é possível adicionar mais elementos");
        }
        sinal = "/";
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        if (tamanho < vtt.length) {
            vtt[tamanho] = Float.valueOf(TxtResultado.getText().replaceAll(",", "."));
            TxtResultado.setText("");
            tamanho++;
        } else {
            JOptionPane.showMessageDialog(this, "O vetor já está cheio, não é possível adicionar mais elementos");
        }
        sinal = "X";
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnApagarC;
    private javax.swing.JButton btnApagarCE;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
