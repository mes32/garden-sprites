(ns garden-sprites.components.nav-bar
  (:require [reitit.frontend.easy :as rfe]
            [garden-sprites.routes :refer [refs]]))

(defn nav-bar []
  [:nav
    [:div {:class "content-div"}
      [:a {:href (rfe/href (:home refs))} [:h1 "Garden Sprites"]]
      [:div
        [:a {:href (rfe/href (:home refs))} "Home"]
        [:a {:href (rfe/href (:epiphytes refs))} "Epiphytes"]
        [:a {:href (rfe/href (:herbs refs))} "Herbs"]
        [:a {:href (rfe/href (:succulents refs))} "Succulents"]
        [:a {:href (rfe/href (:shopping-cart refs))} "Cart (0)"]]]])
