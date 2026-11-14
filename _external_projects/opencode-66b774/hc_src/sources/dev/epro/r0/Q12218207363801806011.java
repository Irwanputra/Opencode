package dev.epro.r0;

import java.util.UUID;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q12218207363801806011 extends J14024120050125738337 {
    public final String b;
    public J1604157424733740866 c;

    public Q12218207363801806011(L13135072960070674001 l13135072960070674001) {
        String str = (String) l13135072960070674001.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            l13135072960070674001.c("SaveableStateHolder_BackStackEntryKey", str);
        }
        this.b = str;
    }

    @Override // dev.epro.r0.J14024120050125738337
    public final void d() {
        J1604157424733740866 j1604157424733740866 = this.c;
        if (j1604157424733740866 == null) {
            S10823041268949770285.b0("saveableStateHolderRef");
            throw null;
        }
        V4145611664959724223 v4145611664959724223 = (V4145611664959724223) j1604157424733740866.a.get();
        if (v4145611664959724223 != null) {
            v4145611664959724223.b(this.b);
        }
        J1604157424733740866 j16041574247337408662 = this.c;
        if (j16041574247337408662 != null) {
            j16041574247337408662.a.clear();
        } else {
            S10823041268949770285.b0("saveableStateHolderRef");
            throw null;
        }
    }
}
