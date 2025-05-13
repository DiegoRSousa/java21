package org.example.sequencedcollection;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        list();
        deq();
        sortedSet();
        linkedHashSet();
    }

    static void list() {
        var langs = List.of("Java", "Elixir", "Rust", "Go", "JavaScript");

        var first = langs.get(0);
        System.out.println("first: " + first);

        var last  = langs.get(langs.size() - 1);
        System.out.println("last: " + last);

        var newList = langs.reversed();
        System.out.println("new: " + newList);


    }

    static void deq() {
        var langs = new ArrayDeque<String>(List.of("Elixir", "Java", "Rust", "Go", "JavaScript"));

        var first = langs.getFirst();
        System.out.println("first: " + first);

        var last  = langs.getLast();
        System.out.println("last: " + last);

    }

    static void sortedSet() {
        SortedSet<String> langs = new TreeSet<>();
        langs.add("Elixir");
        langs.add("Go");
        langs.add("Java");
        langs.add("Rust");
        langs.add("JavaScript");

        var first = langs.first();
        System.out.println("first: " + first);
        var last = langs.last();
        System.out.println("last: " + last);
    }

    static void linkedHashSet() {
        Set<String> langs = new LinkedHashSet<>();
        langs.add("Elixir");
        langs.add("Rust");
        langs.add("Java");
        langs.add("JavaScript");
        langs.add("Go");

        var first = langs.iterator().next();
        System.out.println("first: " + first);
    }
}
