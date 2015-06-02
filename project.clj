(defproject analytics-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-environ "1.0.0"]
            [lein-expectations "0.0.8"]]

  :profiles {:dev {:dependencies [[expectations "2.0.16"]]}}

  :aliases {"test" ["expectations"]}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [incanter/incanter-charts "1.3.0"]
                 [com.datomic/datomic-free "0.9.5153"]
                 [gorillalabs/sparkling "1.2.1"]])
