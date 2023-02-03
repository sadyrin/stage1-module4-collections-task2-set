package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> outSet = new HashSet<>();

        Iterator<String> itFirst = firstSet.iterator();
        Iterator<String> itThird = thirdSet.iterator();

        while(itFirst.hasNext()){
            String str = itFirst.next();

            if(secondSet.contains(str)
                && !thirdSet.contains(str)){
                outSet.add(str);
            }
        }

        while(itThird.hasNext()){
            String str = itThird.next();

            if(!secondSet.contains(str)
                && !firstSet.contains(str)){
                outSet.add(str);
            }
        }

        return outSet;
    }
}
