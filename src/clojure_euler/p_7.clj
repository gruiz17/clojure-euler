(ns p-7
  (:require [utilities.utilities]))

(defn main []
(def i 1)
(def infinity 2)

(while (< i 10001)
  (def infinity (+ infinity 1))
  (if (utilities/prime? infinity)
    (def i (+ i 1))))

(println infinity))
