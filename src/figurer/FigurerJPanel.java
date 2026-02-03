package figurer;
import java.awt.Graphics;
import java.util.ArrayList;
public class FigurerJPanel extends javax.swing.JPanel {
    ArrayList<Figurer> figurLista = new ArrayList<>();
    Filemanager fmgr = new Filemanager();
    public int width;
    public int height;
    public FigurerJPanel() {
        initComponents();
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
                    .addComponent(btnSpara))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
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
        int x = evt.getX();
        int y = evt.getY();
        int b = (int) (Math.random() * 100) + 20;
        int h = (int) (Math.random() * 100) + 20;
        if(this.rbtnTriangel.isSelected()){
            Triangel t = new Triangel(y+(h/2), x-(b/2), b, h);
            figurLista.add(t);
        }
        else if(this.rbtnRektangel.isSelected()){
            Rektangel r = new Rektangel(y, x, b, h);
            figurLista.add(r);
            System.out.println("Rektangel");
        }
        else if(this.rbtnCirkel.isSelected()){
            Cirkel c = new Cirkel(y-(h/2), x-(h/2), h);
            figurLista.add(c);
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        ArrayList<Figurer> temp = fmgr.readFromFile();
    if (temp != null) {
        figurLista = temp;
    } else {
        figurLista.clear(); // or keep old list
    }
    repaint();
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        fmgr.saveToFile(figurLista);
    }//GEN-LAST:event_btnSparaActionPerformed
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanelKnapp;
    private javax.swing.JRadioButton rbtnCirkel;
    private javax.swing.JRadioButton rbtnRektangel;
    private javax.swing.JRadioButton rbtnTriangel;
    // End of variables declaration//GEN-END:variables

}