(ns utilities)

(defn prime? [n]
 (if (= 2 n) true
   (if (even? n) false
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

(defn factorial [n] (reduce *' (range 2 (inc n))))
