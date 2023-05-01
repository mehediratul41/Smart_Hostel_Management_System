/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author SARK
 */
public class FirstPage {
    
    public static void main(String args[]) {
        LoadingPage load = new LoadingPage();
        load.setVisible(true);
        int i = 0; 
        int k = 0;
        try { 
            while (i <= 100) {
                if (i >= 30 && i <70 && k==1)
                {
                   load.setBarString("Wait for Sometime..."); 
                    k=0;
                }
                else if (i >= 70 && k==0)
                {
                    load.setBarString("Almost Finished Loading");
                    k = 1;
                }
                else if(i<30 && k==0)
                {
                   load.setBarString("Loading Started...");
                    k = 1;
                }
                Thread.sleep(700); 
                i += 10; 
                
                
            }
            
        } 
        catch (Exception e) { 
        } 
        
        
        
        new Login().setVisible(true);
        load.setVisible(false);
    
    }
    
}
