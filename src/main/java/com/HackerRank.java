package com;

public class HackerRank {
    public static void main(String[] args) {
        int[] requirements = {4, 6, 6, 7};
        int[][] markings = {{0, 3}, {0, 5}, {0, 7}, {1, 6}, {1, 8}, {1, 9}, {2, 3}, {2, 5}, {2, 6}};
        int flaskType = 3;
        int totalLoss = -1;
        int answer = -1;
        for (int i = 0; i < flaskType; i++) {
            int currLoss = util(markings, requirements, i);
            if (currLoss != -1 && currLoss < totalLoss) {
                answer = flaskType;
                totalLoss = currLoss;
            }
        }
    }

    public static int util(int[][] markings, int[] requirements, int flaskNo) {
        int totalLoss = -1;
        for (int requirement : requirements) {
            for (int[] marking : markings) {
                if (marking[0] != flaskNo)
                    continue;

                if (requirement <= marking[1])
                    if (totalLoss == -1)
                        totalLoss = markings[flaskNo][1] - requirement;
                    else
                        totalLoss += markings[flaskNo][1] - requirement;

            }
        }
        return totalLoss;
        }
}
