(defn fib []
  (do (def prev 0) (def tmp 0) (def sum 0)) ; defining all the variables needed
  (loop [curr 1] ; i have to define curr here, since it is being looped on
    (when (< curr 4000000) ; basically while curr is less than 4 mil
      (def tmp prev) ; hold previous value in temporary storage
      (def prev curr) ; override previous value with current value
      (when (= (rem curr 2) 0) (def sum (+ sum curr))) ; check if current value is even
      (recur (+ curr tmp)) ; loops by adding the previous tmp value to current
      ))
  (println sum)) ; print the final sum

(fib) ; call function