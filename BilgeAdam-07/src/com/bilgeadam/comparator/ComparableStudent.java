package com.bilgeadam.comparator;

public class ComparableStudent implements Comparable<ComparableStudent>{
    private String name; private long id = 0; private double gpa = 0.0;

    public ComparableStudent(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){ return this.name; }
    // Additional code here


    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(ComparableStudent that) {
        if (this.getName() == null && that.getName() == null) {
            return 0;
        } else if (this.getName() == null) {
            return -1;
        } else if (that.getName() == null) {
            return 1;
        } else {
            return this.getName().compareTo(that.getName());
        }
    }
}