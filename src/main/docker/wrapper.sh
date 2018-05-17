#!/bin/bash
#while ! exec 6<>/dev/tcp/${DATABASE_HOST}/${DATABASE_PORT}; do
#    echo "Trying to connect to MySql at ${DATABASE_PORT}..."
#    sleep 10
#done
# -Djava.security.egd=file:/dev/./urandom
java -Dspring.profiles.active=container -jar /app.jar