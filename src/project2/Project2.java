/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author derrick.osae
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        load l1=new load();
        l1.setVisible(true);
        try{
            for (int i=0;i<101;i++){
                Thread.sleep(40);
                l1.jLabel2.setText(Integer.toString(i)+"%");
                login f2=new login();
                if(i==100){
                    l1.dispose();
                    f2.show();
                    
                }
            }
        }catch(Exception e){
            System.out.println("dead");
        }
        
        
    }
    
}
