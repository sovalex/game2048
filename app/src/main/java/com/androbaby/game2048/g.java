package com.androbaby.game2048;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
//import com.google.android.gms.a.c;
//import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public class g implements OnTouchListener {
    private static int b;
    private static int c;
    i a;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private boolean n;

    static {
        b = 15;
        c = 50;
    }

    public g(i iVar) {
        this.l = 1;
        this.m = 1;
        this.n = false;
        this.a = iVar;
        a();
    }

    private void a() {
        Log.d("g","a()");
        if (MainActivity.C > 1.5d) {
            b = (int) (10.0d * MainActivity.C);
            c = ((int) (20.0d * MainActivity.C)) + 20;
        }
    }

    private boolean a(float f, float f2, float f3) {Log.d("g","boolean a(float f, float f2, float f3)");
        return f <= f2 && f2 <= f3;
    }

    private boolean a(int i) {Log.d("g","boolean a(int i)");
        return b() <= ((float) (this.a.r * i));
    }

    private boolean a(int i, int i2) {Log.d("g","boolean a(int i, int i2)");
        return a(1) && a((float) i, this.d, (float) (this.a.r + i)) && a((float) i2, this.e, (float) (this.a.r + i2));
    }

    private float b() {Log.d("g","float b()");
        return ((this.d - this.j) * (this.d - this.j)) + ((this.e - this.k) * (this.e - this.k));
    }

    private boolean b(int i, int i2) {Log.d("g","b(int i, int i2)");
        return a((float) i, this.d, (float) (this.a.c + i)) && a((float) (i2 - this.a.c), this.e, (float) i2);
    }

    private boolean c(int i, int i2) {Log.d("g","c(int i, int i2)");
        return a((float) i, this.d, (float) (this.a.d + i)) && a((float) (i2 - this.a.d), this.e, (float) i2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("g","onTouch(View view, MotionEvent motionEvent)");
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0://c.SignInButton_buttonSize /*0*/:
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.j = this.d;
                this.k = this.e;
                this.h = this.d;
                this.i = this.e;
                this.f = 0.0f;
                this.g = 0.0f;
                this.n = false;
                break;
            case 1:
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.l = 1;
                this.m = 1;
                if (!this.n) {
                    if (!a(this.a.p, this.a.o)) {
                        if (!a(this.a.q, this.a.o)) {
                            if (!this.a.b || !b(MainActivity.D, MainActivity.E + this.a.l)) {
                                if (!this.a.b || !c(MainActivity.F, MainActivity.G + this.a.l)) {
                                    if (a(2) && a((float) this.a.k, this.d, (float) this.a.m) && a((float) this.a.l, this.d, (float) this.a.n) && this.a.j) {
                                        this.a.h.f();
                                        break;
                                    }
                                }
                                this.a.b = false;
                                this.a.invalidate();
                                break;
                            }
                            this.a.b = false;
                            this.a.h.a();
                            break;
                        }
                        this.a.h.b();
                        break;
                    } else if (!this.a.h.e()) {
                        this.a.h.a();
                        break;
                    } else {
                        this.a.b = true;
                        this.a.invalidate();
                        break;
                    }
                }
                break;
            case 2 /*2*/:
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                if (this.a.h.e() && !this.a.b) {
                    float f = this.d - this.h;
                    if (Math.abs(this.f + f) < Math.abs(this.f) + Math.abs(f) && Math.abs(f) > 10.0f && Math.abs(this.d - this.j) > 0.0f) {
                        this.j = this.d;
                        this.k = this.e;
                        this.f = f;
                        this.l = this.m;
                    }
                    if (this.f == 0.0f) {
                        this.f = f;
                    }
                    float f2 = this.e - this.i;
                    if (Math.abs(this.g + f2) < Math.abs(this.g) + Math.abs(f2) && Math.abs(f2) > 10.0f && Math.abs(this.e - this.k) > 0.0f) {
                        this.j = this.d;
                        this.k = this.e;
                        this.g = f2;
                        this.l = this.m;
                    }
                    if (this.g == 0.0f) {
                        this.g = f2;
                    }
                    if (b() > 0.0f && !this.n) {
                        if (((f2 >= ((float) b) && Math.abs(f2) >= Math.abs(f)) || this.e - this.k >= ((float) c)) && this.l % 2 != 0) {
                            this.l *= 2;
                            this.m = 2;
                            this.a.h.a(2);
                            z = true;
                        } else if (((f2 <= ((float) (-b)) && Math.abs(f2) >= Math.abs(f)) || this.e - this.k <= ((float) (-c))) && this.l % 3 != 0) {
                            this.l *= 3;
                            this.m = 3;
                            this.a.h.a(0);
                            z = true;
                        }
                        if (((f >= ((float) b) && Math.abs(f) >= Math.abs(f2)) || this.d - this.j >= ((float) c)) && this.l % 5 != 0) {
                            this.l *= 5;
                            this.m = 5;
                            this.a.h.a(1);
                            z = true;
                        } else if (((f <= ((float) (-b)) && Math.abs(f) >= Math.abs(f2)) || this.d - this.j <= ((float) (-c))) && this.l % 7 != 0) {
                            this.l *= 7;
                            this.m = 7;
                            this.a.h.a(3);
                            z = true;
                        }
                        if (z) {
                            this.n = true;
                            this.j = this.d;
                            this.k = this.e;
                        }
                    }
                }
                this.h = this.d;
                this.i = this.e;
                break;
        }
        return true;
    }
}
