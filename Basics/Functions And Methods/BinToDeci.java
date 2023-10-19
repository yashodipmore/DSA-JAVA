public class BinToDeci {
    public static void binToDec(int binNum)
    {
        int MyBinNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0)
        {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of "+MyBinNum+" = "+ decNum);
    }
    public static void main(String args[])
    {
        binToDec(111);
    }
}
