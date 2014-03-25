; A palindromic number reads the same both ways.
; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
; Find the largest palindrome made from the product of two 3-digit numbers.
(ns p-4
  (:require [clojure.string :as s]))

(defn palindrome? [n]
  (= (str n) (s/reverse (str n))))

(defn three-and-even? [palin n]
  (if
    (and
      (integer? (/ palin n)) (> (/ palin n) 99) (< (/ palin n) 1001)) true false))

(def palindromes (filter palindrome? (rseq (vec (range 100000 (* 999 999))))))
(def bigPalin ())

(dorun
  (for [i palindromes]
    (loop [j 100]
      (when (< j 1000)
        (when (three-and-even? i j) (def bigPalin (conj bigPalin i)))
        (recur (inc j))
      )
    )
  )
)

(defn main [] (println (last bigPalin)))
