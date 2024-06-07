
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sandh
 */
public class tic_tac_toe extends javax.swing.JFrame {

    /**
     * Creates new form tic_tac_toe
     */
    private String startGame ="X";
    private int player1Count=0;
    private int player2Count=0;
    
    
    public tic_tac_toe() {
        initComponents();
    }
    private void gameScore(){
        p1.setText(String.valueOf(player1Count));
        p2.setText(String.valueOf(player2Count));
    }
    private void chose_a_player(){
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    private void winningGame(){
        String b1=btn1.getText();
        String b2=btn2.getText();
        String b3=btn3.getText();
        
        String b4=btn4.getText();
        String b5=btn5.getText();
        String b6=btn6.getText();
        
        String b7=btn7.getText();
        String b8=btn8.getText();
        String b9=btn9.getText();
        
        if(b1.equals("X") && b2.equals("X") && b3.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn2.setBackground(Color.PINK);
            btn3.setBackground(Color.PINK);
        }
    
        if(b4.equals("X") && b5.equals("X") && b6.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
        }
       
        if(b7.equals("X") && b8.equals("X") && b9.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn7.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
     
           if(b1.equals("X") && b4.equals("X") && b7.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn4.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }
       
            if(b2.equals("X") && b5.equals("X") && b8.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
        }
          
             if(b3.equals("X") && b6.equals("X") && b9.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
               if(b1.equals("X") && b5.equals("X") && b9.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
                 if(b3.equals("X") && b5.equals("X") && b7.equals("X")){
            JOptionPane.showConfirmDialog(this, "Player 1 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player1Count++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }
             
        
             
        if(b1.equals("O") && b2.equals("O") && b3.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn2.setBackground(Color.PINK);
            btn3.setBackground(Color.PINK);
        }
        if(b4.equals("O") && b5.equals("O") && b6.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn4.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
        }
        if(b7.equals("O") && b8.equals("O") && b9.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn7.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
         if(b1.equals("O") && b4.equals("O") && b7.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn4.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }
          if(b2.equals("O") && b5.equals("O") && b8.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn2.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn8.setBackground(Color.PINK);
        }
        if(b3.equals("O") && b6.equals("O") && b9.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn6.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
        if(b1.equals("O") && b5.equals("O") && b9.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn1.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn9.setBackground(Color.PINK);
        }
        if(b3.equals("O") && b5.equals("O") && b7.equals("O")){
            JOptionPane.showConfirmDialog(this, "Player 2 win","Tic Tac Tow",JOptionPane.INFORMATION_MESSAGE);
            player2Count++;
            gameScore();
            btn3.setBackground(Color.PINK);
            btn5.setBackground(Color.PINK);
            btn7.setBackground(Color.PINK);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        player2 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btn2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 204, 255));
        reset.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));

        player2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        player2.setText("Player 2:");

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        p2.setForeground(new java.awt.Color(51, 0, 102));
        p2.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(player2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2)
                    .addComponent(p2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.lightGray));

        player1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        player1.setText("Player 1:");

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(51, 0, 102));
        p1.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(player1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(p1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(70, 70, 70)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn2.setForeground(Color.BLUE);
        }
        else{
            btn2.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn3.setForeground(Color.BLUE);
        }
        else{
            btn3.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn5.setForeground(Color.BLUE);
        }
        else{
            btn5.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn1.setForeground(Color.BLUE);
        }
        else{
            btn1.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn6.setForeground(Color.BLUE);
        }
        else{
            btn6.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn4.setForeground(Color.BLUE);
        }
        else{
            btn4.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn7.setForeground(Color.BLUE);
        }
        else{
            btn7.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn8.setForeground(Color.BLUE);
        }
        else{
            btn8.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn9.setForeground(Color.BLUE);
        }
        else{
            btn9.setForeground(Color.red);
        }
        chose_a_player();
        winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
