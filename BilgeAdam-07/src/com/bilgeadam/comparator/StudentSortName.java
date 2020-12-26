package com.bilgeadam.comparator;

import java.util.Comparator;

public class StudentSortName implements Comparator<ComparableStudent> {

    @Override
    public int compare(ComparableStudent s1, ComparableStudent s2){
        int result = s1.getName().compareTo(s2.getName());
        if (result != 0) { return result; }
        else {
            return 0;  // Or do more comparing
        }
    }
}

