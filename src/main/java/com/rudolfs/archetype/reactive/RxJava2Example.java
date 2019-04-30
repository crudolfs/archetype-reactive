package com.rudolfs.archetype.reactive;

import io.reactivex.Flowable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RxJava2Example {
    private static final Logger LOG = LoggerFactory.getLogger(RxJava2Example.class);

    public static void main(String[] args) {
        // create Publisher
        Flowable<String> words = Flowable.just("thinking", "reactive", "is", "easy", "with", "RxJava2");

        // apply operators
        words.filter(word -> word.contains("a"))
                .sorted()
                .subscribe(LOG::info);
    }
}
