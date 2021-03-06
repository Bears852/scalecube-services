package io.scalecube.services.examples;

import static io.scalecube.services.examples.BenchmarkService.NAMESPACE;

import io.scalecube.services.annotations.RequestType;
import io.scalecube.services.annotations.ResponseType;
import io.scalecube.services.annotations.Service;
import io.scalecube.services.annotations.ServiceMethod;
import io.scalecube.services.api.ServiceMessage;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service(NAMESPACE)
public interface BenchmarkService {

  String NAMESPACE = "benchmarks";

  String SERVICE_RECV_TIME = "service-recv-time";
  String SERVICE_SEND_TIME = "service-send-time";
  String CLIENT_RECV_TIME = "client-recv-time";
  String CLIENT_SEND_TIME = "client-send-time";

  @RequestType(String.class)
  @ResponseType(String.class)
  @ServiceMethod
  Mono<Void> requestVoid(ServiceMessage request);

  @RequestType(String.class)
  @ResponseType(String.class)
  @ServiceMethod
  Mono<ServiceMessage> one(ServiceMessage message);

  @RequestType(String.class)
  @ResponseType(String.class)
  @ServiceMethod
  Mono<ServiceMessage> failure(ServiceMessage message);

  @RequestType(String.class)
  @ResponseType(String.class)
  @ServiceMethod
  Flux<ServiceMessage> infiniteStream(ServiceMessage message);
}
