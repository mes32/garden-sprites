(ns garden-sprites.prod
  (:require
    [garden-sprites.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
