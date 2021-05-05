sudo docker stop vaccine

sudo docker rm vaccine

sudo docker run \
    -d --name vaccine \
    --net=host \
    --env DB_URL="127.0.0.1:3306" \
    -p 8880:8880 \
   yichenelaine/fit5120:1.0.0-2104292303

sudo docker update vaccine --restart=always

sudo docker logs -f vaccine