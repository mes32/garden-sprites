(ns garden-sprites.pages.epiphytes
  (:require [garden-sprites.components.plant-card :refer [list-cards]]))

(defn epiphytes-page []
  [:main
    [:div {:class "content-div"}
      [:h2 "Shop Epiphytes"]
      [list-cards "epiphyte"]]])