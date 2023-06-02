package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        
        if ( numberToGoUntil < toBreakWith) {
            int temp = numberToGoUntil;
            System.out.println("iterating till the end");
            numberToGoUntil = toBreakWith + 1;
            toBreakWith = temp;
        }

        for(int i = 1; i <= numberToGoUntil; i++) {
            System.out.println(i);    
            if (i == toBreakWith) {
                break;
            }
        }
    }
}
