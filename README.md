# Garden Sprites

Prototype of an e-commerce site selling plants.

## Requirements
- Clojure
- Leiningen

## Setup

## Run

## Deploy to Heroku (via Leinigen Plugin)

### Development mode
To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, you should be able to open the `public/index.html` page in the browser.

### REPL

The project is setup to start nREPL on port `7002` once Figwheel starts.
Once you connect to the nREPL, run `(cljs)` to switch to the ClojureScript REPL.

### Building for production

```
lein clean
lein package
```

## Features

### Completed Features
- [X] Placeholder feature

### Future Features
- [ ] Placeholder feature

## References
- [https://reagent-project.github.io/index.html](https://reagent-project.github.io/index.html)
- [https://devcenter.heroku.com/articles/deploying-clojure-applications-with-the-heroku-leiningen-plugin](https://devcenter.heroku.com/articles/deploying-clojure-applications-with-the-heroku-leiningen-plugin)
- [https://github.com/clj-commons/secretary](https://github.com/clj-commons/secretary)

## Author
Mike Stockman