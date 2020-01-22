(ns garden-sprites.pages.succulents
  (:require [garden-sprites.components.plant-card :refer [list-cards]]))

(defn succulents-page []
  [:main
    [:div {:class "content-div"}
      [:h2 "Shop Succulents"]
      [list-cards "succlents"]]])