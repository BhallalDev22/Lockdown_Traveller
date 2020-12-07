/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockdown_traveller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ajendrasaxena
 */
public class Pendings extends javax.swing.JFrame {
    String dist,fare,username,tnum,tname,doj1,cls1,sour,dest,p1nl,p2nl,p3nl,p4nl,p5nl,p1al,p2al,p3al,p4al,p5al,p1gl,p2gl,p3gl,p4gl,p5gl,p1pl,p2pl,p3pl,p4pl,p5pl,p1bl,p2bl,p3bl,p4bl,p5bl;
    /**
     * Creates new form Pendings
     */
    public Pendings() throws IOException {
        initComponents();
        Socket s= new Socket("localhost",9110);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        DataInputStream din=new DataInputStream(s.getInputStream());
        dout.writeUTF("select * from pendings");
        tnum=din.readUTF();
        tnm.setText(tnm.getText()+" "+tnum);
        if(tnum.equalsIgnoreCase("-1")){
            JOptionPane.showMessageDialog(rootPane,"No pending requests!!");
            this.setVisible(false);
        }
        else {
            tname=din.readUTF();
            doj1=din.readUTF();
            p1nl=din.readUTF();
            p1al=din.readUTF();
            p1gl=din.readUTF();
            p1pl=din.readUTF();
            p2nl=din.readUTF();
            p2al=din.readUTF();
            p2gl=din.readUTF();
            p2pl=din.readUTF();
            p3nl=din.readUTF();
            p3al=din.readUTF();
            p3gl=din.readUTF();
            p3pl=din.readUTF();
            p4nl=din.readUTF();
            p4al=din.readUTF();
            p4gl=din.readUTF();
            p4pl=din.readUTF();
            p5nl=din.readUTF();
            p5al=din.readUTF();
            p5gl=din.readUTF();
            p5pl=din.readUTF();
            cls1=din.readUTF();
            sour=din.readUTF();
            dest=din.readUTF();
            username=din.readUTF();
            if(p1nl.equalsIgnoreCase("-1")){
                p1n.setText("None");
                p1a.setText("None");
                p1g.setText("None");
                p1p.setText("None");
            }
            else {
                p1n.setText(p1nl);
                p1a.setText(p1al);
                p1g.setText(p1gl);
                p1p.setText(p1pl);
                if(cls1.equalsIgnoreCase("Chair Car")){
                    p1aa.addItem("None");
                    p1aa.addItem("Windows");
                }
                else if(cls1.equalsIgnoreCase("Sleeper")){
                    p1aa.addItem("Lower");
                    p1aa.addItem("Middle");
                    p1aa.addItem("Upper");
                    p1aa.addItem("Side Lower");
                    p1aa.addItem("Side Upper");
                    
                }
                else {
                    p1aa.addItem("Lower");
                    p1aa.addItem("Upper");
                }
            }
            if(p2nl.equalsIgnoreCase("-1")){
                p2n.setText("None");
                p2a.setText("None");
                p2g.setText("None");
                p2p.setText("None");
            }
            else {
                p2n.setText(p2nl);
                p2a.setText(p2al);
                p2g.setText(p2gl);
                p2p.setText(p2pl);
                if(cls1.equalsIgnoreCase("Chair Car")){
                   p2aa.addItem("None");
                    p2aa.addItem("Windows");
                }
                else if(cls1.equalsIgnoreCase("Sleeper")){
                    p2aa.addItem("Lower");
                    p2aa.addItem("Middle");
                    p2aa.addItem("Upper");
                    p2aa.addItem("Side Lower");
                    p2aa.addItem("Side Upper");
                    
                }
                else {
                    p2aa.addItem("Lower");
                    p2aa.addItem("Upper");
                }
            }
            if(p3nl.equalsIgnoreCase("-1")){
                p3n.setText("None");
                p3a.setText("None");
                p3g.setText("None");
                p3p.setText("None");
            }
            else {
                p3n.setText(p3nl);
                p3a.setText(p3al);
                p3g.setText(p3gl);
                p3p.setText(p3pl);
                if(cls1.equalsIgnoreCase("Chair Car")){
                    p3aa.addItem("None");
                    p3aa.addItem("Windows");
                }
                else if(cls1.equalsIgnoreCase("Sleeper")){
                    p3aa.addItem("Lower");
                    p3aa.addItem("Middle");
                    p3aa.addItem("Upper");
                    p3aa.addItem("Side Lower");
                    p3aa.addItem("Side Upper");
                    
                }
                else {
                    p3aa.addItem("Lower");
                    p3aa.addItem("Upper");
                }
            }
            if(p4nl.equalsIgnoreCase("-1")){
                p4n.setText("None");
                p4a.setText("None");
                p4g.setText("None");
                p4p.setText("None");
            }
            else {
                p4n.setText(p4nl);
                p4a.setText(p4al);
                p4g.setText(p4gl);
                p4p.setText(p4pl);
                if(cls1.equalsIgnoreCase("Chair Car")){
                   p4aa.addItem("None");
                    p4aa.addItem("Windows");
                }
                else if(cls1.equalsIgnoreCase("Sleeper")){
                    p4aa.addItem("Lower");
                    p4aa.addItem("Middle");
                    p4aa.addItem("Upper");
                    p4aa.addItem("Side Lower");
                    p4aa.addItem("Side Upper");
                    
                }
                else {
                    p4aa.addItem("Lower");
                    p4aa.addItem("Upper");
                }
            }
            if(p5nl.equalsIgnoreCase("-1")){
                p5n.setText("None");
                p5a.setText("None");
                p5g.setText("None");
                p5p.setText("None");
            }
            else {
                p5n.setText(p1nl);
                p5a.setText(p1al);
                p5g.setText(p1gl);
                p5p.setText(p1pl);
                if(cls1.equalsIgnoreCase("Chair Car")){
                    p5aa.addItem("None");
                    p5aa.addItem("Windows");
                }
                else if(cls1.equalsIgnoreCase("Sleeper")){
                    p5aa.addItem("Lower");
                    p5aa.addItem("Middle");
                    p5aa.addItem("Upper");
                    p5aa.addItem("Side Lower");
                    p5aa.addItem("Side Upper");
                    
                }
                else {
                    p5aa.addItem("Lower");
                    p5aa.addItem("Upper");
                }
            }
            doj.setText(doj.getText()+" "+doj1);
            clasl.setText(clasl.getText()+" "+cls1);
            tn.setText(tn.getText()+" "+tname);
            ds.setText(ds.getText()+" "+dest);
            so.setText(so.getText()+" "+sour);
            
            System.out.println(username);
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

        tnm = new javax.swing.JLabel();
        tn = new javax.swing.JLabel();
        doj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clasl = new javax.swing.JLabel();
        so = new javax.swing.JLabel();
        ds = new javax.swing.JLabel();
        avail1 = new javax.swing.JLabel();
        avail2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p1n = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p2n = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        p3n = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p4n = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        p5n = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p1a = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p2a = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p3a = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        p4a = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        p5a = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        p1g = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        p2g = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        p3g = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        p4g = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        p5g = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p1p = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        p2p = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        p3p = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        p4p = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        p5p = new javax.swing.JLabel();
        avail3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        p1aa = new javax.swing.JComboBox<>();
        p2aa = new javax.swing.JComboBox<>();
        p3aa = new javax.swing.JComboBox<>();
        p4aa = new javax.swing.JComboBox<>();
        p5aa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        avail4 = new javax.swing.JLabel();
        avail6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tnm.setText("Train number :");

        tn.setText("Train Name :");

        doj.setText("Date of journey :");

        jLabel1.setText("User Name :");

        clasl.setText("Class :");

        so.setText("Source :");

        ds.setText("Destination : ");

        avail1.setText("Window");

        avail2.setText("Total");

        jLabel5.setText("Passenger 1 Name");

        p1n.setText("p1n");

        jLabel6.setText("Passenger 2 Name");

        p2n.setText("p2n");

        jLabel7.setText("Passenger 3 Name");

        p3n.setText("p3n");

        jLabel8.setText("Passenger 4 Name");

        p4n.setText("p4n");

        jLabel9.setText("Passenger 5 Name");

        p5n.setText("p5n");

        jLabel10.setText("Passenger 1 Age");

        p1a.setText("p1a");

        jLabel11.setText("Passenger 2 Age");

        p2a.setText("p2a");

        jLabel12.setText("Passenger 3 Age");

        p3a.setText("p3a");

        jLabel13.setText("Passenger 4 Age");

        p4a.setText("p4a");

        jLabel14.setText("Passenger 5 Age");

        p5a.setText("p5a");

        jLabel15.setText("Passenger 1 Gender");

        p1g.setText("p1g");

        jLabel16.setText("Passenger 2 Gender");

        p2g.setText("p2g");

        jLabel17.setText("Passenger 3 Gender");

        p3g.setText("p3g");

        jLabel18.setText("Passenger 4 Gender");

        p4g.setText("p4g");

        jLabel19.setText("Passenger 5 Gender");

        p5g.setText("p5g");

        jLabel20.setText("Passenger 1 Pref");

        p1p.setText("p1p");

        jLabel22.setText("Passenger 2 Pref");

        p2p.setText("p2p");

        jLabel24.setText("Passenger 3 Pref");

        p3p.setText("p3p");

        jLabel26.setText("Passenger 4 Pref");

        p4p.setText("p4p");

        jLabel28.setText("Passenger 5 Pref");

        p5p.setText("p5p");

        avail3.setText("Normal");

        jLabel25.setText("Allot Seat");

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        avail4.setText("jLabel3");

        avail6.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doj, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(avail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(avail6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(clasl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(so, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ds, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(avail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(avail3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(avail2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(p5n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p4n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p1n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p1a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(p2a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p4a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p5a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(p1g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p4g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p5g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(p1p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p4p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p5p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1aa, 0, 147, Short.MAX_VALUE)
                            .addComponent(p2aa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p3aa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4aa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p5aa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(205, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnm)
                    .addComponent(clasl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tn)
                    .addComponent(so))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doj)
                    .addComponent(ds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(avail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avail2)
                    .addComponent(avail4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avail3)
                    .addComponent(avail6))
                .addGap(2, 2, 2)
                .addComponent(jLabel25)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20)
                    .addComponent(p1aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1n)
                    .addComponent(p1a)
                    .addComponent(p1g)
                    .addComponent(p1p))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22)
                    .addComponent(p2aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2n)
                    .addComponent(p2a)
                    .addComponent(p2g)
                    .addComponent(p2p))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24)
                    .addComponent(p3aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3n)
                    .addComponent(p3a)
                    .addComponent(p3g)
                    .addComponent(p3p))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel26)
                    .addComponent(p4aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4n)
                    .addComponent(p4a)
                    .addComponent(p4g)
                    .addComponent(p4p))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19)
                    .addComponent(jLabel28)
                    .addComponent(p5aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5n)
                    .addComponent(p5a)
                    .addComponent(p5g)
                    .addComponent(p5p))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int i=0;
        Socket s1;
        try {
            
            s1 = new Socket("localhost",9120);
            DataInputStream din=new DataInputStream(s1.getInputStream());
            String s2=din.readUTF();
            if(s2.equalsIgnoreCase("-1")){
                i=10000;
            }
            else {
                i = Integer.parseInt(s2);
                i++;
            }
           
            
        } catch (IOException ex) {
            Logger.getLogger(Pendings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Socket s= new Socket("localhost",9100);
            String sql="insert into booking (pnr,username,trainname,trainnum,doj,p1n,p1a,p1g,p1b,p2n,p2a,p2g,p2b,p3n,p3a,p3g,p3b,p4n,p4a,p4g,p4b,p5n,p5a,p5g,p5b,source,destination,fare,distance) values ";
            sql+="('"+i+"','"+username+"','"+tname+"','"+tnum+"','"+doj+"','";
            sql+=p1nl+"','"+p1al+"','"+p1gl+"','"+p1bl+"','";
            sql+=p2nl+"','"+p2al+"','"+p2gl+"','"+p2bl+"','";
            sql+=p3nl+"','"+p3al+"','"+p3gl+"','"+p3bl+"','";
            sql+=p4nl+"','"+p4al+"','"+p4gl+"','"+p4bl+"','";
            sql+=p5nl+"','"+p5al+"','"+p5gl+"','"+p5bl+"','";
            sql+=sour+"','"+dest+"','"+fare+"','"+dist+"')";
        } catch (IOException ex) {
            Logger.getLogger(Pendings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pendings().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Pendings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avail1;
    private javax.swing.JLabel avail2;
    private javax.swing.JLabel avail3;
    private javax.swing.JLabel avail4;
    private javax.swing.JLabel avail6;
    private javax.swing.JLabel clasl;
    private javax.swing.JLabel doj;
    private javax.swing.JLabel ds;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel p1a;
    private javax.swing.JComboBox<String> p1aa;
    private javax.swing.JLabel p1g;
    private javax.swing.JLabel p1n;
    private javax.swing.JLabel p1p;
    private javax.swing.JLabel p2a;
    private javax.swing.JComboBox<String> p2aa;
    private javax.swing.JLabel p2g;
    private javax.swing.JLabel p2n;
    private javax.swing.JLabel p2p;
    private javax.swing.JLabel p3a;
    private javax.swing.JComboBox<String> p3aa;
    private javax.swing.JLabel p3g;
    private javax.swing.JLabel p3n;
    private javax.swing.JLabel p3p;
    private javax.swing.JLabel p4a;
    private javax.swing.JComboBox<String> p4aa;
    private javax.swing.JLabel p4g;
    private javax.swing.JLabel p4n;
    private javax.swing.JLabel p4p;
    private javax.swing.JLabel p5a;
    private javax.swing.JComboBox<String> p5aa;
    private javax.swing.JLabel p5g;
    private javax.swing.JLabel p5n;
    private javax.swing.JLabel p5p;
    private javax.swing.JLabel so;
    private javax.swing.JLabel tn;
    private javax.swing.JLabel tnm;
    // End of variables declaration//GEN-END:variables
}
