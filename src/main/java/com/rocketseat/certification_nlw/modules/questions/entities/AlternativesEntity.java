package com.rocketseat.certification_nlw.modules.questions.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity(name = "alternatives")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlternativesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50)
    private String technology;

    private String description;

    private boolean isCorrect;

    @OneToMany
    @JoinColumn(name = "question_id")
    private List<AlternativesEntity> alternativesEntities;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
