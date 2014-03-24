(ns p-6)
(defn square [x] (* x x))
(println (- (square (reduce + (range 0 101))) (reduce + (map square (range 0 101)))))
