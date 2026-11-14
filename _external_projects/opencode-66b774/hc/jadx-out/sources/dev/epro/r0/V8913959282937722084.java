package dev.epro.r0;

import ads_mobile_sdk.a63;
import ads_mobile_sdk.cm1;
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
public final /* synthetic */ class V8913959282937722084 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ A4779768452142520513 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ V8913959282937722084(A4779768452142520513 a4779768452142520513, Context context, String str, View view, Activity activity, byte b) {
        this.a = b;
        this.b = a4779768452142520513;
        this.c = context;
        this.d = str;
        this.e = view;
        this.f = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strA;
        switch (this.a) {
            case 0:
                final a63 a63Var = (a63) this.b;
                final Context context = this.c;
                final String str = this.d;
                final View view = this.e;
                final Activity activity = this.f;
                final HashMap map = new HashMap();
                final byte b = 0;
                a63Var.h.a(yk0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: dev.epro.r0.Q3306456746093108235
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        String str2 = str;
                        Activity activity2 = activity;
                        View view2 = view;
                        Context context2 = context;
                        HashMap map2 = map;
                        a63 a63Var2 = a63Var;
                        switch (b2) {
                            case 0:
                                ub3 ub3Var = a63Var2.g;
                                ub3Var.getClass();
                                HashMap map3 = new HashMap();
                                Iterator it = ub3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((S1392253949846343516) it.next()).a(map3, context2, view2);
                                }
                                map2.putAll(map3);
                                a63Var2.m0a(map2);
                                map2.put("f", "v");
                                map2.put("ctx", context2);
                                map2.put("view", view2);
                                map2.put("act", activity2);
                                map2.put("bds", str2);
                                break;
                            default:
                                ub3 ub3Var2 = a63Var2.g;
                                ub3Var2.getClass();
                                HashMap map4 = new HashMap();
                                Iterator it2 = ub3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((S1392253949846343516) it2.next()).b(map4);
                                }
                                map2.putAll(map4);
                                a63Var2.m0a(map2);
                                map2.put("f", "c");
                                map2.put("ctx", context2);
                                map2.put("view", view2);
                                map2.put("act", activity2);
                                map2.put("bds", str2);
                                break;
                        }
                    }
                });
                String strA2 = a63Var.a(map);
                map.clear();
                return strA2;
            case 1:
                final a63 a63Var2 = (a63) this.b;
                final Context context2 = this.c;
                final String str2 = this.d;
                final View view2 = this.e;
                final Activity activity2 = this.f;
                final HashMap map2 = new HashMap();
                final byte b2 = 1;
                a63Var2.h.a(yk0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: dev.epro.r0.Q3306456746093108235
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        String str22 = str2;
                        Activity activity22 = activity2;
                        View view22 = view2;
                        Context context22 = context2;
                        HashMap map22 = map2;
                        a63 a63Var22 = a63Var2;
                        switch (b22) {
                            case 0:
                                ub3 ub3Var = a63Var22.g;
                                ub3Var.getClass();
                                HashMap map3 = new HashMap();
                                Iterator it = ub3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((S1392253949846343516) it.next()).a(map3, context22, view22);
                                }
                                map22.putAll(map3);
                                a63Var22.m0a(map22);
                                map22.put("f", "v");
                                map22.put("ctx", context22);
                                map22.put("view", view22);
                                map22.put("act", activity22);
                                map22.put("bds", str22);
                                break;
                            default:
                                ub3 ub3Var2 = a63Var22.g;
                                ub3Var2.getClass();
                                HashMap map4 = new HashMap();
                                Iterator it2 = ub3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((S1392253949846343516) it2.next()).b(map4);
                                }
                                map22.putAll(map4);
                                a63Var22.m0a(map22);
                                map22.put("f", "c");
                                map22.put("ctx", context22);
                                map22.put("view", view22);
                                map22.put("act", activity22);
                                map22.put("bds", str22);
                                break;
                        }
                    }
                });
                String strA3 = a63Var2.a(map2);
                map2.clear();
                return strA3;
            default:
                w53 w53Var = (w53) this.b;
                Context context3 = this.c;
                String str3 = this.d;
                View view3 = this.e;
                Activity activity3 = this.f;
                cm1 cm1VarA = w53Var.a.a();
                if (cm1VarA == null) {
                    w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (cm1VarA) {
                    try {
                        wi0 wi0Var = cm1VarA.b;
                        ub3 ub3Var = wi0Var.b;
                        ub3Var.getClass();
                        HashMap map3 = new HashMap();
                        Iterator it = ub3Var.a.iterator();
                        while (it.hasNext()) {
                            ((S1392253949846343516) it.next()).b(map3);
                        }
                        wi0Var.a(map3);
                        map3.put("f", "c");
                        map3.put("ctx", context3);
                        map3.put("cs", str3);
                        map3.put("aid", null);
                        map3.put("view", view3);
                        map3.put("act", activity3);
                        byte[] bArrA = cm1VarA.a(map3);
                        if (cm1VarA.d) {
                            map3.clear();
                        }
                        strA = cm1.a(bArrA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (strA != null) {
                    return strA;
                }
                w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_CLICK_SIGNALS);
                return "";
        }
    }
}
