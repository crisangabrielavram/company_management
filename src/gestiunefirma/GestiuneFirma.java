/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiunefirma;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author User
 */
public class GestiuneFirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
       System.out.println("SALUT");
        System.out.println("gabi");
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
       Produs p=new Produs(1, 100, 0, 0.80, 0.30, "Motocultor", "gradin", "motosape", "Stihl", "germany", "cpnp");
       Marfa m=new Marfa(1, 1, 1, 2, 3, 2, "gradin", "asdf");
      if(m.getIdMarfa()==p.getId()){
          System.out.println("salut ii bine");
      };
       
//        System.out.println("adaous"+ p.getSalePrice());
//        System.out.println("numele este "+p.getProductName());
//        if (p.getProductName()=="Motocultor"){
//            System.out.println(" assssssssssss");
//        }
        
        
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Calendar cal = Calendar.getInstance();
//        System.out.println(dateFormat.format(cal.getTime()));
//        
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
