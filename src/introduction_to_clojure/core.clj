(ns introduction-to-clojure.core
  (:require [bakery.core :refer :all]))

(defn add-egg []
  (grab :egg)
  (squeeze)
  (add-to-bowl))

(defn add-flour []
  (grab :cup)
  (scoop :flour)
  (add-to-bowl)
  (release))

(defn add-milk []
  (grab :cup)
  (scoop :milk)
  (add-to-bowl)
  (release))

(defn add-sugar []
  (grab :cup)
  (scoop :sugar)
  (add-to-bowl)
  (release))

(defn add-butter []
  (grab :butter)
  (add-to-bowl))

(defn add [ingredient]
  (cond
    (= ingredient :egg)
    (add-egg)
    (= ingredient :milk)
    (add-milk)
    (= ingredient :flour)
    (add-flour)
    (= ingredient :sugar)
    (add-sugar)
    (= ingredient :butter)
    (add-butter)
    :else
    (println "Unknown ingredient:" ingredient)))

(defn bake-cake []
  (add :egg)
  (add :egg)
  (add :flour)
  (add :flour)
  (add :milk)
  (add :sugar)
  (mix)
  (pour-into-pan)
  (bake-pan 25)
  (cool-pan))

(defn scooped? [ingredient]
  (cond
    (= ingredient :milk)
    true
    (= ingredient :flour)
    true
    (= ingredient :sugar)
    true
    :else
    false))

(defn scoopable [ingredient]
  (if (scooped? ingredient)
      "makes sense"
      "that's weird"))
  

(scoopable :flou)

(defn print-10 []
  (dotimes [i 10]
    (println i)))

(print-10)

(defn add-eggs [n]
  (dotimes [e n]
    (add-egg))
  :ok)

(add-eggs 2)

(defn add-flour-cups [n]
  (dotimes [e n]
    (add-flour))
  :ok)

(defn add-milk-cups [n]
  (dotimes [e n]
    (add-milk))
  :ok)

(defn add-sugar-cups [n]
  (dotimes [e n]
    (add-sugar))
  :ok)

(defn add-butters [n]
  (dotimes [e n]
    (add-butter))
  :ok)
