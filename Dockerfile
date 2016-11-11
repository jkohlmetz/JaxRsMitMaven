FROM jboss/wildfly
ADD target/JaxRsMitMaven.war /opt/jboss/wildfly/standalone/deployments/

