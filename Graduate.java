package com.company;

public class Graduate extends Student {

    private String major;

    public Graduate(String name, int id, String major) {
        super(name, id);
        this.major = major;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": " + getId() + ", " + major);
    }

    public boolean equals(Graduate g) {
        if (g.major.equals(major)) {
            return true;
        }
        return false;
    }

    public String getMajor() {
        return major;
    }
}
