package oop.q3;

public class Student {
    public String name;
    public String surname;
    public String country;
    public String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    // Override equals and hashCode for correct comparisons in University methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;
        return name.equals(other.name) &&
                surname.equals(other.surname) &&
                country.equals(other.country) &&
                info.equals(other.info);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + country.hashCode() + info.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + country + ") - " + info;
    }
}
