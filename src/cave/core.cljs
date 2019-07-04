(ns cave.core
  (:require [cljs.js :as cjs]
            [cljs.pprint :refer [pprint]]))

(enable-console-print!)

(defn print-result
  [res]
  (if (:value res)
    (println (:value res))
    (pprint res)))

(def state (cjs/empty-state))

(cjs/compile-str state  "(ns my.caal) (defn yo [x] (+ x x)) (+ 1 1)" "adding" {:target :nodejs
                                                                               :eval cjs/js-eval} #'print-result)

(defn -main [& args])

