
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EditThreadsGUI extends javax.swing.JFrame {

    int Id = sendThreadId();
    String user = LoginGUI.loggedUser;

    ArrayList<String> msgArr = new ArrayList<>();

    String[] strArr1 = new String[3];
    String[] strArr2 = new String[3];
    String[] strArr3 = new String[3];

    public EditThreadsGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEditThreads = new javax.swing.JPanel();
        lblMessageBox1 = new javax.swing.JLabel();
        lblMessageBox2 = new javax.swing.JLabel();
        lblMessageBox3 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        lblHeader = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEditThreads.setBackground(new java.awt.Color(153, 204, 255));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Erstellen Edit Threads");

        lblMessage.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelEditThreadsLayout = new javax.swing.GroupLayout(panelEditThreads);
        panelEditThreads.setLayout(panelEditThreadsLayout);
        panelEditThreadsLayout.setHorizontalGroup(
            panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditThreadsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditThreadsLayout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(panelEditThreadsLayout.createSequentialGroup()
                        .addGroup(panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addComponent(btnSend)
                            .addComponent(btnBack))
                        .addGap(518, 518, 518))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditThreadsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessageBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMessageBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(258, 258, 258))
            .addGroup(panelEditThreadsLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEditThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblMessageBox1, lblMessageBox2, lblMessageBox3});

        panelEditThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnRefresh, btnSend});

        panelEditThreadsLayout.setVerticalGroup(
            panelEditThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditThreadsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessageBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessageBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap())
        );

        panelEditThreadsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblMessageBox1, lblMessageBox2, lblMessageBox3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ThreadsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            msgArr = (ArrayList<String>) getMessages();

            strArr1 = msgArr.get(0).split(",");

            String message1 = strArr1[0];
            String date1 = strArr1[1];
            String username1 = strArr1[2];

            lblMessageBox1.setText(message1 + " " + date1 + " " + username1);

            strArr2 = msgArr.get(1).split(",");

            String message2 = strArr2[0];
            String date2 = strArr2[1];
            String username2 = strArr2[2];

            lblMessageBox2.setText(message2 + " " + date2 + " " + username2);

            strArr3 = msgArr.get(2).split(",");

            String message3 = strArr3[0];
            String date3 = strArr3[1];
            String username3 = strArr3[2];

            lblMessageBox3.setText(message3 + " " + date3 + " " + username3);

        } catch (Exception ex) {
            lblMessage.setText("No messages at the moment");
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String theMessage = txtMessage.getText();

        SimpleDateFormat dateTime = DateTime.getDate();
        String strDateTime = dateTime.format(new Date());

        lblMessage.setText("Message Sent. Refresh to see recent messages");
        addMessages(Id, theMessage, strDateTime, user);
    }//GEN-LAST:event_btnSendActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditThreadsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageBox1;
    private javax.swing.JLabel lblMessageBox2;
    private javax.swing.JLabel lblMessageBox3;
    private javax.swing.JPanel panelEditThreads;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> getMessages() {
        web_server.GetMessages_Service service = new web_server.GetMessages_Service();
        web_server.GetMessages port = service.getGetMessagesPort();
        return port.getMessages();
    }

    private static int sendThreadId() {
        web_server.GetData_Service service = new web_server.GetData_Service();
        web_server.GetData port = service.getGetDataPort();
        return port.sendThreadId();
    }

    private static String addMessages(int threadID, java.lang.String message, java.lang.String date, java.lang.String user) {
        web_server.AddMessages_Service service = new web_server.AddMessages_Service();
        web_server.AddMessages port = service.getAddMessagesPort();
        return port.addMessages(threadID, message, date, user);
    }
}
