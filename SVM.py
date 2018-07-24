import sys
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
style.use("ggplot")
from sklearn import svm

n = int(sys.argv[1])
q1 = float(sys.argv[2])
q2 = float(sys.argv[3])

X = np.empty((0,2), float)
Y = []

x1 = 4;
x2 = n+x1;
y = (2*n)+x1;

for i in range(0,n):
    X = np.append(X, np.array([[float(sys.argv[x1]),float(sys.argv[x2])]]), axis = 0)
    Y.append(int(sys.argv[y]))
    x1 = x1 + 1
    x2 = x2 + 1
    y = y + 1

clf = svm.LinearSVC()
clf.fit(X,Y)

print(clf.predict([[q1,q2]]))

##Show Graph
##plt.scatter(X[:,0], X[:,1], c=y)
##plt.show()
