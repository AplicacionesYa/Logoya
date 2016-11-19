/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoYa.beans;

/**
 *
 * @author Familia Mazo
 */
public class freelance {

    private String name;
    private String email;
    private String cell_phone;
    private String password;
    private String bank;
    private String number_Account;
    private String holders;
    private String route_image;

    public freelance() {
    }

    
    public freelance(String name, String email, String cell_phone, String password, String bank, String number_Account, String holders, String route_image) {
        this.name = name;
        this.email = email;
        this.cell_phone = cell_phone;
        this.password = password;
        this.bank = bank;
        this.number_Account = number_Account;
        this.holders = holders;
        this.route_image = route_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNumber_Account() {
        return number_Account;
    }

    public void setNumber_Account(String number_Account) {
        this.number_Account = number_Account;
    }

    public String getHolders() {
        return holders;
    }

    public void setHolders(String holders) {
        this.holders = holders;
    }

    public String getRoute_image() {
        return route_image;
    }

    public void setRoute_image(String route_image) {
        this.route_image = route_image;
    }
}
