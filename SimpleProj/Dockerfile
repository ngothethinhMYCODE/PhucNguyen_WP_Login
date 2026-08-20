FROM tomcat:11.0-jdk21-temurin

RUN rm -rf /usr/local/tomcat/webapps/ROOT/*

# Copy JSP, CSS và các file web
COPY src/main/webapp/ /usr/local/tomcat/webapps/ROOT/

# Copy các file Java đã được biên dịch
COPY build/classes/ /usr/local/tomcat/webapps/ROOT/WEB-INF/classes/

# Render yêu cầu dùng biến PORT
CMD sed -i "s/port=\"8080\"/port=\"${PORT}\"/" /usr/local/tomcat/conf/server.xml && catalina.sh run