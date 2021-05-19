set JAVA_HOME="d:\java\jdk-11.0.10+9"
cmd /c mvn spring-javaformat:apply
cmd /c mvn clean install
cmd /c copy target\cup-of-java-0.0.1-SNAPSHOT.jar Desafio.jar
cmd /c start desafio.bat
