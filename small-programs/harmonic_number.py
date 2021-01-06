"""Return Harmonic number H(n) = 1 + 1/2 + 1/3 + ... + 1/n for a given n.
It is discrete analog of integral integral(1/x, dx, x from 1 to n).
"""
import sys
import math

n = int(sys.argv[1])
_sum = 0.0
for i in range(1, n+1):
    _sum += 1.0 / i

print(f"\nH({n}) = {_sum:.6f}")
print("For n >> 1, H(n) is about log(n) + 0.57721")
print(f"Here H({n}) - log({n}) = {(_sum - math.log(n)):.6f}\n")