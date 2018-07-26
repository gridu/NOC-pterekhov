FROM java:8
MAINTAINER PTerekhov
USER root

ADD ./scripts/start.sh  /root/start.sh
ADD ./scripts/jenksetup.sh /root/jenksetup.sh
ADD ./scripts/jenkplugin.sh /root/jenkplugin.sh
RUN sh /root/start.sh

ENTRYPOINT ["java","-jar", "/root/jenkins.war"]




