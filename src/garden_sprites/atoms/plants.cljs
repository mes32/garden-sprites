; https://www.pexels.com/photo/botanical-cactus-cactus-garden-cactus-plant-291544/
; Photo by Abhinav Goswami from Pexels
; Cactus

; https://www.pexels.com/photo/basil-in-the-cup-5818/
; Photo by Kaboompics .com from Pexels

; Photo by Maureen Bekker from Pexels
; Echeveria 'Fleur Blanc'
; This plant grows as a rosette of succulent lobes. As native plants growing in semi-arid areas, they are robust and easy to maintain.

; https://www.pexels.com/photo/pink-flower-66181/
; Photo by Wolfgang from Pexels

; https://www.pexels.com/photo/green-leaf-plant-on-wooden-surface-3205147/
; Photo by Nika Akin from Pexels

; https://www.pexels.com/photo/shallow-focus-photo-of-aloe-vera-plants-3234638/
; Photo by Himesh Mehta from Pexels
; Spotted Aloe Vera

; https://www.pexels.com/photo/selective-focus-white-and-green-moth-orchids-926572/
; Photo by Artem Beliaikin from Pexels

(ns garden-sprites.atoms.plants
  (:require [reagent.core :as r]))

(defonce all-plants
  [
    {:name "Cactus"
      :plant-type "succulent"
      :image-paths [
        "./images/cactus.jpg"]
      :price 10.20
      :description "This classic succulent requires minimal water. Watch out for the spines."}
    {:name "Basil"
      :plant-type "herb"
      :image-paths [
        "./images/basil.jpg"]
      :price 3.90
      :description ""}
    {:name "Echeveria 'Fleur Blanc'"
      :plant-type "succulent"
      :image-paths [
        "./images/green-echeveria.jpg"]
      :price 20.00
      :description "This plant grows as a rosette of succulent lobes. These plants are native semi-arid biomes. They are easy to care for and maintain."}
    {:name "Pink Orchid"
      :plant-type "epiphyte"
      :image-paths [
       "./images/pink-orchid.jpg"]
      :price 25.75
      :description ""}
    {:name "Rosemary"
      :plant-type "herb"
      :image-paths [
       "./images/rosemary.jpg"]
      :price 3.50
      :description ""}
    {:name "Spotted Aloe Vera"
      :plant-type "succulent"
      :image-paths [
       "./images/spotted-aloe-vera.jpg"]
      :price 15.50
      :description "This is the spotted variety of the Aloe Vera Plant."}
    {:name "White and Green Moth Orchid"
      :plant-type "epiphyte"
      :image-paths [
       "./images/white-and-green-moth-orchid.jpg"]
      :price 20.50
      :description ""}])

(defonce plants (r/atom all-plants))

(defn get-plants-type!
  [plant-type]
  (if (nil? plant-type)
    (reset! plants all-plants)
    (reset! plants (filter #(= (:plant-type %) plant-type) all-plants))))