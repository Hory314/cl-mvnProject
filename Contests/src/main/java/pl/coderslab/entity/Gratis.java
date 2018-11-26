package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "gratis")
public class Gratis
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;
}
