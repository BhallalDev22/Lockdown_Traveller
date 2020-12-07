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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajendrasaxena
 */
public class RequestBooking extends javax.swing.JFrame {
    int p,i=0,j,couch,q,max1,max2,si=0,sd=0,maxwin,maxnor,wina=0,nora=0,t=0,winb=0,norb=0,wallet,tf;
    int d4[];
    String s4[];
    int dw[],dn[];
    String wind,norm;
    static String username,sour,dest,route,winda,norma,str;
    String date="",tnum="",tnm="",fare="",dist="",so="",ds="",cls="";
    String p1n="-1",p2n="-1",p3n="-1",p4n="-1",p5n="-1";
    String p1a="-1",p2a="-1",p3a="-1",p4a="-1",p5a="-1";
    String p1g="-1",p2g="-1",p3g="-1",p4g="-1",p5g="-1";
    String p1p="-1",p2p="-1",p3p="-1",p4p="-1",p5p="-1";
    String p1b="-1",p2b="-1",p3b="-1",p4b="-1",p5b="-1";
    /**
     * Creates new form RequestBooking
     */
   public int func(int a,int b){
       if(a<=b){
           return a;
       }
       return b;
   }
    public RequestBooking() {
        
        initComponents();
        
        
    }
    public void setter(String a) throws IOException{
        pref.addItem("normal");
        pref.addItem("Window");
        username=a;
        //System.out.println("new");
        Socket soc1=new Socket("localhost",9060);
            DataOutputStream dout1=new DataOutputStream(soc1.getOutputStream());
          //  System.out.println("new");
            DataInputStream din1=new DataInputStream(soc1.getInputStream());
            dout1.writeUTF("select * from train where train_number ='"+tnum+"' AND date='"+date+"'");
            tnum=din1.readUTF();
            tnm=din1.readUTF();
            couch=Integer.parseInt(din1.readUTF());
            winda=din1.readUTF();
            //norma=din1.readUTF();
            route=din1.readUTF();
            norma=din1.readUTF();
            
            System.out.println(route);
            System.out.println(norma);
            System.out.println(winda+" ");
            q=0;
            for(i=0;i<route.length();i++){
                    if(route.charAt(i)=='$'){
                        q++;
                    }
                }
            //System.out.println("new");
            String te=din1.readUTF();
            dw=new int[q];
              
            dn=new int[q];
                String s5="",d3="",s6="";
                p=0;
            System.out.println("new");
                d4=new int[q];
                s4=new String[q];
                for(i=0;i<route.length();i++){System.out.println("new");
                    if(route.charAt(i)=='$'){
                        s6="";
                        d3="";
                        j=0;
                        while(s5.charAt(j)!='%'){
                            s6+=s5.charAt(j);
                            j++;
                        }
                        j++;
                        while(j<s5.length()){
                            d3+=s5.charAt(j);
                            j++;
                        }
                        System.out.println(s6+"\t");
                        s4[p]=s6;
                        d4[p]=Integer.parseInt(d3);
                        if(s4[p].equalsIgnoreCase(sour)){
                            si=p;
                        }
                        if(s4[p].equalsIgnoreCase(dest)){
                            sd=p;
                        }
                        System.out.println(d4[p]);
                        p++;
                        //System.out.println(s5);
                        s5="";
                    }
                    else {
                        s5+=route.charAt(i);      
                    }
                }
                System.out.println("new");
                s5="";
                p=0;
                for(i=0;i<winda.length();i++){
                    if(winda.charAt(i)=='$'){
                     dw[p]=Integer.parseInt(s5);
                     s5="";
                     p++;
                    }
                    else {
                        s5+=winda.charAt(i);
                    }
                }
                s5="";
                p=0;
                for(i=0;i<norma.length();i++){
                    if(norma.charAt(i)=='$'){
                     dn[p]=Integer.parseInt(s5);
                     s5="";
                     p++;
                    }
                    else {
                        s5+=norma.charAt(i);
                    }
                }
                max1=dw[si];
                max2=dn[si];
                for(i=si;i<=sd;i++){
                    if(dw[i]>max1){
                        max1=dw[i];
                    }
                    if(dn[i]>max2){
                        max2=dn[i];
                    }
                }
                windl.setText("Maximum window seats : "+((36*couch)-max1));
                maxwin=(36*couch)-max1;
                norml.setText("Maximum normal seats : "+((36*couch)-max2));
                maxnor=(36*couch)-max2;
             trainnum.setText(trainnum.getText()+" : "+tnum);
             trainname.setText(trainname.getText()+" : "+tnm);
             doj.setText(doj.getText()+" : "+date);
             sol.setText(sol.getText()+" : "+sour);
             destl.setText(destl.getText()+" : "+dest);
             clsl.setText(clsl.getText()+" : Chair Car");
             farel.setText("Fare : Rs. "+(((d4[sd]-d4[si])*1.5)+15));
             distl.setText("Distance : "+(d4[sd]-d4[si]+" Km\n"));
            
        int i;
        for(i=5;i<100;i++){
            age.addItem(i+"");
        }
        Socket s=new Socket("localhost",9090);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF(username);
        str=din.readUTF();
        wallet=Integer.parseInt(str);
        
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
        trainnum = new javax.swing.JLabel();
        trainname = new javax.swing.JLabel();
        doj = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        age = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pref = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        farel = new javax.swing.JLabel();
        distl = new javax.swing.JLabel();
        clsl = new javax.swing.JLabel();
        sol = new javax.swing.JLabel();
        destl = new javax.swing.JLabel();
        windl = new javax.swing.JLabel();
        norml = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trainnum.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        trainnum.setText("Train Number");

        trainname.setText("Train Name");

        doj.setText("Date of Journey");

        jLabel4.setText("Passenger Details");

        jLabel5.setText("Name");

        jLabel6.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel7.setText("Age");

        jLabel1.setText("Birth Preference");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Prefernce"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("Add Pasanger");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        farel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        farel.setText("Fare");

        distl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        distl.setText("Distance");

        clsl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        clsl.setText("Class");

        sol.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        sol.setText("Source");

        destl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        destl.setText("Destination");

        windl.setText("jLabel2");

        norml.setText("jLabel2");

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(name)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age, 0, 61, Short.MAX_VALUE))))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pref, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trainname, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(distl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(trainnum, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(farel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sol, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(norml, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(windl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clsl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sol)
                    .addComponent(destl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(windl)
                    .addComponent(norml, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        i=pref.getSelectedIndex();
        if(pref.getItemAt(i).equalsIgnoreCase("window")&&t<5){
            winb++;
            if(winb>maxwin){
                JOptionPane.showMessageDialog(rootPane, "Can not select window preference");
            }
            else {for(i=si;i<sd;i++){
                    dw[i]++;
                }
                j=gender.getSelectedIndex();
        String g;
        g=gender.getItemAt(j);
        j=age.getSelectedIndex();
        String a;
        a=age.getItemAt(j);
        String p;
        j=pref.getSelectedIndex();
        p=pref.getItemAt(j);
        Object row[]={name.getText(),a,g,p};
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
        t++;
        if(t==1){
            p1n=name.getText();
            p1a=a;
            p1g=g;
            p1b="Window";
        }
        else if(t==2){
            p2n=name.getText();
            p2a=a;
            p2g=g;
            p2b="Window";
        }
        else if(t==3){
            p3n=name.getText();
            p3a=a;
            p3g=g;
            p3b="Window";
        }
        else if(t==4){
            p4n=name.getText();
            p4a=a;
            p4g=g;
            p4b="Window";
        }
        else {
            p5n=name.getText();
            p5a=a;
            p5g=g;
            p5b="Window";
        }
            }
        }
        else if(t<5){
            norb++;
            if(norb>maxnor){
                JOptionPane.showMessageDialog(rootPane, "Can not select normal ");
            }
            else {
                for(i=si;i<sd;i++){
                    dn[i]++;
                }
                j=gender.getSelectedIndex();
        String g;
        g=gender.getItemAt(j);
        j=age.getSelectedIndex();
        String a;
        a=age.getItemAt(j);
        String p;
        j=pref.getSelectedIndex();
        p=pref.getItemAt(j);
        Object row[]={name.getText(),a,g,p};
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
        t++;
        if(t==1){
            p1n=name.getText();
            p1a=a;
            p1g=g;
            p1b="Normal";
        }
        else if(t==2){
            p2n=name.getText();
            p2a=a;
            p2g=g;
            p2b="Normal";
        }
        else if(t==3){
            p3n=name.getText();
            p3a=a;
            p3g=g;
            p3b="Normal";
        }
        else if(t==4){
            p4n=name.getText();
            p4a=a;
            p4g=g;
            p4b="Normal";
        }
        else {
            p5n=name.getText();
            p5a=a;
            p5g=g;
            p5b="Normal";
        }
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Max 5 passengers!!");
        }
        
        /*  total=windows+normals;
        j=pref.getSelectedIndex();
        if(pref.getItemAt(j).equalsIgnoreCase("Window")){
            windb++;
        }
        else {
            normb++;
        }
        if(windb>windows){
            JOptionPane.showMessageDialog(rootPane, "Please select other prefernce other then windows");
            
        }
        if(normb>normals){
             JOptionPane.showMessageDialog(rootPane, "Please select other prefernce other then none");
        }
        else {
        if(total>5){
            p=5;
            
        }
        else {
            p=total;
        }
        if(i<total){
        i++;
        j=gender.getSelectedIndex();
        String g;
        g=gender.getItemAt(j);
        j=age.getSelectedIndex();
        String a;
        a=age.getItemAt(j);
        String p;
        j=pref.getSelectedIndex();
        p=pref.getItemAt(j);
        Object row[]={name.getText(),a,g,p};
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
        if(i==1){pass++;
            p1n=name.getText();
            p1a=a;
            p1g=g;
            p1p=p;
        }
        else if(i==2){pass++;
            p2n=name.getText();
            p2a=a;
            p2g=g;
            p2p=p;
        }
        else if(i==3){pass++;
            p3n=name.getText();
            p3a=a;
            p3g=g;
            p3p=p;
        }
        else if(i==4){pass++;
            p4n=name.getText();
            p4a=a;
            p4g=g;
            p4p=p;
        }
        else {pass++;
            p5n=name.getText();
            p5a=a;
            p5g=g;
            p5p=p;
        }
    }
    else {
        JOptionPane.showMessageDialog(rootPane, "Maximum "+p+" Passengers are allowed on one ticket!!");
    }
        name.setText("");}*/
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tf=(int)(((d4[sd]-d4[si])*1.5)+15)*t;
        if(wallet<tf){
            JOptionPane.showMessageDialog(rootPane, "Not Enough money in wallet!!!");
        }
        else {
            Socket s9;
            try {
                s9 = new Socket("localhost",9100);
                DataOutputStream dout9=new DataOutputStream(s9.getOutputStream());
                dout9.writeUTF("update users set wallet ='"+(wallet-tf)+"' where username ='"+username+"'");
            } catch (IOException ex) {
                Logger.getLogger(RequestBooking.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        String str1="",str2="";
        for(i=0;i<q;i++){
            str1+=dw[i]+"$";
            str2+=dn[i]+"$";
        }
        String sql1="",sql2="";
        sql1="update train set chaircar_window='"+str1+"' where train_number = '"+tnum+"' AND date = '"+date+"'";
        sql2="update train set chaircar_normal='"+str2+"' where train_number = '"+tnum+"' AND date = '"+date+"'";
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
        String s5="insert into booking (pnr,username,trainname,trainnum,doj,p1n,p1a,p1g,p1b,p2n,p2a,p2g,p2b,p3n,p3a,p3g,p3b,p4n,p4a,p4g,p4b,p5n,p5a,p5g,p5b,source,destination,fare,distance,clas,passn,passw)";
        s5+="values ('"+i+"','"+username+"','"+tnm+"','"+tnum+"','"+date+"','";
        s5+=p1n+"','"+p1a+"','"+p1g+"','"+p1b+"','";
        s5+=p2n+"','"+p2a+"','"+p2g+"','"+p2b+"','";
        s5+=p3n+"','"+p3a+"','"+p3g+"','"+p3b+"','";
        s5+=p4n+"','"+p4a+"','"+p4g+"','"+p4b+"','";
        s5+=p5n+"','"+p5a+"','"+p5g+"','"+p5b+"','";
        s5+=sour+"','"+dest+"','"+(((d4[sd]-d4[si])*1.5)+15)*t+"','"+(d4[sd]-d4[si])+"','Chair Car','"+norb+"','"+winb+"')";
        try {
            Socket s=new Socket("localhost",9100);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF(s5);
        } catch (IOException ex) {
            Logger.getLogger(RequestBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Socket s6=new Socket("localhost",9100);
             DataOutputStream dout=new DataOutputStream(s6.getOutputStream());
                dout.writeUTF(sql1);
        } catch (IOException ex) {
            Logger.getLogger(RequestBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Socket s6=new Socket("localhost",9100);
             DataOutputStream dout=new DataOutputStream(s6.getOutputStream());
                dout.writeUTF(sql2);
        } catch (IOException ex) {
            Logger.getLogger(RequestBooking.class.getName()).log(Level.SEVERE, null, ex);
        }}
        this.setVisible(false);
        /*
        this.setVisible(false);
        total=windows+normals;
        if(total>5){
            total=5;
        }
        if(table.getRowCount()>total){
            JOptionPane.showMessageDialog(rootPane, "Maximum "+total+" passengers are allowed");
            this.setVisible(false);
        }
        else {
            tseats=72*totalc;
            twind=totalc*36;
            tnorm=totalc*36;
            twb=twind-windows;
            tnb=tnorm-normals;
            if(p1p.equalsIgnoreCase("Windows")){
             p1b="window";
            }
            else {
                p1b="normal";
            }
            
            String s1="insert into pendings (username,trainnum,trainname,date,p1n,p1a,p1g,p1p,p2n,p2a,p2g,p2p,p3n,p3a,p3g,p3p,p4n,p4a,p4g,p4p,p5n,p5a,p5g,p5p,clas,source,destination,distance)";
        s1+="values ('"+username+"','"+tnum+"','"+tnm+"','"+date+"','";
        s1+=p1n+"','"+p1a+"','"+p1g+"','"+p1p+"','";
        s1+=p2n+"','"+p2a+"','"+p2g+"','"+p2p+"','";
        s1+=p3n+"','"+p3a+"','"+p3g+"','"+p3p+"','";
        s1+=p4n+"','"+p4a+"','"+p4g+"','"+p4p+"','";
        s1+=p5n+"','"+p5a+"','"+p5g+"','"+p5p+"','";
        s1+=cls+"','"+so+"','"+ds+"','"+dist+"')";
        try {
            Socket s=new Socket("localhost",9100);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF(s1);
        } catch (IOException ex) {
            Logger.getLogger(RequestBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        }*/
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RequestBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age;
    private javax.swing.JLabel clsl;
    private javax.swing.JLabel destl;
    private javax.swing.JLabel distl;
    private javax.swing.JLabel doj;
    private javax.swing.JLabel farel;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel norml;
    private javax.swing.JComboBox<String> pref;
    private javax.swing.JLabel sol;
    private javax.swing.JTable table;
    private javax.swing.JLabel trainname;
    private javax.swing.JLabel trainnum;
    private javax.swing.JLabel windl;
    // End of variables declaration//GEN-END:variables
}
