package com.icemajor.todolistwebapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "todo_item")
public class TodoItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;
    
    @Getter
    @Setter
    @NotBlank(message = "What's the task?")
    private String description;
    
    @Getter
    @Setter
    private boolean complete;
    
    @Getter
    @Setter
    private Instant createdDate;
    
    @Getter
    @Setter
    private Instant modifiedDate;
    
    public TodoItem() {}
    
    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }
    
    @Override
    public String toString() {
        return "TodoItem{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}"
                .formatted(id, description, complete, createdDate, modifiedDate);
    }
}
