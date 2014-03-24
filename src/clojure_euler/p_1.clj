(ns p-1)
; Problem 1.
; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
; The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn euler-1 [n sum]
  (if (= n 1000)
    (println sum)

  (if (or (zero? (rem n 3))
      (zero? (rem n 5)))
        (euler-1 (+ n 1) (+ sum n))
      (euler-1 (+ n 1) sum))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; reduce/filter version
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn three-five? [n]
  (if (or (zero? (rem n 3)) (zero? (rem n 5)))
    true false))

(defn euler-1-improved [n]
  (def sum (reduce + (filter three-five? (range 0 n))))
  (println sum))

(euler-1-improved 1000)
