(ns db.__table
  (:require [coast.alpha :refer [defq]])
  (:refer-clojure :exclude [update list find]))

(defq list "sql/__table.db.sql")
(defq find "sql/__table.db.sql")
(defq insert "sql/__table.db.sql")
(defq update "sql/__table.db.sql")
(defq delete "sql/__table.db.sql")
