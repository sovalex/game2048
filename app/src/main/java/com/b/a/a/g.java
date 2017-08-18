/*
package com.b.a.a;

import org.json.JSONException;
import org.json.JSONObject;

public class g {
    String a;
    String b;
    String c;
    String d;
    long e;
    int f;
    String g;
    String h;
    String i;
    String j;

    public g(String str, String str2, String str3) {
        this.a = str;
        this.i = str2;
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(this.i);
        } catch (JSONException e1) {
            e1.printStackTrace();
        }
        this.b = jSONObject.optString("orderId");
        this.c = jSONObject.optString("packageName");
        this.d = jSONObject.optString("productId");
        this.e = jSONObject.optLong("purchaseTime");
        this.f = jSONObject.optInt("purchaseState");
        this.g = jSONObject.optString("developerPayload");
        this.h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.j = str3;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.h;
    }

    public String toString() {
        return "PurchaseInfo(type:" + this.a + "):" + this.i;
    }
}
*/
