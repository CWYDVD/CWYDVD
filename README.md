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

approx = taylorApprox(0.25, 1, 2)
print(approx)
