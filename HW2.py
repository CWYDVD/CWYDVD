#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
DAVID CHEN
u6037704
ME EN 2450
HW2
Due: Feb 8 2024
"""

#%%Problem_1
import math as m

def taylorApprox(x_i, x_i1, n):
    h = x_i1 - x_i
    ty_approx = []

    for i in range(0, n+1):            
        if i % 2 == 0:
            ty_approx.append(((m.e**(-x_i)*(h**i)) / m.factorial(i)))    
        else:
            ty_approx.append(((m.e**(-x_i)*(-1)*(h**i)) / m.factorial(i)))
        
    return sum(ty_approx)

x = 0
while x < 5:
    approx = taylorApprox(0.25, 1, x)
    x += 1
    print(approx)
