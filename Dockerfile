FROM openjdk:11
# هذا السطر يضيف الخاصية التي تمنع الـ crash
ENV JAVA_OPTS="-Djdk.internal.platform.cgroup.version=1"
COPY ./target/demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo1-0.0.1-SNAPSHOT.jar"]