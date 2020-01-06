FROM clojure

# RUN mkdir -p /usr/src/app

COPY . /usr/src/app

WORKDIR /usr/src/app

EXPOSE 3449

CMD ["lein", "do", "clean,", "cljsbuild", "once", "release"]