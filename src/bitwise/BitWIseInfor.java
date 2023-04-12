package bitwise;

public class BitWIseInfor
{

	public static void main(String[] args)
	{
		int a = 2;// 0010
		System.out.println(a & 1);
		System.out.println(a | 1);
		System.out.println(a ^ 1);
		System.out.println(~1);
		// 1s compliment = change every 0 with 1 and vice versa
		// 2s compliment = 1s compliment + add 1
		System.out.println(~0);
		//binary left shift ==> multiply by 2 ==> a<<1 ==> a*2
		System.out.println(a << 1);
		//binary right shift ==> divide by 2 ==> a>>1 ==> 1
		System.out.println(a >> 1);

		/*
		 *    8421
		 * 0 = 000
		 * 1 = 001
		 * 2 = 010
		 * 3 = 011
		 * 4 = 100
		 * 5 = 101
		 * 6 = 110
		 */
		// odd even
		// all odd number have LSB (least significant bit) = 1

		System.out.println(1 & 1); // 1 ==> odd number
		System.out.println(2 & 1); // 0 ==> even number
		System.out.println(3 & 1);
		System.out.println(4 & 1);

		// get Ith Bit
		// for that bit  , bitmast ==> 1<<i
		int i = 1;
		int bitmask = 1 << i;
		System.out.println(bitmask);// 8 == 1000
		// 10 == 1010
		if((10 & bitmask) == 0)
		{
			System.out.println(i + "th bit is: 0");
		}
		else
		{
			System.out.println(i + "th bit is: 1");

		}

		//set Ith Bit
		i = 1;
		bitmask = 1 << i;
		System.out.println(10 | bitmask);

		// clear Ith Bit
		i = 1;
		bitmask = ~(1 << i);
		System.out.println(10 & bitmask);

		// -1 == 11111111
		//clear last Ith Bits
		// bit mask == (-1)<<i Or (~0)<<i
		i = 2;
		bitmask = (~0) << i;
		System.out.println(15 & bitmask);

		//clear range of bits between I and J
		/*
		 *      01 = 1 = 2^1 -1 
		 *     011 = 3 = 2^2 - 1
		 *    0111 = 7 = 2^3 - 1
		 *   01111 = 15 = 2^4 - 1
		 *  011111 = 31 = 2^5 - 1   
		 * 
		 */
		i = 2;
		int j = 4;
		int bitmaskA = ((~0) << (j + 1));
		int bitmaskB = (1 << i) - 1;
		bitmask = bitmaskA | bitmaskB;
		System.out.println(10 & bitmask);

		//  Is N  is power of 2
		int n = 15;
		if((n & (n - 1)) == 0)
		{
			System.out.println(n + " is power of 2");
		}
		else
		{
			System.out.println("Not Power Of 2");
		}

		// To represent a decimal Number N in Binary no. of min. bits required is
		// log2^n + 1 
		int count = 0;
		n = 15;
		while(n > 0)
		{
			if((n & 1) != 0)
			{//checking last bit or LSB is 1 or not
				count++;
			}
			n = n >> 1;
		}
		System.out.println(count);

		// Fast Exponentiation
		/*
		 * 3^5 = 3*3*3*3*3
		 * log(n) time
		 * 5 = 101 in binary
		 * 3^101 
		 */
		int ans = 1;
		a = 2;
		n = 10;
		while(n > 0)
		{
			if((n & 1) != 0)
			{
				ans = ans * a;
			}
			a *= a;
			n >>= 1;
		}
		System.out.println(ans);

		//swap 2 No. without 3rd
		// propertry use in this xXORx = 0 , x^x = 0
		int x = 3, y = 4;
		System.out.println(x ^ x);
		System.out.println("before swap: " + x + " " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("after swap: " + x + " " + y);

		n = -10;
		System.out.println(~n + 1); // give opposite Sign of N
		n = 30;
		System.out.println(~n + 1);
		System.out.println(-~n);// Add 1 to N

		// Convert uppercase character to lowercase
		for(char ch = 'A'; ch <= 'Z'; ch++)
		{
			System.out.print((char) (ch | ' ') + " ");
			// prints abcdefghijklmnopqrstuvwxyz}
		}
	}
}
