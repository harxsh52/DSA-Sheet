package Greedy;
import java.util.Arrays;

public class jobscedhuling {
    

    static class Job {
        int id, deadline, profit;
        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public int[] JobScheduling(int[][] Jobs) {
        int n = Jobs.length;
        Job[] jobArr = new Job[n];
        
        // Step 1: Convert input array to Job objects
        for (int i = 0; i < n; i++) {
            jobArr[i] = new Job(Jobs[i][0], Jobs[i][1], Jobs[i][2]);
        }

        // Step 2: Sort by profit in descending order
        Arrays.sort(jobArr, (a, b) -> b.profit - a.profit);

        // Step 3: Find max deadline to create time slots
        int maxDeadline = 0;
        for (Job job : jobArr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 4: Create time slot array
        int[] result = new int[maxDeadline + 1]; // index 0 unused
        Arrays.fill(result, -1);

        int count = 0, totalProfit = 0;

        // Step 5: Try to schedule each job
        for (Job job : jobArr) {
            for (int t = job.deadline; t > 0; t--) {
                if (result[t] == -1) {
                    result[t] = job.id;
                    count++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Step 6: Return results
        return new int[] {count, totalProfit};
    }
}

