(set-env!
  :dependencies '[[adzerk/boot-cljs          "2.1.2"]
                  [adzerk/boot-reload        "0.5.1"]
                  [hoplon/hoplon             "7.1.0"]
                  [org.clojure/clojure       "1.9.0"]
                  [org.clojure/clojurescript "1.9.946"]
                  [tailrecursion/boot-jetty  "0.1.3"]
                  [cljsjs/bootstrap           "3.3.6-1"]
                  [cljsjs/jquery              "2.2.4-0"]]
  :source-paths #{"src"}
  :asset-paths  #{"assets"})

(require
  '[adzerk.boot-cljs         :refer [cljs]]
  '[adzerk.boot-reload       :refer [reload]]
  '[hoplon.boot-hoplon       :refer [hoplon prerender]]
  '[tailrecursion.boot-jetty :refer [serve]])

(deftask dev
  "Build navbar for local development."
  []
  (comp
    (watch)
    (speak)
    (hoplon)
    (reload)
    (cljs)
    (serve :port 8000)))

(deftask prod
  "Build navbar for production deployment."
  []
  (comp
    (hoplon)
    (cljs :optimizations :advanced)
    (target :dir #{"target"})))
