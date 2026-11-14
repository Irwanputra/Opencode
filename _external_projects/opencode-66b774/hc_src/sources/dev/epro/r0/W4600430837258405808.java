package dev.epro.r0;

import ads_mobile_sdk.cm1;
import ads_mobile_sdk.oc3;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.ub3;
import ads_mobile_sdk.w53;
import ads_mobile_sdk.wi0;
import ads_mobile_sdk.yk0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class W4600430837258405808 implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ W4600430837258405808(oc3 oc3Var, rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        this.b = oc3Var;
        this.c = rm2Var;
        this.d = bArr;
        this.e = bArr2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String a;
        switch (this.a) {
            case 0:
                oc3 oc3Var = (oc3) this.b;
                oc3Var.a.a((rm2) this.c, (byte[]) this.d, (byte[]) this.e);
                return null;
            default:
                w53 w53Var = (w53) this.b;
                Context context = (Context) this.c;
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                cm1 a2 = w53Var.a.a();
                if (a2 == null) {
                    w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (a2) {
                    try {
                        wi0 wi0Var = a2.b;
                        ub3 ub3Var = wi0Var.b;
                        Context context2 = wi0Var.a;
                        ub3Var.getClass();
                        HashMap hashMap = new HashMap();
                        Iterator it = ub3Var.a.iterator();
                        while (it.hasNext()) {
                            ((S1392253949846343516) it.next()).a(hashMap, context2, null);
                        }
                        wi0Var.a(hashMap);
                        hashMap.put("f", "v");
                        hashMap.put("ctx", context);
                        hashMap.put("aid", null);
                        hashMap.put("view", view);
                        hashMap.put("act", activity);
                        byte[] a3 = a2.a(hashMap);
                        if (a2.d) {
                            hashMap.clear();
                        }
                        a = cm1.a(a3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a != null) {
                    return a;
                }
                w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_VIEW_SIGNALS);
                return "";
        }
    }

    public /* synthetic */ W4600430837258405808(w53 w53Var, Context context, String str, View view, Activity activity) {
        this.b = w53Var;
        this.c = context;
        this.d = view;
        this.e = activity;
    }
}
