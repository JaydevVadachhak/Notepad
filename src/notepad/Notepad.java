
package notepad;

import javax.swing.JFrame;

public class Notepad {

    public static void main(String[] args) {
  
        NotepadGUI obj = new NotepadGUI();
        obj.setBounds(0,0,500,500);
        obj.setTitle("Notepad-18BIT039,18BIT046");
        obj.setLayout(null);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
