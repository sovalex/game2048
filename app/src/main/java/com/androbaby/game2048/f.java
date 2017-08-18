package com.androbaby.game2048;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class f {
    public j[][] a;
    public j[][] b;
    private j[][] c;

    public f(int i, int i2) {
        this.a = (j[][]) Array.newInstance(j.class, new int[]{i, i2});
        this.b = (j[][]) Array.newInstance(j.class, new int[]{i, i2});
        this.c = (j[][]) Array.newInstance(j.class, new int[]{i, i2});
        g();
        h();
    }

    public e a() {
        Log.d("f"," e a()");
        ArrayList b = b();
        return b.size() >= 1 ? (e) b.get((int) Math.floor(Math.random() * ((double) b.size()))) : null;
    }

    public j a(int i, int i2) {Log.d("f"," a(int i, int i2)");
        return b(i, i2) ? this.a[i][i2] : null;
    }

    public void a(j jVar) {Log.d("f"," a(j jVar)");
        this.a[jVar.e()][jVar.f()] = jVar;
    }

    public boolean a(e eVar) {Log.d("f"," a(e eVar))");
        return !b(eVar);
    }

    public ArrayList<e> b() {
        Log.d("f"," b()");
        ArrayList<e> arrayList = new ArrayList();
        for (int i = 0; i < this.a.length; i++) {
            for (int i2 = 0; i2 < this.a[0].length; i2++) {
                if (this.a[i][i2] == null) {
                    arrayList.add(new e(i, i2));
                }
            }
        }
        return arrayList;
    }

    public void b(j jVar) {Log.d("f"," b(j jVar)");
        this.a[jVar.e()][jVar.f()] = null;
    }

    public boolean b(int i, int i2) {Log.d("f"," b(int i, int i2)");
        return i >= 0 && i < this.a.length && i2 >= 0 && i2 < this.a[0].length;
    }

    public boolean b(e eVar) {Log.d("f"," b(e eVar)");
        return c(eVar) != null;
    }

    public j c(e eVar) {Log.d("f","c(e eVar)");
        return (eVar == null || !d(eVar)) ? null : this.a[eVar.e()][eVar.f()];
    }

    public boolean c() {Log.d("f","boolean c()");
        return b().size() >= 1;
    }

    public void d() {Log.d("f","void d()");
        for (int i = 0; i < this.c.length; i++) {
            for (int i2 = 0; i2 < this.c[0].length; i2++) {
                if (this.c[i][i2] == null) {
                    this.b[i][i2] = null;
                } else {
                    this.b[i][i2] = new j(i, i2, this.c[i][i2].a());
                }
            }
        }
    }

    public boolean d(e eVar) {Log.d("f","boolean d(e eVar)");
        return eVar.e() >= 0 && eVar.e() < this.a.length && eVar.f() >= 0 && eVar.f() < this.a[0].length;
    }

    public void e() {Log.d("f","e()");
        for (int i = 0; i < this.a.length; i++) {
            for (int i2 = 0; i2 < this.a[0].length; i2++) {
                if (this.a[i][i2] == null) {
                    this.c[i][i2] = null;
                } else {
                    this.c[i][i2] = new j(i, i2, this.a[i][i2].a());
                }
            }
        }
    }

    public void f() {Log.d("f","f()");
        for (int i = 0; i < this.b.length; i++) {
            for (int i2 = 0; i2 < this.b[0].length; i2++) {
                if (this.b[i][i2] == null) {
                    this.a[i][i2] = null;
                } else {
                    this.a[i][i2] = new j(i, i2, this.b[i][i2].a());
                }
            }
        }
    }

    public void g() {Log.d("f","g()");
        for (j[] jVarArr : this.a) {
            for (int i = 0; i < this.a[0].length; i++) {
                jVarArr[i] = null;
            }
        }
    }

    public void h() {Log.d("f","h()");
        for (int i = 0; i < this.a.length; i++) {
            for (int i2 = 0; i2 < this.a[0].length; i2++) {
                this.b[i][i2] = null;
            }
        }
    }
}
