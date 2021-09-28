#boring if...
#all digits at even position are even
#all digits at odd positions are odd
#digit count starts at 1 not 0

#calculate how many number in [L,R] are boring

numCases = int(input())

for case in range (0, numCases):
    min, max = map(int, input().split(" "))
    count = 0
    
    for num in range (min, max+1):
        digitsNum = []
        stringNum = str(num)
        for dig in stringNum:
            digitsNum.append(int(dig))

        notTrue = 0
        for i in range (0, len(digitsNum)):
            if (i%2==0):
                #odd position
                if (digitsNum[i]%2==0):
                    #digit is even AKA int is not boring
                    notTrue += 1
            else:
                #even position
                if (digitsNum[i]%2!=0):
                    #digit is odd AKA int is not boring
                    notTrue += 1
                    
        if (notTrue == 0):
            count +=1
            
    print("Case #{}: {}".format(case+1, count))