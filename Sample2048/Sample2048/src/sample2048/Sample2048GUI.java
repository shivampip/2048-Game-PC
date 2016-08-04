package sample2048;

import java.awt.Color;
import java.awt.Label;

/*@author Shivam Agrawal*/

public class Sample2048GUI extends java.awt.Frame {


    public Sample2048GUI() {
        initComponents();
        sam=new Sample2048();
    }

    Sample2048 sam;



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        b00 = new java.awt.Label();
        b01 = new java.awt.Label();
        b02 = new java.awt.Label();
        b03 = new java.awt.Label();
        b10 = new java.awt.Label();
        b11 = new java.awt.Label();
        b12 = new java.awt.Label();
        b13 = new java.awt.Label();
        b20 = new java.awt.Label();
        b21 = new java.awt.Label();
        b22 = new java.awt.Label();
        b23 = new java.awt.Label();
        b30 = new java.awt.Label();
        b31 = new java.awt.Label();
        b32 = new java.awt.Label();
        b33 = new java.awt.Label();
        label17 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button2 = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        scorel = new java.awt.Label();
        bestl = new java.awt.Label();

        setBackground(new java.awt.Color(153, 255, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(51, 0, 51));
        panel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panel1KeyPressed(evt);
            }
        });

        b00.setAlignment(java.awt.Label.CENTER);
        b00.setBackground(new java.awt.Color(255, 255, 255));
        b00.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b01.setAlignment(java.awt.Label.CENTER);
        b01.setBackground(new java.awt.Color(255, 255, 255));
        b01.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b02.setAlignment(java.awt.Label.CENTER);
        b02.setBackground(new java.awt.Color(255, 255, 255));
        b02.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b03.setAlignment(java.awt.Label.CENTER);
        b03.setBackground(new java.awt.Color(255, 255, 255));
        b03.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b10.setAlignment(java.awt.Label.CENTER);
        b10.setBackground(new java.awt.Color(255, 255, 255));
        b10.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b11.setAlignment(java.awt.Label.CENTER);
        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b12.setAlignment(java.awt.Label.CENTER);
        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b13.setAlignment(java.awt.Label.CENTER);
        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b20.setAlignment(java.awt.Label.CENTER);
        b20.setBackground(new java.awt.Color(255, 255, 255));
        b20.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b21.setAlignment(java.awt.Label.CENTER);
        b21.setBackground(new java.awt.Color(255, 255, 255));
        b21.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b22.setAlignment(java.awt.Label.CENTER);
        b22.setBackground(new java.awt.Color(255, 255, 255));
        b22.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b23.setAlignment(java.awt.Label.CENTER);
        b23.setBackground(new java.awt.Color(255, 255, 255));
        b23.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b30.setAlignment(java.awt.Label.CENTER);
        b30.setBackground(new java.awt.Color(255, 255, 255));
        b30.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b31.setAlignment(java.awt.Label.CENTER);
        b31.setBackground(new java.awt.Color(255, 255, 255));
        b31.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b32.setAlignment(java.awt.Label.CENTER);
        b32.setBackground(new java.awt.Color(255, 255, 255));
        b32.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        b33.setAlignment(java.awt.Label.CENTER);
        b33.setBackground(new java.awt.Color(255, 255, 255));
        b33.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(new java.awt.Color(51, 0, 51));
        label17.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 0));
        label17.setText("2048");

        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField1KeyPressed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(51, 0, 51));
        button2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Exit");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        label1.setText("Score");

        label2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        label2.setText("Best");

        scorel.setAlignment(java.awt.Label.CENTER);
        scorel.setBackground(new java.awt.Color(0, 51, 51));
        scorel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        scorel.setForeground(new java.awt.Color(102, 255, 255));
        scorel.setText("512");

        bestl.setAlignment(java.awt.Label.CENTER);
        bestl.setBackground(new java.awt.Color(0, 51, 51));
        bestl.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        bestl.setForeground(new java.awt.Color(102, 255, 255));
        bestl.setText("64");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scorel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bestl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scorel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bestl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    public void update(int score,int best)
        {
            setColor(b00,sam.a[0][0]);
            setColor(b01,sam.a[0][1]);
            setColor(b02,sam.a[0][2]);
            setColor(b03,sam.a[0][3]);
            setColor(b10,sam.a[1][0]);
            setColor(b11,sam.a[1][1]);
            setColor(b12,sam.a[1][2]);
            setColor(b13,sam.a[1][3]);
            setColor(b20,sam.a[2][0]);
            setColor(b21,sam.a[2][1]);
            setColor(b22,sam.a[2][2]);
            setColor(b23,sam.a[2][3]);
            setColor(b30,sam.a[3][0]);
            setColor(b31,sam.a[3][1]);
            setColor(b32,sam.a[3][2]);
            setColor(b33,sam.a[3][3]);
            scorel.setText(score+"");
            bestl.setText(best+"");
            
        }
   

    
    public void setColor(Label l,int value)
    {
        l.setText(value+"");
        l.setFont(new java.awt.Font("Arial", 1, 60));
        
        if(value==0)
        {
            l.setText("");
            l.setBackground(Color.white);
        }
            
        else if(value==2)
            l.setBackground(Color.yellow);
        else if(value==4)
            l.setBackground(Color.orange);
        else if(value==8)
            l.setBackground(Color.cyan);
        else if(value==16)
            l.setBackground(Color.green);
        else if(value==32)
            l.setBackground(Color.pink);
        else if(value==64)
            l.setBackground(Color.red);
        else if(value==128)
            l.setBackground(Color.blue);
        else if(value==256)
            l.setBackground(Color.magenta);
        else if(value==512)
            l.setBackground(Color.lightGray);
        else if(value==1024)
            l.setBackground(Color.darkGray);
        else if(value==2048)
            l.setBackground(Color.black);
        
        if(value>64)
            l.setFont(new java.awt.Font("Arial", 1, 45));
        if(value>512)
            l.setFont(new java.awt.Font("Arial", 1, 30));
                
    }
    
    
    

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void panel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panel1KeyPressed
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_panel1KeyPressed

    private void textField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyPressed
        int choice=evt.getKeyCode();
        System.out.println("This key is pressed "+evt.getKeyChar());
        boolean go;
        switch(choice)
        {
            case java.awt.event.KeyEvent.VK_UP:
                sam.slide("up");
                sam.adding("up");
                sam.slide("up");
                go=sam.random();
                if(go)
                    update(sam.score,sam.best);
                else
                    gameOver();
                break;
                
            case java.awt.event.KeyEvent.VK_DOWN:
                sam.slide("down");
                sam.adding("down");
                sam.slide("down");
                go=sam.random();
                if(go)
                    update(sam.score,sam.best);
                else
                    gameOver();
                break;
                
            case java.awt.event.KeyEvent.VK_LEFT:
                sam.slide("left");
                sam.adding("left");
                sam.slide("left");
                go=sam.random();
                if(go)
                    update(sam.score,sam.best);
                else
                    gameOver();
                break;
                
            case java.awt.event.KeyEvent.VK_RIGHT:
                sam.slide("right");
                sam.adding("right");
                sam.slide("right");
                go=sam.random();
                if(go)
                    update(sam.score,sam.best);
                else
                    gameOver();
                break;
        }
        
    }//GEN-LAST:event_textField1KeyPressed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button2ActionPerformed

    
    
     void gameOver()
        {
            b10.setText('G'+"");
            b11.setText('A'+"");
            b12.setText('M'+"");
            b13.setText('E'+"");
            
            b20.setText('O'+"");
            b21.setText('V'+"");
            b22.setText('E'+"");
            b23.setText('R'+"");
            
            b00.setText("");
            b01.setText("");
            b02.setText("");
            b03.setText("");
            b30.setText("");
            b31.setText("");
            b32.setText("");
            b33.setText("");
            
            textField1.setFocusable(false);
        }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sample2048GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label b00;
    private java.awt.Label b01;
    private java.awt.Label b02;
    private java.awt.Label b03;
    private java.awt.Label b10;
    private java.awt.Label b11;
    private java.awt.Label b12;
    private java.awt.Label b13;
    private java.awt.Label b20;
    private java.awt.Label b21;
    private java.awt.Label b22;
    private java.awt.Label b23;
    private java.awt.Label b30;
    private java.awt.Label b31;
    private java.awt.Label b32;
    private java.awt.Label b33;
    private java.awt.Label bestl;
    private java.awt.Button button2;
    private java.awt.Label label1;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Panel panel1;
    private java.awt.Label scorel;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
