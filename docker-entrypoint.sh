#!/bin/bash

set -ex
export JAVA_OPTS="-Xmx100"

if [ "$1" = "start" ]
then
  exec lein ring server-headless
fi

exec "$@"
