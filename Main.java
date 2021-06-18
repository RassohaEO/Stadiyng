package Lesson13dz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        HashSet<Integer> b = new HashSet<>();
        b.add(8);
        b.add(9);
        b.add(10);
        b.add(11);
        b.add(12);


        CollectionUtilsImpel utils = new CollectionUtilsImpel();
        Collection<Integer> difference = utils.difference(a, b);
        System.out.println("difference " + difference);
        Collection<Integer> union = utils.union(a, b);
        System.out.println("union " + union);
        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println("intersection " + intersection);
        Set<Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a, b);
        System.out.println("unionWithoutDuplicate " + unionWithoutDuplicate);
        Set<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println("intersectionWithoutDuplicate " + intersectionWithoutDuplicate);



    }

}
