package dev.epro.r0;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U2064221978935652540 {
    public static final /* synthetic */ int c = 0;
    public final E17436120295797655087 a = E17436120295797655087.f();
    public boolean b;

    static {
        new U2064221978935652540(0);
    }

    public U2064221978935652540(int i) {
        a();
        a();
    }

    public static void b(W12822723367527402820 w12822723367527402820, V14641450762532118893 v14641450762532118893, int i, Object obj) {
        if (v14641450762532118893 == V14641450762532118893.d) {
            w12822723367527402820.B(i, 3);
            ((E10304945778167701561) obj).b(w12822723367527402820);
            w12822723367527402820.B(i, 4);
        }
        w12822723367527402820.B(i, v14641450762532118893.b);
        switch (v14641450762532118893.ordinal()) {
            case 0:
                w12822723367527402820.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                w12822723367527402820.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                w12822723367527402820.F(((Long) obj).longValue());
                break;
            case 3:
                w12822723367527402820.F(((Long) obj).longValue());
                break;
            case 4:
                w12822723367527402820.w(((Integer) obj).intValue());
                break;
            case 5:
                w12822723367527402820.u(((Long) obj).longValue());
                break;
            case 6:
                w12822723367527402820.s(((Integer) obj).intValue());
                break;
            case 7:
                w12822723367527402820.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof D8243293650800641817)) {
                    w12822723367527402820.A((String) obj);
                    break;
                } else {
                    w12822723367527402820.q((D8243293650800641817) obj);
                    break;
                }
            case 9:
                ((E10304945778167701561) obj).b(w12822723367527402820);
                break;
            case 10:
                E10304945778167701561 e10304945778167701561 = (E10304945778167701561) obj;
                w12822723367527402820.D(((T3817383632789307090) e10304945778167701561).a(null));
                e10304945778167701561.b(w12822723367527402820);
                break;
            case 11:
                if (!(obj instanceof D8243293650800641817)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    w12822723367527402820.D(length);
                    w12822723367527402820.n(bArr, 0, length);
                    break;
                } else {
                    w12822723367527402820.q((D8243293650800641817) obj);
                    break;
                }
            case 12:
                w12822723367527402820.D(((Integer) obj).intValue());
                break;
            case 13:
                w12822723367527402820.w(((Integer) obj).intValue());
                break;
            case 14:
                w12822723367527402820.s(((Integer) obj).intValue());
                break;
            case 15:
                w12822723367527402820.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                w12822723367527402820.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                w12822723367527402820.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        E17436120295797655087 e17436120295797655087 = this.a;
        int size = e17436120295797655087.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = e17436120295797655087.c(i);
            if (c2.getValue() instanceof T3817383632789307090) {
                T3817383632789307090 t3817383632789307090 = (T3817383632789307090) c2.getValue();
                t3817383632789307090.getClass();
                X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
                x8293765978123339002.getClass();
                x8293765978123339002.a(t3817383632789307090.getClass()).b(t3817383632789307090);
                t3817383632789307090.h();
            }
        }
        if (!e17436120295797655087.c) {
            if (e17436120295797655087.a.size() > 0) {
                e17436120295797655087.c(0).getKey().getClass();
                Z3383101362411723454.s();
                return;
            } else {
                Iterator it = e17436120295797655087.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    Z3383101362411723454.s();
                    return;
                }
            }
        }
        if (!e17436120295797655087.c) {
            e17436120295797655087.b = e17436120295797655087.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e17436120295797655087.b);
            e17436120295797655087.e = e17436120295797655087.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e17436120295797655087.e);
            e17436120295797655087.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        U2064221978935652540 u2064221978935652540 = new U2064221978935652540();
        E17436120295797655087 e17436120295797655087 = this.a;
        if (e17436120295797655087.a.size() > 0) {
            Map.Entry c2 = e17436120295797655087.c(0);
            if (c2.getKey() != null) {
                Z3383101362411723454.s();
                return null;
            }
            c2.getValue();
            throw null;
        }
        Iterator it = e17436120295797655087.d().iterator();
        if (!it.hasNext()) {
            return u2064221978935652540;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            Z3383101362411723454.s();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U2064221978935652540) {
            return this.a.equals(((U2064221978935652540) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public U2064221978935652540() {
    }
}
