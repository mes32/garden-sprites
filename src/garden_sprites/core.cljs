(ns garden-sprites.core
  (:require [reagent.core :as r]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]
            [reitit.coercion :as rc]
            [reitit.coercion.spec :as rss]
            [spec-tools.data-spec :as ds]
            [fipp.edn :as fedn]
            [garden-sprites.pages.herbs :refer [herbs-page]]))

;; -------------------------
;; Pages

(defn home-page []
  [:div
   [:h2 "Welcome to Garden Sprites"]])

(defn epiphytes-page []
  [:div
   [:h2 "Epiphytes"]])

(defn succulents-page []
  [:div
   [:h2 "Succulents"]])

(defn shopping-cart-page []
  [:div
   [:h2 "Shopping Cart"]])

;; -------------------------
;; Routes
(defonce match (r/atom nil))

(defn current-page []
  [:div
   [:ul
    [:li [:a {:href (rfe/href ::home-page)} "Home"]]
    [:li [:a {:href (rfe/href ::epiphytes-page)} "🌱Epiphytes"]]
    [:li [:a {:href (rfe/href ::herbs-page)} "🌿Herbs"]]
    [:li [:a {:href (rfe/href ::succulents-page)} "🌵Succulents"]]
    [:li [:a {:href (rfe/href ::shopping-cart-page)} "Shopping Cart"]]]
   (if @match
     (let [view (:view (:data @match))]
       [view @match]))
   [:pre (with-out-str (fedn/pprint @match))]])

(def routes
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

;; -------------------------
;; Initialize app
(defn init! []
  (rfe/start!
    (rf/router routes {:data {:coercion rss/coercion}})
    (fn [m] (reset! match m))
    ;; set to false to enable HistoryAPI
    {:use-fragment true})
  (r/render [current-page] (.getElementById js/document "app")))

(init!)
