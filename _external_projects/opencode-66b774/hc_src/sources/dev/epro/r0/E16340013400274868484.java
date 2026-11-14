package dev.epro.r0;

import ads_mobile_sdk.a62;
import ads_mobile_sdk.c72;
import ads_mobile_sdk.d62;
import ads_mobile_sdk.ii;
import ads_mobile_sdk.m6;
import ads_mobile_sdk.n6;
import ads_mobile_sdk.o6;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E16340013400274868484 extends a62 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E16340013400274868484(ii iiVar, HashSet hashSet, JSONObject jSONObject, long j, byte b) {
        super(iiVar);
        this.f = b;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.f;
        JSONObject jSONObject = this.d;
        switch (b) {
            case 0:
                break;
            default:
                ii iiVar = this.b;
                if (!c72.c(jSONObject, (JSONObject) iiVar.a)) {
                    iiVar.a = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.a62
    public final void onPostExecute(String str) {
        n6 n6Var;
        byte b = this.f;
        long j = this.e;
        HashSet hashSet = this.c;
        switch (b) {
            case 0:
                n6 n6Var2 = n6.c;
                if (n6Var2 != null) {
                    for (m6 m6Var : Collections.unmodifiableCollection(n6Var2.a)) {
                        if (hashSet.contains(m6Var.g)) {
                            o6 o6Var = m6Var.d;
                            if (j >= o6Var.d && o6Var.c != 3) {
                                o6Var.c = (byte) 3;
                                d62.a.a((WebView) o6Var.b.get(), "setNativeViewHierarchy", str, o6Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (n6Var = n6.c) != null) {
                    for (m6 m6Var2 : Collections.unmodifiableCollection(n6Var.a)) {
                        if (hashSet.contains(m6Var2.g)) {
                            o6 o6Var2 = m6Var2.d;
                            if (j >= o6Var2.d) {
                                o6Var2.c = (byte) 2;
                                d62.a.a((WebView) o6Var2.b.get(), "setNativeViewHierarchy", str, o6Var2.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // ads_mobile_sdk.a62, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
