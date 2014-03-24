;;;;;;will make this more efficient in a bit
(ns p-5)
(defn everything-divisible? [x]
  (if
    (and
      (not (zero? x))
      (even? x)
      (= (rem x 11) 0)
      (= (rem x 12) 0)
      (= (rem x 13) 0)
      (= (rem x 14) 0)
      (= (rem x 15) 0)
      (= (rem x 16) 0)
      (= (rem x 17) 0)
      (= (rem x 18) 0)
      (= (rem x 19) 0)
      (= (rem x 20) 0)) true false))

(println
  (first
    (seq
      (filter everything-divisible? (range Integer/MAX_VALUE)))))

;; 232792560
