(ns garden-sprites.core
    (:require
      [reagent.core :as r]
      [reagent.session :as session]
      [secretary.core :as secretary :refer-macros [defroute]]))

(defn page []
  [(session/get :current-page)])

;; -------------------------
;; Views/Pages

; (defn index-page []
;   [:div [:h2 "// Welcome to Garden Sprites //"]])

(defn home-page []
  [:div [:h2 "Welcome to Garden Sprites"]
    [:h3 "Prototype of an e-commerce site selling house plants"]
    [:div [:a {:href "#/shopping-cart"} "go to shopping cart"]]])

(defn shopping-cart-page []
  [:div [:h2 "Shopping Cart"]
   [:div [:a {:href "#/"} "go to the home page"]]])

;; -------------------------
;; Routes
(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
  (session/put! :current-page home-page))

(secretary/defroute "/shopping-cart" []
  (session/put! :current-page shopping-cart-page))

;; -------------------------
;; Initialize app
(defn mount-components []
  (r/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (mount-components))
