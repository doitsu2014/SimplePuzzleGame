package puzzleproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EzPuzzle extends javax.swing.JFrame {

    int[] sidesOfButton1 = {0, 0, 1, -1};
    int[] sidesOfButton2 = {1, -1, 0, 0};

    boolean isStartMoveCount = false;
    boolean isStartTime = false;

    boolean isStart = false;

    Thread controlTime;
    Runnable startingTime = new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (true) {
                lblValueOfTime.setText(i + "");
                i++;
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    };

    public EzPuzzle() {
        initComponents();
        prepareGame();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMainFrameOfGame = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        lblNumberCount = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblValueOfTime = new javax.swing.JLabel();
        cbStagesOfGame = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMainFrameOfGame.setPreferredSize(new java.awt.Dimension(0, 423));

        javax.swing.GroupLayout pnMainFrameOfGameLayout = new javax.swing.GroupLayout(pnMainFrameOfGame);
        pnMainFrameOfGame.setLayout(pnMainFrameOfGameLayout);
        pnMainFrameOfGameLayout.setHorizontalGroup(
            pnMainFrameOfGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnMainFrameOfGameLayout.setVerticalGroup(
            pnMainFrameOfGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        lblCount.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblCount.setText("Move Count:");

        lblNumberCount.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblNumberCount.setText("0");

        lblTime.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblTime.setText("Time:");

        lblValueOfTime.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblValueOfTime.setText("0");

        cbStagesOfGame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ez Puzzle 3x3", "Ez Puzzle 4x4" }));
        cbStagesOfGame.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStagesOfGameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(lblCount)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumberCount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValueOfTime)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cbStagesOfGame, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnMainFrameOfGame, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMainFrameOfGame, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbStagesOfGame, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblNumberCount)
                    .addComponent(lblTime)
                    .addComponent(lblValueOfTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewGame)
                    .addComponent(btnQuit))
                .addContainerGap())
        );

        pnMainFrameOfGame.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStagesOfGameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStagesOfGameItemStateChanged
        if (isStart == true) {
            isStart = false;
            controlTime.stop();
            lblNumberCount.setText("0");
            lblValueOfTime.setText("0");
        }
        prepareGame();
    }//GEN-LAST:event_cbStagesOfGameItemStateChanged

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        if (isStart == true) {
            isStart = false;
            controlTime.stop();
            lblNumberCount.setText("0");
            lblValueOfTime.setText("0");
        }
        prepareGame();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to exit the GAME?", "Exit Game", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EzPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EzPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EzPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EzPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EzPuzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnQuit;
    private javax.swing.JComboBox<String> cbStagesOfGame;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblNumberCount;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblValueOfTime;
    private javax.swing.JPanel pnMainFrameOfGame;
    // End of variables declaration//GEN-END:variables

    private void prepareGame() {
        if (cbStagesOfGame.getSelectedIndex() == 0) {
            createPuzzle3x3();
        } else {
            createPuzzle4x4();
        }

    }

    private void createPuzzle3x3() {

        pnMainFrameOfGame.removeAll();
        pnMainFrameOfGame.revalidate();
        GridLayout gl = new GridLayout(3, 3);
        JButton[][] buttons = new JButton[3][3];
        pnMainFrameOfGame.setLayout(gl);
        int count = 0;
        // Create buttons and implement listener
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count++;
                buttons[i][j] = new JButton();
                buttons[i][j].setText(count + "");
                buttons[i][j].setFont(new Font("", Font.BOLD, 45));
                buttons[i][j].setBackground(Color.ORANGE);
                int tmpI = i, tmpJ = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (isStart == false) {
                            controlTime = new Thread(startingTime);
                            controlTime.start();
                            isStart = true;
                        }
                        changePosPuzzle3x3(e, tmpI, tmpJ);
                        checkWin(e);

                    }

                    private void changePosPuzzle3x3(ActionEvent e, int tmpI, int tmpJ) {
                        for (int side = 0; side < 4; side++) {
                            int sr = tmpI + sidesOfButton1[side];
                            int sc = tmpJ + sidesOfButton2[side];
                            if (sr >= 0 && sr < 3 && sc >= 0 && sc < 3) {
                                String s = buttons[sr][sc].getText();
                                if (s.isEmpty()) {
                                    int a = Integer.parseInt(lblNumberCount.getText());
                                    lblNumberCount.setText((++a) + "");
                                    buttons[sr][sc].setText(buttons[tmpI][tmpJ].getText());
                                    buttons[tmpI][tmpJ].setText(s);
                                }
                            }
                        }
                    }

                    private void checkWin(ActionEvent e) {
                        boolean isWin = true;
                        int count = 0;
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                count++;
                                if (count < 9) {
                                    if (buttons[k][l].getText().isEmpty()) {
                                        isWin = false;
                                        break;
                                    }
                                    int value = Integer.parseInt(buttons[k][l].getText());
                                    if (value != count) {
                                        isWin = false;
                                        break;
                                    }
                                }
                            }
                        }
                        if (isWin == true) {
                            controlTime.stop();
                            JOptionPane.showMessageDialog(null, "You win!!!!!!!!!!!!!!!!!!!\nYour move count: "
                                    + lblNumberCount.getText() + "\nTime is taken: " + lblValueOfTime.getText());
                            btnNewGameActionPerformed(e);
                        }

                    }
                });
                pnMainFrameOfGame.add(buttons[i][j]);

            }
        }
        buttons[2][2].setText("");
        // random position of buttons
        Random randomGame = new Random();
        count = randomGame.nextInt(50) + randomGame.nextInt(50);

        while (count > 0) {
            //get position
            int rr = randomGame.nextInt(3); // random row
            int rc = randomGame.nextInt(3); // random column
            //get side
            for (int side = 0; side < 4; side++) {
                int sr = rr + sidesOfButton1[side]; // calc row
                int sc = rc + sidesOfButton2[side]; // calc column
                if (sr >= 0 && sr < 3 && sc >= 0 && sc < 3) {
                    String s = buttons[sr][sc].getText();
                    if (s.isEmpty()) {
                        buttons[sr][sc].setText(buttons[rr][rc].getText());
                        buttons[rr][rc].setText(s);
                        count--;
                    }
                }
            }

        }
        pnMainFrameOfGame.updateUI();
    }

    private void createPuzzle4x4() {

        pnMainFrameOfGame.removeAll();
        pnMainFrameOfGame.revalidate();
        GridLayout gl = new GridLayout(4, 4);
        JButton[][] buttons = new JButton[4][4];
        pnMainFrameOfGame.setLayout(gl);
        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                buttons[i][j] = new JButton();
                buttons[i][j].setText(count + "");
                buttons[i][j].setFont(new Font("", Font.BOLD, 45));
                buttons[i][j].setBackground(Color.ORANGE);
                int tmpI = i, tmpJ = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (isStart == false) {
                            controlTime = new Thread(startingTime);
                            controlTime.start();
                            isStart = true;
                        }
                        changePosPuzzle4x4(e, tmpI, tmpJ);
                        checkWin(e);
                    }

                    private void changePosPuzzle4x4(ActionEvent e, int tmpI, int tmpJ) {
                        for (int side = 0; side < 4; side++) {
                            int sr = tmpI + sidesOfButton1[side];
                            int sc = tmpJ + sidesOfButton2[side];
                            if (sr >= 0 && sr < 4 && sc >= 0 && sc < 4) {
                                String s = buttons[sr][sc].getText();
                                if (s.isEmpty()) {
                                    int a = Integer.parseInt(lblNumberCount.getText());
                                    lblNumberCount.setText((++a) + "");
                                    buttons[sr][sc].setText(buttons[tmpI][tmpJ].getText());
                                    buttons[tmpI][tmpJ].setText(s);
                                }
                            }
                        }
                    }

                    private void checkWin(ActionEvent e) {
                        boolean isWin = true;
                        int count = 0;
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 4; l++) {
                                count++;
                                if (count < 16) {
                                    if (buttons[k][l].getText().isEmpty()) {
                                        isWin = false;
                                        break;
                                    }
                                    int value = Integer.parseInt(buttons[k][l].getText());
                                    if (value != count) {
                                        isWin = false;
                                        break;
                                    }
                                }
                            }
                        }
                        if (isWin == true) {
                            controlTime.stop();
                            JOptionPane.showMessageDialog(null, "You win!!!!!!!!!!!!!!!!!!!\nYour move count: "
                                    + lblNumberCount.getText() + "\nTime is taken: " + lblValueOfTime.getText());
                            btnNewGameActionPerformed(e);
                        }
                    }
                });
                pnMainFrameOfGame.add(buttons[i][j]);

            }
        }
        buttons[3][3].setText("");

        Random randomGame = new Random();
        count = randomGame.nextInt(50) + randomGame.nextInt(50);

        while (count > 0) {
            //get position
            int rr = randomGame.nextInt(4); // random row
            int rc = randomGame.nextInt(4); // random column
            //get side
            for (int side = 0; side < 4; side++) {
                int sr = rr + sidesOfButton1[side]; // calc row
                int sc = rc + sidesOfButton2[side]; // calc column
                if (sr >= 0 && sr < 4 && sc >= 0 && sc < 4) {
                    String s = buttons[sr][sc].getText();
                    if (s.isEmpty()) {
                        buttons[sr][sc].setText(buttons[rr][rc].getText());
                        buttons[rr][rc].setText(s);
                        count--;
                    }
                }
            }

        }
        pnMainFrameOfGame.updateUI();
    }

}
