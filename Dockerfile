FROM openjdk:8
WORKDIR /app
ADD first.java .
RUN javac first.java
CMD ["java", "first"]

# FROM java:8
# WORKDIR /var/www/java
# COPY . /var/www/java
# RUN javac Sample.java
# CMD ["java", "Sample"]