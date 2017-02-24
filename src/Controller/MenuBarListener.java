package Controller;


import View.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/**
 * Klasa obsługująca zdarzenia z ManuBar okna głównego
 * @author kamil
 */
public class MenuBarListener implements ActionListener {   
    private Window window;
    
    public MenuBarListener(Window window){
        this.window=window;    
    }
        
    @Override
    public void actionPerformed(ActionEvent event) {
        String source=event.getActionCommand();
        switch(source){
            case "Koniec":{
                window.close();
                break;
            }
            case "OApk":{
                String s="Wielodokumentowy edytor tekstowy.";
                JOptionPane.showMessageDialog(null, s, "O Aplikacji", JOptionPane.INFORMATION_MESSAGE);
                break;
            }                                    
            case "OAut":{
                JOptionPane.showMessageDialog(null, "Autor:                 Kamil Breczko\nWersja:              1.0+\nData wydania:  09 12 2016", "O Aplikacji", JOptionPane.INFORMATION_MESSAGE);
                break;
            }                    
            case "Domyslny":{
                try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    SwingUtilities.updateComponentTreeUI(window);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(window, "Wystapil blad przy zmianie stylu", "Blad", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case "Nimbus":{
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(window);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(window, "Wystapil blad przy zmianie stylu", "Blad", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            case "Motif":{
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(window);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(window, "Wystapil blad przy zmianie stylu", "Blad", JOptionPane.ERROR_MESSAGE);
                }
                break;
            } 
        }
    }
}
