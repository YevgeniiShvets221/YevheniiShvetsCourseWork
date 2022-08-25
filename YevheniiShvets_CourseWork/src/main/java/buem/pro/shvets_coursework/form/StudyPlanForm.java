package buem.pro.shvets_coursework.form;

import java.time.LocalDateTime;

public class StudyPlanForm {
    private String id;
    private  String student;
    private String subject;
    private int mark;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudyPlanForm() {
    }

    public StudyPlanForm(String student, String subject, int mark) {
        this.student = student;
        this.subject = subject;
        this.mark = mark;
    }

    public StudyPlanForm(String id, String student, String subject, int mark, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.mark = mark;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
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
        return "StudyPlanForm{" +
                "id='" + id + '\'' +
                ", student='" + student + '\'' +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
