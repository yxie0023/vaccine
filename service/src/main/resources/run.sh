#!/bin/bash

ulimit -c unlimited
ulimit -n 32768

basePath=$(cd "$(dirname "$0")";pwd)
SERVICE_HOME=$basePath
cd $SERVICE_HOME

SERVICE_LIBS="$SERVICE_HOME/"

SERVICE_MAIN="edu.monash.ServiceApplication"
declare -a JAVA_ARGS
JAVA_ARGS[0]="-Xmx512m"
JAVA_ARGS[1]="-Xms512m"
JAVA_ARGS[2]="-Xdebug -Xrunjdwp:transport=dt_socket,address=8880,server=y,suspend=n"

exec $JAVA_HOME/bin/java -Duser.dir=$SERVICE_HOME ${JAVA_ARGS[@]} -classpath $SERVICE_HOME:$SERVICE_LIBS/* $SERVICE_MAIN