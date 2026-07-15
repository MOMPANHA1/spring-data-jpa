package co.panha.hibernate.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // int4 NOT NULL (Auto-increment)
    private Integer id;

    @Column(nullable = false)
    private Integer countRating;

    @Column(nullable = false)
    private Instant createdAt;
    private String description;
    private Float discountPercent;
    @Column(nullable = false)
    private Boolean isDeleted;
    @Column(nullable = false)
    private Boolean isPublished;
    @Column(nullable = false)
    private String keyword;
    @Column(nullable = false)
    private String level;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private String slug;
    @Column(nullable = false)
    private Float starRating;
    @Column(nullable = false)
    private String thumbnail;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Float totalHours;
    @Column(nullable = false)
    private Instant updatedAt;
    @Column(nullable = false)
    private Instant lastModifiedAt;
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;
}
