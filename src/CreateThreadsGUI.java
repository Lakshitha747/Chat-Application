
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateThreadsGUI extends javax.swing.JFrame {

    String user = LoginGUI.loggedUser;

    public CreateThreadsGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCreateThreads = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblThreadTitle = new javax.swing.JLabel();
        lblCreatedBy = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        btnCreateThread = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblUser.setText(user);
        lblMessage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCreateThreads.setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Erstellen Create Threads");

        lblThreadTitle.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblThreadTitle.setText("Thread Title");

        lblCreatedBy.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCreatedBy.setText("Created By");

        btnCreateThread.setText("Create Thread");
        btnCreateThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateThreadActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreateThreadsLayout = new javax.swing.GroupLayout(panelCreateThreads);
        panelCreateThreads.setLayout(panelCreateThreadsLayout);
        panelCreateThreadsLayout.setHorizontalGroup(
            panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateThreadsLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThreadTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateThreadsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUser)
                        .addContainerGap(224, Short.MAX_VALUE))
                    .addGroup(panelCreateThreadsLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblCreatedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateThreadsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateThreadsLayout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateThreadsLayout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateThreadsLayout.createSequentialGroup()
                        .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addComponent(btnCreateThread))
                        .addGap(260, 260, 260))))
        );

        panelCreateThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCreatedBy, lblThreadTitle, lblUser, txtTitle});

        panelCreateThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCreateThread});

        panelCreateThreadsLayout.setVerticalGroup(
            panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateThreadsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThreadTitle)
                    .addComponent(lblCreatedBy))
                .addGap(46, 46, 46)
                .addGroup(panelCreateThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblUser))
                .addGap(26, 26, 26)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateThread)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        panelCreateThreadsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCreatedBy, lblThreadTitle, lblUser, txtTitle});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCreateThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCreateThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ThreadsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateThreadActionPerformed
        String title = txtTitle.getText();
        lblMessage.setText("Thread Added");
        SimpleDateFormat dateTime = DateTime.getDate();
        String strDateTime = dateTime.format(new Date());
        addData(title, strDateTime, user);
    }//GEN-LAST:event_btnCreateThreadActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateThreadsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateThread;
    private javax.swing.JLabel lblCreatedBy;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblThreadTitle;
    private static javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelCreateThreads;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private static String addData(java.lang.String title, java.lang.String date, java.lang.String username) {
        web_server.AddData_Service service = new web_server.AddData_Service();
        web_server.AddData port = service.getAddDataPort();
        return port.addData(title, date, username);
    }
}
