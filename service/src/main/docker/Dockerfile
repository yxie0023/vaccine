# docker打包需要的基础文件
#基础镜像
FROM 10.10.208.193:5000/urcs/java:8

VOLUME ["/tmp"]

#docker打包时配置文件
ADD ./* /home/service/

#指定时区
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ENTRYPOINT ["/home/service/run.sh"]
