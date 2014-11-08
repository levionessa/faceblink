(ns keybase.client
  (:require [org.httpkit.client :as client]))

(def keybase-uri "https://keybase.io/_/api/1.0/")

(defn getsalt-uri [username]
  (str keybase-uri "getsalt.json?email_or_username=" username))

(defn getsalt [username]
  @(client/get (getsalt-uri username)))
