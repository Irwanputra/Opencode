package p131.p161.p211;

import java.io.IOException;
import java.io.StringWriter;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p214.p215.C2562;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2532 {
    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C2534 c2534 = new C2534(stringWriter);
            c2534.f9887 = true;
            C2562.f9985.mo4533(c2534, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2655 m4538() {
        if (this instanceof C2655) {
            return (C2655) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }
}
