"""Return True/False if a given year is a leap year.
A leap year is either divisible by 4 but not by 100 or divisible by 400."""

import sys

year = int(sys.argv[1])

is_leap = (year % 4 == 0) and (year % 100 != 0)
is_leap = is_leap or (year % 400 == 0)

print(is_leap)