# springboot-weblogic-jms-demo
Spring boot application consuming messages from Weblogic JMS

## Install Oracle JDK 8
To intall WLS 14c, Oracle JKD 8 needs to be installed, see https://www.oracle.com/nl/java/technologies/javase/javase-jdk8-downloads.html

## Install Weblogic
Then follow these instructions: 
https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlsig/installing-weblogic-server-developers.html

# Configure Weblogic Resources
To setup Weblogic resources, ConnectionFactory, Queue, ..., see:
http://www.itbuzzpress.com/weblogic-tutorials/configuring-jms-services.html?showall=1&limitstart=

# JMSToolBox
To send a message to the Queue, use JMSToolBox:
https://github.com/jmstoolbox/jmstoolbox/wiki/2.9-Setup-for-Oracle-WebLogic-Server 
