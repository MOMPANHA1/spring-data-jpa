package co.panha.hibernate.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {
    @Id
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String biography;
    private String facebookLink;
    private String githubLink;
    @Column(nullable = false)
    private String jobTitle;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private Instant lastModifiedAt;
    @Column(nullable = false)
    private String lastModifiedBy;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
