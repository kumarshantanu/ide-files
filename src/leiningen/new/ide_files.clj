(ns leiningen.new.ide-files
  (:require [clojure.string :as str]
            [leiningen.new.ide-files.eclipse :as eclipse]
            [leiningen.new.ide-files.idea    :as idea])
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def ^:const ides ["eclipse" "idea"])

(defn pwd-name
  []
  (-> (java.io.File. ".")
    .getAbsoluteFile
    .getParentFile
    .getName))


(defn no-such-template
  [ide]
  (println "No such IDE:" ide "-- valid choices are: eclipse, idea (or intellij)"))


(defn ide-files
  "Generate files for specified IDE, generate for all IDEs if none specified"
  ([ide]
    (case (str/lower-case ide)
      "all"      (ide-files)
      "eclipse"  (eclipse/eclipse (pwd-name))
      "idea"     (idea/idea (pwd-name))
      "intellij" (idea/idea (pwd-name))
      (no-such-template ide)))
  ([]
    (doseq [each ides]
      (ide-files each))))

