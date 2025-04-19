package org.knit.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.knit.solutions.Solution;

@Builder
public class TaskHolder implements Comparable<TaskHolder> {
    private final Class<? extends Solution> taskClass;
    private int id;
    private String descriptor;

    public TaskHolder(Class<? extends Solution> taskClass, int id, String descriptor) {
        this.taskClass = taskClass;
        this.id = id;
        this.descriptor = descriptor;
    }

    @Override
    public int compareTo(TaskHolder taskHolder) {
        return Integer.compare(id, taskHolder.id);
    }

    public Class<? extends Solution> getTaskClass() {
        return taskClass;
    }

    public int getId() {
        return id;
    }

    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public String toString() {
        return "TaskHolder{" +
                "taskClass=" + taskClass +
                ", id=" + id +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}