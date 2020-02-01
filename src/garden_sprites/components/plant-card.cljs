(ns garden-sprites.components.plant-card
  (:require [garden-sprites.atoms.plants :refer [plants get-plants-type!]]))

(defn plant-card
  [plant]
  [:div.plant-card
    [:h3 (:name plant)]
    [:img {:src (first (:image-paths plant))}]
    [:h4 "$" (:price plant)]
    [:button "Add to cart"]])

(defn list-cards [plant-type]
  (do
    (get-plants-type! plant-type))
    [:div
      (for [plant @plants]
        ^{:key plant} (plant-card plant))])