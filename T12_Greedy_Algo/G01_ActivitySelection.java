package T12_Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class G01_ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int activitys[][] = new int[end.length][3];

        for (int i = 0; i < start.length; i++) {
            activitys[i][0] = i;
            activitys[i][1] = start[i];
            activitys[i][2] = end[i];
        }

        System.out.println(activitySelection(activitys));
    }

    static int activitySelection(int activitys[][]) {
        Arrays.sort(activitys, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> list = new ArrayList<>();

        int maxAct = 1;
        list.add(activitys[0][0]);
        int lastEnd = activitys[0][2];

        for (int i = 1; i < activitys.length; i++) {
            if (activitys[i][1] >= lastEnd) {
                lastEnd = activitys[i][2];
                maxAct++;
                list.add(i);
            }
        }

        System.out.println(list);

        return maxAct;
    }
}
