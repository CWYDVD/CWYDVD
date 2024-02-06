import math as m

def taylorApprox(x_i, x_i1, n):
    h = x_i1 - x_i
    ty_approx = []
    if n == 0:
        ty_approx.append(m.e**(-x_i))
    
    for i in range(1, n):
        if i % 2 == 0:
            f_xi1 = (m.e**(-x_i)*(h)**n) / m.factorial(n)
            ty_approx.append(f_xi1)
            
        else:
            f_xi1 = (m.e**(-x_i)*(-1)*(h)**n) / m.factorial(n)
            
    return ty_approx

approx = taylorApprox(0.25, 1, 2)
print(approx)
