(ns garden-sprites.components.nav-bar
  (:require [reitit.frontend.easy :as rfe]
            [garden-sprites.routes :refer [refs]]))

(defn nav-bar []
  [:nav
    [:ul
      [:li [:a {:href (rfe/href (:home refs))} "🏠 Home"]]
      [:li [:a {:href (rfe/href (:epiphytes refs))} "🌱 Epiphytes"]]
      [:li [:a {:href (rfe/href (:herbs refs))} "🌿 Herbs"]]
      [:li [:a {:href (rfe/href (:succulents refs))} "🌵 Succulents"]]
      [:li [:a {:href (rfe/href (:shopping-cart refs))} "🛒 Cart"]]]])
