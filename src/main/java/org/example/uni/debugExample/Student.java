package org.example.uni.debugExample;

public class Student {
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Student(String name, String family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Student{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
