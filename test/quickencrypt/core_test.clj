(ns quickencrypt.core-test
  (:require [clojure.test :refer :all]
            [quickencrypt.core :refer :all]))

(deftest test-encrypt
  (testing "Testing: test-encrypt"
    (let [string-to-encrypt "This is a test string."
          key "mykey"
          encrypted-message (encrypt string-to-encrypt key)]
      (is (= encrypted-message "epHabXjtJDuGia2x3yykFkzLP/ZylzWMnhMOz9Kbhwg=")))))

(deftest test-decrypt
  (testing "Testing: test-encrypt"
    (let [string-to-decrypt "epHabXjtJDuGia2x3yykFkzLP/ZylzWMnhMOz9Kbhwg="
          key "mykey"
          decrypted-message (decrypt string-to-decrypt key)]
      (is (= decrypted-message "This is a test string.")))))
