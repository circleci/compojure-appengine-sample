#!/bin/bash

set -ex

if [ "$1" = "start" ]
then

  exec lein ring server-headless
fi

exec "$@"
