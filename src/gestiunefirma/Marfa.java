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
public class Marfa {
    private int id;
    private int idMarfa;
    private int row;
    private int bunk;
    private int line;
    private int idSlot;
    private String category;
    private String code;
   
    public Marfa(int id,int idMarfa,int idSlot, int row, int bunk, int line, String category, String code) {
        this.id=id;
        this.idMarfa = idMarfa;
        this.row = row;
        this.bunk = bunk;
        this.line = line;
        this.category = category;
        this.code = code;
        this.idSlot=idSlot;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idMarfa
     */
    public int getIdMarfa() {
        return idMarfa;
    }

    /**
     * @param idMarfa the idMarfa to set
     */
    public void setIdMarfa(int idMarfa) {
        this.idMarfa = idMarfa;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the bunk
     */
    public int getBunk() {
        return bunk;
    }

    /**
     * @param bunk the bunk to set
     */
    public void setBunk(int bunk) {
        this.bunk = bunk;
    }

    /**
     * @return the line
     */
    public int getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(int line) {
        this.line = line;
    }

    /**
     * @return the idSlot
     */
    public int getIdSlot() {
        return idSlot;
    }

    /**
     * @param idSlot the idSlot to set
     */
    public void setIdSlot(int idSlot) {
        this.idSlot = idSlot;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

   

  
    
    
   
    
}
