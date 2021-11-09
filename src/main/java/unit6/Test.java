package unit6;

import java.io.IOException;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Test {

    public static void main(String[] args) throws IOException, RunnerException {

        Options opt = new OptionsBuilder()
            .include(TestPerformance.class.getSimpleName())
//            .shouldDoGC(true)
//            .mode(Mode.Throughput)
//            .timeUnit(TimeUnit.SECONDS)
            .forks(1)
            .warmupForks(1)
            .warmupIterations(1)
//            .warmupTime(TimeValue.seconds(1))
//            .measurementIterations(3)
//            .measurementTime(TimeValue.seconds(1))
            .build();

        new Runner(opt).run();

    }
}