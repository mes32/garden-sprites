(ns garden-sprites.pages.herbs
  (:require [garden-sprites.components.plant-card :refer [list-cards]]))

(defn herbs-page []
  [:main
    [:div {:class "content-div"}
      [:h2 "Shop Herbs"]
      [list-cards "herb"]]])