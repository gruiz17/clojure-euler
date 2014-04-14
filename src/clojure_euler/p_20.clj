(ns p-20
  (:require [utilities.utilities]))

(defn main []
(reduce + (map #(Integer/parseInt (str %)) (str (utilities/factorial 100)))))
