package com.rudolfs.archetype.reactive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

public class ReactorExample {
    private static final Logger LOG = LoggerFactory.getLogger(ReactorExample.class);

    public static void main(String[] args) {
        // create Publisher
        Flux<String> words = Flux.just("thinking", "reactive", "is", "easy", "with", "RxJava2");

        // apply operators
        words.filter(word -> word.contains("a"))
                .sort()
                .subscribe(LOG::info);
    }
}
