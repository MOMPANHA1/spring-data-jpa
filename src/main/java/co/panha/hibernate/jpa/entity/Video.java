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
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // int4 NOT NULL (Auto-increment)
    private Integer id;
    @Column(nullable = false)
    private String duration;
    @Column(nullable = false)
    private Boolean isDeleted;
    @Column(nullable = false)
    private Boolean isPublished;
    @Column(nullable = false)
    private String slug;
    @Column(nullable = false)
    private String thumbnail;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String youtube;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private Instant lastModifiedAt;
    @Column(nullable = false)
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments;
}
