package sg.edu.nus.reactive_prac.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PublishController {
  @GetMapping(value = "/publishNames", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<String> showListOfNames() {
    Flux<String> stringFlux = Flux.just("Hello", "World", "This", "Is", "a", "name");
    return stringFlux;
  }
}
