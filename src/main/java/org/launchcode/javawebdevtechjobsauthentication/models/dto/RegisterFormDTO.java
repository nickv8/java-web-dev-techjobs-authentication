package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class RegisterFormDTO extends LogInFormDTO{

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
