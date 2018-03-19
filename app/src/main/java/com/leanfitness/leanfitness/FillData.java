package com.leanfitness.leanfitness;

import java.util.ArrayList;

/**
 * Created by ndabhi on 3/14/2018.
 */

public class FillData {

    /**
     * Function responsible for filling the list of exercises
     * Create new ExerciseInfo class and add it in the arrayList
     */
    public static ArrayList<ExerciseInfo> create() {
        final ArrayList<ExerciseInfo> exercises = new ArrayList<ExerciseInfo>();

        //Add exercise item here
        ExerciseInfo info1 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "ABS Advance",
                "Spine Lumber Twist",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Stomach",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info1);


        //Add exercise item here
        ExerciseInfo info2 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info2);

        ExerciseInfo info3 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info3);
        ExerciseInfo info4 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info4);
        ExerciseInfo info5 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info5);
        ExerciseInfo info6 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info6);
        ExerciseInfo info7 = new ExerciseInfo(R.drawable.abs_1, R.drawable.abs_1,
                "This is excercise name",
                "Spine Lumber Twist 123 ",
                "Spine Lumber Twist Stretch Right.\n" +
                        "Lie on your back with your legs extended.\n\n" +
                        "Life your right leg up and use your left hand to pull your right knee to the left, " +
                        "but keep your other arm extended to the side on the floor.",
                "Biceps",
                "T3NHYjGhAkk"); //This is id of youtube video
        exercises.add(info7);
        //Second exercise here

        return exercises;
    }
}
