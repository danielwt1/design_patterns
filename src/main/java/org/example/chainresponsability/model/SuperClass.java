package org.example.chainresponsability.model;

public class SuperClass {
    protected String name;
    protected String lastName;
    protected String email;
    protected Long totalPrices;
    protected boolean isActive ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(Long totalPrices) {
        this.totalPrices = totalPrices;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
