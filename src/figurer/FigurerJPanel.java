package figurer;
import java.awt.Graphics;
import java.util.ArrayList;
public class FigurerJPanel extends javax.swing.JPanel implements Runnable{
    private volatile Thread trad;
    ArrayList<Figurer> figurLista = new ArrayList<>();
    Filemanager fmgr = new Filemanager();
    public int width;
    public int height;
    public int x;
    private javax.swing.Timer animeringsTimer;
    private boolean isMoving = false;
    public FigurerJPanel() {
        initComponents();


        
          
          //Skapar animeringen
    animeringsTimer = new javax.swing.Timer(16, new java.awt.event.ActionListener() {
        //Timer med 16 som värde, påverkar hastigheten
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        for (Figurer f : figurLista) { //Loop for arraylisten
            f.move(0, 0); //Flyttar på formerna, byter ut nollorna sen

            if (f.getX() > getWidth()) { //Vänder håll när den nuddar höger kanten
                f.flipDirection(); 
            }
            else if (f.getX() < 0) { //Vänder håll om den nuddar vänster kanten
                f.flipDirection();
            }
        }
        repaint();
    }
});
        

    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelKnapp = new javax.swing.JPanel();
        btnRensa = new javax.swing.JButton();
        rbtnCirkel = new javax.swing.JRadioButton();
        rbtnRektangel = new javax.swing.JRadioButton();
        rbtnTriangel = new javax.swing.JRadioButton();
        btnHämta = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        btnStartStop = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(400, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btnRensa.setText("Rensa");
        btnRensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRensaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCirkel);
        rbtnCirkel.setText("Cirkel");
        rbtnCirkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCirkelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnRektangel);
        rbtnRektangel.setText("Rektangel");
        rbtnRektangel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRektangelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnTriangel);
        rbtnTriangel.setText("Triangel");
        rbtnTriangel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTriangelActionPerformed(evt);
            }
        });

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnStartStop.setText("Start");
        btnStartStop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnStartStopItemStateChanged(evt);
            }
        });
        btnStartStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKnappLayout = new javax.swing.GroupLayout(jPanelKnapp);
        jPanelKnapp.setLayout(jPanelKnappLayout);
        jPanelKnappLayout.setHorizontalGroup(
            jPanelKnappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKnappLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnCirkel)
                .addGap(18, 18, 18)
                .addComponent(rbtnRektangel)
                .addGap(18, 18, 18)
                .addComponent(rbtnTriangel)
                .addGap(18, 18, 18)
                .addComponent(btnRensa)
                .addGap(18, 18, 18)
                .addComponent(btnHämta)
                .addGap(18, 18, 18)
                .addComponent(btnSpara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartStop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelKnappLayout.setVerticalGroup(
            jPanelKnappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKnappLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKnappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRensa)
                    .addComponent(rbtnCirkel)
                    .addComponent(rbtnRektangel)
                    .addComponent(rbtnTriangel)
                    .addComponent(btnHämta)
                    .addComponent(btnSpara)
                    .addComponent(btnStartStop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
        //Tömmer former listan
        this.figurLista.clear();
        repaint();
    }//GEN-LAST:event_btnRensaActionPerformed
    private void rbtnCirkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCirkelActionPerformed

    }//GEN-LAST:event_rbtnCirkelActionPerformed
    private void rbtnRektangelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRektangelActionPerformed
        
    }//GEN-LAST:event_rbtnRektangelActionPerformed
    private void rbtnTriangelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTriangelActionPerformed
        
    }//GEN-LAST:event_rbtnTriangelActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //variablar för muspositionen
        int x = evt.getX();
        int y = evt.getY();
        //Slumpar fram bas och höjd
        int b = (int) (Math.random() * 100) + 20;
        int h = (int) (Math.random() * 100) + 20;
        //Kollar vilken form som är vald och lägger därefter till den formen i listan
        if(this.rbtnTriangel.isSelected()){
            Triangel t = new Triangel(x, y, b, h);
            figurLista.add(t);
        }
        else if(this.rbtnRektangel.isSelected()){
            Rektangel r = new Rektangel(x, y, b, h);
            figurLista.add(r);
        }
        else if(this.rbtnCirkel.isSelected()){
            Cirkel c = new Cirkel(x, y, h);
            figurLista.add(c);
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
    //Hämtar sparade former
        ArrayList<Figurer> temp = fmgr.readFromFile();
    if (temp != null) {
        figurLista = temp;
    } else {
        figurLista.clear(); // or keep old list
    }
    repaint();
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        //sparar former
        fmgr.saveToFile(figurLista);
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnStartStopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnStartStopItemStateChanged
        //För att veta om den ska animera formerna eller inte
        if (isMoving == false) {
            animeringsTimer.start();
            isMoving = true;
            this.btnStartStop.setText("Stopp");
        } else {
            animeringsTimer.stop();
            isMoving = false;
            this.btnStartStop.setText("Start");
        }
    }//GEN-LAST:event_btnStartStopItemStateChanged

    private void btnStartStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartStopActionPerformed
    //Ritar om formerna
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < figurLista.size() ; i++){
            figurLista.get(i).rita(g);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnSpara;
    private javax.swing.JToggleButton btnStartStop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanelKnapp;
    private javax.swing.JRadioButton rbtnCirkel;
    private javax.swing.JRadioButton rbtnRektangel;
    private javax.swing.JRadioButton rbtnTriangel;
    // End of variables declaration//GEN-END:variables

    /**
     * Krävs för att programmet ska köras men gör inget
     */
    @Override
    public void run() {
    }
    public void stop(){   
    }
    public void start(){
    }
}