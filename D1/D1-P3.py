for _ in range(int(input())):
    f, d, t, b=map(int, input().split())
    Tt = ((2*(d+f))/t)**(1/2)
    Tb = f/b
    print('Bolt' if Tt>Tb else 'Tiger')
