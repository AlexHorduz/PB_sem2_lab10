package lab10;

import lab10.models.Rectangle;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<Rectangle> widthComparator = (L, R) -> Double.compare(L.getWidth(), R.getWidth());

        Comparator<Rectangle> widthComparatorReversed = widthComparator.reversed();

        Comparator<Rectangle> widthAndHeightComparator = widthComparator
                .thenComparing((L, R) -> Double.compare(L.getHeight(), R.getHeight()));

        Comparator<Rectangle> widthComparatorWithNullsFirst =  Comparator.nullsFirst(widthComparator);

        Set<Rectangle> set1 = new TreeSet<>(widthComparator);
        Set<Rectangle> set2 = new TreeSet<>(widthComparatorReversed);
        Set<Rectangle> set3 = new TreeSet<>(widthAndHeightComparator);
        Set<Rectangle> set4 = new TreeSet<>(widthComparatorWithNullsFirst);

        for (int i = 0; i < 10; i++) {
            set1.add(new Rectangle(i, i + 1));
            set2.add(new Rectangle(i, i + 1));
            set3.add(new Rectangle(i, i + 1));
            set4.add(new Rectangle(i, i + 1));
        }

    }
}
