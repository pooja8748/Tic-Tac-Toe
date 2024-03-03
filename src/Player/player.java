package player;

import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;
    private String address;
    private long contactnumber;
    private String emailid;
    private int age;

    public void setPlayerdetail(String name, int age, String address, long contactnumber, String emailid, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.contactnumber = contactnumber;
        this.emailid = emailid;
        this.age = age;
    }

    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPlayerNameSymbolEmailidAge(String name, char symbol, String emailid, int age) {
        this.name = name;
        this.symbol = symbol;
        this.emailid = emailid;
        this.age = age;
    }

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }

    public String getPlayeremailid() {
        return this.emailid;
    }

    public int getPlayerage() {
        return this.age;
    }

    public long getcontactnumber() {
        return this.contactnumber;
    }

    public void displayPlayerDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Email ID: " + this.emailid);
        System.out.println("Contact Number: " + this.contactnumber);
        System.out.println("Address: " + this.address);
    }
}
