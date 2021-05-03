package notepad;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

@SuppressWarnings("empty-statement")
public class NotepadGUI extends javax.swing.JFrame {
    
    JFrame f;
    JFrame f1;
    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();


    /**
     * Creates new form NotepadGUI
     */
    public NotepadGUI() {
        initComponents();
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
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        charcount = new javax.swing.JButton();
        wordcount = new javax.swing.JButton();
        pad = new javax.swing.JButton();
        text = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        copyText = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ip = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        sourcecode = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        details = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        charcount.setText("CharCount");
        charcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charcountActionPerformed(evt);
            }
        });

        wordcount.setText("WordCount");
        wordcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordcountActionPerformed(evt);
            }
        });

        pad.setText("Pad Color");
        pad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padActionPerformed(evt);
            }
        });

        text.setText("Text Color");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        calculator.setText("Calculator");
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(charcount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wordcount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pad)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charcount)
                    .addComponent(wordcount)
                    .addComponent(calculator)
                    .addComponent(text)
                    .addComponent(pad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setText("Save ");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        cutText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        jMenu3.add(cutText);

        copyText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        jMenu3.add(copyText);

        pasteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        jMenu3.add(pasteText);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("IPFind");

        ip.setText("IP  Finder");
        ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipActionPerformed(evt);
            }
        });
        jMenu2.add(ip);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("SourceCodeFind");

        sourcecode.setText("Source Code Generator");
        sourcecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcecodeActionPerformed(evt);
            }
        });
        jMenu4.add(sourcecode);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Owner");

        details.setText("Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });
        jMenu5.add(details);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        setTitle(filename);
        
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(NotepadGUI.this,"Open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null){
            
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            
            String line = null;
            
            while((line = reader.readLine()) != null)
            {
                sb.append(line+ "\n");
                textArea.setText(sb.toString());
            }
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found:");
        }
        
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(NotepadGUI.this,"Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null)
        {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try
        {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(textArea.getText());
            setTitle(filename);
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        searchTextArea(textArea, searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter
    {
        public myHighlighter(Color color)
        {
            super(color);
        }
    }
    public void removeHighLight(JTextComponent textComp)
    {
        Highlighter removeHighLighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighLighter.getHighlights();
        
        for(int i=0; i<remove.length;i++)
        {
            if(remove[i].getPainter() instanceof myHighlighter)
            {
                   removeHighLighter.removeHighlight(remove[i]);
            }
        }
    }

    DefaultHighlighter.HighlightPainter highlighter = new myHighlighter(Color.YELLOW);
    
    public void searchTextArea(JTextComponent textComp, String textString){
        removeHighLight(textComp);
        try
        {
            Highlighter highlight = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0,doc.getLength());
            
            int pos = 0;
            
            while((pos = text.toUpperCase().indexOf(textString.toUpperCase(),pos))>= 0)
            {
                 highlight.addHighlight(pos,pos+textString.length(),highlighter);
                 pos += textString.length();
            }
        }
        catch(Exception e)
        {
            
        }
    }
    
    
    
    
    
    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed
        // TODO add your handling code here:
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection,cutSelection);
        textArea.replaceRange("",textArea.getSelectionStart(),textArea.getSelectionEnd());
    }//GEN-LAST:event_cutTextActionPerformed

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed
        // TODO add your handling code here:
        String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection,copySelection);
    }//GEN-LAST:event_copyTextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
        // TODO add your handling code here:
        Transferable pasteText = clipboard.getContents(NotepadGUI.this);
        try {
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
 
        } catch (IOException e) {
            System.out.println("Did not work");
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(NotepadGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasteTextActionPerformed

    private void charcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charcountActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()== charcount)
        {  
        String text=textArea.getText();  
        f = new JFrame("Option Pane");
	JOptionPane.showMessageDialog(f,text.length());
        }
    }//GEN-LAST:event_charcountActionPerformed

    private void wordcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordcountActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()== wordcount)
        {  
        String text = textArea.getText();  
        String words[]=text.split("\\s");
        f1 = new JFrame("Option Pane");
	JOptionPane.showMessageDialog(f1,words.length);
        }
    }//GEN-LAST:event_wordcountActionPerformed

    private void padActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()== pad){  
        Color c = JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
        textArea.setBackground(c);  
        }
    }//GEN-LAST:event_padActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()== text){  
        Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
        textArea.setForeground(c); 
        }
    }//GEN-LAST:event_textActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
        // TODO add your handling code here:
        Calculator cal = new Calculator();
        cal.setVisible(true);
        cal.setDefaultCloseOperation(cal.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_calculatorActionPerformed

    private void ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipActionPerformed
        // TODO add your handling code here:
        IPFinder ipf = new IPFinder();
        ipf.setVisible(true);
        ipf.setDefaultCloseOperation(ipf.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ipActionPerformed

    private void sourcecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourcecodeActionPerformed
        // TODO add your handling code here:
        SourceGetter sg = new SourceGetter();
        sg.setVisible(true);
        sg.setDefaultCloseOpeartin(sg.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_sourcecodeActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        // TODO add your handling code here:
        Help h = new Help();
        h.setVisible(true);
        h.setDefaultCloseOperation(h.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_detailsActionPerformed

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
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculator;
    private javax.swing.JButton charcount;
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JMenuItem details;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem ip;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JButton pad;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JMenuItem sourcecode;
    private javax.swing.JButton text;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton wordcount;
    // End of variables declaration//GEN-END:variables

}
