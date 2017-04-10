/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

/**
 *
 * @author User
 */

public class Priv {
    private String access;
    public Priv(String access){
    this.access=access;
    
    
    }
    public int  checkPriv(){
    int i = 0;
    if (access.equalsIgnoreCase("full")){i=1;}
    if (access.equalsIgnoreCase("limited")){i=2;}
    if (access.equalsIgnoreCase("view")){i=3;}
        return i;
    }
}
