package dev.epro.r0;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J17480908745181428642 extends K10678596132709730734 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public J17480908745181428642(O16849885747999394079 o16849885747999394079, H4563649114871566866 h4563649114871566866) {
        this.b = o16849885747999394079;
        this.c = h4563649114871566866;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (d13396727227989475489.H() == 9) {
                    d13396727227989475489.D();
                    return null;
                }
                Collection collection = (Collection) ((H4563649114871566866) obj).c();
                d13396727227989475489.b();
                while (d13396727227989475489.p()) {
                    collection.add(((O16849885747999394079) obj2).c.b(d13396727227989475489));
                }
                d13396727227989475489.g();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objB = ((A13706681545055074315) obj).c.b(d13396727227989475489);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new X13554947934760653097("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + d13396727227989475489.o(true));
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    y14132333989764804283.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((O16849885747999394079) this.b).c(y14132333989764804283, it.next());
                    }
                    y14132333989764804283.g();
                } else {
                    y14132333989764804283.p();
                }
                break;
            default:
                ((A13706681545055074315) this.c).c.c(y14132333989764804283, obj);
                break;
        }
    }

    public J17480908745181428642(A13706681545055074315 a13706681545055074315, Class cls) {
        this.c = a13706681545055074315;
        this.b = cls;
    }
}
