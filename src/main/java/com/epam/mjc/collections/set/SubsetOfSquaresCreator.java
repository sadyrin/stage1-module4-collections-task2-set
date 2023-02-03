package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();

        for(Integer i : sourceList){
            set.add(i * i);
        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());

        NavigableSet<Integer> subSet = new TreeSet<>();
        subSet.addAll(set);
        subSet = subSet.subSet(lowerBound, true, upperBound, true);

        return subSet;
    }
}
