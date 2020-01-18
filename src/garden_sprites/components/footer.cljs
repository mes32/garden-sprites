(ns garden-sprites.components.footer
  (:require [reitit.frontend.easy :as rfe]
            [garden-sprites.routes :refer [refs]]))

(defn footer []
  [:footer
    [:div {:class "content-div"}
      [:div
        [:a {:href (rfe/href (:home refs))} "Home"]
        [:a {:href (rfe/href (:epiphytes refs))} "Epiphytes"]
        [:a {:href (rfe/href (:herbs refs))} "Herbs"]
        [:a {:href (rfe/href (:succulents refs))} "Succulents"]]]
      [:h2 "Garden Sprites"]
      [:h3 "(Subsoil Layer)"]])
