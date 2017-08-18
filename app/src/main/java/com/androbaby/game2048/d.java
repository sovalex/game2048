/*
package com.androbaby.game2048;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.b.a.a.d.a;
import com.b.a.a.d.b;
import com.b.a.a.d.c;
import com.b.a.a.e;
import com.b.a.a.f;
import com.b.a.a.g;

public class d {
    MainActivity a;
    com.b.a.a.d b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    c i;
    a j;

    public d(final MainActivity mainActivity) {
        this.c = "";
        this.d = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp6ITD87Iwc0aBNkjaQZkgQ6hpRUlhK0sNBiWQyh+5fo28t1V5tJk74bTTu0c8iejxDgH8YKWmstnAx";
        this.e = "SEbtiBTKt/0uQxNGTtFKW2n815YahvJ3tHRBMb7JrMYVazja6BodjEmCReUTYM+6Ec8oGnZZcMNquN3j51ANPz5hlWNH578uUQVT4huDoXUYBLLDFqO54HIq+2k";
        this.f = "A+q5KKBbiSOp/UZPIMK46tGR/aRNG3LNtADJZSG/P316w7LkZ+x6eMmBh1zVUWVMlvIxL3mS/a+xx/GexwoVwOUNELnNdsVcmEm84Aq+HKIqbHpcqofji5TmaIk";
        this.g = "cb8IFvnPVcoA9BwHrwIDAQAB";
        this.h = "no_ad";
        this.i = new c() {
            */
/* synthetic *//*
 com.androbaby.game2048.d a;
           public void a(e eVar, f fVar) {
                Log.i("BillingManager", "Query inventory finished.");
                if (this.a.b != null && !eVar.c()) {
                    Log.i("BillingManager", "Query inventory was successful.");
                    g a = fVar.a(this.a.h);
                    MainActivity mainActivity = this.a.a;
                    boolean z = a != null && this.a.a(a);
                    mainActivity.ah = Boolean.valueOf(z);
                    Log.i("BillingManager", "User is " + (this.a.a.ah.booleanValue() ? "No Ad" : "Ad"));
                    if (this.a.a.ah.booleanValue()) {
                        this.a.a.g();
                        this.a.a.M.setVisibility(View.GONE);
                    }
                }
            }
        };
        this.j = new a() {
            */
/* synthetic *//*
 d a;

            public void a(e eVar, g gVar) {
                Log.i("", "Purchase finished: " + eVar + ", purchase: " + gVar);
                if (this.a.b != null && !eVar.c() && this.a.a(gVar) && gVar.b().equals(this.a.h)) {
                    this.a.a.g();
                    this.a.a.M.setVisibility(View.GONE);
                    Log.i("BillingManager", "Congratulating user for purchase.");
                }
            }
        };
        this.a = mainActivity;
        this.c = this.d + this.e + this.f + this.g;
    }

    public void a() {
        this.b = new com.b.a.a.d(this.a, this.c);
        this.b.a(new b() {
            */
/* synthetic *//*
 d a;

            public void a(e eVar) {
                Log.i("BillingManager", "Setup finished.");
                if (!eVar.b()) {
                    Log.d("Problem", "Problem setting up In-app Billing: " + eVar);
                }
                if (this.a.b != null) {
                    Log.i("BillingManager", "Setup successful");
                    if (!this.a.a.ah.booleanValue()) {
                        Log.i("BillingManager", "Querying inventory.");
                        try {
                            this.a.b.a(this.a.i);
                        } catch (Exception e) {
                            this.a.a.ai = Boolean.valueOf(true);
                            if (this.a.a.M != null) {
                                this.a.a.M.setVisibility(View.GONE);
                            }
                        }
                    }
                }
            }
        });
    }

    public boolean a(int i, int i2, Intent intent) {
        return this.b == null ? false : this.b.a(i, i2, intent);
    }

    boolean a(g gVar) {
        return true;
    }

    public void b() {
        try {
            this.b.a(this.a, this.h, 10001, this.j, "");
        } catch (Exception e) {
            this.a.ai = Boolean.valueOf(true);
            if (this.a.M != null) {
                this.a.M.setVisibility(View.GONE);
            }
        }
    }

    public void c() {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
    }
}
*/
