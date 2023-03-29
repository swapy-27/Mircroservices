package com.intuit.mybooks.model;

import jakarta.persistence.*;

@Entity // specifies this class is mapped to a database table
@Table(name = "customer") // specifies which specific table is mapped to
public class Customer {
    @Id // this will be primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // different ways to generate primary key by default AUTO
    @Column(name = "cust_id")
    private long id;

    @Column(name = "first_name") // specify coloumn names
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String email;
    @Column(name = "password")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
