package com.androbaby.game2048;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class i extends View {
    private int A;
    private float B;
    private float C;
    private int D;
    private int E;
    private int F;
    private Drawable G;
    private BitmapDrawable[] H;
    private Drawable I;
    private Drawable J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    int a;
    boolean b;
    public int c;
    public int d;
    float e;
    float f;
    Paint g;
    public h h;
    public final int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    long s;
    long t;
    float u;
    float v;
    float w;
    float x;
    float y;
    boolean z;

    public i(Context context, int i, MainActivity mainActivity) {
        super(context);
        Log.d("Canvas"," i(Context context, int i, MainActivity mainActivity)");
        this.g = new Paint(1);
        this.i = 21;
        this.j = false;
        this.A = 0;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 0;
        this.H = new BitmapDrawable[21];
        this.s = System.nanoTime();
        this.t = System.nanoTime();
        this.z = true;
        Resources resources = context.getResources();
        this.h = new h(context, this, i, mainActivity);
        try {
            this.G = resources.getDrawable(R.drawable.background_rectangle);
            this.I = resources.getDrawable(R.drawable.light_up_rectangle);
            this.J = resources.getDrawable(R.drawable.fade_rectangle);
            this.a = resources.getColor(R.color.background);
            setBackgroundColor(this.a);
            this.g.setAntiAlias(true);
        } catch (Exception e) {
            Log.d("Canvas"," Error getting assets");
        }
        setOnTouchListener(new g(this));
        this.h.a();
    }

    private static int a(int i) {
        Log.d("Canvas"," int a(int i) ");
        if (i > 0) {
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw new IllegalArgumentException();
    }

    private void a(int i, int i2) {
        Log.d("Canvas"," a(int i, int i2)");
        if (MainActivity.u == null) {
            MainActivity.u = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        } else {
            MainActivity.u.eraseColor(this.a);
        }
        Canvas canvas = new Canvas(MainActivity.u);
        c(canvas);
        a(canvas, false);
        b(canvas);
        e(canvas);
        f(canvas);
        d(canvas);
    }

    private void a(Canvas canvas) {
        Log.d("Canvas"," a(Canvas canvas)");
        this.g.setTextSize(this.f);
        this.g.setTextAlign(Align.CENTER);
        int measureText = (int) this.g.measureText("" + this.h.j);
        measureText = Math.max(this.O, measureText) + (this.E * 2);
        int max = Math.max(this.P, (int) this.g.measureText("" + this.h.i)) + (this.E * 2);
        int i = measureText / 2;
        int i2 = max / 2;
        int i3 = this.m;
        measureText = i3 - measureText;
        int i4 = measureText - this.E;
        max = i4 - max;
        this.G.setBounds(measureText, this.K, i3, this.N);
        this.G.draw(canvas);
        this.g.setTextSize(this.u);
        this.g.setColor(getResources().getColor(R.color.text_brown));
        canvas.drawText(getResources().getString(R.string.high_score), (float) (measureText + i), (float) this.L, this.g);
        this.g.setTextSize(this.f);
        this.g.setColor(getResources().getColor(R.color.text_white));
        canvas.drawText(String.valueOf(this.h.j), (float) (measureText + i), (float) this.M, this.g);
        this.G.setBounds(max, this.K, i4, this.N);
        this.G.draw(canvas);
        this.g.setTextSize(this.u);
        this.g.setColor(getResources().getColor(R.color.text_brown));
        canvas.drawText(getResources().getString(R.string.score), (float) (max + i2), (float) this.L, this.g);
        this.g.setTextSize(this.f);
        this.g.setColor(getResources().getColor(R.color.text_white));
        canvas.drawText(String.valueOf(this.h.i), (float) (max + i2), (float) this.M, this.g);
    }

    private void a(Canvas canvas, int i, int i2, int i3) {
        Log.d("Canvas"," a(Canvas canvas, int i, int i2, int i3)");
        int f = f();
        if (i >= 8) {
            this.g.setColor(getResources().getColor(R.color.text_white));
        } else {
            this.g.setColor(getResources().getColor(R.color.text_black));
        }
        canvas.drawText("" + i, (float) ((this.A / 2) + i2), (float) (((this.A / 2) + i3) - f), this.g);
    }

    private void a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        Log.d("Canvas"," a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4)");
        drawable.setBounds(i, i2, i3, i4);
        drawable.draw(canvas);
    }

    private void a(Canvas canvas, boolean z) {
        Log.d("Canvas"," a(Canvas canvas, boolean z)");
        if (z) {
            a(canvas, this.I, this.p, this.o, this.p + this.r, this.o + this.r);
        } else {
            a(canvas, this.G, this.p, this.o, this.p + this.r, this.o + this.r);
        }
        a(canvas, getResources().getDrawable(R.drawable.ic_action_refresh), this.p + this.F, this.o + this.F, (this.p + this.r) - this.F, (this.o + this.r) - this.F);
    }

    private void a(Canvas canvas, boolean z, boolean z2) {
        Log.d("Canvas"," a(Canvas canvas, boolean z, boolean z2)");
        int i = this.m - this.k;
        int i2 = this.n - this.l;
        int i3 = i / 2;
        int i4 = i2 / 2;
        if (z) {
            this.I.setAlpha(127);
            a(canvas, this.I, 0, 0, i, i2);
            this.I.setAlpha(255);
            this.g.setColor(getResources().getColor(R.color.text_white));
            this.g.setAlpha(255);
            this.g.setTextSize(this.y);
            this.g.setTextAlign(Align.CENTER);
            int f = i4 - f();
            canvas.drawText(getResources().getString(R.string.you_win), (float) i3, (float) f, this.g);
            this.g.setTextSize(this.v);
            canvas.drawText(z2 ? getResources().getString(R.string.go_on) : getResources().getString(R.string.for_now), (float) i3, (float) ((f + (this.E * 3)) - (f() * 2)), this.g);
            return;
        }
        this.J.setAlpha(127);
        a(canvas, this.J, 0, 0, i, i2);
        this.J.setAlpha(255);
        this.g.setColor(getResources().getColor(R.color.text_black));
        this.g.setAlpha(255);
        this.g.setTextSize(this.y);
        this.g.setTextAlign(Align.CENTER);
        canvas.drawText(getResources().getString(R.string.game_over), (float) i3, (float) (i4 - f()), this.g);
    }

    private void b(int i, int i2) {
        Log.d("Canvas"," b(int i, int i2)");
        int i3 = (int) (0.2d * ((double) i));
        int i4 = (int) (0.08d * ((double) i));
        this.A = ((int) (0.8d * ((double) i))) / this.h.d;
        this.D = ((int) (0.1d * ((double) i))) / (this.h.d + 1);
        int i5 = i / 2;
        int i6 = i2 / 2;
        int i7 = (i3 / 2) + i6;
        if (MainActivity.B < 1.4d) {
            i7 = ((i3 * 3) / 4) + i6;
        }
        this.r = i3 / 2;
        this.g.setTextAlign(Align.CENTER);
        this.g.setTextSize((float) this.A);
        this.B = ((float) (this.A * this.A)) / Math.max((float) this.A, this.g.measureText("0000"));
        this.C = this.B;
        this.u = (float) ((int) (((double) i4) / 2.5d));
        this.v = (float) ((int) (((double) i4) / 1.2d));
        this.x = (float) ((int) (((double) i4) / 1.5d));
        this.w = (float) ((int) (((double) i4) * 1.8d));
        this.y = (float) ((int) (((double) i4) * 1.35d));
        this.E = i4 / 4;
        this.F = i4 / 5;
        this.e = (float) i4;
        this.f = (float) ((int) (((double) i4) / 1.5d));
        i4 = (this.A * this.h.d) + (this.D * (this.h.d + 1));
        this.k = i5 - (i4 / 2);
        this.m = i5 + (i4 / 2);
        this.l = i7 - (i4 / 2);
        this.n = i7 + (i4 / 2);
        this.g.setTextSize(this.u);
        i7 = f();
        this.K = (int) (((double) this.l) - (((double) i3) * 1.5d));
        this.L = (int) ((((float) (this.K + this.E)) + (this.u / 2.0f)) - ((float) i7));
        this.M = (int) ((((float) (this.L + this.E)) + (this.u / 2.0f)) + (this.f / 2.0f));
        this.O = (int) this.g.measureText(getResources().getString(R.string.high_score));
        this.P = (int) this.g.measureText(getResources().getString(R.string.score));
        this.g.setTextSize(this.f);
        this.N = (int) ((((float) (f() + this.M)) + (this.f / 2.0f)) + ((float) this.E));
        this.o = ((this.l + this.N) / 2) - (this.r / 2);
        this.p = this.m - this.r;
        this.q = (this.p - ((this.r * 3) / 2)) - this.F;
        b();
        this.g.setTextSize(this.e);
        this.c = (int) this.g.measureText(getResources().getString(R.string.yes));
        this.d = (int) this.g.measureText(getResources().getString(R.string.no));
    }

    private void b(Canvas canvas) {
        Log.d("Canvas"," b(Canvas canvas)");
        a(canvas, this.G, this.q, this.o, this.q + this.r, this.o + this.r);
        a(canvas, getResources().getDrawable(R.drawable.ic_action_undo),
                this.q + this.F, this.o + this.F, (this.q + this.r) - this.F, (this.o + this.r) - this.F);
    }

    private void b(Canvas canvas, boolean z, boolean z2) {
        Log.d("Canvas"," b(Canvas canvas, boolean z, boolean z2)");
        int i = this.m - this.k;
        int i2 = this.n - this.l;
        int i3 = i / 2;
        int i4 = i2 / 2;
        this.J.setAlpha(127);
        a(canvas, this.J, 0, 0, i, i2);
        this.J.setAlpha(255);
        this.g.setColor(getResources().getColor(R.color.text_black));
        this.g.setAlpha(255);
        this.g.setTextSize(this.y);
        this.g.setTextAlign(Align.CENTER);
        int f = i4 - f();
        canvas.drawText(getResources().getString(R.string.restart), (float) i3, (float) f, this.g);
        this.g.setTextSize(this.e);
        String string = getResources().getString(R.string.yes);
        MainActivity.D = i3 - (this.E * 9);
        MainActivity.E = ((this.E * 5) + f) - (f() * 2);
        canvas.drawText(string, (float) MainActivity.D, (float) MainActivity.E, this.g);
        string = getResources().getString(R.string.no);
        MainActivity.F = (this.E * 9) + i3;
        MainActivity.G = (f + (this.E * 5)) - (f() * 2);
        canvas.drawText(string, (float) MainActivity.F, (float) MainActivity.G, this.g);
    }

    private void c() {
        Log.d("Canvas"," void c()");
        System.out.println("void c");
        Resources resources = getResources();
        int[] cellRectangleIds = getCellRectangleIds();
        this.g.setTextAlign(Align.CENTER);
        for (int i = 1; i < this.H.length; i++) {
            int pow = (int) Math.pow(2.0d, (double) i);
            this.g.setTextSize(this.C);
            this.g.setTextSize(((this.C * ((float) this.A)) * 0.9f) / Math.max(((float) this.A) * 0.9f, this.g.measureText(String.valueOf(pow))));
            Bitmap createBitmap = Bitmap.createBitmap(this.A, this.A, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            a(canvas, resources.getDrawable(cellRectangleIds[i]), 0, 0, this.A, this.A);
            a(canvas, pow, 0, 0);
            this.H[i] = new BitmapDrawable(resources, createBitmap);
        }
    }

    private void c(Canvas canvas) {
        Log.d("Canvas"," c(Canvas canvas)");
        this.g.setTextSize(this.w);
        this.g.setColor(getResources().getColor(R.color.text_black));
        this.g.setTextAlign(Align.LEFT);
        canvas.drawText(getResources().getString(R.string.header), (float) this.k, (float) (this.K - (f() * 2)), this.g);
    }

    private void d() {
        Log.d("Canvas"," void d()");
        Resources resources = getResources();
        if (MainActivity.w == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.m - this.k, this.n - this.l, Config.ARGB_8888);
            a(new Canvas(createBitmap), true, true);
            MainActivity.w = new BitmapDrawable(resources, createBitmap);
        }
        if (MainActivity.x == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.m - this.k, this.n - this.l, Config.ARGB_8888);
            a(new Canvas(createBitmap), true, false);
            MainActivity.x = new BitmapDrawable(resources, createBitmap);
        }
        if (MainActivity.v == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.m - this.k, this.n - this.l, Config.ARGB_8888);
            a(new Canvas(createBitmap), false, false);
            MainActivity.v = new BitmapDrawable(resources, createBitmap);
        }
        if (MainActivity.y == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.m - this.k, this.n - this.l, Config.ARGB_8888);
            b(new Canvas(createBitmap), false, false);
            MainActivity.y = new BitmapDrawable(resources, createBitmap);
        }
    }

    private void d(Canvas canvas) {
        Log.d("Canvas"," d(Canvas canvas) ");
        this.g.setTextSize(this.x);
        this.g.setTextAlign(Align.LEFT);
        canvas.drawText(getResources().getString(R.string.instructions), (float) this.k, (float) ((this.n - (f() * 2)) + this.E), this.g);
    }

    private void e() {
        Log.d("Canvas"," void e()");
        this.t = System.nanoTime();
        this.h.c.a(this.t - this.s);
        this.s = this.t;
    }

    private void e(Canvas canvas) { Log.d("Canvas"," e(Canvas canvas)");
        a(canvas, this.G, this.k, this.l, this.m, this.n);
    }

    private int f() {
        Log.d("Canvas"," f()");
        return (int) ((this.g.descent() + this.g.ascent()) / 2.0f);
    }

    private void f(Canvas canvas) {
        Log.d("Canvas"," f(Canvas canvas)");
        Drawable drawable = getResources().getDrawable(R.drawable.cell_rectangle);
        for (int i = 0; i < this.h.d; i++) {
            for (int i2 = 0; i2 < this.h.e; i2++) {
                int i3 = (this.k + this.D) + ((this.A + this.D) * i);
                int i4 = (this.l + this.D) + ((this.A + this.D) * i2);
                a(canvas, drawable, i3, i4, i3 + this.A, i4 + this.A);
            }
        }
    }

    private void g(Canvas canvas) {
        Log.d("Canvas"," g(Canvas canvas)");
        this.g.setTextSize(this.B);
        this.g.setTextAlign(Align.CENTER);
        for (int i = 0; i < this.h.d; i++) {
            for (int i2 = 0; i2 < this.h.e; i2++) {
                int i3 = (this.k + this.D) + ((this.A + this.D) * i);
                int i4 = i3 + this.A;
                int i5 = (this.l + this.D) + ((this.A + this.D) * i2);
                int i6 = i5 + this.A;
                j a = this.h.b.a(i, i2);
                if (a != null) {
                    int a2 = a(a.a());
                    ArrayList a3 = this.h.c.a(i, i2);
                    Object obj = null;
                    for (int size = a3.size() - 1; size >= 0; size--) {
                        b bVar = (b) a3.get(size);
                        if (bVar.a() == -1) {
                            obj = 1;
                        }
                        if (bVar.d()) {
                            float c;
                            if (bVar.a() == -1) {
                                c = (float) bVar.c();
                                this.g.setTextSize(this.B * c);
                                c = (1.0f - c) * ((float) (this.A / 2));
                                this.H[a2].setBounds((int) (((float) i3) + c), (int) (((float) i5) + c), (int) (((float) i4) - c), (int) (((float) i6) - c));
                                this.H[a2].draw(canvas);
                            } else if (bVar.a() == 1) {
                                double r14 = bVar.c();
                                c = (float) (((r14 * (-0.5d * r14)) / 2.0d) + (1.0d + (0.375d * r14)));
                                this.g.setTextSize(this.B * c);
                                c = (1.0f - c) * ((float) (this.A / 2));
                                this.H[a2].setBounds((int) (((float) i3) + c), (int) (((float) i5) + c), (int) (((float) i4) - c), (int) (((float) i6) - c));
                                this.H[a2].draw(canvas);
                            } else if (bVar.a() == 0) {
                               double r14 = bVar.c();
                                int i7 = a3.size() >= 2 ? a2 - 1 : a2;
                                int i8 = bVar.a[0];
                                int i9 = bVar.a[1];
                                int e = a.e();
                                i8 = (int) ((((double) ((e - i8) * (this.A + this.D))) * (r14 - 1.0d)) * 1.0d);
                                r14 -= 1.0d;
                                i9 = (int) ((r14 * ((double) ((a.f() - i9) * (this.A + this.D)))) * 1.0d);
                                this.H[i7].setBounds(i3 + i8, i5 + i9, i8 + i4, i9 + i6);
                                this.H[i7].draw(canvas);
                            }
                            obj = 1;
                        }
                    }
                    if (obj == null) {
                        this.H[a2].setBounds(i3, i5, i4, i6);
                        this.H[a2].draw(canvas);
                    }
                }
            }
        }
    }

    private int[] getCellRectangleIds() {
        Log.d("Canvas"," int[] getCellRectangleIds()");
        int[] iArr = new int[21];
        iArr[0] = R.drawable.cell_rectangle;
        iArr[1] = R.drawable.cell_rectangle_2;
        iArr[2] = R.drawable.cell_rectangle_4;
        iArr[3] = R.drawable.cell_rectangle_8;
        iArr[4] = R.drawable.cell_rectangle_16;
        iArr[5] = R.drawable.cell_rectangle_32;
        iArr[6] = R.drawable.cell_rectangle_64;
        iArr[7] = R.drawable.cell_rectangle_128;
        iArr[8] = R.drawable.cell_rectangle_256;
        iArr[9] = R.drawable.cell_rectangle_512;
        iArr[10] = R.drawable.cell_rectangle_1024;
        iArr[11] = R.drawable.cell_rectangle_2048;
        for (int i = 12; i < iArr.length; i++) {
            iArr[i] = R.drawable.cell_rectangle_4096;
        }
        return iArr;
    }

    private void h(Canvas canvas) {
        Log.d("Canvas"," h(Canvas canvas)");
        this.j = false;
        Iterator it = this.h.c.d.iterator();
        double d = 1.0d;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            d = bVar.a() == 0 ? bVar.c() : d;
        }
        BitmapDrawable bitmapDrawable = null;
        if (this.h.c()) {
            if (this.h.g()) {
                this.j = true;
                bitmapDrawable = MainActivity.w;
            } else {
                bitmapDrawable = MainActivity.x;
            }
        } else if (this.h.d()) {
            bitmapDrawable = MainActivity.v;
        }
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(this.k, this.l, this.m, this.n);
            bitmapDrawable.setAlpha((int) (d * 255.0d));
            bitmapDrawable.draw(canvas);
        }
    }

    private void i(Canvas canvas) {
        Log.d("Canvas"," i(Canvas canvas)");
        Iterator it = this.h.c.d.iterator();
        double d = 1.0d;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            d = bVar.a() == 0 ? bVar.c() : d;
        }
        BitmapDrawable bitmapDrawable = MainActivity.y;
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(this.k, this.l, this.m, this.n);
            bitmapDrawable.setAlpha((int) (d * 255.0d));
            bitmapDrawable.draw(canvas);
        }
    }

    private void j(Canvas canvas) {
        Log.d("Canvas"," j(Canvas canvas)");
        this.g.setTextAlign(Align.LEFT);
        this.g.setTextSize(this.v);
        this.g.setColor(getResources().getColor(R.color.text_black));
        canvas.drawText(getResources().getString(R.string.endless), (float) this.k, (float) (this.o - (f() * 2)), this.g);
    }

    public void a() {
        Log.d("Canvas"," void a()");
        b(MainActivity.z, MainActivity.A);
        c();
        a(MainActivity.z, MainActivity.A);
        d();
    }

    public void b() {Log.d("Canvas"," void b()");
        this.s = System.nanoTime();
    }

    public void onDraw(Canvas canvas) {
        Log.d("Canvas"," onDraw(Canvas canvas)");
        canvas.drawBitmap(MainActivity.u, 0.0f, 0.0f, this.g);
        a(canvas);
        if (!(this.h.e() || this.h.c.a())) {
            a(canvas, true);
        }
        g(canvas);
        if (this.h.e() && this.b) {
            i(canvas);
        }
        if (!this.h.e()) {
            h(canvas);
        }
        if (!this.h.g()) {
            j(canvas);
        }
        if (this.h.c.a()) {
            invalidate(this.k, this.l, this.m, this.n);
            e();
        } else if (!this.h.e() && this.z) {
            invalidate();
            this.z = false;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.d("Canvas"," onSizeChanged(int i, int i2, int i3, int i4)");
        a();
    }
}
