package com.androbaby.game2048;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class h {
    public static int a;
    public f b;
    public c c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public int l;
    Handler m;
    Runnable n;
    private long o;
    private int p;
    private Context q;
    private i r;
    private MainActivity s;
    private long t;

    public h(Context context, i iVar, int i, MainActivity mainActivity) {
        this.b = null;
        this.d = 4;
        this.e = 4;
        this.f = 2;
        this.g = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.o = 0;
        this.p = 0;
        this.t = 1000;
        this.m = new Handler();
        this.n = new Runnable() {
            public void run() {
                //h.this.s.n();
                h.this.s.ab = false;
            }
        };
        this.s = mainActivity;
        this.q = context;
        this.r = iVar;
        iVar.getClass();
        a = (int) Math.pow(2.0d, (double) 20);
        this.d = i;
        this.e = i;
    }

    private List<Integer> a(e eVar) {
        Log.d("h","List<Integer> a(e eVar)");
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < this.d; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        if (eVar.e() == 1) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    private void a(j jVar) {
        Log.d("h","a(j jVar)");
        this.b.a(jVar);
        this.c.a(jVar.e(), jVar.f(), -1, 100000000, 100000000, null);
    }

    private void a(j jVar, e eVar) {
        Log.d("h"," a(j jVar, e eVar)");
        this.b.a[jVar.e()][jVar.f()] = null;
        this.b.a[eVar.e()][eVar.f()] = jVar;
        jVar.a(eVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e[] a(e e, e e2) {
        Log.d("h","  a(e e, e e2)");
        e e3 = new e(e.e(), e.f());
        e e4;
        while (true) {
            e4 = new e(e3.e() + e2.e(), e3.f() + e2.f());
            if (!this.b.d(e4) || !this.b.a(e4)) {
                break;
            }
            e3 = e4;
        }
        return new e[] { e3, e4 };
    }

    private e b(int i) {
        return new e[]{new e(0, -1), new e(1, 0), new e(0, 1), new e(-1, 0)}[i];
    }

    private List<Integer> b(e eVar) {
        Log.d("h","   List<Integer> b(e eVar)");
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < this.e; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        if (eVar.f() == 1) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    private boolean b(e eVar, e eVar2) {
        Log.d("h","boolean b(e eVar, e eVar2)");
        return eVar.e() == eVar2.e() && eVar.f() == eVar2.f();
    }

    private void h() {
        Log.d("h","void h()");
        for (int i = 0; i < this.f; i++) {
            i();
        }
    }

    private void i() {
        Log.d("h","void i()");
        if (this.b.c()) {
            a(new j(this.b.a(), Math.random() < 0.9d ? 2 : 4));
        }
    }

    private void j() {
        Log.d("h","void j()");
        for (j[] array : this.b.a) {
            for (j k : array) {
                if (this.b.b((e)k)) {
                    k.a((j[])null);
                }
            }
        }
    }

    private void k() {
        Log.d("h","void k()");
        this.b.d();
        this.h = true;
        this.k = this.o;
        this.l = this.p;
    }

    private void l() {
        Log.d("h","l()");
        this.b.e();
        this.o = this.i;
        this.p = this.g;
    }

    private void m() {
        Log.d("h","m()");
        if (!o() && !c()) {
            this.g = -1;
            n();
            this.m.postDelayed(this.n, this.t);
        }
    }

    private void n() {
        Log.d("h","n() ");
        this.c.a(-1, -1, 0, 500000000, 200000000, null);
        if (this.i >= this.j) {
            this.j = this.i;
        }
    }

    private boolean o() {
        Log.d("h","o() ");
        return this.b.c() || p();
    }

    private boolean p() {
        Log.d("h"," boolean p()");
        for (int i = 0; i < this.d; i++) {
            for (int i2 = 0; i2 < this.e; i2++) {
                j c = this.b.c(new e(i, i2));
                if (c != null) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        e b = b(i3);
                        j c2 = this.b.c(new e(b.e() + i, b.f() + i2));
                        if (c2 != null && c2.a() == c.a()) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private int q() { Log.d("h"," int q()");
        return !g() ? a : 2048;
    }

    public void a() {
        Log.d("h","void a()");
        if (this.b == null) {
            this.b = new f(this.d, this.e);
        } else {
            l();
            k();
            this.b.g();
        }
        this.c = new c(this.d, this.e);
        if (this.i >= this.j) {
            this.j = this.i;
        }
        this.i = 0;
        this.g = 0;
        h();
        this.r.z = true;
        this.r.b();
        this.r.invalidate();
    }

   public void a(int n) {
       Log.d("h","a(int n) ");
       this.c.b();
       if (!this.e()) {
           return;
       }
       this.l();
       e b = this.b(n);
       List<Integer> a = this.a(b);
       List<Integer> b2 = this.b(b);
       this.j();
       Iterator<Integer> iterator = a.iterator();
       int n2 = 0;
       while (iterator.hasNext()) {
            int intValue = iterator.next();
            Iterator<Integer> iterator2 = b2.iterator();
           int n3 = n2;
           while (iterator2.hasNext()) {
                int intValue2 = iterator2.next();
                e e = new e(intValue, intValue2);
                j c = this.b.c(e);
               if (c != null) {
                    e[] a2 = this.a(e, b);
                    j c2 = this.b.c(a2[1]);
                   if (c2 != null && c2.a() == c.a() && c2.b() == null) {
                        j j = new j(a2[1], 2 * c.a());
                       j.a(new j[] { c, c2 });
                       this.b.a(j);
                       this.b.b(c);
                       c.a(a2[1]);
                       this.c.a(j.e(), j.f(), 0, 100000000L, 0L, new int[] { intValue, intValue2 });
                       this.c.a(j.e(), j.f(), 1, 100000000L, 100000000L, (int[])null);
                       this.i += j.a();
                       this.j = Math.max(this.i, this.j);
                       if (j.a() >= this.q() && !this.c()) {
                           ++this.g;
                           this.n();
                       }
                   }
                   else {
                       this.a(c, a2[0]);
                       this.c.a(a2[0].e(), a2[0].f(), 0, 100000000L, 0L, new int[] { intValue, intValue2, 0 });
                   }
                   if (this.b(e, (e)c)) {
                       continue;
                   }
                   n3 = 1;
               }
           }
           n2 = n3;
       }
       if (n2 != 0) {
           this.k();
           this.i();
           this.m();
       }
       this.r.b();
       this.r.invalidate();// -repaint
   }
    public void b() {Log.d("h","b() ");
        if (this.h) {
            this.h = false;
            this.c.b();
            this.b.f();
            this.i = this.k;
            this.g = this.l;
            this.r.z = true;
            this.r.invalidate();
        }
    }

    public boolean c() {Log.d("h","boolean c()");
        return this.g > 0 && this.g % 2 != 0;
    }

    public boolean d() {Log.d("h","boolean d()");
        return this.g == -1;
    }

    public boolean e() {Log.d("h","boolean e()");
        return (c() || d()) ? false : true;
    }

    public void f() {
        Log.d("h","void f()");
        this.g = 2;
        this.r.invalidate();
        this.r.z = true;
    }

    public boolean g() {Log.d("h","boolean g()");
        return (this.g == 2 || this.g == 3) ? false : true;
    }
}
