package finalproject;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class FinalProject 
{

    public static void main(String[] args) 
    {
        setLook();

        // Load the main window
        MainFrame main = new MainFrame();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
       
    }
    
    private static void setLook()
    {
        try 
        {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (Exception e) 
        {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
    
}
