package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x11 {
    public java.net.URL a;
    public java.lang.String b;
    public final java.util.LinkedHashMap c;
    public byte[] d;
    public final ads_mobile_sdk.bn0 e;
    public dev.epro.r0.C5867465274389968370 f;
    public final java.util.ArrayList g;

    public x11(ads_mobile_sdk.y11 y11Var) {
        y11Var.getClass();
        this.b = "GET";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.c = linkedHashMap;
        this.g = new java.util.ArrayList();
        this.a = y11Var.a;
        this.b = y11Var.b;
        linkedHashMap.putAll(y11Var.c);
        this.d = y11Var.d;
        this.e = y11Var.e;
        this.f = y11Var.f;
    }

    public final ads_mobile_sdk.y11 a() {
        java.net.URL url;
        java.net.URL url2 = this.a;
        if (url2 == null) {
            dev.epro.r0.S10973172697741180971.m("HttpRequest.Builder: URL must be set before calling build()");
            return null;
        }
        java.util.ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            url = url2;
        } else {
            java.lang.String string = url2.toString();
            string.getClass();
            android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(string).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                dev.epro.r0.H9390398899829886498 h9390398899829886498 = (dev.epro.r0.H9390398899829886498) obj;
                builderBuildUpon.appendQueryParameter((java.lang.String) h9390398899829886498.a, (java.lang.String) h9390398899829886498.b);
            }
            url = new java.net.URL(builderBuildUpon.build().toString());
        }
        return new ads_mobile_sdk.y11(url, this.b, dev.epro.r0.E4951175994894594588.z0(this.c), this.d, this.e, this.f);
    }

    public final void b(java.lang.String str, byte[] bArr) {
        bArr.getClass();
        a("POST", bArr);
        this.c.put("Content-Type", str);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        str2.getClass();
        this.g.add(new dev.epro.r0.H9390398899829886498(str, str2));
    }

    public final void b(java.lang.String str) {
        str.getClass();
        this.a = new java.net.URL(str);
    }

    public x11() {
        this.b = "GET";
        this.c = new java.util.LinkedHashMap();
        this.g = new java.util.ArrayList();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        java.util.LinkedHashMap linkedHashMap = this.c;
        java.lang.String str3 = (java.lang.String) linkedHashMap.get(str);
        if (str3 != null) {
            str2 = dev.epro.r0.G6547577305291411977.s(str3, ", ", str2);
        }
        linkedHashMap.put(str, str2);
    }

    public final void a(java.lang.String str, byte[] bArr) {
        if (str.length() > 0) {
            if (bArr == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH"))) {
                dev.epro.r0.S10973172697741180971.i(dev.epro.r0.G6547577305291411977.s("Method ", str, " must have a request body."));
                return;
            } else {
                this.b = str;
                this.d = bArr;
                return;
            }
        }
        dev.epro.r0.S10973172697741180971.j("HTTP method must not be empty");
    }
}
