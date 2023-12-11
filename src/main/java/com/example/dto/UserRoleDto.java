package com.example.dto;

public class UserRoleDto {
    private String firstName;
    private String lastName;
    private String userId;
    private String role;
    private String pillar;
    private String validUntil;

    // Standardkonstruktor, Getter und Setter

    public UserRoleDto() {
    }

    public UserRoleDto(String firstName, String lastName, String userId, String role, String pillar, String validUntil) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.role = role;
        this.pillar = pillar;
        this.validUntil = validUntil;
    }

    // Getter und Setter hier...

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPillar() {
        return pillar;
    }

    public void setPillar(String pillar) {
        this.pillar = pillar;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
