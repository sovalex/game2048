package com.androbaby.game2048;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R.styleable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
//import com.google.a.a.a.a;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.g;
//import com.google.android.gms.games.c;
import java.util.Locale;
import com.androbaby.game2048.a;

public class MainActivity extends FragmentActivity implements OnTouchListener {
    public static int A;
    public static double B;
    public static double C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static Bitmap u;
    public static BitmapDrawable v;
    public static BitmapDrawable w;
    public static BitmapDrawable x;
    public static BitmapDrawable y;
    public static int z;
    RelativeLayout H;
    TextView I;
    ImageView J;
    ImageView K;
    ImageView L;
    ImageView M;
    Button N;
    Button O;
    RelativeLayout P;
    Dialog Q;
    i R1;
    i S;
    i T;
    i U;
    i V;
    i W;
    // AdView X;
    boolean Y;
    final int Z;
    final int aa;
    boolean ab;
    //final String ac;
    SharedPreferences ad;
    int ae;
    int af;
    //d ag;
    public Boolean ah;
    public Boolean ai;
    private g an;
    DisplayMetrics m;
    RelativeLayout n;
    int o;
    String[] p;
    int[] q;
    int r;
    Typeface s;
    int t;

    static {
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
    }

    public MainActivity() {
        this.o = 0;
        this.r = 0;
        this.t = 4;
        this.Y = false;
        this.Z = 5000;
        this.aa = 5001;
        this.ab = true;
        // this.ac = "ca-app-pub-2530153337266016/3679803688";
        this.ae = 2;
        this.ah = Boolean.valueOf(false);
        this.ai = Boolean.valueOf(false);
    }

   /* private void J() {
        if (!(this.t == 4 || this.t == 5 || this.t == 6 || this.t == 8 || this.t != 3)) {
        }
        startActivityForResult(c.k.a(G()), 5001);
    }*/

    private void K() {
        Log.d("MainActivity","a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4)");
        this.I.setText(this.p[this.r]);
        this.J.setImageResource(this.q[this.r]);
        if (this.r == 0) {
            this.t = 4;
        } else if (this.r == 1) {
            this.t = 5;
        } else if (this.r == 2) {
            this.t = 6;
        } else if (this.r == 3) {
            this.t = 8;
        } else if (this.r == 4) {
            this.t = 3;
        }
        L();
    }

    private void L() {
        Log.d("MainActivity"," void L()");
        if (this.t == 4) {
            this.W = this.R1;
        } else if (this.t == 5) {
            this.W = this.S;
        } else if (this.t == 6) {
            this.W = this.T;
        } else if (this.t == 8) {
            this.W = this.U;
        } else if (this.t == 3) {
            this.W = this.V;
        }
    }

    private void a(String str) {
        Log.d("MainActivity"," a(String str)");
        v();
        this.ad = getSharedPreferences(str, 0);
        Editor edit = this.ad.edit();
        j[][] jVarArr = this.W.h.b.a;
        j[][] jVarArr2 = this.W.h.b.b;
        edit.putInt("width", jVarArr.length);
        edit.putInt("height", jVarArr.length);
        for (int i = 0; i < jVarArr.length; i++) {
            for (int i2 = 0; i2 < jVarArr[0].length; i2++) {
                if (jVarArr[i][i2] != null) {
                    edit.putInt(i + " " + i2, jVarArr[i][i2].a());
                } else {
                    edit.putInt(i + " " + i2, 0);
                }
                if (jVarArr2[i][i2] != null) {
                    edit.putInt("undo" + i + " " + i2, jVarArr2[i][i2].a());
                } else {
                    edit.putInt("undo" + i + " " + i2, 0);
                }
            }
        }
        edit.putLong("score", this.W.h.i);
        edit.putLong("high score temp", this.W.h.j);
        edit.putLong("undo score", this.W.h.k);
        edit.putBoolean("can undo", this.W.h.h);
        edit.putInt("game state", this.W.h.g);
        edit.putInt("undo game state", this.W.h.l);
        edit.commit();
    }

