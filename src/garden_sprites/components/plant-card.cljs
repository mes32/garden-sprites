(ns garden-sprites.components.plant-card
  (:require [garden-sprites.atoms.plants :refer [plants filter-plants]]))

(defn plant-card
  [plant]
  [:div.plant-card
    [:h3 (:name plant)]
    [:img {:src (first (:image-paths plant))}]
    [:h4 "$" (:price plant)]])

(defn list-cards [plant-type]
  [:div
    (do
      (reset! plants (filter-plants plant-type))
      (for [plant @plants]
        ^{:key plant} (plant-card plant)))])