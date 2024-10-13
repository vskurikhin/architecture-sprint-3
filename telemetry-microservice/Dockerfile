FROM eclipse-temurin:21.0.4_7-jre-alpine
WORKDIR /opt/app
RUN addgroup --system javauser && adduser -S -s /usr/sbin/nologin -G javauser javauser
COPY ./target/telemetry-0.0.1-SNAPSHOT.jar app.jar
RUN chown -R javauser:javauser .
USER javauser
ENTRYPOINT ["java", "-jar", "app.jar"]