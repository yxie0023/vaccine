#delete useless packages

docker rmi --force `docker images | grep vaccine | awk '{print $3}'`
gradle clean --refresh-dependencies
gradle buildDocker -x test --stacktrace