(ns leiningen.new.ide-files.util
  (:use [leiningen.new.templates :only [*dir* ->files]]))


(defn announce
  [subject proj-name]
  (println (format "Generating %s project files for '%s'" subject proj-name)))


(defmacro files
  [& body]
  `(binding [*dir* "."]
     (->files ~@body)))
