
import java.util.ArrayList;

public class ThreadsGUI extends javax.swing.JFrame {

    ArrayList<String> msgArr = new ArrayList<>();

    String[] str1 = new String[4];
    String[] str2 = new String[4];

    String msgId1;
    String msgId2;

    public ThreadsGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupThreads = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelThreads = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        lblDateTime1 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblDateTime2 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        btnThread1 = new javax.swing.JRadioButton();
        btnThread2 = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelThreads.setBackground(new java.awt.Color(153, 204, 255));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTitle.setText("Title ");

        lblDateTime.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDateTime.setText("Date And Time Created");

        lblUser.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblUser.setText("Created By");

        lblHeader.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Erstellen Threads");

        lblDateTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDateTime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnGroupThreads.add(btnThread1);

        btnGroupThreads.add(btnThread2);

        btnCreate.setText("Create Threads");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Threads");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Threads");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelThreadsLayout = new javax.swing.GroupLayout(panelThreads);
        panelThreads.setLayout(panelThreadsLayout);
        panelThreadsLayout.setHorizontalGroup(
            panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThreadsLayout.createSequentialGroup()
                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThreadsLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelThreadsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThread1)
                            .addComponent(btnThread2))
                        .addGap(71, 71, 71)
                        .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelThreadsLayout.createSequentialGroup()
                                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)
                                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(231, 231, 231)
                                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelThreadsLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelThreadsLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186)
                        .addComponent(lblDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(250, 250, 250)
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelThreadsLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCreate)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnEdit});

        panelThreadsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDateTime1, lblDateTime2});

        panelThreadsLayout.setVerticalGroup(
            panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThreadsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThread1)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblDateTime1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblUser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(panelThreadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThread2)
                    .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThreads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        new CreateThreadsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            msgArr = (ArrayList<String>) getData();

            str1 = msgArr.get(0).split(",");

            msgId1 = str1[0].trim();
            String title1 = str1[1];
            String date1 = str1[2];
            String username1 = str1[3];

            str2 = msgArr.get(1).split(",");

            msgId2 = str1[0].trim();
            String title2 = str2[1];
            String date2 = str2[2];
            String username2 = str2[3];

            lblTitle1.setText(title1);
            lblDateTime1.setText(date1);
            lblUser1.setText(username1);

            lblTitle2.setText(title2);
            lblDateTime2.setText(date2);
            lblUser2.setText(username2);
        } catch (Exception ex) {
            lblMessage.setText("Please add another thread");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnThread1.isSelected()) {
            getThreadId(msgId1);
            new EditThreadsGUI().setVisible(true);
            this.setVisible(false);
        } else if (btnThread2.isSelected()) {
            getThreadId(msgId2);
            new EditThreadsGUI().setVisible(true);
            this.setVisible(false);
        } else {
            lblMessage.setText("Please select a thread");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGroupThreads;
    private javax.swing.JRadioButton btnThread1;
    private javax.swing.JRadioButton btnThread2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDateTime1;
    private javax.swing.JLabel lblDateTime2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JPanel panelThreads;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> getData() {
        web_server.GetData_Service service = new web_server.GetData_Service();
        web_server.GetData port = service.getGetDataPort();
        return port.getData();
    }

    private static int getThreadId(java.lang.String id) {
        web_server.GetData_Service service = new web_server.GetData_Service();
        web_server.GetData port = service.getGetDataPort();
        return port.getThreadId(id);
    }
}
