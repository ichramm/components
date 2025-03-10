(defproject com.intception/components "0.2.0"
  :description "Reusable services implementation following the components pattern"
  :url "https://github.com/guilespi/components"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.intception.components/lifecycle "0.1.7"]
                 [com.intception.components/jetty "0.1.12"]
                 [com.intception.components/datomic "0.1.13"]
                 [com.intception.components/app "0.1.8"]
                 [com.intception.components/redis "0.1.10"]
                 [com.intception.components/metrics "0.1.11"]
                 [com.intception.components/time-series "0.1.18"]
                 [com.intception.components/blob-storage "0.2.0"]]
  :plugins [[lein-sub "0.2.4"]
            [codox "0.8.5"]]
  :sub ["lifecycle"
        "jetty"
        "datomic"
        "app"
        "redis"
        "metrics"
        "time-series"
        "blob-storage"])
