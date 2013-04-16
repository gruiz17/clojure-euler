(defn fib []
  (do (def prev 0) (def tmp 0) (def sum 0))
  (loop [curr 1]
    (when (< curr 4000000)
      (def tmp prev)
      (def prev curr)
      (when (= (rem curr 2) 0) (def sum (+ sum curr)))
      (recur (+ curr tmp))
      ))
  (println sum))

(fib)