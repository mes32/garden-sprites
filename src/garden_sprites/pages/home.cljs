(ns garden-sprites.pages.home
  (:require [reagent.core :as r]
            [garden-sprites.atoms.counter :refer [counter counter-dec]]))

(defn home-page []
  [:div
   [:h2 "Welcome to Garden Sprites"]
   [:img {:src "./images/potted-plants.jpg"}]
   [:h3 "Count: " @counter]
   [:input {:type "button" :value "Increase Count"
            :on-click #(swap! counter inc)}]
  [:input {:type "button" :value "Decrease Count"
            :on-click #(swap! counter counter-dec)}]])

; Photo by Min An from Pexels