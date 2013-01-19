(ns leiningen.new.ide-files
  (:require [clojure.string :as str]
            [leiningen.new.ide-files.eclipse :as eclipse]
            [leiningen.new.ide-files.idea    :as idea]))

(defn pwd-name
  []
  (-> (java.io.File. ".")
    .getAbsoluteFile
    .getParentFile
    .getName))


(defn no-such-template
  [ide]
  (println "No such IDE:" ide
    "-- valid choices are: all, eclipse, idea (or intellij)"))


(defn ide-files
  "Generate files for specified IDE"
  [ide]
  (case (str/lower-case ide)
    "all"      (dorun (map ide-files ["eclipse" "idea"]))
    "eclipse"  (eclipse/eclipse (pwd-name))
    "idea"     (idea/idea (pwd-name))
    "intellij" (idea/idea (pwd-name))
    (no-such-template ide)))
