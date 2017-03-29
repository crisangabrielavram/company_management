/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiunefirma;

/**
 *
 * @author User
 */
public class Angajat {
  private  int id,age,experienceDomain,inFirmTime;
  private  double salary,bonus;
   private String  name,gender,maritual,studies,specialisation,position;
  private  boolean asigMed,Fitness;
   
    public Angajat(int id,int age,int experienceDomain,int inFirmTime,double salary,double bonus,
         String name,String gender,String maritual,String studies,String specialisation,String position,boolean asigMed,boolean Fitness ){
    this.id=id;
    this.age=age;
   this.experienceDomain=experienceDomain;
    this.inFirmTime=inFirmTime;
     this.salary=salary;
      this.bonus=bonus;
       this.name=name; 
       this.gender=gender;
       this.maritual=maritual;
       this.studies=studies;
       this.specialisation=specialisation;
       this.position=position;
       this.asigMed=asigMed;
       this.Fitness=Fitness;
    }

    Angajat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getExperienceDomain() {
        return experienceDomain;
    }

    public int getInFirmTime() {
        return inFirmTime;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritual() {
        return maritual;
    }

    public String getStudies() {
        return studies;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public String getPosition() {
        return position;
    }

    public boolean isAsigMed() {
        return asigMed;
    }

    public boolean isFitness() {
        return Fitness;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperienceDomain(int experienceDomain) {
        this.experienceDomain = experienceDomain;
    }

    public void setInFirmTime(int inFirmTime) {
        this.inFirmTime = inFirmTime;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaritual(String maritual) {
        this.maritual = maritual;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAsigMed(boolean asigMed) {
        this.asigMed = asigMed;
    }

    public void setFitness(boolean Fitness) {
        this.Fitness = Fitness;
    }
    
}

