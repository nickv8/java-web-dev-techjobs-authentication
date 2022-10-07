package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LogInFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 5, max = 25, message = "Invalid user name, must be between 5 and 25 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 7, max = 25, message = "Invalid password, must be between 7 and 25 characters.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
