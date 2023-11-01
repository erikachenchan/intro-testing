package org.exercises;

import java.util.ArrayList;

public class ExerciseManagement {

    //ArrayList<Exercise>: This declares a variable named exercises of the type ArrayList that stores objects of the Exercise class.
    // ArrayList is a dynamic array-like data structure in Java, which can grow or shrink in size as needed.
    // In this case, it's specifically designed to hold objects of the Exercise class.
    private final ArrayList<Exercise> exercises;

    // This line declares a constructor for the ExerciseManagement class, and it's marked as public, which means it can be accessed from other parts of the program.
    // Constructors are special methods used for initializing objects of a class.
    public ExerciseManagement() {
        // Inside the constructor, this line initializes an instance variable named exercises.
        // The this keyword is used to refer to the exercises variable of the current object (the object being constructed).
        // It assigns a new ArrayList to the exercises variable.
        this.exercises = new ArrayList<>();
    }

    // public method exerciseList that returns Array of String
    public ArrayList<String> exerciseList() {
        // an ArrayList called list is initialized to store strings.
        // It is an empty list initially,
        // and this list will be used to store the names of exercises
        ArrayList<String> list = new ArrayList<>();

        // "for-each" loop that iterates over a collection of Exercise objects,
        // referred to as exercises
        for (Exercise exercise : exercises) {
            // inside the loop, this line calls the getName method on the current Exercise object (exercise)
            // to retrieve its name. It then adds that name as a string to the list ArrayList.
            // This effectively populates the list with the names of exercises in the exercises collection.
            list.add(exercise.getName());
        }

        //returns the list ArrayList, which now contains the names of exercises, as the result of the exerciseList method
        return list;
    }

    public void add(String exercises) {
        this.exercises.add(new Exercise(exercises));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
