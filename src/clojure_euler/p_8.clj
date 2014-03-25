(ns p-8
  (:require [numbers.numbers]))

(def digits
  (map (fn [x] (Integer/parseInt x))
  (rest
    (seq
      (.split
        (.replaceAll numbers/p-8-number "\n  " "") "")))))

(def i 0)
(def product-seq (seq '()))

(while (< i 996)
  (def product-seq (cons
    (reduce *
    [(nth digits i) (nth digits (+ i 1)) (nth digits (+ i 2)) (nth digits (+ i 3)) (nth digits (+ i 4))]) product-seq))
  (def i (+ i 1))
)

(defn main []
  println (apply max product-seq))
