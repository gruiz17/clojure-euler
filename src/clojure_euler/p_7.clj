; to determine if a number is prime
; determine if it is divisible by any number before it

; -> determine if it is divisible by any number before the number/2
; -> determine if it is divisible by any number before sqrt(number)
(ns p-7
  (:require [utilities.utilities]))
(defn prime? [n]
   (if (= 2 n) true
     (if
       (or
         (even? n) false
         (= 1 n) false
         (= 0 n) false
        )
      )
       (loop [i 3]
        (if (> i (int (Math/sqrt n))) true
         (if (zero? (rem n i)) false
          (recur (+ i 2))
         )
        )
       )
      )
    )
  )
