/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class CompanyManagement {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SALUT");
        System.out.println("gabi");

        
        //UserDB a=new UserDB();
        UsernameDB b=new UsernameDB();
        if (b.readUser("cgaby92")){
//            System.out.println("true");
//            UserDB a=new UserDB();
//            User us=a.readUser("cgaby92");
//            System.out.println("nume "+us.getName()+" "+us.getSurname());
        PrivDB pdb=new PrivDB();
Priv a=pdb.readUser("cgaby92");
int z=0;
z=a.checkPriv();
            System.out.println("priv este:"+z);
        }
        else{
            System.out.println("false");
        
        }
        
        //User us=a.readUser("cgaby92");
        
      // System.out.println("nume "+us.getName()+" "+us.getSurname());
        
        
        
        
        
        
        
        
        
        
        /* char ch = 'a';
        Angajat a=new Angajat(1, 24, 1, 1, 2000, 100, "Crisan Gabriel", "male", "single", "UTCN", "CA-eng", "intern", true, true);
        Angajat b=new Angajat(2, 28, 5, 5, 5000, 500, "Fratele Fasu", "male", "married", "UTCN", "CA-eng", "Senior Developper", true, true);
        Angajat c=new Angajat(3, 42, 18,15, 15000, 1000, "Lica Samadaul", "male", "married", "UTCN", "CA-eng", "CEO", true, true);
        ArrayList<Angajat> peopleInFirm = new ArrayList<>();
        peopleInFirm.add(c);
        peopleInFirm.add(a);
        peopleInFirm.add(b);
       for(Angajat d:peopleInFirm) {
            System.out.println(d.getName());
            
        }
         */

//        
//      Calendar c1;
//        c1 = new GregorianCalendar(2016, 8, 21);
//        System.out.println(dateFormat.format(c1.getTime()));
//        if(c1.equals(cal)){System.out.println("asdadsa");}
//        if (DateUtils.isSameDay(cal, c1)) {
//    System.out.println("same day");
//} 
    }

}
