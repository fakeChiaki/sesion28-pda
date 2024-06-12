package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Episode {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "air_date", length = 45)
    private String air_date;

    @Column(name = "episode", length = 45)
    private String episode;

    @Column(name = "characters", length = 100)
    private String characters;

    @Column(name = "created", length = 100)
    private String created;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "url", length = 100)
    private String url;

}
