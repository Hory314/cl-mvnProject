package pl.coderslab.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reward_types")
public class RewardType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reward_type", nullable = false)
    private String rewardType;

    @OneToMany(mappedBy = "rewardType")
    private List<Contest> contests;
}
