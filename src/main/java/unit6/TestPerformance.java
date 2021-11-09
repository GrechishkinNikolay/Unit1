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

TestPerformance.addToTheEndOfArrayList       50000  avgt        90,228          ms/op
TestPerformance.addToTheEndOfLinkedList      50000  avgt       550,496          ms/op
TestPerformance.addToTheMiddleOfArrayList    50000  avgt       108,867          ms/op
TestPerformance.addToTheMiddleOfLinkedList   50000  avgt       526,415          ms/op

Benchmark                                   (size)  Mode  Cnt      Score   Error  Units
TestPerformance.addToTheEndOfArrayList       50000  avgt         848,520          ms/op
TestPerformance.addToTheEndOfArrayList      100000  avgt        3354,556          ms/op
TestPerformance.addToTheEndOfLinkedList      50000  avgt        5194,429          ms/op
TestPerformance.addToTheEndOfLinkedList     100000  avgt       12163,342          ms/op

TestPerformance.addToTheMiddleOfArrayList    50000  avgt        1076,578          ms/op
TestPerformance.addToTheMiddleOfArrayList   100000  avgt        2800,325          ms/op
TestPerformance.addToTheMiddleOfLinkedList   50000  avgt        5076,824          ms/op
TestPerformance.addToTheMiddleOfLinkedList  100000  avgt       12218,979          ms/op

TestPerformance.containArrayList             50000  avgt           0,086          ms/op
TestPerformance.containArrayList            100000  avgt           0,188          ms/op
TestPerformance.containLinkedList            50000  avgt           0,540          ms/op
TestPerformance.containLinkedList           100000  avgt           0,670          ms/op

TestPerformance.delArrayList                 50000  avgt         549,612          ms/op
TestPerformance.delArrayList                100000  avgt        1029,532          ms/op
TestPerformance.delLinkedList                50000  avgt        1317,532          ms/op
TestPerformance.delLinkedList               100000  avgt        3085,822          ms/op

TestPerformance.delByIndexArrayList          50000  avgt         545,177          ms/op
TestPerformance.delByIndexArrayList         100000  avgt        1382,763          ms/op
TestPerformance.delByIndexLinkedList         50000  avgt        1312,939          ms/op
TestPerformance.delByIndexLinkedList        100000  avgt        2326,331          ms/op


TestPerformance.getByIndexFromArrayList      50000  avgt           0,069          ms/op
TestPerformance.getByIndexFromArrayList     100000  avgt           0,071          ms/op
TestPerformance.getByIndexFromLinkedList     50000  avgt           0,134          ms/op
TestPerformance.getByIndexFromLinkedList    100000  avgt           0,100          ms/op
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