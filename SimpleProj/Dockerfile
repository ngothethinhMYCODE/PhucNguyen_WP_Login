FROM tomcat:11.0-jdk21-temurin

RUN rm -rf /usr/local/tomcat/webapps/ROOT/*

COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

CMD sed -i \
    -e 's/<Server port="8005"/<Server port="-1"/' \
    -e "s/port=\"8080\"/port=\"${PORT}\"/" \
    /usr/local/tomcat/conf/server.xml && catalina.sh run