    private void b(String str) {
        Log.d("MainActivity","b(String str)");
        this.W.h.c.b();
        this.ad = getSharedPreferences(str, 0);
        for (int i = 0; i < this.W.h.b.a.length; i++) {
            for (int i2 = 0; i2 < this.W.h.b.a[0].length; i2++) {
                int i3 = this.ad.getInt(i + " " + i2, -1);
                if (i3 > 0) {
                    this.W.h.b.a[i][i2] = new j(i, i2, i3);
                } else if (i3 == 0) {
                    this.W.h.b.a[i][i2] = null;
                }
                int i4 = this.ad.getInt("undo" + i + " " + i2, -1);
                if (i4 > 0) {
                    this.W.h.b.b[i][i2] = new j(i, i2, i4);
                } else if (i3 == 0) {
                    this.W.h.b.b[i][i2] = null;
                }
            }
        }
        this.W.h.i = this.ad.getLong("score", this.W.h.i);
        this.W.h.j = this.ad.getLong("high score temp", this.W.h.j);
        this.W.h.k = this.ad.getLong("undo score", this.W.h.k);
        this.W.h.h = this.ad.getBoolean("can undo", this.W.h.h);
        this.W.h.g = this.ad.getInt("game state", this.W.h.g);
        this.W.h.l = this.ad.getInt("undo game state", this.W.h.l);
    }

    public int A() {
        Log.d("MainActivity","A()");
        this.ad = getSharedPreferences("CHOICE", 0);
        return this.ad.getInt("CHOICE_TYPE", 0);
    }

    public int B() {
        Log.d("MainActivity","B()");
        this.ad = getSharedPreferences("CHOICE", 0);
        return this.ad.getInt("NO_COUNT", 0);
    }

