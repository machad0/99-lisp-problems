(defproject lisp-problems "0.1.0-SNAPSHOT"
  :description "99 problems written lisp, solved with clojure"
  :url "https://github.com/machad0/99-lisp-problems"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot lisp-problems.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
