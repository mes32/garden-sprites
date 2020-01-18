# Garden Sprites

Prototype of an e-commerce site for selling house plants.

## Requirements
- [Java Virtual Machine](https://java.com/en/download/) (most likely already installed)
- [Leiningen](https://libraries.io/homebrew/leiningen)
-  [SassC](https://github.com/sass/sassc)

To install Leiningen and SassC using [Homebrew](https://brew.sh/):

```bash
brew update
brew install leiningen sassc
```

## Setup and Run

### Development mode
To start Figwheel and SaasC compilers, navigate into the project folder and run the following commands in the terminal:

```bash
# 1. Compile SCSS files into CSS
#    ctrl-c to quit
lein scss :develop

# 2. Compile ClojureScript to JavaScript and start the client-side in browser.
#    :cljs/quit to quit
lein figwheel
```

Figwheel will automatically detect changes to `.cljs` files and recompile as needed. The SassC plugin will continue to run and watch for changes to files inside the `/scss` directory and recompile CSS as needed.

Once Figwheel is running, you should be able to open `public/index.html` in the web browser. See [localhost:3449/index.html](http://localhost:3449/index.html).

### Compiling for production

```bash
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
- [X] Minimal Clojure server delivers ClojureScript client-side
- [X] Reactive components and state management using Reagent
- [X] Client-side routing and multiple pages using Reitit library
- [X] Style sheets written in SCSS

### Future Features
- [ ] Shopping cart state managed using an atom

## References
- [https://reagent-project.github.io/index.html](https://reagent-project.github.io/index.html)
- [https://devcenter.heroku.com/articles/build-docker-images-heroku-yml](https://devcenter.heroku.com/articles/build-docker-images-heroku-yml)
- [https://github.com/metosin/reitit/tree/master/examples/frontend](https://github.com/metosin/reitit/tree/master/examples/frontend)
- [https://github.com/bluegray/lein-scss](https://github.com/bluegray/lein-scss)
- [https://yogthos.net/posts/2014-07-15-Building-Single-Page-Apps-with-Reagent.html](https://yogthos.net/posts/2014-07-15-Building-Single-Page-Apps-with-Reagent.html)
- [https://medium.com/tech-notes-and-geek-stuff/gimp-instagram-filters-c660580661c6](https://medium.com/tech-notes-and-geek-stuff/gimp-instagram-filters-c660580661c6)

## Author
Mike Stockman