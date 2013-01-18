(ns leiningen.new.ide-files.idea
  (:use leiningen.new.templates))


(def render (renderer "ide_files/idea"))


(defn idea
  [proj-name]
  (println "Generating IntelliJ IDEA project files for '" proj-name \')
  (let [data {:name proj-name
              :sanitized (sanitize proj-name)}
  	r #(render % data)]
    (->files data
      [(str proj-name ".iml") (r "project.iml")]
      ".idea"
      [".idea/.name"          (r "dot-idea/dot-name")]
      [".idea/compiler.xml"   (r "dot-idea/compiler.xml")]
      [".idea/encodings.xml"  (r "dot-idea/encodings.xml")]
      [".idea/misc.xml"       (r "dot-idea/misc.xml")]
      [".idea/modules.xml"    (r "dot-idea/modules.xml")]
      [".idea/uiDesigner.xml" (r "dot-idea/uiDesigner.xml")]
      [".idea/vcs.xml"        (r "dot-idea/vcs.xml")]
      [".idea/workspace.xml"  (r "dot-idea/workspace.xml")]
      ".idea/copyright"
      [".idea/copyright/profiles_settings.xml" (r "dot-idea/copyright/profiles_settings.xml")]
      ".idea/inspectionProfiles"
      ".idea/libraries"
      [".idea/libraries/clojure_1_3_0.xml"     (r "dot-idea/libraries/clojure_1_3_0.xml")]
      ".idea/scopes"
      [".idea/scopes"                          (r "dot-idea/scopes/scope_settings.xml")])))
