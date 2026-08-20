FROM tomcat:11.0-jdk21-temurin

RUN rm -rf /usr/local/tomcat/webapps/ROOT/*

COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

CMD sed -i "s/port=\"8080\"/port=\"${PORT}\"/" /usr/local/tomcat/conf/server.xml && catalina.sh run