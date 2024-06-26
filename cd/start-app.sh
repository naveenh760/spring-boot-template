#!/usr/bin/env sh

SPRING_PROFILE=${APP_ENV}
if [ -z "${SPRING_PROFILE}" ]
then
  SPRING_PROFILE=prod
fi

java -jar -Duser.timezone=UTC -Xmx2G  -Dspring.profiles.active=${SPRING_PROFILE} app.jar