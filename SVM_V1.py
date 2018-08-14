import sys
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
style.use("ggplot")
from sklearn import svm

n = int(sys.argv[1]) + int(sys.argv[2])
X = np.empty((0,3), float)
Y = []

x1 = 3;
x2 = n+x1;
x3 = (2*n)+x1;
y = (3*n)+x1;

for i in range(0,n):
    X = np.append(X, np.array([[float(sys.argv[x1]),float(sys.argv[x2]),float(sys.argv[x3])]]), axis = 0)
    Y.append(int(sys.argv[y]))
    x1 = x1 + 1
    x2 = x2 + 1
    x3 = x3 + 1
    y = y + 1

q1 = float(sys.argv[y])
q2 = float(sys.argv[y+1])
q3 = float(sys.argv[y+2])

clf = svm.SVC()
clf.fit(X,Y)

print(clf.predict([[q1,q2,q3]]))

##Show Graph
##plt.scatter(X[:,0], X[:,1], c=y)
##plt.show()
