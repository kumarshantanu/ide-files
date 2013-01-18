(ns leiningen.new.ide-files.eclipse
  (:use leiningen.new.templates))


(def render (renderer "ide_files/eclipse"))


(defn eclipse
  [proj-name]
  (println "Generating Eclipse project files for '" proj-name \')
  (let [data {:name proj-name
              :sanitized (sanitize proj-name)}
  	r #(render % data)]
    (->files data
      [".classpath" (r "classpath")]
      [".project"   (r "project")])))
