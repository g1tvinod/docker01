FROM ubuntu:18.04

RUN \
  apt-get update && \
  apt-get install -y openjdk-11-jre-headless
  
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64

ADD app/target/*.jar /home

CMD ["java", "-jar", "/home/*.jar"]
