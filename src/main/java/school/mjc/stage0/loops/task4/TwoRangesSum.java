package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int sum = 0;
        int skippedSum = 0;
        for(int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skippedSum += i;
                continue;
            }
            sum += i;
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + sum);
    }
}
