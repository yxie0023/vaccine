docker stop vaccine

docker rm vaccine

docker run \
    -d --name vaccine \
    --net=host \
    --env DB_URL="localhost:3306" \
    -p 8880:8880 \
   yichenelaine/fit5120:1.0.0-2103291752

docker update vaccine --restart=always

docker logs -f vaccine