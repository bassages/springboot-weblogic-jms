# springboot-weblogic-jms-demo
Spring boot application consuming messages from Weblogic JMS

## Install Oracle JDK 8
To intall WLS 14c, Oracle JKD 8 needs to be installed, see https://www.oracle.com/nl/java/technologies/javase/javase-jdk8-downloads.html

## Install Weblogic
Detailed instructions: 
https://docs.oracle.com/en/middleware/standalone/weblogic-server/14.1.1.0/wlsig/installing-weblogic-server-developers.html

Basically:
- Run the installer using Oracle JDK 8: 
```/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin/java -jar fmw_14.1.1.0.0_wls_lite_quick_generic.jar```
- ```cd wls1411/oracle_common/common/bin```
- In the wizzard:
  - Leave everything default at page **Create Domain**, click button **Next >**
  - Leave everything default at page **Templates**, click button **Next >**
  - On page **Administrator Account** fill fields **Name**, **Password** and **Confirm Password** with value **weblogic1**, click button **Next >**
  - Leave everything default at page **Domain Mode and JDK**, click button **Next >**
  - Leave everything default at page **Advanced Configuration**, click button **Next >**
  - On page **Configuration Summary**, click button **Next >**
  - On page **Configuration Progress**, click button **Next >**
  - On page **End of Configuration**, click button **Finish**

## Start Weblogic domain
* ```cd <install-dir>/wls1411/user_projects/domains/base_domain/bin```
* ```./startWebLogic.sh```

# Configure Weblogic Resources
* Go to http://localhost:7001/console/
* Login with username **weblogic1** and password *weblogic1*
* To setup Weblogic resources, ConnectionFactory, Queue, ..., execute the following instructions (but skip step **Creating Oracle Weblogic JMS application modules**):
http://www.itbuzzpress.com/weblogic-tutorials/configuring-jms-services.html?showall=1&limitstart=

# JMSToolBox
To send a message to the Queue, use JMSToolBox:
https://github.com/jmstoolbox/jmstoolbox/wiki/2.9-Setup-for-Oracle-WebLogic-Server 
