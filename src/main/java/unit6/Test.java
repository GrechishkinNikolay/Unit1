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
            .forks(1)
            .build();
        new Runner(opt).run();

    }
}