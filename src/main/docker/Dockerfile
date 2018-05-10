FROM java:8
#VOLUME /tmp
RUN mkdir /app
ADD demo-0.0.1-SNAPSHOT.jar /app/app.jar
#ADD runboot.sh /app/
#RUN bash -c 'touch /app/app.jar'
ENTRYPOINT ["java","-jar","/app/app.jar"]