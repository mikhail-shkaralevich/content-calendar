package com.mikhail.content_calendar.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        @Column(value = "description")
        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
