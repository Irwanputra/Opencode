package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class D13009265547245150778 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(G6547577305291411977.C("No KMS client does support: ", str));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
