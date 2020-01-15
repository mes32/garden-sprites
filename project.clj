(defproject garden-sprites "0.1.0-SNAPSHOT"
  :description "Prototype of an e-commerce site for selling house plants"
  :url "https://github.com/mes32/garden-sprites"
  :license {:name "The MIT License"
            :url "https://github.com/mes32/garden-sprites/blob/master/LICENSE"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring-server "0.5.0"]
                 [reagent "0.8.1"]
                 [ring "1.7.1"]
                 [hiccup "1.0.5"]
                 [org.clojure/clojurescript "1.10.439"]
                 [metosin/reitit "0.3.10"]
                 [metosin/reitit-spec "0.3.10"]
                 [metosin/reitit-frontend "0.3.10"]
                 ;; Just for pretty printing the match
                 [fipp "0.6.14"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.19"]
            [lein-scss "0.3.0"]]

  :clean-targets ^{:protect false}

  [:target-path
   [:cljsbuild :builds :app :compiler :output-dir]
   [:cljsbuild :builds :app :compiler :output-to]]

  :resource-paths ["public"]

  :figwheel {:http-server-root "."
             :nrepl-port 7002
             :nrepl-middleware [cider.piggieback/wrap-cljs-repl]
             :css-dirs ["public/css"]}

  :cljsbuild {:builds {:app
                       {:source-paths ["src" "env/dev/cljs"]
                        :compiler
                        {:main "garden-sprites.dev"
                         :output-to "public/js/app.js"
                         :output-dir "public/js/out"
                         :asset-path   "js/out"
                         :source-map true
                         :optimizations :none
                         :pretty-print  true}
                        :figwheel
                        {:on-jsload "garden-sprites.core/mount-root"
                         :open-urls ["http://localhost:3449/index.html"]}}
                       :release
                       {:source-paths ["src" "env/prod/cljs"]
                        :compiler
                        {:output-to "public/js/app.js"
                         :output-dir "public/js/release"
                         :optimizations :advanced
                         :infer-externs true
                         :pretty-print false}}}}

  ; :hooks [leiningen.scss]

  :scss {:builds
         {:develop    {:source-dir "scss/"
                       :dest-dir   "public/css/"
                       :executable "sassc"
                       :args       ["-m" "-I" "scss/" "-t" "nested"]}
          :production {:source-dir "scss/"
                       :dest-dir   "public/css/"
                       :executable "sassc"
                       :args       ["-I" "scss/" "-t" "compressed"]
                       :jar        true}
          :testremote {:source-dir "scss/"
                       :dest-dir   "public/css/"
                       :executable "sassc"
                       :args       ["-I" "scss/" "-t" "nested"]
                       :image-token "#IMAGE-URL#"
                       :image-url "https://s3.amazonaws.com/test/"
                       :font-token "#FONT-URL#"
                       :font-url "https://s3.amazonaws.com/test/fonts/"}
          :test       {:source-dir "tests/scss/"
                       :dest-dir   "/tmp/test/css/"
                       :executable "sassc"
                       :args       ["-m" "-I" "scss/" "-t" "nested"]}}}

  :min-lein-version "2.9.1"

  :aliases {"package" ["do" "clean" ["cljsbuild" "once" "release"]]}

  :profiles {:dev {:source-paths ["src" "env/dev/clj"]
                   :dependencies [[binaryage/devtools "0.9.11"]
                                  [figwheel-sidecar "0.5.19"]
                                  [nrepl "0.6.0"]
                                  [cider/piggieback "0.4.2"]]}}

  :main garden-sprites.core
                                  
  :heroku {:app-name "garden-sprites"})
