
package notepad;

import javax.swing.JFrame;

public class Notepad {

    public static void main(String[] args) {
  
        NotepadGUI obj = new NotepadGUI();
        obj.setTitle("Notepad");
        obj.setLayout(null);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
