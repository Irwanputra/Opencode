package dev.epro.r0;

import com.google.android.gms.common.api.Status;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K12477491117444883648 {
    public final Map a;
    public final Map b;

    public K12477491117444883648() {
        this.a = Collections.synchronizedMap(new WeakHashMap());
        this.b = Collections.synchronizedMap(new WeakHashMap());
    }

    public static A1960181136934585864 a() {
        A1960181136934585864 a1960181136934585864 = new A1960181136934585864();
        a1960181136934585864.a = new HashMap();
        a1960181136934585864.b = new HashMap();
        return a1960181136934585864;
    }

    public Object b(S11983430735376301043 s11983430735376301043) throws GeneralSecurityException {
        Object obj = this.a.get(s11983430735376301043);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(s11983430735376301043)));
    }

    public Enum c(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public void d(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                Z3383101362411723454.s();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((M17133811648581684718) entry2.getKey()).a(new X4906216915227203322(status));
            }
        }
    }

    public K12477491117444883648(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }
}
