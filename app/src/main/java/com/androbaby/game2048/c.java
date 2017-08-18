package com.androbaby.game2048;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class c {
    public ArrayList<b>[][] a;
    int b;
    boolean c;
    public ArrayList<b> d;

    public c(int i, int i2) {
        Log.d("c","c(int i, int i2)");
        this.b = 0;
        this.c = false;
        this.d = new ArrayList();
        this.a = (ArrayList[][]) Array.newInstance(ArrayList.class, new int[]{i, i2});
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.a[i3][i4] = new ArrayList();
            }
        }
    }

    public ArrayList<b> a(int i, int i2) {Log.d("c","a(int i, int i2)");
        return this.a[i][i2];
    }

    public void a(int i, int i2, int i3, long j, long j2, int[] iArr) {
        Log.d("c","a(int i, int i2, int i3, long j, long j2, int[] iArr)");
        b bVar = new b(i, i2, i3, j, j2, iArr);
        if (i == -1 && i2 == -1) {
            this.d.add(bVar);
        } else {
            this.a[i][i2].add(bVar);
        }
        this.b++;
    }

    public void a(long n) {
        Log.d("c","a(long n)");
        ArrayList<b> list = new ArrayList<b>();
        for (b b : this.d) {
            b.a(n);
            if (b.b()) {
                list.add(b);
                --this.b;
            }
        }
        for (ArrayList<b>[] array : this.a) {
            for (int length2 = array.length, j = 0; j < length2; ++j) {
                for (b b2 : array[j]) {
                    b2.a(n);
                    if (b2.b()) {
                        list.add(b2);
                        --this.b;
                    }
                }
            }
        }
        Iterator<b> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            this.a(iterator3.next());
        }
    }


    public void a(b bVar) {Log.d("c","a(b bVar)");
        if (bVar.e() == -1 && bVar.f() == -1) {
            this.d.remove(bVar);
        } else {
            this.a[bVar.e()][bVar.f()].remove(bVar);
        }
    }

    public boolean a() {Log.d("c","boolean a()");
        if (this.b != 0) {
            this.c = true;
            return true;
        } else if (!this.c) {
            return false;
        } else {
            this.c = false;
            return true;
        }
    }

    public void b() {Log.d("c","void b()");
        for (final ArrayList<b>[] array : this.a) {
            for (int length2 = array.length, j = 0; j < length2; ++j) {
                array[j].clear();
            }
        }
        this.d.clear();
        this.b = 0;
    }
}
