package interfaz;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;


/**
 *
 * @author Tapia
 */
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogNuevaEcuacion = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldY2 = new javax.swing.JTextField();
        jTextFieldY1 = new javax.swing.JTextField();
        jTextFieldY = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonResolver1 = new javax.swing.JButton();
        jButtonLib1 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JDialogNuevaEcuacionN = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jDialogResultado = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRes = new javax.swing.JTextArea();
        jButtonEcuacion = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEcuacionN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextFieldY2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jTextFieldY1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jTextFieldY.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("= 0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("y");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("y'' +");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("y' +");

        jButtonResolver1.setText("Resolver");
        jButtonResolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResolver1ActionPerformed(evt);
            }
        });

        jButtonLib1.setText("Libreria");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Ecuación de orden 2:");

        javax.swing.GroupLayout JDialogNuevaEcuacionLayout = new javax.swing.GroupLayout(JDialogNuevaEcuacion.getContentPane());
        JDialogNuevaEcuacion.getContentPane().setLayout(JDialogNuevaEcuacionLayout);
        JDialogNuevaEcuacionLayout.setHorizontalGroup(
            JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JDialogNuevaEcuacionLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDialogNuevaEcuacionLayout.createSequentialGroup()
                        .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JDialogNuevaEcuacionLayout.createSequentialGroup()
                                .addComponent(jTextFieldY2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldY1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonResolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLib1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JDialogNuevaEcuacionLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        JDialogNuevaEcuacionLayout.setVerticalGroup(
            JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogNuevaEcuacionLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldY1)
                    .addComponent(jTextFieldY2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(JDialogNuevaEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResolver1)
                    .addComponent(jButtonLib1))
                .addGap(23, 23, 23)
                .addComponent(jButtonRegresar)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ecuacion.jpg"))); // NOI18N

        javax.swing.GroupLayout JDialogNuevaEcuacionNLayout = new javax.swing.GroupLayout(JDialogNuevaEcuacionN.getContentPane());
        JDialogNuevaEcuacionN.getContentPane().setLayout(JDialogNuevaEcuacionNLayout);
        JDialogNuevaEcuacionNLayout.setHorizontalGroup(
            JDialogNuevaEcuacionNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JDialogNuevaEcuacionNLayout.setVerticalGroup(
            JDialogNuevaEcuacionNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        jTextAreaRes.setColumns(20);
        jTextAreaRes.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jTextAreaRes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRes);

        javax.swing.GroupLayout jDialogResultadoLayout = new javax.swing.GroupLayout(jDialogResultado.getContentPane());
        jDialogResultado.getContentPane().setLayout(jDialogResultadoLayout);
        jDialogResultadoLayout.setHorizontalGroup(
            jDialogResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogResultadoLayout.setVerticalGroup(
            jDialogResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEcuacion.setText("Nueva Ecuación");
        jButtonEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEcuacionActionPerformed(evt);
            }
        });

        jButtonInfo.setText("Información");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N

        jButtonEcuacionN.setText("Nueva Ecuación N");
        jButtonEcuacionN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEcuacionNActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEcuacionN, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButtonEcuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(513, 513, 513))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButtonEcuacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEcuacionN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInfo)
                .addContainerGap(495, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JDialogNuevaEcuacion.setSize(640,400);
        JDialogNuevaEcuacion.setVisible(true);
        JDialogNuevaEcuacion.setTitle("Ingrese Los Datos");
        JDialogNuevaEcuacion.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEcuacionActionPerformed
        // TODO add your handling code here:
        JDialogNuevaEcuacion.setSize(640,400);
        JDialogNuevaEcuacion.setVisible(true);
        JDialogNuevaEcuacion.setTitle("Ingrese Los Datos");
        JDialogNuevaEcuacion.setLocationRelativeTo(null);
        jTextFieldY2.setText(null);
        jTextFieldY1.setText(null);
        jTextFieldY.setText(null);

    }//GEN-LAST:event_jButtonEcuacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonEcuacionNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEcuacionNActionPerformed
        // TODO add your handling code here:
        JDialogNuevaEcuacionN.setSize(640,400);
        JDialogNuevaEcuacionN.setVisible(true);
        JDialogNuevaEcuacionN.setTitle("Ingrese Los Datos");
        JDialogNuevaEcuacionN.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonEcuacionNActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        JDialogNuevaEcuacion.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonResolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResolver1ActionPerformed
        // TODO add your handling code here:
        double a,b,c;//DECLARAMOS LAS VARIABLES CON LAS QUE VAMOS A TRABAJAR
        double alfa=0,beta=0;
        String paso1,paso2,SP="";//UN STRING QUE ALMACENA EL TEXTO
        a=Double.parseDouble(jTextFieldY2.getText());
        b=Double.parseDouble(jTextFieldY1.getText());
        c=Double.parseDouble(jTextFieldY.getText());
	double dato1,dato2,dato3,dato4;//VARIABLES AUXILIARES
	dato1=(-b)/(2*a);
	dato2=(b*b)-(4*a*c);
	if(dato2<0)
	{
            dato2=sqrt(abs(dato2))/(2*a);
            paso1="Raiz 1: "+ dato1 + " + " + dato2 + "i  \nRaiz 2: " + dato1 + " - " + dato2 + "i\n";
            paso2="Entonces: \n α = "+dato1 + "; β = " + abs(dato2)+"\n";
            alfa=dato1;
            beta=abs(dato2);
            if(alfa!=0)
            {
            SP="Entonces: \n Yc= C1"+"(e^"+alfa+")COS"+dato2+"X"+ " + C2"+"(e^"+alfa+")SEN"+dato2+"X \n";
            }else{
            SP="Entonces: \n Yc= C1COS"+dato2+"X"+ " + C2SEN"+dato2+"X \n";
            }
	}else
	{
            dato3=dato1+dato2;
            dato4=dato1-dato2;
            paso1="Raiz 1: " + dato3 + " \nRaiz 2: " + dato4+"\n";
            paso2="";
            SP="Entonces: \n Yc= C1"+"(e^"+dato3+")" + " + C2"+"(e^"+dato4+") \n";
	}

        
        String ED="1.- Ecuación Diferencial: " + a +"y'' + "+ b +"y' + "+ c +"y = 0 \n";
        String EC="2.- Ecuación Característica : " + a +"m^2 + "+ b +"m + "+ c +" = 0 \n";
        String R="3.- Raíces: \n";
       
        jTextAreaRes.setText(ED+EC+R+paso1+paso2 + SP);
        jDialogResultado.setLocationRelativeTo(null);
        jDialogResultado.setBounds(900,900,500,500);
        jDialogResultado.setVisible(true);
        
    }//GEN-LAST:event_jButtonResolver1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDialogNuevaEcuacion;
    private javax.swing.JDialog JDialogNuevaEcuacionN;
    private javax.swing.JButton jButtonEcuacion;
    private javax.swing.JButton jButtonEcuacionN;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonLib1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonResolver1;
    private javax.swing.JDialog jDialogResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRes;
    private javax.swing.JTextField jTextFieldY;
    private javax.swing.JTextField jTextFieldY1;
    private javax.swing.JTextField jTextFieldY2;
    // End of variables declaration//GEN-END:variables
}
