(ns mathtrixs.matrix-test
  (:require [clojure.test :refer :all]
            [mathtrixs.matrix :refer :all]
            [mathtrixs.core-test :refer :all]))

(deftest matrices
  (testing "Matrix validation"
    (is (valid? minimal) "Minimal")
    (is (not (valid? [[1 2 3]
                        [1 2 3]
                        [1 2 3 4]
                        [1 2 3]])) "Invalid detection")
    (is (valid? wide) "Wide")
    (is (valid? tall) "Tall")))
