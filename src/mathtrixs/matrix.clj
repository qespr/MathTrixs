(ns mathtrixs.matrix
  (:gen-class))

(defn valid?
  "Checks whether given matrix is valid"
  [m]
  ;;Checks if m only contains vectors and
  ;;these vectors only contain numbers
  ;;All inner vectors must have the same length
  (and
   (vector? m)
   (< 0 (count m))
   (every? vector? m)
   (let [len (count (first m))]
     (every? (fn [x]
             (and (= len (count x))
                  (every? number? x))) m))))

(defn rectangular?
  "Check whether given matrix is rectangular"
  [m]
  (and
   (valid? m)
   (= (count m) (count (first m)))))

