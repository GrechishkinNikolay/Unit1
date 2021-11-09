package unit6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

/*
Benchmark                                   (size)  Mode  Cnt      Score   Error  Units
TestPerformance.addToTheEndOfArrayList       50000  avgt         989,056          ms/op
TestPerformance.addToTheEndOfArrayList      100000  avgt        6027,471          ms/op

TestPerformance.addToTheEndOfLinkedList      50000  avgt       12632,966          ms/op
TestPerformance.addToTheEndOfLinkedList     100000  avgt       29735,060          ms/op


TestPerformance.addToTheMiddleOfArrayList    50000  avgt        2164,998          ms/op
TestPerformance.addToTheMiddleOfArrayList   100000  avgt       11033,216          ms/op

TestPerformance.addToTheMiddleOfLinkedList   50000  avgt       18696,201          ms/op
TestPerformance.addToTheMiddleOfLinkedList  100000  avgt       18117,117          ms/op


TestPerformance.containArrayList             50000  avgt         534,366          ms/op
TestPerformance.containArrayList            100000  avgt        1002,495          ms/op

TestPerformance.containLinkedList            50000  avgt        5506,652          ms/op
TestPerformance.containLinkedList           100000  avgt       13006,746          ms/op


TestPerformance.delArrayList                 50000  avgt         645,613          ms/op
TestPerformance.delArrayList                100000  avgt        1470,907          ms/op

TestPerformance.delLinkedList                50000  avgt        4148,581          ms/op
TestPerformance.delLinkedList               100000  avgt       13682,895          ms/op


TestPerformance.delByIndexArrayList          50000  avgt         557,140          ms/op
TestPerformance.delByIndexArrayList         100000  avgt        1182,480          ms/op

TestPerformance.delByIndexLinkedList         50000  avgt        5615,827          ms/op
TestPerformance.delByIndexLinkedList        100000  avgt        9050,971          ms/op


TestPerformance.getByIndexFromArrayList      50000  avgt         529,777          ms/op
TestPerformance.getByIndexFromArrayList     100000  avgt        1668,790          ms/op

TestPerformance.getByIndexFromLinkedList     50000  avgt        5299,219          ms/op
TestPerformance.getByIndexFromLinkedList    100000  avgt       13366,002          ms/op

Process finished with exit code 0

*/

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Measurement(batchSize = 10000, iterations = 1)
@Warmup(batchSize = 3000, iterations = 1)
@State(Scope.Thread)
public class TestPerformance {

    @Param({"50000", "100000"})
    public int size;
    static Random random = new Random();
    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;

    @Setup
    public void setUp() {
        arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(20));
        }
        linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(20));
        }
    }

    public ArrayList<Integer> getArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(this.arrayList);
        return arrayList;
    }

    public LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(this.linkedList);
        return linkedList;
    }

    private Integer value = 7;

    @Benchmark
    public boolean addToTheEndOfArrayList() {
        return getArrayList().add(value);
    }

    @Benchmark
    public void addToTheEndOfLinkedList() {
        getLinkedList().addLast(value);
    }

    @Benchmark
    public void addToTheMiddleOfArrayList() {
        getArrayList().add(size / 2, value);
    }

    @Benchmark
    public void addToTheMiddleOfLinkedList() {
        getLinkedList().add(size / 2, value);
    }

    @Benchmark
    public Integer getByIndexFromArrayList() {
        return getArrayList().get(8);
    }

    @Benchmark
    public Integer getByIndexFromLinkedList() {
        return getLinkedList().get(8);
    }

    @Benchmark
    public boolean containArrayList() {
        return getArrayList().contains(value);
    }

    @Benchmark
    public boolean containLinkedList() {
        return getLinkedList().contains(value);
    }

    @Benchmark
    public boolean delArrayList() {
        return getArrayList().remove(value);
    }

    @Benchmark
    public boolean delLinkedList() {
        return getLinkedList().remove(value);
    }

    @Benchmark
    public boolean delByIndexArrayList() {
        return getArrayList().remove(value);
    }

    @Benchmark
    public boolean delByIndexLinkedList() {
        return getLinkedList().remove(value);
    }
}