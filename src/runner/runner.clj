(ns runner)

(defn run [x]
  (let [thing (str "p-" x)]
    (require :reload-all (symbol (str "clojure-euler." thing)))
    ((eval (symbol (str thing "/main"))))
  )
)
