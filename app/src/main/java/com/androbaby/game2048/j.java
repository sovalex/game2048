package com.androbaby.game2048;

import android.util.Log;

public class j extends e {

    private int a;
    private j[] b;

    public j(int i, int i2, int i3) {
        super(i, i2);
        this.b = null;
        this.a = i3;
    }

    public j(e eVar, int i) {
        super(eVar.e(), eVar.f());
        Log.d("j","j(e eVar, int i)");
        this.b = null;
        this.a = i;
    }

    public int a() {Log.d("j","int a()");
        return this.a;
    }

    public void a(e eVar) {Log.d("j","a(e eVar)");
        a(eVar.e());
        b(eVar.f());
    }

    public void a(j[] jVarArr) {Log.d("j","a(j[] jVarArr)");
        this.b = jVarArr;
    }

    public j[] b() {Log.d("j","j[] b()");
        return this.b;
    }
}
