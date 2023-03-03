package org.europol.eu.emas.emasbackend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="submissions")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String country;

    private Double price;

    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    private Type type;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "submission")
//    private Set<HistoryItem> historyItems;

}
