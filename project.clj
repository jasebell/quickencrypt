(defproject net.clojars.jasonbell/quickencrypt "0.1.0"
  :description "Clojure library to Encrypt/Decrypt with AES Encryption."
  :url "https://github.com/jasebell/quickencrypt"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;; https://mvnrepository.com/artifact/commons-codec/commons-codec
                 [commons-codec/commons-codec "1.15"]])
