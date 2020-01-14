(ns garden-sprites.routes
  (:require [reagent.core :as r]
            [garden-sprites.pages.home :refer [home-page]]
            [garden-sprites.pages.epiphytes :refer [epiphytes-page]]
            [garden-sprites.pages.herbs :refer [herbs-page]]
            [garden-sprites.pages.succulents :refer [succulents-page]]
            [garden-sprites.pages.shopping-cart :refer [shopping-cart-page]]))

(defonce match (r/atom nil))

(defonce routes
  [["/"
    {:name ::home-page
     :view home-page}]
  ["/epiphytes"
    {:name ::epiphytes-page
     :view epiphytes-page}]
  ["/herbs"
    {:name ::herbs-page
     :view herbs-page}]
  ["/succulents"
    {:name ::succulents-page
     :view succulents-page}]
  ["/shopping-cart"
    {:name ::shopping-cart-page
    :view shopping-cart-page}]])

(def refs
  {:home ::home-page
   :epiphytes ::epiphytes-page
   :herbs ::herbs-page
   :succulents ::succulents-page
   :shopping-cart ::shopping-cart-page})