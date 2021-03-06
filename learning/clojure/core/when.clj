; (when test & body)
; Evaluates test. If logical true, evaluates body in an implicit do.

(defn print_number_name [^Integer n]
    (let [number_list_name ["zero" "one" "two" "three" "four" "five"]]
        (when (and (or (pos? n) (zero? n)) (< n (count number_list_name)))
            (println (str "The number " n " is " (get number_list_name n))))))

(doseq [x (range 0 6)
    :let [y (print_number_name x)]])

; When the condition is false, it will return directly nil.
(when true
    (print "we ")
    (print "can ")
    (print "write a lot of ")
    (print "statements in the same ")
    (print "block of code"))

; Same as if omitting the else part
(assert (= (if false "hello") nil)) ; it returns nil, but the assert is true