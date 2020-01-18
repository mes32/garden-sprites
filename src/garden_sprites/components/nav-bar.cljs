(ns garden-sprites.components.nav-bar
  (:require [reitit.frontend.easy :as rfe]
            [garden-sprites.routes :refer [match refs]]))

(defn selected [match path]
  (if (= (:path @match) path)
    "selected"))

(defn nav-bar []
  [:nav
    [:div {:class "content-div"}
      [:a {:href (rfe/href (:home refs))} [:h1 "Garden Sprites"]]
      [:div
        [:a {:href (rfe/href (:home refs)) :class (selected match "/")} "Home"]
        [:a {:href (rfe/href (:epiphytes refs)) :class (selected match "/epiphytes")} "Epiphytes"]
        [:a {:href (rfe/href (:herbs refs)) :class (selected match "/herbs")} "Herbs"]
        [:a {:href (rfe/href (:succulents refs)) :class (selected match "/succulents")} "Succulents"]
        [:a {:href (rfe/href (:shopping-cart refs)) :class (selected match "/shopping-cart")} "Cart (0)"]]]])
