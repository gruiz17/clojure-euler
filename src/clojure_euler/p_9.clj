(ns p-9)

(defn main []
(loop [i 1
       j 2]
  (def sum (+ i j (Math/sqrt (+ (Math/pow i 2) (Math/pow j 2)))))
  (println (str i "+" j "+" (Math/sqrt (+ (Math/pow i 2) (Math/pow j 2))) "=" sum))
  (if (= (double 1000) sum)
    (reduce  * [i j (Math/sqrt (+ (Math/pow i 2) (Math/pow j 2)))])
    (if (> j 1000)
      (recur (inc i) (- j (- 1000 i)))
      (recur (+ i 0) (inc j))))))

