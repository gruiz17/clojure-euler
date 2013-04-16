(defn euler-1 [n sum]
  (if (= n 1000) (println sum)

  (if (or (zero? (rem n 3))
      (zero? (rem n 5)))
        (euler-1 (+ n 1) (+ sum n))
      (euler-1 (+ n 1) sum))))

(euler-1 0 0)

