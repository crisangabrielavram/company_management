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
public class User {

    private int id;

    private String name, surname, username, position,emp_code;

    public User(int id, String name, String surname, String username,String emp_code, String position) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.emp_code=emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPosition() {
        return position;
    }

}
