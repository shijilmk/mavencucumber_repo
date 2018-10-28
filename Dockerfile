FROM ubuntu:latest
RUN apt-get -y update && apt-get -y install default-jre && apt-get -y clean && mkdir /opt/dockertest_shijil
ADD dockertest_shijil-1.0-SNAPSHOT.jar /opt/dockertest_shijil/
WORKDIR /opt/dockertest
ENTRYPOINT java -jar dockertest_shijil-1.0-SNAPSHOT.jar
VOLUME /opt/dockertest
EXPOSE 80