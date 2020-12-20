package com.bilgeadam.ooprevisit;

public class Pilot {
    private long id;
    private String name;
    private int age;
    private int experienceYear;
    private PilotStatus status;

    public Pilot(long id, String name, int age, int experienceYear, PilotStatus status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experienceYear = experienceYear;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public PilotStatus getStatus() {
        return status;
    }

    public void setStatus(PilotStatus status) {
        this.status = status;
    }

    public String displayInformation(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experienceYear=" + experienceYear +
                ", status=" + status +
                '}';
    }
}
