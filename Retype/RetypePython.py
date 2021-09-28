#has n levels
#on k-th level
#key on level s
#need to move back to level s to get key
#exiting a level takes 1 minute
#takes L minutes to complete L levels
#find if restarting game or moving to previous levels is faster
numCases = int(input())

#time
restartL = 0
backL = 0
L = 0

for case in range (0, numCases):
    keyNums = input().split(" ")
    N = int(keyNums[0])
    K = int(keyNums[1])
    S = int(keyNums[2])
    
    #time for restart
    #time to level K + restart time + time to finish game
    restartL = (K - 1) + 1 + N
    
    #time for backward motion
    #time to level K + time back to S + time from S to finish
    backL = (K - 1) + (K-S) + (N-S + 1)
    #print(restartL, backL)
    if (restartL < backL):
        L = restartL
    else:
        L = backL
    
    print("Case #{}: {}".format(case+1, L))
    