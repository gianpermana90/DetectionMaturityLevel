import sys
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
style.use("ggplot")
from sklearn import svm

inp = int(sys.argv[1])
print(inp)

X = np.empty((0,2), float)
Y = []

h = 2;
s = 12;
v = 22;
y = 32;

for i in range(0,inp):
    X = np.append(X, np.array([[float(sys.argv[h]),float(sys.argv[s])]]), axis = 0)
    Y.append(int(sys.argv[y]))
    h = h + 1
    s = s + 1
    y = y + 1
    
print(X)
print(Y)

clf = svm.SVC(kernel='linear', C =  1.0)
clf.fit(X,Y)

print(clf.predict([[16,54]]))

##Show Graph
##plt.scatter(X[:,0], X[:,1], c=y)
##plt.show()
