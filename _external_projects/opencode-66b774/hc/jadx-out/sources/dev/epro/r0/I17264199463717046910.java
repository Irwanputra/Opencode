package dev.epro.r0;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I17264199463717046910 {
    public static final /* synthetic */ int c = 0;
    public final E11030406304573768846 a = new E11030406304573768846();
    public boolean b;

    static {
        new I17264199463717046910(0);
    }

    public I17264199463717046910(int i) {
        a();
        a();
    }

    public static void b(M15366967277392692994 m15366967277392692994, I11511442489993941339 i11511442489993941339, int i, Object obj) throws IOException {
        if (i11511442489993941339 == I11511442489993941339.e) {
            m15366967277392692994.X(i, 3);
            ((L17990604304028499756) obj).a(m15366967277392692994);
            m15366967277392692994.X(i, 4);
            return;
        }
        m15366967277392692994.X(i, i11511442489993941339.b);
        X12005299008365699314 x12005299008365699314 = X12005299008365699314.a;
        switch (i11511442489993941339.ordinal()) {
            case 0:
                m15366967277392692994.T(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                m15366967277392692994.R(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                m15366967277392692994.b0(((Long) obj).longValue());
                break;
            case 3:
                m15366967277392692994.b0(((Long) obj).longValue());
                break;
            case 4:
                m15366967277392692994.V(((Integer) obj).intValue());
                break;
            case 5:
                m15366967277392692994.T(((Long) obj).longValue());
                break;
            case 6:
                m15366967277392692994.R(((Integer) obj).intValue());
                break;
            case 7:
                byte bBooleanValue = ((Boolean) obj).booleanValue();
                if (m15366967277392692994.h == m15366967277392692994.g) {
                    m15366967277392692994.J();
                }
                byte[] bArr = m15366967277392692994.f;
                int i2 = m15366967277392692994.h;
                bArr[i2] = bBooleanValue;
                m15366967277392692994.h = i2 + 1;
                break;
            case 8:
                if (!(obj instanceof A10473301933203002473)) {
                    m15366967277392692994.W((String) obj);
                } else {
                    m15366967277392692994.P((A10473301933203002473) obj);
                }
                break;
            case 9:
                ((L17990604304028499756) obj).a(m15366967277392692994);
                break;
            case 10:
                L17990604304028499756 l17990604304028499756 = (L17990604304028499756) obj;
                m15366967277392692994.Z(l17990604304028499756.c());
                l17990604304028499756.a(m15366967277392692994);
                break;
            case 11:
                if (!(obj instanceof A10473301933203002473)) {
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    m15366967277392692994.Z(length);
                    m15366967277392692994.c0(length, bArr2);
                } else {
                    m15366967277392692994.P((A10473301933203002473) obj);
                }
                break;
            case 12:
                m15366967277392692994.Z(((Integer) obj).intValue());
                break;
            case 13:
                m15366967277392692994.V(((Integer) obj).intValue());
                break;
            case 14:
                m15366967277392692994.R(((Integer) obj).intValue());
                break;
            case 15:
                m15366967277392692994.T(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                m15366967277392692994.Z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                m15366967277392692994.b0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        E11030406304573768846 e11030406304573768846 = this.a;
        int i = e11030406304573768846.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = e11030406304573768846.c(i2).b;
            if (obj instanceof I10827619964430248728) {
                I10827619964430248728 i10827619964430248728 = (I10827619964430248728) obj;
                F13787414490045888232.c.a(i10827619964430248728.getClass()).b(i10827619964430248728);
                i10827619964430248728.j();
            }
        }
        Iterator it = e11030406304573768846.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof I10827619964430248728) {
                I10827619964430248728 i108276199644302487282 = (I10827619964430248728) value;
                F13787414490045888232.c.a(i108276199644302487282.getClass()).b(i108276199644302487282);
                i108276199644302487282.j();
            }
        }
        if (!e11030406304573768846.d) {
            if (e11030406304573768846.b > 0) {
                e11030406304573768846.c(0).a.getClass();
                Z3383101362411723454.s();
                return;
            } else {
                Iterator it2 = e11030406304573768846.a().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    Z3383101362411723454.s();
                    return;
                }
            }
        }
        if (!e11030406304573768846.d) {
            e11030406304573768846.c = e11030406304573768846.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e11030406304573768846.c);
            e11030406304573768846.f = e11030406304573768846.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e11030406304573768846.f);
            e11030406304573768846.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        I17264199463717046910 i17264199463717046910 = new I17264199463717046910();
        E11030406304573768846 e11030406304573768846 = this.a;
        if (e11030406304573768846.b > 0) {
            e11030406304573768846.c(0).a.getClass();
            Z3383101362411723454.s();
            return null;
        }
        Iterator it = e11030406304573768846.a().iterator();
        if (!it.hasNext()) {
            return i17264199463717046910;
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
        if (obj instanceof I17264199463717046910) {
            return this.a.equals(((I17264199463717046910) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public I17264199463717046910() {
    }
}
