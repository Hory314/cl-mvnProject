package pl.coderslab.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "contests")
public class Contest
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String organizer;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(name = "start_date", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime endDate;

    @Column(name = "contest_link", unique = true)
    private String contestLink;

    @Column(name = "rules_link")
    private String rulesLink;

    @Column(columnDefinition = "BLOB")
    private Byte image;

    @Column(name = "reward_description")
    private String rewardDescription;

    @ManyToOne
    @JoinColumn(name = "reward_type_id")
    private RewardType rewardType;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Tag> tags;
}
