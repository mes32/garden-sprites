(ns garden-sprites.components.plant-card)

(defn list-cards [plants]
  [:div
    (for [plant plants]
      ^{:key plant}
        [:div.plant-card
          [:h3 (:name plant)]
          [:img {:src (first (:image-paths plant))}]
          [:h4 "$" (:price plant)]])])