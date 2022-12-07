/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpe.spring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Daniel
 */
public class Login {
    @JsonProperty
    private long id;

    @JsonProperty
    private String Username;

    @JsonProperty
    private String Password;

    public Login(long id, String Username, String Password) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
    }

    
    public Login(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
