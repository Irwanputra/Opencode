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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        String strA;
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
                cm1 cm1VarA = w53Var.a.a();
                if (cm1VarA == null) {
                    w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (cm1VarA) {
                    try {
                        wi0 wi0Var = cm1VarA.b;
                        ub3 ub3Var = wi0Var.b;
                        Context context2 = wi0Var.a;
                        ub3Var.getClass();
                        HashMap map = new HashMap();
                        Iterator it = ub3Var.a.iterator();
                        while (it.hasNext()) {
                            ((S1392253949846343516) it.next()).a(map, context2, null);
                        }
                        wi0Var.a(map);
                        map.put("f", "v");
                        map.put("ctx", context);
                        map.put("aid", null);
                        map.put("view", view);
                        map.put("act", activity);
                        byte[] bArrA = cm1VarA.a(map);
                        if (cm1VarA.d) {
                            map.clear();
                        }
                        strA = cm1.a(bArrA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (strA != null) {
                    return strA;
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
