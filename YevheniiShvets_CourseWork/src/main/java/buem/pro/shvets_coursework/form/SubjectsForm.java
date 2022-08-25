package buem.pro.shvets_coursework.form;

import java.time.LocalDateTime;

public class SubjectsForm {
    private String id;
    private String name;
    private int lecturesHours;
    private int practicesHours;
    private int laboratoryWorkHours;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SubjectsForm() {
    }

    public SubjectsForm(String name, int lecturesHours, int practicesHours, int laboratoryWorkHours) {
        this.name = name;
        this.lecturesHours = lecturesHours;
        this.practicesHours = practicesHours;
        this.laboratoryWorkHours = laboratoryWorkHours;
    }

    public SubjectsForm(String id, String name, int lecturesHours, int practicesHours, int laboratoryWorkHours, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
    public String toString() {
        return "SubjectsForm{" +
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
