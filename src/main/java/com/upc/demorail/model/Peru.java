package com.upc.demorail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Peru {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