    public void C() {
        Log.d("MainActivity","C() ");
        this.ad = getSharedPreferences("CHOICE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("NO_COUNT", B() + 1);
        edit.commit();
    }

    public void D() {
        Log.d("MainActivity","D()");
        this.ad = getSharedPreferences("CHOICE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("CHOICE_TYPE", 0);
        edit.putInt("NO_COUNT", 0);
        edit.commit();
    }

    public int E() {
        Log.d("MainActivity","E()");
        this.ad = getSharedPreferences("SCORE", 0);
        return this.ad.getInt("CODE", 0);
    }

    public void a(long j) {
        Log.d("MainActivity","a(long j)");
        if (j == 0) {//|| !H()
        }
        /*if (this.t == 4) {
            c.k.a(G(), getString(2131099740), j);
        } else if (this.t == 5) {
            c.k.a(G(), getString(2131099741), j);
        } else if (this.t == 6) {
            c.k.a(G(), getString(2131099742), j);
        } else if (this.t == 8) {
            c.k.a(G(), getString(2131099743), j);
        } else if (this.t == 3) {
            c.k.a(G(), getString(2131099739), j);
        }*/
    }

    public void b(int i) {
        Log.d("MainActivity"," b(int i)");
        this.ad = getSharedPreferences("SCORE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("RATE_TYPE", i);
        edit.commit();
    }

    public void c(int i) {
        Log.d("MainActivity"," c(int i)");
        this.ad = getSharedPreferences("CHOICE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("CHOICE_TYPE", i);
        edit.commit();
    }

    public void d(int i) {
        Log.d("MainActivity"," d(int i)");
        this.ad = getSharedPreferences("SCORE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("CODE", i);
        edit.commit();
    }

    public int f() {
        Log.d("MainActivity"," int f()");
        this.ad = getSharedPreferences("SCORE", 0);
        return this.ad.getInt("BUY", 0);
    }

    public void g() {
        Log.d("MainActivity"," g()");
        this.ad = getSharedPreferences("SCORE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("BUY", 1);
        edit.commit();
    }

   /* public void h() {
        Builder builder = new Builder(this);
        builder.setTitle(R.string.remove_ads).setPositiveButton(R.string.yes, new OnClickListener() {
            final *//* synthetic *//* MainActivity a;

            {
                this.a = MainActivity;//r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                // MyActivity.this.finish();
                //dialogInterface.dismiss();
                // MainActivity.this.finish();// this.a.ag.b();
                this.ag.b();
                dialogInterface.dismiss();
            }
        }).setNegativeButton(R.string.no, null);
        builder.create().show();
    }*/

    public void i() {
        Log.d("MainActivity"," void i()");
        if (this.Y) {
            this.Y = false;
        }
    }

    /*public void j() {
        super.j();
        if (this.Y) {
            a(this.W.h.i);
            J();
            this.Y = false;
        }
    }*/

    /*public void k() {
        if (H()) {
            J();
            return;
        }
        this.Y = true;
        I();
    }*/

    /*public void l() {
        if (!this.ah.booleanValue()) {
            this.an = new g(this);
            //this.an.a("ca-app-pub-2530153337266016/3679803688");
            this.an.a(new com.google.android.gms.ads.a() {
                *//* synthetic *//* MainActivity a;

                *//*{
                    this.a = r1;
                }*//*

                public void a() {
                    this.a.m();
                }
            });
            m();
        }
    }*/

    /*public void m() {
        if (!this.ah.booleanValue()) {
            this.an.a(new com.google.android.gms.ads.c.a().a());
        }
    }*/

   /* public void n() {
        if (!this.ah.booleanValue()) {
            if (this.an.a()) {
                this.an.b();
            } else {
               // m();
            }
        }
    }*/

    public void o() {
        Log.d("MainActivity","o()");
        this.p = getResources().getStringArray(R.array.type_array);
        this.q = new int[this.p.length];
        this.q[0] = R.drawable.logo_4;
        this.q[1] = R.drawable.logo_5;
        this.q[2] = R.drawable.logo_6;
        this.q[3] = R.drawable.logo_8;
        this.q[4] = R.drawable.logo_3;
        if (Locale.getDefault().toString().substring(0, 2).equals("ru")) {
            this.s = Typeface.createFromAsset(getAssets(), "Asap-Regular.otf");
        } else {
            this.s = Typeface.createFromAsset(getAssets(), "ArchivoNarrow-Regular.otf");
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        A = defaultDisplay.getHeight();
        z = defaultDisplay.getWidth();
        this.m = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(this.m);
        C = (double) this.m.density;
        B = ((double) A) / ((double) z);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        Log.d("MainActivity", "onActivityResult(" + i + "," + i2 + "," + intent);
        //if (this.ag.a(i, i2, intent)) {
         //   Log.d("", "onActivityResult handled by IABUtil.");
        //} else {
            super.onActivityResult(i, i2, intent);
        //}
    }

    public void onBackPressed() {
        Log.d("MainActivity", "onBackPressed()");
        if (this.o != 0) {
           /* if (this.ab) {
                n();
            }*/
            this.ab = true;
            s();
            a("view" + this.t);
            a(this.W.h.i);
        } else if (this.Q != null) {
            if (this.Q.isShowing()) {
                this.Q.dismiss();
                return;
            }
            this.Q.show();
            this.Q.getWindow().setLayout(this.af, this.af);
        } else if (w() != 0 || x() < this.ae) {
            super.onBackPressed();
        } else {
            p();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("MainActivity", "onCreate(Bundle bundle)");
        setContentView(R.layout.activity_main);
        if (f() > 0) {
            this.ah = Boolean.valueOf(true);
        }
        //l();
        o();
        this.n = (RelativeLayout) findViewById(R.id.main);
        r();
        q();
        u();
        L();
        if (this.t == 4) {
            this.r = 0;
        } else if (this.t == 5) {
            this.r = 1;
        } else if (this.t == 6) {
            this.r = 2;
        } else if (this.t == 8) {
            this.r = 3;
        } else if (this.t == 3) {
            this.r = 4;
        }
        this.I.setText(this.p[this.r]);
        this.J.setImageResource(this.q[this.r]);
        if (bundle != null && bundle.getBoolean("hasState")) {
            b("view" + this.t);
        }
        if (!this.ah.booleanValue()) {
            new a(this).a();
        }
        s();
        //this.ag = new d(this);
        //this.ag.a();
    }

    protected void onDestroy() {
        super.onDestroy();
        //this.ag.c();
        Log.d("MainActivity", "onDestroy()");
    }

    protected void onPause() {
        super.onPause();
        a("view" + this.t);
        Log.d("MainActivity", "onPause()");
    }

    protected void onResume() {
        super.onResume();
        b("view" + this.t);
        Log.d("MainActivity", "onResume()");
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("hasState", true);
        a("view" + this.t);
        Log.d("MainActivity", "onResume()");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("MainActivity", "onTouch(View view, MotionEvent motionEvent)");
        if (motionEvent.getAction() != 0 && motionEvent.getAction() == 1) {
            switch (view.getId()) {
                case 3:
                    this.r = ((this.r - 1) + this.p.length) % this.p.length;
                    K();
                    break;
                case 4:
                    this.r = (this.r + 1) % this.p.length;
                    K();
                    break;
                case 5:
                    t();
                    break;
                case 6:
                    //k();
                    break;
                case 7:
                   // h();
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public void p() {
        Log.d("MainActivity", "void p()");
        Builder builder = new Builder(this);
        builder.setTitle(R.string.app_quit_title).setNegativeButton(R.string.no, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.b(1);
                MainActivity.this.finish();
            }
        }).setPositiveButton(R.string.yes, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.b(2);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(com.androbaby.game2048.a.e + com.androbaby.game2048.a.q));
                MainActivity.this.startActivity(intent);
            }
        }).setNeutralButton(R.string.later, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.b(0);
                MainActivity.this.finish();
            }
        });
        builder.create().show();
    }

   /* Builder Builder = new Builder((Context) this);
    Builder.setTitle(2131099696).

    setNegativeButton(2131099702,(DialogInterface.OnClickListener)

    new MainActivity.MainActivity$5(this)).

    setPositiveButton(2131099707,(DialogInterface$OnClickListener)

    new MainActivity.MainActivity$4(this)).

    setNeutralButton(2131099701,(DialogInterface$OnClickListener)

    new MainActivity.MainActivity$3(this));
    alertDialog$Builder.create().

    show();*/

    public void q() {
        Log.d("MainActivity", "void q()");
        int i = A;
        int i2 = z;
        int i3 = i / 15;
        int i4 = i / 3;
        int i5 = i / 15;
        int i6 = i / 27;
        int i7 = i2 / 3;
        int i8 = i / 16;
        int i9 = i / 24;
        int i10 = i / 50;
        int i11 = i / 20;
        i2 = (i2 * 3) / 5;
        int i12 = i / 15;
        int i13 = i / 25;
        i /= 20;
        int i14 = i / 5;
        this.H = new RelativeLayout(this);
        this.J = new ImageView(this);
        this.J.setId(Integer.valueOf(1).intValue());
        this.I = new TextView(this);
        this.I.setId(Integer.valueOf(2).intValue());
        this.I.setText(this.p[this.r]);
        this.I.setTextSize(0, (float) i6);
        this.I.setGravity(17);
        this.I.setTypeface(this.s);
        this.I.setOnTouchListener(this);
        this.K = new ImageView(this);
        this.K.setId(Integer.valueOf(3).intValue());
        this.K.setOnTouchListener(this);
        this.K.setImageResource(R.drawable.arrow_left);
        this.K.setAlpha(200);
        this.L = new ImageView(this);
        this.L.setId(Integer.valueOf(4).intValue());
        this.L.setOnTouchListener(this);
        this.L.setImageResource(R.drawable.arrow_right);
        this.L.setAlpha(200);
        this.N = new Button(this);
        this.N.setId(Integer.valueOf(5).intValue());
        this.N.setText(R.string.start_game);
        this.N.setTextSize(0, (float) i6);
        this.N.setTypeface(this.s);
        this.N.setTextColor(getResources().getColor(R.color.text_white));
        this.N.setPadding(0, 0, 0, 0);
        this.N.setMinHeight(0);
        this.N.setMinWidth(0);
        this.N.setOnTouchListener(this);
        this.N.setBackgroundDrawable(getResources().getDrawable(R.drawable.button1_normal));
        this.O = new Button(this);
        this.O.setId(Integer.valueOf(6).intValue());
        this.O.setText(R.string.high_scores);
        //Button button = this.O;
        this.O.setTextSize(0, (float) i6);
        this.O.setTypeface(this.s);
        this.O.setTextColor(getResources().getColor(R.color.text_white));
        this.O.setPadding(0, 0, 0, 0);
        this.O.setMinHeight(0);
        this.O.setMinWidth(0);
        this.O.setOnTouchListener(this);
        this.O.setBackgroundDrawable(getResources().getDrawable(R.drawable.button2_normal));
        //this.M = new ImageView(this);
        //this.M.setId(Integer.valueOf(7).intValue());
       // this.M.setOnTouchListener(this);
        //this.M.setImageResource(R.drawable.buy);
        //if (this.ah.booleanValue() || this.ai.booleanValue()) {
         //   this.M.setVisibility(View.GONE);
        //} else {
        //    this.M.setVisibility(View.VISIBLE);
        //}
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams2.setMargins(0, i3, 0, i5);
        layoutParams2.addRule(14);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i7, -2);
        layoutParams3.setMargins(i10, 0, i10, i11);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.J.getId());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i8, i9);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.addRule(0, this.I.getId());
        layoutParams4.addRule(3, this.J.getId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i8, i9);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.addRule(1, this.I.getId());
        layoutParams5.addRule(3, this.J.getId());
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(i7, -2);
        layoutParams6.setMargins(i10, 0, i10, i11);
        layoutParams6.addRule(14);
        layoutParams6.addRule(3, this.I.getId());
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(i2, i12);
        layoutParams7.setMargins(0, i13, 0, 0);
        layoutParams7.addRule(14);
        layoutParams7.addRule(3, this.I.getId());
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(i2, i12);
        layoutParams8.setMargins(0, i13, 0, 0);
        layoutParams8.addRule(14);
        layoutParams8.addRule(3, this.N.getId());
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(i, i);
        layoutParams9.setMargins(0, i14, i14, 0);
        layoutParams9.addRule(10);
        layoutParams9.addRule(11);
        this.H.setLayoutParams(layoutParams);
        this.J.setLayoutParams(layoutParams2);
        this.I.setLayoutParams(layoutParams3);
        this.K.setLayoutParams(layoutParams4);
        this.L.setLayoutParams(layoutParams5);
        this.N.setLayoutParams(layoutParams7);
        this.O.setLayoutParams(layoutParams8);
        //this.M.setLayoutParams(layoutParams9);
        this.H.addView(this.J);
        this.H.addView(this.I);
        this.H.addView(this.K);
        this.H.addView(this.L);
        this.H.addView(this.N);
        this.H.addView(this.O);
        //this.H.addView(this.M);
        this.n.addView(this.H);
    }

    public void r() {
        Log.d("MainActivity", "void r()");
        this.R1= new i(getBaseContext(), 4, this);
        this.S = new i(getBaseContext(), 5, this);
        this.T = new i(getBaseContext(), 6, this);
        this.U = new i(getBaseContext(), 8, this);
        this.V = new i(getBaseContext(), 3, this);
        if (B > 1.4d) {
            int ceil = ((float) A) / this.m.density > 720.0f ? (int) Math.ceil((double) (90.0f * this.m.density)) : (int) Math.ceil((double) (50.0f * this.m.density));
            int i = A - ceil;
            Log.i("height", A + "");
            Log.i("margin", ceil + "");
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, i);
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i);
            LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i);
            LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, i);
            /*if (!this.ah.booleanValue()) {
                this.X = (AdView) this.n.findViewById(2131492959);
                this.X.a(new com.google.android.gms.ads.c.a().a());
            }*/
            this.R1.setLayoutParams(layoutParams);
            this.S.setLayoutParams(layoutParams2);
            this.T.setLayoutParams(layoutParams3);
            this.U.setLayoutParams(layoutParams4);
            this.V.setLayoutParams(layoutParams5);
        }
        this.n.addView(this.R1);
        this.n.addView(this.S);
        this.n.addView(this.T);
        this.n.addView(this.U);
        this.n.addView(this.V);
        this.R1.setVisibility(View.GONE);
        this.S.setVisibility(View.GONE);
        this.T.setVisibility(View.GONE);
        this.U.setVisibility(View.GONE);
        this.V.setVisibility(View.GONE);
    }

    public void s() {
        this.o = 0;
        this.H.setVisibility(View.VISIBLE);
        if (this.P != null) {
            this.P.setVisibility(View.VISIBLE);
        }
        this.W.setVisibility(View.GONE);
       /* if (this.X != null) {
            this.X.setVisibility(8);
        }*/
    }

    public void t() {
        this.o = 1;
        b("view" + this.t);
        this.H.setVisibility(View.GONE);
        if (this.P != null) {
            this.P.setVisibility(View.GONE);
        }
        this.W.setVisibility(View.VISIBLE);
        /*if (this.X != null) {
            this.X.setVisibility(0);
        }*/
        this.W.a();
        y();
    }

    public int u() {
        Log.d("MainActivity", "int u()");
        this.t = PreferenceManager.getDefaultSharedPreferences(this).getInt("view_type", 4);
        return this.t;
    }

    public void v() {
        Log.d("MainActivity", "void v()");
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putInt("view_type", this.t);
        edit.commit();
    }

    public int w() {
        Log.d("MainActivity", "int w()");
        this.ad = getSharedPreferences("SCORE", 0);
        return this.ad.getInt("RATE_TYPE", 0);
    }

    public int x() {
        Log.d("MainActivity", "int x()");
        this.ad = getSharedPreferences("SCORE", 0);
        return this.ad.getInt("PLAY_COUNT", 0);
    }

    public void y() {
        Log.d("MainActivity", "void y()");
        this.ad = getSharedPreferences("SCORE", 0);
        Editor edit = this.ad.edit();
        edit.putInt("PLAY_COUNT", x() + 1);
        edit.commit();
    }

    public void z() {
        Log.d("MainActivity", "void z()");
        int i = (z * 5) / 36;
        int i2 = i * 6;
        int i3 = i * 5;
        int i4 = i2 / 2;
        this.af = i2;
        this.Q = new Dialog(this);
        this.Q.requestWindowFeature(1);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.endpromo_dialog, null);
        ImageView imageView = new ImageView(this);
        imageView.setId(Integer.valueOf(100).intValue());
        imageView.setPadding(0, 0, 0, 0);
        imageView.setImageBitmap(a.v);
        imageView.setOnClickListener(new View.OnClickListener() {
            /* synthetic */ MainActivity a;

            public void onClick(View view) {
                this.a.C();
                this.a.finish();
            }
        });
        ImageView imageView2 = new ImageView(this);
        imageView2.setId(Integer.valueOf(android.support.v7.appcompat.R.styleable.AppCompatTheme_autoCompleteTextViewStyle).intValue());
        imageView2.setPadding(0, 0, 0, 0);
        imageView2.setImageBitmap(a.u);
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* synthetic */ MainActivity a;

            public void onClick(View view) {
                this.a.c(1);
                this.a.finish();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(a.s.toString()));//
                this.a.startActivity(intent);
            }
        });
        ImageView imageView3 = new ImageView(this);
        imageView3.setId(Integer.valueOf(android.support.v7.appcompat.R.styleable.AppCompatTheme_buttonStyle).intValue());
        imageView3.setImageBitmap(a.t);
        imageView3.setOnClickListener(new View.OnClickListener() {
            /* synthetic */ MainActivity a;

            public void onClick(View view) {
                this.a.c(1);
                this.a.finish();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(a.s.toString()));
                this.a.startActivity(intent);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i3);
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, i);
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams2.addRule(3, imageView3.getId());
        layoutParams2.addRule(9);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i4, i);
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.addRule(3, imageView3.getId());
        layoutParams3.addRule(1, imageView.getId());
        imageView3.setLayoutParams(layoutParams);
        imageView.setLayoutParams(layoutParams2);
        imageView2.setLayoutParams(layoutParams3);
        viewGroup.addView(imageView3);
        viewGroup.addView(imageView);
        viewGroup.addView(imageView2);
        this.Q.setContentView(viewGroup);
        this.Q.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }
}
