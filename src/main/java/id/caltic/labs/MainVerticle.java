package id.caltic.labs;

import io.vertx.core.AbstractVerticle;

import java.util.Optional;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
  	int port = Integer.valueOf(Optional.ofNullable(System.getenv("PORT")).orElse("9000"));

  	vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Caltic Vert.x!\n"))
        .listen(port);
  }

}
