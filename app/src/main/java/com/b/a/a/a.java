/*
package com.b.a.a;

import android.util.Log;

public class a {
    static final */
/* synthetic *//*
 boolean a;
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;

    static {
        Log.d("a","static");
        a = !a.class.desiredAssertionStatus();
        b = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71,
                (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79,
                (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87,
                (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101,
                (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108,
                (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115,
                (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122,
                (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55,
                (byte) 56, (byte) 57, (byte) 43, (byte) 47};

        c = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71,
                (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79,
                (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87,
                (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101,
                (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108,
                (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115,
                (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122,
                (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55,
                (byte) 56, (byte) 57, (byte) 45, (byte) 95};

        d = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) -9,
                (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58,
                (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9,
                (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6,
                (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14,
                (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22,
                (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32,
                (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40,
                (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48,
                (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};

        e = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9,
                (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9,
                (byte) -9, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58,
                (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9,
                (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6,
                (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14,
                (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22,
                (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 63,
                (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32,
                (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40,
                (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48,
                (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
    }

    private a() {
    }

    private static int a(byte[] array, int n, byte[] array2, int n2, byte[] array3) {
        Log.d("a","int a(byte[] array, int n, byte[] array2, int n2, byte[] array3) ");
        if (array[n + 2] == 61) {
            array2[n2] = (byte)((array3[array[n]] << 24 >>> 6 | array3[array[n + 1]] << 24 >>> 12) >>> 16);
            return 1;
        }
        if (array[n + 3] == 61) {
            int n3 = array3[array[n]] << 24 >>> 6 | array3[array[n + 1]] << 24 >>> 12 | array3[array[n + 2]] << 24 >>> 18;
            array2[n2] = (byte)(n3 >>> 16);
            array2[n2 + 1] = (byte)(n3 >>> 8);
            return 2;
        }
        int n4 = array3[array[n]] << 24 >>> 6 | array3[array[n + 1]] << 24 >>> 12 | array3[array[n + 2]] << 24 >>> 18 | array3[array[n + 3]] << 24 >>> 24;
        array2[n2] = (byte)(n4 >> 16);
        array2[n2 + 1] = (byte)(n4 >> 8);
        array2[n2 + 2] = (byte)n4;
        return 3;
    }
    public static byte[] a(String str) throws b {Log.d("a","a(String str)");
        byte[] bytes = str.getBytes();
        return a(bytes, 0, bytes.length);
    }

    public static byte[] a(byte[] bArr, int i, int i2) throws b {
        Log.d("a","a(byte[] bArr, int i, int i2)");
        return a(bArr, i, i2, d);
    }


   public static byte[] a(byte[] array, int n, int n2, byte[] array2) throws b {
       Log.d("a","a(byte[] array, int n, int n2, byte[] array2)");
       byte[] array3 = new byte[2 + n2 * 3 / 4];
       byte[] array4 = new byte[4];
       int i = 0;
       int n3 = 0;
       int n4 = 0;
       while (i < n2) {
           byte b = (byte)(0x7F & array[i + n]);
           byte b2 = array2[b];
           if (b2 < -5) {
               throw new b("Bad Base64 input character at " + i + ": " + array[i + n] + "(decimal)");
           }
           int n6;
           int n7;
           if (b2 >= -1) {
               if (b == 61) {
                   int n5 = n2 - i;
                   byte b3 = (byte)(0x7F & array[n + (n2 - 1)]);
                   if (n3 == 0 || n3 == 1) {
                       throw new b("invalid padding byte '=' at byte offset " + i);
                   }
                   if ((n3 == 3 && n5 > 2) || (n3 == 4 && n5 > 1)) {
                       throw new b("padding byte '=' falsely signals end of encoded value at offset " + i);
                   }
                   if (b3 != 61 && b3 != 10) {
                       throw new b("encoded value has invalid trailing byte");
                   }
                   break;
               }
               else {
                   n6 = n3 + 1;
                   array4[n3] = b;
                   if (n6 == 4) {
                       n7 = n4 + a(array4, 0, array3, n4, array2);
                       n6 = 0;
                   }
                   else {
                       n7 = n4;
                   }
               }
           }
           else {
               n6 = n3;
               n7 = n4;
           }
           ++i;
           n4 = n7;
           n3 = n6;
       }
       if (n3 != 0) {
           if (n3 == 1) {
               throw new b("single trailing character at offset " + (n2 - 1));
           }
           array4[n3] = 61;
           n4 += a(array4, 0, array3, n4, array2);
       }
       byte[] array5 = new byte[n4];
       System.arraycopy(array3, 0, array5, 0, n4);
       return array5;
   }
}
*/
