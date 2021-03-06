/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.resources;

import Person.Person;
import client.TListenServer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author Diagnosa
 */

public class CilentGUI extends javax.swing.JFrame {
    BufferedOutputStream bos = null;
    DataInputStream dis = null;
    BufferedReader br = null;
    BufferedInputStream bi = null;
    ObjectOutputStream ous = null;
    ObjectInputStream ois = null;
    private Socket socket;
    Person p = new Person();
    public ArrayList <String> Daftar ;
    public ArrayList <String> Penerima = new ArrayList<String>();
    public ArrayList <String> DaftarFile ;
    public ArrayList <String> DaftarDownload = new ArrayList<String>();
    FileOutputStream fos = null;
    FileInputStream fis = null;
    public String NamaFile;
    byte [] mybytearray ;
    TListenServer ThreadS;
    /**
     * Creates new form CilentGUI
     */
    public CilentGUI() {
        initComponents();
        DropList.removeAllItems();
        DropListFile.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        Browse = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        filePath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButConnect = new javax.swing.JButton();
        LabList = new javax.swing.JLabel();
        ButList = new javax.swing.JButton();
        DropList = new javax.swing.JComboBox();
        LabCOnnected = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TextDaftarPenerima = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CheckFile = new javax.swing.JButton();
        DropListFile = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaFile = new javax.swing.JTextArea();
        Download = new javax.swing.JButton();
        AddFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        Upload.setText("Send");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        filePath.setText("File Path");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Send Your File");
        jLabel1.setIconTextGap(3);

        ButConnect.setText("Connect");
        ButConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButConnectActionPerformed(evt);
            }
        });

        LabList.setText("Select User");

        ButList.setText("List");
        ButList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButListActionPerformed(evt);
            }
        });

        DropList.setEditable(true);
        DropList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DropList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropListActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextDaftarPenerima.setViewportView(TextArea);

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Username :");

        CheckFile.setText("Check File");
        CheckFile.setActionCommand("");
        CheckFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFileActionPerformed(evt);
            }
        });

        DropListFile.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DropListFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropListFileActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Check Your Directory");

        textAreaFile.setColumns(20);
        textAreaFile.setRows(5);
        jScrollPane2.setViewportView(textAreaFile);

        Download.setText("Download");
        Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadActionPerformed(evt);
            }
        });

        AddFile.setText("Add File");
        AddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabList)
                                .addGap(12, 12, 12)
                                .addComponent(ButList, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButConnect))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextDaftarPenerima)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DropList, 0, 118, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Upload))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckFile)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Download, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabCOnnected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DropListFile, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(AddFile))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Browse, ButList});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabCOnnected, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButConnect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButList)
                    .addComponent(LabList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(DropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDaftarPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Browse)
                    .addComponent(filePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Upload)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DropListFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddFile))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Download)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            NamaFile = file.getName();
            try {
              // What to do with the file, e.g. display it in a TextArea
              filePath.setText(file.getAbsolutePath());
              //NamaFile = file.getAbsolutePath().toString();
              textarea.read( new FileReader( file.getAbsolutePath() ), null );
            } catch (IOException ex) {
              System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        
        try {
            
            mybytearray = new byte[(int)file.length()];
            p.setNamaFile(NamaFile);
            fis = new FileInputStream(file);
            bi = new BufferedInputStream(fis);
            try {
                
                bi.read(mybytearray, 0, mybytearray.length);
                System.out.println(file.length());
                p.setMybytearray(mybytearray);
                p.setPenerima(Penerima);
                /*for(int i=0; i<Penerima.size(); i++){
                    System.out.println("penerima nya adalah" + Penerima.get(i));
                }*/
                
                ous.writeUTF("MESS");
                ous.flush();
                ous.reset();
                ous.writeObject(p);
                ous.flush();
                ous.reset();
                
                
            } catch (IOException ex) {
                Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UploadActionPerformed

    private void ButConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButConnectActionPerformed
        try {
            if(ButConnect.getText().toString().equals("Connect")){
                socket = new Socket("localhost", 6060);
                bos = new BufferedOutputStream(socket.getOutputStream());
                dis = new DataInputStream(socket.getInputStream());
                br = new BufferedReader(new InputStreamReader(dis));

                ous = new ObjectOutputStream(socket.getOutputStream());
                ois = new ObjectInputStream(socket.getInputStream());
                int success =0;
                ous.writeUTF("CON");
                ous.flush();
                ous.reset();
                System.out.println(Username.getText());
                ous.writeUTF(Username.getText());
                ous.flush();
                ous.reset();

                String pesan = ois.readUTF();
                if ((pesan) != null) {
                    if(pesan.equals("SUCCESS")){
                        success = 1;
                    }
                }

                if(success == 1){
                    LabCOnnected.setText(Username.getText() + " You are Connected");
                }
                ButConnect.setText("Disconnect");
            }
            else if(ButConnect.getText().toString().equals("Disconnect")){
                ous.writeUTF("QUIT");
                ous.flush();
                ous.reset();
                ButConnect.setText("Connect");
                LabCOnnected.setText(Username.getText() + " You are not Connected");
                socket.close();
            }
            
            //ThreadS = new TListenServer(socket);
            //Thread t = new Thread(ThreadS);
            //t.start();
            //socket.close();
        } catch (IOException ex) {
            Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
               
    }//GEN-LAST:event_ButConnectActionPerformed

    private void ButListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButListActionPerformed
         try {
             try {
                 ous.writeUTF("LIST");
                 ous.flush();
                 ous.reset();
                 p = (Person) ois.readObject();
                 this.Daftar = p.getDaftar();
                 
                  String tampil = "";
                  DropList.removeAllItems();
                  for(int i=0; i<this.Daftar.size(); i++){
                      DropList.addItem(Daftar.get(i));
                      System.out.println(Daftar.get(i));
                  }
                  
                  
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            
           
            
            
            //socket.close();
        } catch (IOException ex) {
            Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_ButListActionPerformed

    private void DropListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropListActionPerformed
            
    }//GEN-LAST:event_DropListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index = DropList.getSelectedIndex();
        TextArea.append(Daftar.get(index));
        //System.out.println("Yang mau dikirim i" + Daftar.get(index));
        Penerima.add(Daftar.get(index));
        
        Daftar.remove(index);
        DropList.removeAllItems();

        for(int i=0; i<this.Daftar.size(); i++){
                DropList.addItem(Daftar.get(i));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void CheckFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFileActionPerformed
        try {
            try {
            ous.writeUTF("CHEK");
            ous.flush();
            ous.reset();
            
            p = (Person) ois.readObject();
            this.DaftarFile = p.getDaftarFile();
            
            
            DropListFile.removeAllItems();
            for(int i=0; i<this.DaftarFile.size(); i++){
                DropListFile.addItem(DaftarFile.get(i));
                System.out.println(DaftarFile.get(i));
            }    
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }            
        } catch (IOException ex) {
            Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CheckFileActionPerformed

    private void AddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFileActionPerformed
        int index = DropListFile.getSelectedIndex();
        textAreaFile.append(DaftarFile.get(index) + "\r\n");
        String a= DaftarFile.get(index);
//        System.out.println(a+" added");
        DaftarDownload.add(a);
        
        
        DaftarFile.remove(index);
        DropListFile.removeAllItems();

        for(int i=0; i<this.DaftarFile.size(); i++){
                DropListFile.addItem(DaftarFile.get(i));
        }
    }//GEN-LAST:event_AddFileActionPerformed

    private void DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadActionPerformed
        try {
            ous.writeUTF("DOWN");
            ous.flush();
            ous.reset();
            p.setFileYangDiunduh(DaftarDownload);
            ous.writeObject(p);
            ous.flush();
            ous.reset();
            try {
                
                for(int i=0; i<p.getFileYangDiunduh().size();i++){
                    p = (Person) ois.readObject();
                    System.out.println(p.getFileYangDiunduh().get(i));
                    System.out.println(p.getMybytearrayServer().length);
                    byte [] bytesDownload = new byte[p.getMybytearrayServer().length];
                    fos = new FileOutputStream("e:/" + p.getFileYangDiunduh().get(i));
                    bos = new BufferedOutputStream(fos);
                    bos.write(p.getMybytearrayServer(),0,p.getMybytearrayServer().length);
                    bos.flush();
                    bos.close();
                    fos.close();
                }
                
                textAreaFile.setText("");
                p.setFileYangDiunduh(null);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(CilentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DownloadActionPerformed

    private void DropListFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropListFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropListFileActionPerformed

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
            java.util.logging.Logger.getLogger(CilentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CilentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CilentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CilentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CilentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFile;
    private javax.swing.JButton Browse;
    private javax.swing.JButton ButConnect;
    private javax.swing.JButton ButList;
    private javax.swing.JButton CheckFile;
    private javax.swing.JButton Download;
    private javax.swing.JComboBox DropList;
    private javax.swing.JComboBox DropListFile;
    private javax.swing.JLabel LabCOnnected;
    private javax.swing.JLabel LabList;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JScrollPane TextDaftarPenerima;
    private javax.swing.JButton Upload;
    private javax.swing.JTextField Username;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel filePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaFile;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
    private File file; 
    private FileFilter CustomFilter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the DaftarDownload
     */
    public ArrayList <String> getDaftarDownload() {
        return DaftarDownload;
    }

    /**
     * @param DaftarDownload the DaftarDownload to set
     */
    
}


