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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        String a;
        switch (this.a) {
            case 0:
                final a63 a63Var = (a63) this.b;
                final Context context = this.c;
                final String str = this.d;
                final View view = this.e;
                final Activity activity = this.f;
                final HashMap hashMap = new HashMap();
                final byte b = 0;
                a63Var.h.a(yk0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: dev.epro.r0.Q3306456746093108235
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        String str2 = str;
                        Activity activity2 = activity;
                        View view2 = view;
                        Context context2 = context;
                        HashMap hashMap2 = hashMap;
                        a63 a63Var2 = a63Var;
                        switch (b2) {
                            case 0:
                                ub3 ub3Var = a63Var2.g;
                                ub3Var.getClass();
                                HashMap hashMap3 = new HashMap();
                                Iterator it = ub3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((S1392253949846343516) it.next()).a(hashMap3, context2, view2);
                                }
                                hashMap2.putAll(hashMap3);
                                a63Var2.m0a(hashMap2);
                                hashMap2.put("f", "v");
                                hashMap2.put("ctx", context2);
                                hashMap2.put("view", view2);
                                hashMap2.put("act", activity2);
                                hashMap2.put("bds", str2);
                                break;
                            default:
                                ub3 ub3Var2 = a63Var2.g;
                                ub3Var2.getClass();
                                HashMap hashMap4 = new HashMap();
                                Iterator it2 = ub3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((S1392253949846343516) it2.next()).b(hashMap4);
                                }
                                hashMap2.putAll(hashMap4);
                                a63Var2.m0a(hashMap2);
                                hashMap2.put("f", "c");
                                hashMap2.put("ctx", context2);
                                hashMap2.put("view", view2);
                                hashMap2.put("act", activity2);
                                hashMap2.put("bds", str2);
                                break;
                        }
                    }
                });
                String a2 = a63Var.a(hashMap);
                hashMap.clear();
                return a2;
            case 1:
                final a63 a63Var2 = (a63) this.b;
                final Context context2 = this.c;
                final String str2 = this.d;
                final View view2 = this.e;
                final Activity activity2 = this.f;
                final HashMap hashMap2 = new HashMap();
                final byte b2 = 1;
                a63Var2.h.a(yk0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: dev.epro.r0.Q3306456746093108235
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        String str22 = str2;
                        Activity activity22 = activity2;
                        View view22 = view2;
                        Context context22 = context2;
                        HashMap hashMap22 = hashMap2;
                        a63 a63Var22 = a63Var2;
                        switch (b22) {
                            case 0:
                                ub3 ub3Var = a63Var22.g;
                                ub3Var.getClass();
                                HashMap hashMap3 = new HashMap();
                                Iterator it = ub3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((S1392253949846343516) it.next()).a(hashMap3, context22, view22);
                                }
                                hashMap22.putAll(hashMap3);
                                a63Var22.m0a(hashMap22);
                                hashMap22.put("f", "v");
                                hashMap22.put("ctx", context22);
                                hashMap22.put("view", view22);
                                hashMap22.put("act", activity22);
                                hashMap22.put("bds", str22);
                                break;
                            default:
                                ub3 ub3Var2 = a63Var22.g;
                                ub3Var2.getClass();
                                HashMap hashMap4 = new HashMap();
                                Iterator it2 = ub3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((S1392253949846343516) it2.next()).b(hashMap4);
                                }
                                hashMap22.putAll(hashMap4);
                                a63Var22.m0a(hashMap22);
                                hashMap22.put("f", "c");
                                hashMap22.put("ctx", context22);
                                hashMap22.put("view", view22);
                                hashMap22.put("act", activity22);
                                hashMap22.put("bds", str22);
                                break;
                        }
                    }
                });
                String a3 = a63Var2.a(hashMap2);
                hashMap2.clear();
                return a3;
            default:
                w53 w53Var = (w53) this.b;
                Context context3 = this.c;
                String str3 = this.d;
                View view3 = this.e;
                Activity activity3 = this.f;
                cm1 a4 = w53Var.a.a();
                if (a4 == null) {
                    w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (a4) {
                    try {
                        wi0 wi0Var = a4.b;
                        ub3 ub3Var = wi0Var.b;
                        ub3Var.getClass();
                        HashMap hashMap3 = new HashMap();
                        Iterator it = ub3Var.a.iterator();
                        while (it.hasNext()) {
                            ((S1392253949846343516) it.next()).b(hashMap3);
                        }
                        wi0Var.a(hashMap3);
                        hashMap3.put("f", "c");
                        hashMap3.put("ctx", context3);
                        hashMap3.put("cs", str3);
                        hashMap3.put("aid", null);
                        hashMap3.put("view", view3);
                        hashMap3.put("act", activity3);
                        byte[] a5 = a4.a(hashMap3);
                        if (a4.d) {
                            hashMap3.clear();
                        }
                        a = cm1.a(a5);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a != null) {
                    return a;
                }
                w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_CLICK_SIGNALS);
                return "";
        }
    }
}
