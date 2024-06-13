package com.example.csd214;

public class Appointment
{
    private int id;
    private String name;
    private String doctor;
    private int room;

    public Appointment(int id, String name, String doctor, int room) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.room = room;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDoctor() {
        return doctor;
    }

    public int getRoom() {
        return room;
    }
}



