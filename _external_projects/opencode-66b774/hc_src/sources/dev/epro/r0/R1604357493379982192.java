package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R1604357493379982192 {
    public static C10101319439186475078 a(Object obj) {
        Z14368087615735085238 z14368087615735085238 = (Z14368087615735085238) obj;
        C10101319439186475078 c10101319439186475078 = z14368087615735085238.unknownFields;
        if (c10101319439186475078 != C10101319439186475078.f) {
            return c10101319439186475078;
        }
        C10101319439186475078 c = C10101319439186475078.c();
        z14368087615735085238.unknownFields = c;
        return c;
    }

    public static boolean b(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        int i2 = e17564419012940707302.b;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) e17564419012940707302.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            e17564419012940707302.x0(0);
            ((C10101319439186475078) obj).d(i3 << 3, Long.valueOf(h17306840337920354701.j()));
            return true;
        }
        if (i4 == 1) {
            e17564419012940707302.x0(1);
            ((C10101319439186475078) obj).d((i3 << 3) | 1, Long.valueOf(h17306840337920354701.h()));
            return true;
        }
        if (i4 == 2) {
            ((C10101319439186475078) obj).d((i3 << 3) | 2, e17564419012940707302.w());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new N11355818201711573941("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw N11355818201711573941.b();
            }
            e17564419012940707302.x0(5);
            ((C10101319439186475078) obj).d(5 | (i3 << 3), Integer.valueOf(h17306840337920354701.g()));
            return true;
        }
        C10101319439186475078 c = C10101319439186475078.c();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (e17564419012940707302.h() != Integer.MAX_VALUE && b(i7, e17564419012940707302, c)) {
        }
        if (i6 != e17564419012940707302.b) {
            throw new N11355818201711573941("Protocol message end-group tag did not match expected tag.");
        }
        if (c.e) {
            c.e = false;
        }
        ((C10101319439186475078) obj).d(i5 | 3, c);
        return true;
    }
}
