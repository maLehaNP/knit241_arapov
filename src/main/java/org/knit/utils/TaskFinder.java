package org.knit.utils;

import lombok.extern.slf4j.Slf4j;
import org.knit.TaskDescription;
import org.knit.solutions.Solution;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;


@Slf4j
public class TaskFinder {
    public static TreeMap<Integer, TaskHolder> findTasksByReflectionApi(String path) {
        TreeMap<Integer, TaskHolder> taskHolderTreeMap = new TreeMap<>();
        Reflections reflections = new Reflections(path);

        Set<Class<?>> annotations = reflections.get(Scanners.TypesAnnotated.with(TaskDescription.class).asClass());
        Set<Class<? extends Solution>> interfaces = reflections.getSubTypesOf(Solution.class);

        Set<Class<? extends Solution>> collect = interfaces.stream()
                .filter(annotations::contains).collect(Collectors.toSet());

        for (Class<? extends Solution> aClass : collect) {
            TaskDescription annotation = aClass.getAnnotation(TaskDescription.class);
            TaskHolder taskHolder = TaskHolder.builder()
                    .taskClass(aClass)
                    .id(annotation.taskNumber())
                    .descriptor(annotation.taskDescription())
                    .build();

            taskHolderTreeMap.put(annotation.taskNumber(), taskHolder);
        }

        return taskHolderTreeMap;
    }
}