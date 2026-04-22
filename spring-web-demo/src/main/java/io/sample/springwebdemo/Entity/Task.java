package io.sample.springwebdemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TABLE_TASKS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT") // MySQL friendly
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private TaskStatus status;

    @Column(nullable = false)
    private Integer priority;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}