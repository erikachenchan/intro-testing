package org.exercises;

import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
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
            //nside the loop, this line calls the getName method on the current Exercise object (exercise)
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
