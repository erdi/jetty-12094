This is a reproducer project for https://github.com/jetty/jetty.project/issues/12094.

To reproduce, after cloning:
- `git checkout jetty-11`
- `./gradlew run`
- `curl localhost:8090/hello` should return `Hello world!`
- `curl localhost:8091/hello` should return `Hello world!`
- stop `./gradlew run`
- `git checkout jetty-12`
- `./gradlew run`
- `curl localhost:8090/hello` should return `Hello world!`
- `curl localhost:8091/hello` returns a 503

Authored using JDK 21.