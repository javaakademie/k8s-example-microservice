package de.javaakademie.k8sexampleservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String envVar = Optional.ofNullable(System.getenv("EXAMPLE_VALUE")).orElse("default_value");
        Greeting greeting = new Greeting(counter.incrementAndGet(), "Hello " + name + "!", envVar.isEmpty() ? "default_value" : envVar);
        return new ResponseEntity(greeting, HttpStatus.OK);
    }

}
