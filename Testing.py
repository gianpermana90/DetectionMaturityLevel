import sys
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import style
style.use("ggplot")
from sklearn import svm

X = [[0], [1], [2], [3]]
Y = [1, 2, 2, 3]
clf = svm.LinearSVC()
clf.fit(X, Y) 
dec = clf.decision_function([[1]])
print(dec.shape[1]) # 4 classes: 4*3/2 = 6
print(clf.predict([[.4]]))
