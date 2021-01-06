"""Use Newton's method to compute positive sqrt(x) where x > 0."""

import sys

EPS = 1e-15
c = float(sys.argv[1])
t = c / 2.0
while abs(t - c/t) > EPS * t:
    t = (c/t + t) / 2.0
print(t)
