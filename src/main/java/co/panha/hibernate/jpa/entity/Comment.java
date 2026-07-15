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
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = false)
    private Boolean isDeleted;
    @Column(nullable = false)
    private String text;
    @Column(nullable = false)
    private String createdBy;
    @Column(nullable = false)
    private Instant lastModifiedAt;
    @Column(nullable = false)
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comment parent;

}
