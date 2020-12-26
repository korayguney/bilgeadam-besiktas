package com.bilgeadam.comparator;

import java.util.Comparator;

public class StudentSortGpa implements Comparator<ComparableStudent> {
    public int compare(ComparableStudent s1, ComparableStudent s2){
        if (s1.getGpa() < s2.getGpa()) { return 1; }
        else if (s1.getGpa() > s2.getGpa()) { return -1; }
        else { return 0; }
    }
}
