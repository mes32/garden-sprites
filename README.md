# Garden Sprites

Prototype of an e-commerce site for selling house plants.

## Requirements
- Clojure
- Leiningen

## Setup and Run

### Development mode
To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically detect changes to .cljs files and recompile as needed.

Once Figwheel is running, you should be able to open `public/index.html` in the web browser. See [localhost:3449/index.html](http://localhost:3449/index.html).

### Compiling for production

```
# Option 1
lein clean
lein package

# Option 2
lein do clean, cljsbuild once release
```

## Deploy to Heroku (via Docker)

**Note:** This is currently failing on the build stage due to Heroku's memory limits. A possible workaround might be building locally and directly deploying the compiled code.

```bash
# 1. Initialize Heroku from inside the project directory
#    Optionally provide a name for the deployed project
heroku create <deployed_project_name>

# 2. Set the heroku stack to container so that it will build the deployed app from the Dockerfile
heroku stack:set container

# 3. Push the repo to Heroku using Git
git push heroku master
```

## Features

### Completed Features
- [X] Placeholder feature

### Future Features
- [ ] Placeholder feature

## References
- [https://reagent-project.github.io/index.html](https://reagent-project.github.io/index.html)
- [https://devcenter.heroku.com/articles/build-docker-images-heroku-yml](https://devcenter.heroku.com/articles/build-docker-images-heroku-yml)
- [https://github.com/clj-commons/secretary](https://github.com/clj-commons/secretary)

## Author
Mike Stockman