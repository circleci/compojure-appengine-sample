FROM clojure:alpine

ADD . /code
WORKDIR /code
ENTRYPOINT ["/code/docker-entrypoint.sh"]
CMD ["start"]
