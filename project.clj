(defproject mathtrixs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "AGPL 3 WITH Classpath-exception-2.0"
            :url "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot mathtrixs.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
