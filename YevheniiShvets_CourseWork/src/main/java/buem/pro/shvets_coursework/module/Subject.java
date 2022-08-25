package buem.pro.shvets_coursework.module;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.lang.String.*;

@Document
public class Subject {
    @Id
    private String id;
    private String name;
    private int lecturesHours;
    private int practicesHours;
    private int laboratoryWorkHours;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Subject() {
    }

    public Subject(String name, int lecturesHours, int practicesHours, int laboratoryWorkHours) {
        this.name = name;
        this.lecturesHours = lecturesHours;
        this.practicesHours = practicesHours;
        this.laboratoryWorkHours = laboratoryWorkHours;
    }

    public Subject(String id, String name, int lecturesHours, int practicesHours, int laboratoryWorkHours, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.lecturesHours = lecturesHours;
        this.practicesHours = practicesHours;
        this.laboratoryWorkHours = laboratoryWorkHours;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLecturesHours() {
        return lecturesHours;
    }

    public void setLecturesHours(int lecturesHours) {
        this.lecturesHours = lecturesHours;
    }

    public int getPracticesHours() {
        return practicesHours;
    }

    public void setPracticesHours(int practicesHours) {
        this.practicesHours = practicesHours;
    }

    public int getLaboratoryWorkHours() {
        return laboratoryWorkHours;
    }

    public void setLaboratoryWorkHours(int laboratoryWorkHours) {
        this.laboratoryWorkHours = laboratoryWorkHours;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id.equals(subject.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lecturesHours=" + lecturesHours +
                ", practicesHours=" + practicesHours +
                ", laboratoryWorkHours=" + laboratoryWorkHours +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
