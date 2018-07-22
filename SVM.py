import sys
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
style.use("ggplot")
from sklearn import svm

inp = sys.argv[1]
print(inp)

X = np.array([[47,42],
 [39,38],
 [50,32],
 [44,38],
 [28,55],
 [19,51],
 [13,58],
 [61,58],
 [16,56],
 [30,53]])

y = [0,0,0,0,1,1,1,1,1,1]

clf = svm.SVC(kernel='linear', C =  1.0)
clf.fit(X,y)

print(clf.predict([[16,54]]))

##Show Graph
##plt.scatter(X[:,0], X[:,1], c=y)
##plt.show()
