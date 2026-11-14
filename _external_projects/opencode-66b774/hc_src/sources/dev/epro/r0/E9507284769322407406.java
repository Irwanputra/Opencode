package dev.epro.r0;

import ads_mobile_sdk.a63;
import ads_mobile_sdk.cm1;
import ads_mobile_sdk.fm0;
import ads_mobile_sdk.rp1;
import ads_mobile_sdk.ub3;
import ads_mobile_sdk.v73;
import ads_mobile_sdk.w53;
import ads_mobile_sdk.wi0;
import ads_mobile_sdk.yk0;
import ads_mobile_sdk.z93;
import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class E9507284769322407406 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ E9507284769322407406(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String a;
        switch (this.a) {
            case 0:
                Y8203071358079267502 y8203071358079267502 = Y8203071358079267502.a;
                X12113469389570258392 x12113469389570258392 = (X12113469389570258392) this.b;
                H1239233717680269921 h1239233717680269921 = (H1239233717680269921) this.c;
                String str = h1239233717680269921.c;
                R6421434650946170247 r6421434650946170247 = h1239233717680269921.h;
                L16425900549479658727 l16425900549479658727 = h1239233717680269921.a;
                boolean z = true;
                boolean z2 = false;
                if (x12113469389570258392 instanceof L18315800671553487900) {
                    R10975805389692362869 r10975805389692362869 = ((L18315800671553487900) x12113469389570258392).a;
                    Y8203071358079267502 a2 = r6421434650946170247.a(str);
                    Z16582172441672663350 w = h1239233717680269921.g.w();
                    w.getClass();
                    G16660188620551127941.E(w.a, false, true, new O3126593184193694660(str, (byte) 3));
                    if (a2 != null) {
                        if (a2 == Y8203071358079267502.b) {
                            if (r10975805389692362869 instanceof R13606847544478402433) {
                                int i = I15319306796992343861.a;
                                B14824868959299866349.n().getClass();
                                if (l16425900549479658727.c()) {
                                    h1239233717680269921.b();
                                } else {
                                    r6421434650946170247.f(Y8203071358079267502.c, str);
                                    Z4023314114778119473 z4023314114778119473 = ((R13606847544478402433) r10975805389692362869).a;
                                    z4023314114778119473.getClass();
                                    G16660188620551127941.E(r6421434650946170247.a, false, true, new Y14986451238933639207(z4023314114778119473, str, (byte) 20));
                                    long currentTimeMillis = System.currentTimeMillis();
                                    I16138585026445501844 i16138585026445501844 = h1239233717680269921.i;
                                    for (String str2 : i16138585026445501844.a(str)) {
                                        if (r6421434650946170247.a(str2) == Y8203071358079267502.e && ((Boolean) G16660188620551127941.E(i16138585026445501844.a, true, false, new V1772710875189249092(str2, (byte) 12))).booleanValue()) {
                                            int i2 = I15319306796992343861.a;
                                            B14824868959299866349.n().getClass();
                                            r6421434650946170247.f(y8203071358079267502, str2);
                                            r6421434650946170247.e(currentTimeMillis, str2);
                                        }
                                    }
                                }
                            } else if (r10975805389692362869 instanceof B2490497281198466065) {
                                int i3 = I15319306796992343861.a;
                                B14824868959299866349.n().getClass();
                                h1239233717680269921.a(-256);
                                z2 = z;
                            } else {
                                int i4 = I15319306796992343861.a;
                                B14824868959299866349.n().getClass();
                                if (l16425900549479658727.c()) {
                                    h1239233717680269921.b();
                                } else {
                                    h1239233717680269921.d(r10975805389692362869);
                                }
                            }
                        } else if (!a2.a()) {
                            h1239233717680269921.a(-512);
                            z2 = z;
                        }
                    }
                    z = false;
                    z2 = z;
                } else if (x12113469389570258392 instanceof F8175081547451543538) {
                    R10975805389692362869 r109758053896923628692 = ((F8175081547451543538) x12113469389570258392).a;
                    int i5 = I15319306796992343861.a;
                    B14824868959299866349.n().getClass();
                    if (l16425900549479658727.c()) {
                        h1239233717680269921.b();
                    } else {
                        h1239233717680269921.d(r109758053896923628692);
                    }
                } else {
                    if (!(x12113469389570258392 instanceof W6302889252315264486)) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    int i6 = ((W6302889252315264486) x12113469389570258392).a;
                    if (S10823041268949770285.t(l16425900549479658727.y, Boolean.TRUE)) {
                        int i7 = I15319306796992343861.a;
                        B14824868959299866349.n().getClass();
                        h1239233717680269921.a(i6);
                    } else {
                        Y8203071358079267502 a3 = r6421434650946170247.a(str);
                        if (a3 == null || a3.a()) {
                            int i8 = I15319306796992343861.a;
                            B14824868959299866349 n = B14824868959299866349.n();
                            Objects.toString(a3);
                            n.getClass();
                            z = false;
                        } else {
                            int i9 = I15319306796992343861.a;
                            B14824868959299866349 n2 = B14824868959299866349.n();
                            a3.toString();
                            n2.getClass();
                            r6421434650946170247.f(y8203071358079267502, str);
                            r6421434650946170247.g(i6, str);
                            r6421434650946170247.c(-1L, str);
                        }
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 1:
                a63 a63Var = (a63) this.b;
                Context context = (Context) this.c;
                HashMap hashMap = new HashMap();
                a63Var.h.a(yk0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new E138661690457992157(a63Var, hashMap, context, (byte) 11));
                String a4 = a63Var.a(hashMap);
                hashMap.clear();
                return a4;
            case 2:
                fm0 fm0Var = (fm0) this.b;
                Object obj = this.c;
                synchronized (fm0Var) {
                    E686369837194379706.p(fm0Var.a);
                    File file = new File(fm0Var.a.getParent(), fm0Var.a.getName() + ".temp");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fm0Var.c.a(obj, fileOutputStream);
                            fileOutputStream.close();
                            if (!file.renameTo(fm0Var.a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        file.delete();
                        throw e;
                    }
                }
                return null;
            case 3:
                rp1 rp1Var = (rp1) this.b;
                v73 v73Var = (v73) this.c;
                DexClassLoader dexClassLoader = rp1Var.l;
                z93 z93Var = rp1Var.d;
                byte[] bArr = rp1Var.k;
                String str3 = v73Var.a;
                String str4 = v73Var.b;
                Class<?>[] clsArr = v73Var.c;
                try {
                    z93Var.getClass();
                    byte[] a5 = z93.a(str3, bArr);
                    Charset charset = z93.a;
                    return dexClassLoader.loadClass(new String(a5, charset)).getMethod(new String(z93.a(str4, bArr), charset), clsArr);
                } catch (X17419789831805662092 | ClassNotFoundException | NoSuchMethodException | NullPointerException e2) {
                    throw new IllegalStateException(e2);
                }
            default:
                w53 w53Var = (w53) this.b;
                Context context2 = (Context) this.c;
                cm1 a6 = w53Var.a.a();
                if (a6 == null) {
                    w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (a6) {
                    try {
                        wi0 wi0Var = a6.b;
                        ub3 ub3Var = wi0Var.b;
                        ub3Var.getClass();
                        HashMap hashMap2 = new HashMap();
                        Iterator it = ub3Var.a.iterator();
                        while (it.hasNext()) {
                            ((S1392253949846343516) it.next()).a(hashMap2);
                        }
                        wi0Var.a(hashMap2);
                        hashMap2.put("f", "q");
                        hashMap2.put("ctx", context2);
                        hashMap2.put("aid", null);
                        byte[] a7 = a6.a(hashMap2);
                        if (a6.d) {
                            hashMap2.clear();
                        }
                        a = cm1.a(a7);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (a != null) {
                    return a;
                }
                w53Var.d.b(yk0.EVENT_ID_DG_ENGINE_NULL_QUERY_SIGNALS);
                return "";
        }
    }
}
