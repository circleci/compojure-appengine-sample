(ns compojure-app.handler-test
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [ring.mock.request :as mock]
            [compojure-app.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (str/starts-with? (:body response) "Hello World"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
