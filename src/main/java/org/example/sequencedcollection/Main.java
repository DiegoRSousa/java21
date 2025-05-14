package org.example.sequencedcollection;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        list();
//        deq();
//        sortedSet();
        linkedHashSet();
    }

    static void list() {
        var langs = List.of("Java", "Elixir", "Rust", "Go", "JavaScript");

        var first = langs.getFirst();
        System.out.println("first: " + first);

        var last  = langs.getLast();
        System.out.println("last: " + last);

        var reversed = langs.reversed();
        System.out.println(reversed);

    }

    static void deq() {
        var langs = new ArrayDeque<String>(List.of("Elixir", "Java", "Rust", "Go", "JavaScript"));

        var first = langs.getFirst();
        System.out.println("first: " + first);

        var last  = langs.getLast();
        System.out.println("last: " + last);

        langs.addFirst("Lua");
        System.out.println(langs);

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


        var removed = langs.removeLast();

        System.out.println("Removed: " + removed);
        System.out.println(langs);

    }

    static void linkedHashSet() {
        SequencedSet<String> langs = new LinkedHashSet<>();
        langs.add("Elixir");
        langs.add("Rust");
        langs.add("Java");
        langs.add("JavaScript");
        langs.add("Go");

        var first = langs.getFirst();
        System.out.println("first: " + first);

        var last = langs.getLast();
        System.out.println("last: " + last);
    }
}
