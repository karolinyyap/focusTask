
package controller;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import view.DlgJanCategoria;
import view.DlgJanEquipe;
import view.DlgJanRelatorio;
import view.DlgJanTarefa;
import view.DlgJanUsuario;
import view.FrmPrincipal;
import view.JanLogin;

/**
 *
 * @author Karoliny
 */
public class GerenciadorInterface {
    private FrmPrincipal janPrincipal = null;
    private DlgJanTarefa janTarefa = null; 
    private DlgJanEquipe janEquipe = null; 
    private DlgJanUsuario janUsuario = null; 
    private DlgJanCategoria janCategoria = null; 
    private DlgJanRelatorio janRelatorio = null;
    private JanLogin janLogin = null;
    
    //SINGLETON
    private static GerenciadorInterface myInstance = new GerenciadorInterface();
    
    private GerenciadorInterface() {
        
    }

    public static GerenciadorInterface getMyInstance() {
        return myInstance;
    }
    //FIM DO SINGLETON
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }               
        dlg.setVisible(true); 
        return dlg;
    }  
    
    public void abrirPrincipal() {
        if (janPrincipal == null){
            janPrincipal = new FrmPrincipal();
        }  
        janPrincipal.setVisible(true);
    }
    
    public void abrirTarefa() {
        abrirJanela(janPrincipal, janTarefa, DlgJanTarefa.class);
    }
    
    public void abrirEquipe(){
        abrirJanela(janPrincipal, janEquipe, DlgJanEquipe.class);
    }
    
    public void abrirCategoria(){
        abrirJanela(janPrincipal, janCategoria, DlgJanCategoria.class);
    }
    
    public void abrirUsuario(){
        abrirJanela(janPrincipal, janUsuario, DlgJanUsuario.class);
    }
    
    public void abrirRelatorio(){
        abrirJanela(janPrincipal, janRelatorio, DlgJanRelatorio.class);
    }
    
    public void abrirLogin(){
        abrirJanela(janPrincipal, janLogin, JanLogin.class);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        
        GerenciadorInterface.getMyInstance().abrirPrincipal();
    }
}
