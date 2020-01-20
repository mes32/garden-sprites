(ns garden-sprites.pages.succulents
  (:require [garden-sprites.atoms.succulents :refer [succulents]]))

(defn list-cards [succulents]
  [:div
    (for [plant succulents]
      ^{:key plant}
        [:div
          [:h3 (:name plant)]
          [:img {:src (:image-path plant)}]])])

(defn succulents-page []
  [:main
    [:div {:class "content-div"}
      [:h2 "Shop Succulents"]
      [list-cards @succulents]]])