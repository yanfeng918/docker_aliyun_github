FROM java:8
#VOLUME /tmp
RUN mkdir /app
ADD demo.jar /app/app.jar
#ADD runboot.sh /app/
#RUN bash -c 'touch /app/app.jar'
ENTRYPOINT ["java","-jar","/app/app.jar"]