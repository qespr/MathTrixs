(ns mathtrixs.core-test
  (:require [clojure.test :refer :all]
            [mathtrixs.core :refer :all]))

;;Some Matrices that will probably be used in mulptiple tests
(def minimal "Smallest possible matrix"
  [[1]])
(def wide "Wide matrix - vector"
  [[1 2 3 4 5 6 7 8 9]])
(def tall "Tall matrix - vertical vector"
  [[1]
   [2]
   [3]
   [4]
   [5]
   [6]
   [7]])



;;TODO: TVL to mám být zvlášť v souboru lol
