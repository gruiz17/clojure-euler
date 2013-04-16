(defn euler-1 [n sum] ; starting this out
  (if (= n 1000) ; if the iterator n is equal to 1000, print the calculated sum at that point
    (println sum)

  (if (or (zero? (rem n 3)) ; otherwise, check this condition
      (zero? (rem n 5))) ; if either n%3 = 0 or n%5 = 0, run the method again recursively,
        (euler-1 (+ n 1) (+ sum n)) ; but add one to iterator, and add whatever n was to sum

      (euler-1 (+ n 1) sum)))) ; if not, just go on as usual, adding one to n

(euler-1 0 0) ; call the function

