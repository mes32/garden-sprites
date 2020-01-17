(ns garden-sprites.pages.herbs
  (:require [garden-sprites.atoms.counter :refer [counter counter-dec]]))

(defn herbs-page []
  [:div
   [:h2 "Shop Herbs"]
   [:h3 "Count: " @counter]
   [:input {:type "button" :value "Increase Count"
            :on-click #(swap! counter inc)}]
   [:input {:type "button" :value "Decrease Count"
            :on-click #(swap! counter counter-dec)}]])