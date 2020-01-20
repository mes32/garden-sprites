; Photo by Maureen Bekker from Pexels
; Echeveria 'Fleur Blanc'
; This plant grows as a rosette of succulent lobes. As native plants growing in semi-arid areas, they are robust and easy to maintain.

; https://www.pexels.com/photo/shallow-focus-photo-of-aloe-vera-plants-3234638/
; Photo by Himesh Mehta from Pexels
; Spotted Aloe Vera

; https://www.pexels.com/photo/botanical-cactus-cactus-garden-cactus-plant-291544/
; Photo by Abhinav Goswami from Pexels
; Cactus

(ns garden-sprites.atoms.succulents
  (:require [reagent.core :as r]))

(defonce succulents (r/atom
  [
    {:name "Echeveria 'Fleur Blanc'"
     :image-path "./images/green-echeveria.jpg"
     :price 20.00}
    {:name "Spotted Aloe Vera"
     :image-path "./images/spotted-aloe-vera.jpg"
     :price 15.50}
    {:name "Cactus"
     :image-path "./images/cactus.jpg"
     :price 10.20}]))