/*
 * Customer.java
 *
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.systex.model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Customer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cid;
    private String name;
    private String email;
    private String telephone;
    private String gender;
    private String birth;
    private String address;
    private String[] habits;
    private String account;
    
    /** Creates a new instance of Customer */
    public Customer() {
    }

    /**
     * Getter for property name.
     * @return Value of property name.
     */
    public int getCid() {
        return this.cid;
    }

    /**
     * Setter for property name.
     * @param name New value of property name.
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * Getter for property name.
     * @return Value of property name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for property name.
     * @param name New value of property name.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Getter for property password.
     * @return Value of property password.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for property password.
     * @param password New value of property password.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for property telephone.
     * @return Value of property telephone.
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Setter for property telephone.
     * @param telephone New value of property telephone.
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    /**
     * Getter for property address.
     * @return Value of property address.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for property address.
     * @param address New value of property address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for property gender.
     * @return Value of property gender.
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Setter for property gender.
     * @param gender New value of property gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for property habits.
     * @return Value of property habits.
     */
    public String[] getHabits() {
        return this.habits;
    }

    public String getHabitString() {
        String habitString = "";
        int len = habits.length;
        for (int i = 0; i < len; i++) {
            if (habits[i].equals("music")) {
                habitString += "聽音樂";
            }
            if (habits[i].equals("shopping")) {
                habitString += "逛大街";
            }
            if (habits[i].equals("reading")) {
                habitString += "讀好書";
            }
            if (i != len - 1) {
                habitString += ",";
            }
        }
        return habitString;
    }

    /**
     * Setter for property habits.
     * @param habits New value of property habits.
     */
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    /**
     * Getter for property birth.
     * @return Value of property birth.
     */
    public String getBirth() {
        return this.birth;
    }

    public String getBirthYearString() {
        //String year = this.birth.split("-")[0];
        return this.birth.split("-")[0];
    }
    
    public int getBirthYear() {
        return Integer.parseInt(this.birth.split("-")[0]);
    }
    
    public int getBirthMonth() {
        return Integer.parseInt(this.birth.split("-")[1]);
    }

    public int getBirthDay() {
        return Integer.parseInt(this.birth.split("-")[2]);
    }

    /**
     * Setter for property birth.
     * @param birth New value of property birth.
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * Getter for property birth.
     * @return Value of property birth.
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Setter for property birth.
     * @param birth New value of property birth.
     */
    public void setAccount(String account) {
        this.account = account;
    }
}
