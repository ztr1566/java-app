FROM openjdk:11
ENV JAVA_OPTS="-Djdk.internal.platform.cgroup.version=1"
COPY ./target/demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "sh", "-c", "exec java $JAVA_OPTS -jar demo1-0.0.1-SNAPSHOT.jar" ]