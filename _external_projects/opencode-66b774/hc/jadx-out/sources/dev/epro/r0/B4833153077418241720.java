package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B4833153077418241720 {
    public static Q11287569198401486162 a(Object obj) {
        T3817383632789307090 t3817383632789307090 = (T3817383632789307090) obj;
        Q11287569198401486162 q11287569198401486162 = t3817383632789307090.unknownFields;
        if (q11287569198401486162 != Q11287569198401486162.f) {
            return q11287569198401486162;
        }
        Q11287569198401486162 q112875691984014861622 = new Q11287569198401486162(0, new int[8], new Object[8], true);
        t3817383632789307090.unknownFields = q112875691984014861622;
        return q112875691984014861622;
    }

    public static boolean b(int i, E17564419012940707302 e17564419012940707302, Object obj) throws A9458650138667563085, J12068242864160501074, Q13606351353383574666 {
        int i2 = e17564419012940707302.b;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) e17564419012940707302.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            e17564419012940707302.x0(0);
            ((Q11287569198401486162) obj).c(i3 << 3, Long.valueOf(f3160751278268780235.s()));
            return true;
        }
        if (i4 == 1) {
            e17564419012940707302.x0(1);
            ((Q11287569198401486162) obj).c((i3 << 3) | 1, Long.valueOf(f3160751278268780235.p()));
            return true;
        }
        if (i4 == 2) {
            ((Q11287569198401486162) obj).c((i3 << 3) | 2, e17564419012940707302.y());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw A9458650138667563085.b();
            }
            e17564419012940707302.x0(5);
            ((Q11287569198401486162) obj).c(5 | (i3 << 3), Integer.valueOf(f3160751278268780235.o()));
            return true;
        }
        Q11287569198401486162 q11287569198401486162 = new Q11287569198401486162(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new A9458650138667563085("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (e17564419012940707302.h() != Integer.MAX_VALUE && b(i7, e17564419012940707302, q11287569198401486162)) {
        }
        if (i6 != e17564419012940707302.b) {
            throw new A9458650138667563085("Protocol message end-group tag did not match expected tag.");
        }
        if (q11287569198401486162.e) {
            q11287569198401486162.e = false;
        }
        ((Q11287569198401486162) obj).c(i5 | 3, q11287569198401486162);
        return true;
    }
}
