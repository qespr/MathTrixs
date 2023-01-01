(ns mathtrixs.matrix-test
  (:require [clojure.test :refer :all]
            [mathtrixs.matrix :refer :all]
            [mathtrixs.core-test :refer :all]))

(deftest validation
  (testing "Matrix validation"
    (is (valid? minimal) "Minimal")
    (is (not (valid? [[1 2 3]
                        [1 2 3]
                        [1 2 3 4]
                        [1 2 3]])) "Invalid")
    (is (valid? wide) "Wide")
    (is (valid? tall) "Tall")))

(deftest rectangular
  (testing "Rectangular matrix"
    (is (rectangular? minimal) "Minimal")
    (is (not (rectangular? wide)) "Wide")
    (is (not (rectangular? tall)) "Tall")
    (is (rectangular? [[1 2 3]
                       [1 2 3]
                       [1 2 3]]) "3x3")
    (is (not (rectangular? [[1 2 3 4]
                            [1 2]
                            [1 2 3]])) "Broken")
    (is (not (rectangular? [[1 2 3]
                            [1 2 3]
                            [1 2 3]
                            [1 2 3]])) "4x3")))
