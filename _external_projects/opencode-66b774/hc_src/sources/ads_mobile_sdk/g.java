package ads_mobile_sdk;

import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class g {
    public transient int a;

    public abstract int a(G18207276409179303092 g18207276409179303092);

    public final byte[] a() {
        try {
            int a = ((cu0) this).a((G18207276409179303092) null);
            byte[] bArr = new byte[a];
            vu vuVar = new vu(bArr, a);
            ((cu0) this).a(vuVar);
            if (vuVar.b() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (vuVar.b() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            Z3383101362411723454.m(G6547577305291411977.s("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void a(OutputStream outputStream) {
        cu0 cu0Var = (cu0) this;
        int a = cu0Var.a((G18207276409179303092) null);
        if (a > 4096) {
            a = 4096;
        }
        xu xuVar = new xu(a, outputStream);
        cu0Var.a(xuVar);
        int i = xuVar.d;
        if (i > 0) {
            outputStream.write(xuVar.b, 0, i);
            xuVar.d = 0;
        }
    }
}
