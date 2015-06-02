(ns analytics-clj.core
  (:require [datomic.api :as d]))

;TODO: change it to the right backend when necessary
(def db-uri-base "datomic:mem://")

(defn datom-conn
  []
  "Create a connection to the database"
  (let [uri (str db-uri-base (d/squuid))]
    (d/delete-database uri)
    (d/create-database uri)
    (d/connect uri)))
