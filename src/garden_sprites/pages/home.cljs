(ns garden-sprites.pages.home
  (:require [garden-sprites.atoms.counter :refer [counter counter-dec]]
            [garden-sprites.components.plant-card :refer [list-cards]]))

(defn home-page []
  [:main
    [:div {:class "content-div"}
    [:h2 "Welcome to Garden Sprites"]
    [:h3 "Online plant retailer, ESTD. 2020"]
    [list-cards]
    [:h3 "Count: " @counter]
    [:input {:type "button" :value "Increase Count"
              :on-click #(swap! counter inc)}]
    [:input {:type "button" :value "Decrease Count"
              :on-click #(swap! counter counter-dec)}]]])