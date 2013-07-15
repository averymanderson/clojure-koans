(meditations
	"July 9: Flatten a nested list structure"
	(def a [1 2 3])
	(def b [4 5 6])
	(= (apply concat [a b]) [1 2 3 4 5 6])
  
  "July 15: Eliminate consecutive duplicates of list elements"
  (def c [1 1 1 2 3 4 4 4 5 6])
  (= (distinct c) [1 2 3 4 5 6]))
