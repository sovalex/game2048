package com.androbaby.game2048;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class a {
    public static String e;
    public static String f;
    public static String q;
    public static String r;
    public static String s;
    public static Bitmap t;
    public static Bitmap u;
    public static Bitmap v;
    public static int w;
    ImageView A;
    ImageView B;
    ImageView C;
    Handler D;
    Runnable E;
    MainActivity a;
    Bitmap b;
    Bitmap c;
    Bitmap d;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    String n;
    String o;
    String p;
    int x;
    int y;
    int z;

    private class aa extends AsyncTask<Void, Void, Void> {
        /* synthetic */ a a;

        private aa(a aVar) {
            this.a = aVar;
        }

        public aa() {
        }

        protected Void a(Void... voidArr) {
            /*if (this.a.b()) {
                this.a.c();
                this.a.e();
                this.a.d();
                this.a.f();
            }*/
            return null;
        }

        protected void a(Void voidR) {
           /* if (this.a.b()) {
                if (this.a.x > 0) {
                    this.a.b(MainActivity.z / 6);
                    this.a.D.postDelayed(this.a.E, (long) (this.a.z * 1000));
                } else {
                    this.a.a(MainActivity.z / 6);
                }
                if (this.a.a.o > 0) {
                    this.a.a.P.setVisibility(8);
                }
                if (a.w != this.a.a.E()) {
                    this.a.a.D();
                    if (!(a.t == null || a.u == null || a.v == null)) {
                        this.a.a.z();
                    }
                } else if (!(this.a.a.A() != 0 || this.a.a.B() >= 1 || a.t == null || a.u == null || a.v == null)) {
                    this.a.a.z();
                }
                this.a.a.d(a.w);
            }*/
        }

       /* protected *//* synthetic *//* Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }*/

        /*protected *//* synthetic *//* void onPostExecute(Object obj) {
            a((Void) obj);
        }*/

        @Override
        protected Void doInBackground(Void... params) {
            return a((Void[]) params);
        }

        @Override
        protected void onPreExecute() {

        }

        protected void onPostExecute(Void obj) {
            a((Void) obj);
        }
    }

    static {
        q = "com.androbaby.game2048";
    }

    public a(MainActivity mainActivity) {
        Log.d("a","a(MainActivity mainActivity)");
        this.g = "http://www.forumvs.com/android/";
        this.h = "http://www.forumvs.com/android/endDialog/";
        this.i = "game2048_";
        this.j = "game2048_en.txt";
        this.x = 0;
        this.y = 1;
        this.z = 10;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = new Handler();
        this.E = new Runnable() {
            public void run() {
                a.this.c(a.this.y);
                a.this.y = (a.this.y % a.this.x) + 1;
                a.this.D.postDelayed(a.this.E, (long) (a.this.z * 1000));
            }
        };
        this.a = mainActivity;
        // g();
    }

    public static boolean b(String str) {
        Log.d("a","a(MainActivity mainActivity)");
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private InputStream c(String str) {
        Log.d("a","InputStream c(String str)");
        try {
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection instanceof HttpURLConnection) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.connect();
                    return httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : null;
                } catch (Exception e) {
                    throw new IOException("Error connecting");
                }
            }
            throw new IOException("Not an HTTP connection");
        } catch (IOException i) {
            i.printStackTrace();
        }
        return null;
    }

    private Bitmap d(String str) {
        Log.d("a","d(String str)");
        try {
            InputStream c = c(str);
            if (c == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(c);
            c.close();
            return decodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

   /* private void g() {
        try {
            this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            e = "market://details?id=";
            f = "market://search?q=pub:Androbaby";
        } catch (Exception e) {
            e = "http://play.google.com/store/apps/details?id=";
            f = "http://play.google.com/store/search?q=pub:Androbaby";
        }
    }*/

    public void a() {Log.d("a","void a()");
        new aa().execute(new Void[]{null, null, null});
    }

    public void a(int i) {
        Log.d("a","void a(int i)");
        RelativeLayout relativeLayout = (RelativeLayout) this.a.findViewById(R.id.main);
        this.a.P = new RelativeLayout(this.a);
        this.a.P.setPadding(i / 2, 0, i / 2, i / 4);
        ImageView imageView = new ImageView(this.a);
        imageView.setImageBitmap(this.b);
        ImageView imageView2 = new ImageView(this.a);
        imageView2.setImageBitmap(this.c);
        ImageView imageView3 = new ImageView(this.a);
        imageView3.setImageBitmap(this.d);
        imageView.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                a.this.a(a.this.n);
            }
        });
        imageView2.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                a.this.a(a.this.o);
            }
        });
        imageView3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                a.this.a(a.this.p);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (i / 4) + i);
        layoutParams.addRule(12);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i, i);
        layoutParams3.addRule(14);
        layoutParams3.addRule(10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i, i);
        layoutParams4.addRule(10);
        layoutParams4.addRule(11);
        this.a.P.setLayoutParams(layoutParams);
        imageView.setLayoutParams(layoutParams2);
        imageView2.setLayoutParams(layoutParams3);
        imageView3.setLayoutParams(layoutParams4);
        this.a.P.addView(imageView);
        this.a.P.addView(imageView2);
        this.a.P.addView(imageView3);
        relativeLayout.addView(this.a.P);
    }

    public void a(String str) { Log.d("a","a(String str)");
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.a.startActivity(intent);
        } catch (Exception e) {
        }
    }

    public void b(int i) {Log.d("a","void b(int i)");
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = (RelativeLayout) this.a.findViewById(R.id.main);
        this.a.P = new RelativeLayout(this.a);
        this.a.P.setPadding(i / 2, 0, i / 2, i / 4);
        if (this.x > 0) {
            this.A = new ImageView(this.a);
            this.A.setImageBitmap(this.b);
            this.A.setOnClickListener(new OnClickListener() {

                public void onClick(View view) {
                    a.this.a(a.this.n);
                }
            });
            layoutParams = new RelativeLayout.LayoutParams(i * 5, i);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            this.A.setLayoutParams(layoutParams);
        }
        if (this.x > 1) {
            this.B = new ImageView(this.a);
            this.B.setImageBitmap(this.c);
            this.B.setOnClickListener(new OnClickListener() {
                /* synthetic */ a a;
                public void onClick(View view) {
                    this.a.a(this.a.o);
                }
            });
            layoutParams = new RelativeLayout.LayoutParams(i * 5, i);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            this.B.setLayoutParams(layoutParams);
        }
        if (this.x > 2) {
            this.C = new ImageView(this.a);
            this.C.setImageBitmap(this.d);
            this.C.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    a.this.a(a.this.p);
                }
            });
            layoutParams = new RelativeLayout.LayoutParams(i * 5, i);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            this.C.setLayoutParams(layoutParams);
        }
        layoutParams = new RelativeLayout.LayoutParams(-1, (i / 4) + i);
        layoutParams.addRule(12);
        this.a.P.setLayoutParams(layoutParams);
        if (this.A != null) {
            this.a.P.addView(this.A);
            this.A.setVisibility(View.VISIBLE);
        }
        if (this.B != null) {
            this.a.P.addView(this.B);
            this.B.setVisibility(View.GONE);
        }
        if (this.C != null) {
            this.a.P.addView(this.C);
            this.C.setVisibility(View.GONE);
        }
        relativeLayout.addView(this.a.P);
    }

   /* public boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }*/

    public void c() {Log.d("a","c()");
        String str = this.g + (this.i + Locale.getDefault().toString().substring(0, 2) + ".txt");
        if (!b(str)) {
            str = this.g + this.j;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(str).openStream()));
            this.k = bufferedReader.readLine();
            this.l = bufferedReader.readLine();
            this.m = bufferedReader.readLine();
            this.n = e + this.k + "&rdid=" + this.k;
            this.o = e + this.l + "&rdid=" + this.l;
            this.p = e + this.m + "&rdid=" + this.m;
            str = bufferedReader.readLine();
            if (str != null) {
                if (str.equals("1")) {
                    this.x = 1;
                } else if (str.equals("2")) {
                    this.x = 2;
                } else if (str.equals("3")) {
                    this.x = 3;
                }
                if (this.x > 0) {
                    this.z = Integer.parseInt(bufferedReader.readLine());
                    str = bufferedReader.readLine();
                }
                if (str != null && str.equals("0")) {
                    this.n = bufferedReader.readLine();
                    this.o = bufferedReader.readLine();
                    this.p = bufferedReader.readLine();
                }
            }
        } catch (Exception e) {
        }
    }

    public void c(int i) {Log.d("a","c(int i)");
        if (i == 1) {
            if (this.A != null) {
                this.A.setVisibility(View.VISIBLE);
            }
            if (this.B != null) {
                this.B.setVisibility(View.GONE);
            }
            if (this.C != null) {
                this.C.setVisibility(View.GONE);
            }
        } else if (i == 2) {
            if (this.A != null) {
                this.A.setVisibility(View.GONE);
            }
            if (this.B != null) {
                this.B.setVisibility(View.VISIBLE);
            }
            if (this.C != null) {
                this.C.setVisibility(View.GONE);
            }
        } else if (i == 3) {
            if (this.A != null) {
                this.A.setVisibility(View.GONE);
            }
            if (this.B != null) {
                this.B.setVisibility(View.GONE);
            }
            if (this.C != null) {
                this.C.setVisibility(View.VISIBLE);
            }
        }
    }

    public void d() {Log.d("a","d()");
        String str = this.h + (this.i + Locale.getDefault().toString().substring(0, 2) + ".txt");
        if (!b(str)) {
            str = this.h + this.j;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(str).openStream()));
            Random random = new Random();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int parseInt = Integer.parseInt(bufferedReader.readLine());
            if (parseInt == 0) {
                int i;
                w = Integer.parseInt(bufferedReader.readLine());
                bufferedReader.readLine();
                int parseInt2 = Integer.parseInt(bufferedReader.readLine());
                parseInt = parseInt2;
                while (true) {
                    i = parseInt - 1;
                    if (parseInt <= 0) {
                        break;
                    }
                    arrayList.add(bufferedReader.readLine());
                    parseInt = i;
                }
                parseInt = parseInt2;
                while (true) {
                    i = parseInt - 1;
                    if (parseInt > 0) {
                        arrayList2.add(bufferedReader.readLine());
                        parseInt = i;
                    } else {
                        parseInt2 = random.nextInt(parseInt2);
                        str = (String) arrayList.get(parseInt2);
                        r = (String) arrayList2.get(parseInt2);
                        s = str;
                        return;
                    }
                }
            }
            w = parseInt;
            r = bufferedReader.readLine();
            s = e + r;
        } catch (Exception e) {
        }
    }

    public void e() {Log.d("a","e()");
        if (this.k != "") {
            if (this.x == 0) {
                this.b = d(this.g + this.k + ".png");
                this.c = d(this.g + this.l + ".png");
                this.d = d(this.g + this.m + ".png");
            }
            if (this.x > 0) {
                this.b = d(this.g + this.k + "_banner.png");
            }
            if (this.x > 1) {
                this.c = d(this.g + this.l + "_banner.png");
            }
            if (this.x > 2) {
                this.d = d(this.g + this.m + "_banner.png");
            }
        }
    }

    public void f() {Log.d("a","f()");
        if (r != "") {
            t = d(this.h + r + "_main.png");
            v = d(this.h + r + "_no.png");
            u = d(this.h + r + "_yes.png");
        }
    }
}
