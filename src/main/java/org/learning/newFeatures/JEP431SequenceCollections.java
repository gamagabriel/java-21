package org.learning.newFeatures;

import java.util.ArrayList;

// Documentation -> https://openjdk.org/jeps/431
public class JEP431SequenceCollections {
    public static void main(String[] args) {

        ArrayList<String> sequenceCollections = new ArrayList<>();
        sequenceCollections.add("1° position");
        sequenceCollections.add("2° position");
        sequenceCollections.add("3° position");

        System.out.println("[REVERSED] Normal: " + sequenceCollections);
        System.out.println("[REVERSED] Reversed: " + sequenceCollections.reversed());


        sequenceCollections.addFirst("New first position");
        System.out.println("[ADD_FIRST] list with new first: " + sequenceCollections);

        sequenceCollections.addLast("New last position");
        System.out.println("[ADD_FIRST] list with new last: " + sequenceCollections);

        System.out.println("[GET_FIRST] Returning first element at list: " + sequenceCollections.getFirst());
        System.out.println("[GET_LAST] Returning last element at list: " + sequenceCollections.getLast());

        sequenceCollections.removeFirst();
        System.out.println("[LIST] Returning list after removing first element: " + sequenceCollections);

        sequenceCollections.removeLast();
        System.out.println("[LIST] Returning list after removing last element: " + sequenceCollections);
    }
}
