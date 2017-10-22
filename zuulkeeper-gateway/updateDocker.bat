docker stop zuulkeeper-gateway
docker rm zuulkeeper-gateway
docker rmi flexbridge/zuulkeeper-gateway
mvn clean install -DskipTests
docker run -d -p 8889:8889 --name zuulkeeper-gateway flexbridge/zuulkeeper-gateway


