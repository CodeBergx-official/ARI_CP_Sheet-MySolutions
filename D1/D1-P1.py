for _ in range(int(input())):
    n=int(input())
    s=input()
    total_cnt=cnt=0
    flag=False
    for cell in s:
        if cell=='.':
            cnt+=1
            total_cnt+=1
        else:
            cnt=0
        if cnt==3:
            flag = True
            break
    if flag:
        print(2)
    else:
        print(total_cnt)
