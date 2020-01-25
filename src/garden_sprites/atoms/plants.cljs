; Photo by Maureen Bekker from Pexels
; Echeveria 'Fleur Blanc'
; This plant grows as a rosette of succulent lobes. As native plants growing in semi-arid areas, they are robust and easy to maintain.

; https://www.pexels.com/photo/shallow-focus-photo-of-aloe-vera-plants-3234638/
; Photo by Himesh Mehta from Pexels
; Spotted Aloe Vera

; https://www.pexels.com/photo/botanical-cactus-cactus-garden-cactus-plant-291544/
; Photo by Abhinav Goswami from Pexels
; Cactus

(ns garden-sprites.atoms.plants
  (:require [reagent.core :as r]))

(defonce all-plants
  [
    {:name "Echeveria 'Fleur Blanc'"
      :plant-type "succulent"
      :image-paths [
        "./images/green-echeveria.jpg"]
      :price 20.00
      :description "This plant grows as a rosette of succulent lobes. These plants are native semi-arid biomes. They are easy to care for and maintain."}
    {:name "Spotted Aloe Vera"
      :plant-type "succulent"
      :image-paths [
       "./images/spotted-aloe-vera.jpg"]
      :price 15.50
      :description "This is the spotted variety of the Aloe Vera Plant."}
    {:name "Cactus"
      :plant-type "succulent"
      :image-paths [
        "./images/cactus.jpg"]
      :price 10.20
      :description "This classic succulent requires minimal water. Watch out for the spines."}
    {:name "Dummy"
      :plant-type "herb"
      :image-paths [
       "./images/spotted-aloe-vera.jpg"]
      :price 0
      :description "This is not a succulent."}])

(defonce plants (r/atom all-plants))

(defn get-plants-type!
  [plant-type]
  (if (nil? plant-type)
    (reset! plants all-plants)
    (reset! plants (filter #(= (:plant-type %) plant-type) all-plants))))