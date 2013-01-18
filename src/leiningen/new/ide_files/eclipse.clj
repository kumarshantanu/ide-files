(ns leiningen.new.ide-files.eclipse
  (:require [leiningen.new.ide-files.util :as util])
  (:use [leiningen.new.templates :only [renderer sanitize]]))


(def render (renderer "ide_files/eclipse"))


(defn eclipse
  [proj-name]
  (util/announce "Eclipse" proj-name)
  (let [data {:name proj-name
              :sanitized (sanitize proj-name)}
  	r #(render % data)]
    (util/files data
      [".classpath" (r "classpath")]
      [".project"   (r "project")])))
