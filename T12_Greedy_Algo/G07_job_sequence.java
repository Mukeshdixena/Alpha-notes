package T12_Greedy_Algo;

import java.util.*;

public class G07_job_sequence {

    static class Job {
        int id;
        int dedliine;
        int profit;

        Job(int id, int dedliine, int profit) {
            this.id = id;
            this.dedliine = dedliine;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        jobInfoSequence_1(jobInfo);
        jobInfoSequence_2(jobInfo);

    }

    static void jobInfoSequence_2(int jobInfo[][]) {
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            Job temp = new Job(i, jobInfo[i][0], jobInfo[i][1]);
            jobs.add(temp);
        }

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            System.out.println(curr.id + " " + curr.dedliine + " " + curr.profit);
        }

        // Collections.sort(jobs, (a, b) -> a.profit - b.profit); // ascending ordere
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // descending ordere

        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.dedliine > time) {
                time++;
                ans.add(curr.id);
            }
        }
        System.out.println(time);
        System.out.println(ans);
    }

    static void jobInfoSequence_1(int jobInfo[][]) {

        Arrays.sort(jobInfo, Comparator.comparingDouble(o -> o[1]));
        // for (int i = 0; i < jobInfo.length; i++) {
        // System.out.println(jobInfo[i][0] + " " + jobInfo[i][1]);
        // }

        int time = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = jobInfo.length - 1; i >= 0; i--) {
            if (jobInfo[i][0] > time) {
                time++;
                al.add(jobInfo[i][1]);
            }
        }
        System.out.println(time);
        System.out.println(al);
    }
}
