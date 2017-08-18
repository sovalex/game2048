package com.androbaby.game2048;

import android.util.Log;

public class b extends e {
    public int[] a;
    private int b;
    private long c;
    private long d;
    private long e;

    public b(int i, int i2, int i3, long j, long j2, int[] iArr) {
        super(i, i2);
        this.b = i3;
        this.d = j;
        this.e = j2;
        this.a = iArr;
    }

    public int a() {
        Log.d("b","a()");
        return this.b;
    }

    public void a(long j) { Log.d("b","a(long j)");
        this.c += j;
    }

    public boolean b() {Log.d("b","b()");
        return this.d + this.e < this.c;
    }

    public double c() {Log.d("b","c()");
        return Math.max(0.0d, (1.0d * ((double) (this.c - this.e))) / ((double) this.d));
    }

    public boolean d() {Log.d("b","d()");
        return this.c >= this.e;
    }
}
