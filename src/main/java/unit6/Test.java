package unit6;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        Bench bench = new Bench();
        ExecutionPlan executionPlan = new ExecutionPlan();
        bench.benchMurmur3_128(executionPlan);

    }

}