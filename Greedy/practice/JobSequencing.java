package Greedy.practice;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobSequence(Job[] jobs) {
        // Step 1: Sort jobs by profit in descending order
        Arrays.sort(jobs, Comparator.comparingInt((Job job) -> job.profit).reversed());

        // Step 2: Find max deadline to create slot array
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create slot array, -1 means free
        char[] slot = new char[maxDeadline + 1];  // 1-indexed
        Arrays.fill(slot, '-');

        int jobCount = 0;
        int totalProfit = 0;

        // Step 4: Place jobs
        for (Job job : jobs) {
            for (int t = job.deadline; t > 0; t--) {
                if (slot[t] == '-') {
                    slot[t] = job.id;
                    jobCount++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Output
        System.out.println("Jobs scheduled:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != '-') {
                System.out.print(slot[i] + " ");
            }
        }
        System.out.println("\nTotal jobs: " + jobCount);
        System.out.println("Total profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };

        jobSequence(jobs);
    }
}

