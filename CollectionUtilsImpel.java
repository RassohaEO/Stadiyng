package Lesson13dz;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtilsImpel implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);
        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> intersection = new LinkedList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);


            }


        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);


            }


        }


        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> unionWithoutDuplicate = new LinkedHashSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> intersectionWithoutDuplicate = new LinkedHashSet<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersectionWithoutDuplicate.add(num);


            }


        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersectionWithoutDuplicate.add(num);


            }


        }


        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> difference = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);

            }

        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);
            }

        }

        return difference;
    }
}
