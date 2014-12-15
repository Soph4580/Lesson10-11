import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
        
public class Sorting extends javax.swing.JFrame {
    
    DefaultListModel model;
    int nums[] = new int[100000];
        
    public Sorting() {
        initComponents();
        model= new DefaultListModel();
        lstnums.setModel(model);       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList();
        btngenerate = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnselc = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnums);

        btngenerate.setText("Generate Numbers");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnselc.setText("Selection");
        btnselc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselcActionPerformed(evt);
            }
        });

        btninsert.setText("Insertion");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngenerate)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnselc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btngenerate)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnbubble)
                .addGap(39, 39, 39)
                .addComponent(btnselc)
                .addGap(46, 46, 46)
                .addComponent(btninsert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
       //clear list
        model.clear();
        long stime = System.currentTimeMillis();
        bubbleSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime);
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnbubbleActionPerformed

    private void btnselcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselcActionPerformed
      //clear list
        model.clear();
        long stime = System.currentTimeMillis();
        selectionSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime);
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnselcActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        //clear list
        model.clear();
        long stime = System.currentTimeMillis();
        insertionSort(nums);
        long etime = (System.currentTimeMillis() - stime)/1000;
        JOptionPane.showMessageDialog(this, "Time it took: " + etime);
        //rebuild list
        for (int x = 0;x < nums.length;x ++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
             model.clear();
            for(int x = 0;x < nums.length;x ++){
            nums[x]=(int)(Math.random()*100000) + 1;
            model.addElement(nums[x]);}
    }//GEN-LAST:event_btngenerateActionPerformed
    
public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	
         swap(a, i, minIndex);
   } 
} 

public static int findMinimum(int[] a, int first){
 
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}
    
public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;
        
        for (int k=1; k<a.length; k++){
	
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				
				a[j+1] = a[j];
				j--;
			}
                        else{
				
				stillLooking=false;
			}
			a[j+1]=itemToInsert;
		}
  	}
}

 public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++)  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}
		}
	
}
 
 


    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
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
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnselc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstnums;
    // End of variables declaration//GEN-END:variables
}
