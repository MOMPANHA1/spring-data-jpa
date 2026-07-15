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
@Table(name = "student_profiles")
public class StudentProfiles {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // បង្កើត UUID ជា String ស្វ័យប្រវត្តិ
    private String userId;
    private String facebookLink;
    private String githubLink;

    @Column(nullable = false)
    private String major;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String university;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private Instant lastModifiedAt;
    @Column(nullable = false)
    private String lastModifiedBy;
    @Column(nullable = false)
    private String profilePicture;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;

}
