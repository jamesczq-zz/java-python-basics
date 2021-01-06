"""Tabulate up to 2^n with user input n."""

import sys

n = int(sys.argv[1])
power = 1
i = 0
while i <= n:
    print(f"{i}\t{power}")
    i += 1
    power *= 2 