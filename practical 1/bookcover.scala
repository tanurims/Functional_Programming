def CoverPrice(n:Int):Double=n*24.95
def Discount(p:Double):Double=p*0.4
def Price(n:Int):Double=CoverPrice(n)-Discount(CoverPrice(n))
def ShipCost(n:Int):Double=if(n<=50) 3*n else 0.75*(n-50)+3*50
def TotPrice(n:Int):Double=Price(n)+ShipCost(n)