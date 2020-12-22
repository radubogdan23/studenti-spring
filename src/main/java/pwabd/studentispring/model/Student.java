package pwabd.studentispring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenti")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String nume;
    private String prenume;
    private double medie;

    public Student() {
        // super();
        // TODO Auto-generated constructor stub
    }

    public Student(String nume, String prenume, double medie) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.medie = medie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", medie=" + medie + "]";
    }

}
