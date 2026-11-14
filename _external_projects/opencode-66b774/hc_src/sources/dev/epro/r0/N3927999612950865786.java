package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N3927999612950865786 {
    public static final N3927999612950865786 b = new N3927999612950865786();
    public final AtomicReference a;

    public N3927999612950865786() {
        A1960181136934585864 a1960181136934585864 = new A1960181136934585864();
        a1960181136934585864.a = new HashMap();
        a1960181136934585864.b = new HashMap();
        this.a = new AtomicReference(new C3286149729114985901(a1960181136934585864));
    }

    public final synchronized void a(O2211401162397821294 o2211401162397821294) {
        A1960181136934585864 a1960181136934585864 = new A1960181136934585864((C3286149729114985901) this.a.get());
        a1960181136934585864.c(o2211401162397821294);
        this.a.set(new C3286149729114985901(a1960181136934585864));
    }

    public final synchronized void b(G153318823017092791 g153318823017092791) {
        Object obj;
        A1960181136934585864 a1960181136934585864 = new A1960181136934585864((C3286149729114985901) this.a.get());
        HashMap hashMap = a1960181136934585864.b;
        switch (g153318823017092791.a) {
            case 0:
                obj = Q18154916179356040156.class;
                break;
            case 1:
                obj = Y7661440305297242229.class;
                break;
            case 2:
                obj = B5876679728636531530.class;
                break;
            case 3:
                obj = W5605385477019102368.class;
                break;
            default:
                obj = A8947685337014270457.class;
                break;
        }
        if (hashMap.containsKey(obj)) {
            G153318823017092791 g1533188230170927912 = (G153318823017092791) hashMap.get(obj);
            if (!g1533188230170927912.equals(g153318823017092791) || !g153318823017092791.equals(g1533188230170927912)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(obj)));
            }
        } else {
            hashMap.put(obj, g153318823017092791);
        }
        this.a.set(new C3286149729114985901(a1960181136934585864));
    }
}
