package dev.epro.r0;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F12905216483416502853 {
    public static final F12905216483416502853 c = new F12905216483416502853(R9411874267597469228.h1(new ArrayList()), null);
    public final Set a;
    public final M2066880349381062048 b;

    public F12905216483416502853(Set set, M2066880349381062048 m2066880349381062048) {
        this.a = set;
        this.b = m2066880349381062048;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F12905216483416502853)) {
            return false;
        }
        F12905216483416502853 f12905216483416502853 = (F12905216483416502853) obj;
        return f12905216483416502853.a.equals(this.a) && S10823041268949770285.t(f12905216483416502853.b, this.b);
    }

    public final int hashCode() {
        int h = L11610354117192841236.h(this.a, 1517, 41);
        M2066880349381062048 m2066880349381062048 = this.b;
        return h + (m2066880349381062048 != null ? m2066880349381062048.hashCode() : 0);
    }
}
