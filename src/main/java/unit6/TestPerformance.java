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
Benchmark                                   Mode  Cnt       Score        Error  Units
TestPerformance.addToTheEndOfArrayList        ss   10       3,459 ±      5,533  ms/op
TestPerformance.addToTheEndOfLinkedList       ss   10      20,086 ±     45,272  ms/op
TestPerformance.addToTheMiddleOfArrayList     ss   10  140126,776 ± 202606,750  ms/op
TestPerformance.addToTheMiddleOfLinkedList    ss   10      21,601 ±     49,844  ms/op
Benchmark                                 Mode  Cnt  Score   Error  Units
TestPerformance.containArrayList          avgt    5  0,947 ± 0,035  ms/op
TestPerformance.containLinkedList         avgt    5  1,287 ± 0,090  ms/op
TestPerformance.getByIndexFromArrayList   avgt    5  0,448 ± 0,388  ms/op
TestPerformance.getByIndexFromLinkedList  avgt    5  0,742 ± 1,243  ms/op
Benchmark                      (size)  Mode  Cnt      Score      Error  Units
TestPerformance.delArrayList    50000  avgt    5   4758,847 ±  927,965  ms/op
TestPerformance.delArrayList   100000  avgt    5   8371,058 ±  309,235  ms/op
TestPerformance.delLinkedList   50000  avgt    5   9942,700 ± 1214,940  ms/op
TestPerformance.delLinkedList  100000  avgt    5  21603,572 ± 2894,945  ms/op
Benchmark                             (size)  Mode  Cnt      Score       Error  Units
TestPerformance.delByIndexArrayList    50000  avgt    5   4859,158 ±  3904,428  ms/op
TestPerformance.delByIndexArrayList   100000  avgt    5  13654,343 ± 15903,476  ms/op
TestPerformance.delByIndexLinkedList   50000  avgt    5  26575,617 ± 27767,733  ms/op
TestPerformance.delByIndexLinkedList  100000  avgt    5  37954,186 ± 25550,624  ms/op

Benchmark22222222222222222                (size)  Mode  Cnt    Score   Error  Units
TestPerformance.containArrayList           50000  avgt         0,017          ms/op
TestPerformance.containLinkedList          50000  avgt         0,018          ms/op
TestPerformance.delArrayList               50000  avgt        36,991          ms/op
TestPerformance.delByIndexArrayList        50000  avgt        50,265          ms/op
TestPerformance.delByIndexLinkedList       50000  avgt       106,623          ms/op
TestPerformance.delLinkedList              50000  avgt       109,992          ms/op
TestPerformance.getByIndexFromArrayList    50000  avgt         0,005          ms/op
TestPerformance.getByIndexFromLinkedList   50000  avgt         0,007          ms/op
*/

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Measurement(batchSize = 1000, iterations = 1)
@Warmup(batchSize = 50, iterations = 2)
@State(Scope.Thread)
public class TestPerformance {

    @Param({"50000"/*, "100000"*/})
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

    private Integer value = 7;

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
//        linkedList.add(5, value);
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

    @Benchmark
    public boolean delArrayList() {
        return arrayList.remove(value);
    }

    @Benchmark
    public boolean delLinkedList() {
        return linkedList.remove(value);
    }

    @Benchmark
    public boolean delByIndexArrayList() {
        return arrayList.remove(value);
    }

    @Benchmark
    public boolean delByIndexLinkedList() {
        return linkedList.remove(value);
    }
}