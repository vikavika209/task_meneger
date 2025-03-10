package com.time_meneger.dto;

import com.time_meneger.entity.Task;
import com.time_meneger.entity.TaskPriority;
import com.time_meneger.entity.TaskStatus;
import com.time_meneger.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private long id;

    private String title;

    private String description;

    private TaskStatus status;

    private TaskPriority priority;

    private UserDto author;

    private UserDto assignee;

    public TaskDto toDto(Task task){
        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.status = task.getStatus();
        this.priority = task.getPriority();
        this.assignee = new UserDto().toUserDto(task.getAssignee());
        this.author = new UserDto().toUserDto(task.getAuthor());
        return this;
    }
}