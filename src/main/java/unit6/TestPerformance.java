package unit6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;



/*
Benchmark                                   Mode  Cnt       Score        Error  Units
TestPerformance.addToTheEndOfArrayList        ss   10       3,459 ±      5,533  ms/op
TestPerformance.addToTheEndOfLinkedList       ss   10      20,086 ±     45,272  ms/op
TestPerformance.addToTheMiddleOfArrayList     ss   10  140126,776 ± 202606,750  ms/op
TestPerformance.addToTheMiddleOfLinkedList    ss   10      21,601 ±     49,844  ms/op
*/


@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Measurement(batchSize = 100000, iterations = 5)
@Warmup(batchSize = 100000, iterations = 5)
@State(Scope.Thread)
public class TestPerformance {

    private ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    private LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    private int value = 42;

//    @Benchmark
//    public boolean addToTheEndOfArrayList() {
//        return arrayList.add(value);
//    }
//
//    @Benchmark
//    public void addToTheEndOfLinkedList() {
//        linkedList.addLast(value);
//    }
//
//    @Benchmark
//    public void addToTheMiddleOfArrayList() {
//        arrayList.add(5, value);
//    }
//
//    @Benchmark
//    public void addToTheMiddleOfLinkedList() {
//        linkedList.add(5,value);
//    }

    @Benchmark
    public Integer getByIndexFromArrayList() {
        return arrayList.get(8);
    }

    @Benchmark
    public Integer getByIndexFromLinkedList() {
        return linkedList.get(8);
    }

    @Benchmark
    public boolean containArrayList() {
        return arrayList.contains(value);
    }

    @Benchmark
    public boolean containLinkedList() {
        return linkedList.contains(value);
    }


}