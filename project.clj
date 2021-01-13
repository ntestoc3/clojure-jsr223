(defproject clojure-jsr223 "1.7.0.3"
  :description "clojure jsr223 support"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ]
  :java-source-paths ["src/"]
  :resource-paths ["resources/"]
  :omit-source true
  :plugins [[com.gfredericks/lein-merge-services "1.0.0"]]
  :repl-options {:init-ns cljsr-233.core})
