package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.C5867465274389968370;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.S10973172697741180971;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class x11 {
    public URL a;
    public String b;
    public final LinkedHashMap c;
    public byte[] d;
    public final bn0 e;
    public C5867465274389968370 f;
    public final ArrayList g;

    public x11(y11 y11Var) {
        y11Var.getClass();
        this.b = "GET";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.c = linkedHashMap;
        this.g = new ArrayList();
        this.a = y11Var.a;
        this.b = y11Var.b;
        linkedHashMap.putAll(y11Var.c);
        this.d = y11Var.d;
        this.e = y11Var.e;
        this.f = y11Var.f;
    }

    public final y11 a() {
        URL url;
        URL url2 = this.a;
        if (url2 == null) {
            S10973172697741180971.m("HttpRequest.Builder: URL must be set before calling build()");
            return null;
        }
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            url = url2;
        } else {
            String url3 = url2.toString();
            url3.getClass();
            Uri.Builder buildUpon = Uri.parse(url3).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
                buildUpon.appendQueryParameter((String) h9390398899829886498.a, (String) h9390398899829886498.b);
            }
            url = new URL(buildUpon.build().toString());
        }
        return new y11(url, this.b, E4951175994894594588.z0(this.c), this.d, this.e, this.f);
    }

    public final void b(String str, byte[] bArr) {
        bArr.getClass();
        a("POST", bArr);
        this.c.put("Content-Type", str);
    }

    public final void b(String str, String str2) {
        str2.getClass();
        this.g.add(new H9390398899829886498(str, str2));
    }

    public final void b(String str) {
        str.getClass();
        this.a = new URL(str);
    }

    public x11() {
        this.b = "GET";
        this.c = new LinkedHashMap();
        this.g = new ArrayList();
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = this.c;
        String str3 = (String) linkedHashMap.get(str);
        if (str3 != null) {
            str2 = G6547577305291411977.s(str3, ", ", str2);
        }
        linkedHashMap.put(str, str2);
    }

    public final void a(String str, byte[] bArr) {
        if (str.length() > 0) {
            if (bArr == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH"))) {
                S10973172697741180971.i(G6547577305291411977.s("Method ", str, " must have a request body."));
                return;
            } else {
                this.b = str;
                this.d = bArr;
                return;
            }
        }
        S10973172697741180971.j("HTTP method must not be empty");
    }
}
