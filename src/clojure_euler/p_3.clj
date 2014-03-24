; Problem 3.
; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143 ?
(ns p-3
  (:require [utilities.utilities]))

(defn main []
(defn largest-fact [n]
 (do (def j n) (def the-largest 0))
 (loop [i 2]
  (when (<= i j)
    (when (zero? (rem n i))
      (def j (/ j i))
      (when (utilities/prime? i) (def the-largest i))
    )
    (recur (inc i))
  )
 )
 (println the-largest)
)

(largest-fact 600851475143))
