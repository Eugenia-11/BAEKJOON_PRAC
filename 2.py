try:
  A, B = input().split()

  A = int(A)
  B = int(B)

  if A>0 and B <10 :
      print(A+B)

except:
   print("정수를 입력하시오")



A,B = map(int, input().split())
print(A+B)