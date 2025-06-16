package Greedy.practice;

import java.util.*;

public class Activityselection {

    // Inner class for Activity
    static class Activity {
        int start, end;
        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void selectActivities(int[] start, int[] end) {
        if (start.length != end.length) {
            throw new IllegalArgumentException("Start and end arrays must be of the same length.");
        }

        int n = start.length;

        // Create list of Activity objects
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }

        // Sort activities based on their end time using Comparator.comparingInt
        activities.sort(Comparator.comparingInt(a -> a.end));

        if (activities.isEmpty()) {
            System.out.println("No activities to select.");
            return;
        }

        // Select first activity
        int count = 1;
        int lastEnd = activities.get(0).end;
        System.out.println("Selected Activities:");
        System.out.println("(" + activities.get(0).start + ", " + activities.get(0).end + ")");

        // Loop through remaining activities
        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= lastEnd) {
                System.out.println("(" + activities.get(i).start + ", " + activities.get(i).end + ")");
                lastEnd = activities.get(i).end;
                count++;
            }
        }

        System.out.println("Maximum number of non-overlapping activities: " + count);
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        selectActivities(start, end);
    }
}
