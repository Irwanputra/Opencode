package dev.epro.r0;

import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G12738412843435213993 {
    public final F4096073349764486348 a;
    public Object b;
    public M8849337839148886240 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final A4559761392562572984 e = E7125458317232359087.f();
    public final A4559761392562572984 f = new A4559761392562572984();
    public final E13273723708836014930 g = new E13273723708836014930();
    public final D389890677992184566 h = new D389890677992184566(0, new B4739506393801054036[16]);
    public final I16737082536984153748 i = new I16737082536984153748(this, (byte) 1);
    public final A4559761392562572984 l = E7125458317232359087.f();
    public final HashMap m = new HashMap();

    public G12738412843435213993(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12738412843435213993.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, M8849337839148886240 m8849337839148886240) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int c = m8849337839148886240.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = m8849337839148886240.c[c];
        }
        m8849337839148886240.b[c] = obj;
        m8849337839148886240.c[c] = i;
        if ((obj instanceof B4739506393801054036) && i2 != i) {
            Y5595560268505326605 h = ((B4739506393801054036) obj).h();
            this.m.put(obj, h.f);
            M8849337839148886240 m88493378391488862402 = h.e;
            A4559761392562572984 a4559761392562572984 = this.l;
            E7125458317232359087.p(a4559761392562572984, obj);
            Object[] objArr = m88493378391488862402.b;
            long[] jArr = m88493378391488862402.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                O13595511762861117873 o13595511762861117873 = (O13595511762861117873) objArr[(i3 << 3) + i5];
                                if (o13595511762861117873 instanceof Y14161449526678499798) {
                                    ((Y14161449526678499798) o13595511762861117873).f(2);
                                }
                                E7125458317232359087.e(a4559761392562572984, o13595511762861117873, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof Y14161449526678499798) {
                ((Y14161449526678499798) obj).f(2);
            }
            E7125458317232359087.e(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        A4559761392562572984 a4559761392562572984 = this.e;
        E7125458317232359087.o(a4559761392562572984, obj2, obj);
        if (!(obj2 instanceof B4739506393801054036) || a4559761392562572984.c(obj2)) {
            return;
        }
        E7125458317232359087.p(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(dev.epro.r0.J12623741444539852712 r34) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G12738412843435213993.d(dev.epro.r0.J12623741444539852712):void");
    }
}
