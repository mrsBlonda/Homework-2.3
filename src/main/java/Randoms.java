import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

    int min, max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (max - min > 0) {
                    min++;
                    return true;
                }
                return false;
            }


            @Override
            public Integer next() {

                for (int i = min; i <= max; i++) {
                    return (int) (Math.random() * (max - min)) + min;
                }
                return 0;

            }
        };

    }


}