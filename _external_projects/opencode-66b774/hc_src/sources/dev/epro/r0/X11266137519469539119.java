package dev.epro.r0;

import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X11266137519469539119 implements H14594851337895968403 {
    public final S7974369370986781936 a;
    public final H6941026884529629628 b;
    public final AutofillId c;

    public X11266137519469539119(S7974369370986781936 s7974369370986781936, H6941026884529629628 h6941026884529629628) {
        this.a = s7974369370986781936;
        this.b = h6941026884529629628;
        s7974369370986781936.setImportantForAutofill(1);
        Z6787503239643758223 m = E2166724654553415323.m(s7974369370986781936);
        AutofillId b = m != null ? D1067171241640027219.b(m.a) : null;
        if (b == null) {
            throw L11610354117192841236.j("Required value was null.");
        }
        this.c = b;
    }
}
