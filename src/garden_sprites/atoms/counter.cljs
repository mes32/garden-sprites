(ns garden-sprites.atoms.counter
  (:require [reagent.core :as r]))

(defonce counter (r/atom 0))

(defn counter-dec
  [x]
  (if (> (- x 1) 0)
    (- x 1)
    0))