package com.epam.rd.autotasks;
import java.util.ArrayList;

public class TaskCarousel {
    private final int capacity;
    private int numTasks = 0;
    int counterExecution = 0;
    boolean isFull = false;

    ArrayList<Task> listOfTasks;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
        listOfTasks = new ArrayList<>(capacity);
    }

    public boolean addTask(Task task) {
        if (task == null || task.isFinished() || isFull()) {
            return false;
        }
            listOfTasks.add(task);
            numTasks++;
            return true;
        }


        public boolean execute() {
            if (isEmpty()) return false;
            if (counterExecution >= listOfTasks.size()) counterExecution = 0;
            Task task = listOfTasks.get(counterExecution);
            task.execute();
            if (task.isFinished()) {
                listOfTasks.remove(task);
            }
            else {
                counterExecution++;
            }
            return true;
        }

        public boolean isFull() {

            if (listOfTasks.size() == capacity) {
                isFull = true;
                return true;
            }
            return false;
        }

        public boolean isEmpty() {

            return listOfTasks.size() == 0;
        }

    }

