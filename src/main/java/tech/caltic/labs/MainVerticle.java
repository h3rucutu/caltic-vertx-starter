package tech.caltic.labs;

import io.vertx.core.AbstractVerticle;

import java.util.Optional;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
  	int port = Integer.parseInt(Optional.ofNullable(System.getenv("PORT")).orElse("9000"));

  	vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Caltx Vert.x!\n"))
        .listen(port);
  }

}
