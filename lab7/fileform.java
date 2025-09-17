package lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class fileform implements ActionListener {
   JFrame frame = new JFrame("Menu");
   JMenuItem j1;
   JMenuItem j2;
   JMenuItem j3;
   JMenuItem ji1;
   JMenuItem ji2;

   public fileform() {
      this.frame.setSize(400, 400);
      this.frame.setDefaultCloseOperation(3);
      JMenuBar var1 = new JMenuBar();
      JMenu var2 = new JMenu("Files Tools");
      this.j1 = new JMenuItem("Save");
      this.j2 = new JMenuItem("Save As");
      this.j3 = new JMenuItem("Close");
      this.j1.addActionListener(this);
      this.j2.addActionListener(this);
      this.j3.addActionListener(this);
      var2.add(this.j1);
      var2.add(this.j2);
      var2.add(this.j3);
      JMenu var3 = new JMenu("Loads");
      this.ji1 = new JMenuItem("Load from Device");
      this.ji2 = new JMenuItem("Load from Drive");
      this.ji1.addActionListener(this);
      this.ji2.addActionListener(this);
      var3.add(this.ji1);
      var3.add(this.ji2);
      var2.add(var3);
      var1.add(var2);
      this.frame.setJMenuBar(var1);
      this.frame.setVisible(true);
   }

   public void actionPerformed(ActionEvent var1) {
      Object var2 = var1.getSource();
      if (var2 == this.j1) {
         this.showMessage("Save");
      } else if (var2 == this.j2) {
         this.showMessage("Save As");
      } else if (var2 == this.j3) {
         this.showMessage("Close");
      } else if (var2 == this.ji1) {
         this.showMessage("Load from Device");
      } else if (var2 == this.ji2) {
         this.showMessage("Load from Drive");
      }

   }

   public void showMessage(String var1) {
      JOptionPane.showMessageDialog(this.frame, "You clicked on " + var1);
   }

   public static void main(String[] args) {
      new fileform();
   }
}
