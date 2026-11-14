package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class g {
    public transient int a;

    public abstract int a(dev.epro.r0.G18207276409179303092 g18207276409179303092);

    public final byte[] a() {
        try {
            int iA = ((ads_mobile_sdk.cu0) this).a((dev.epro.r0.G18207276409179303092) null);
            byte[] bArr = new byte[iA];
            ads_mobile_sdk.vu vuVar = new ads_mobile_sdk.vu(bArr, iA);
            ((ads_mobile_sdk.cu0) this).a(vuVar);
            if (vuVar.b() > 0) {
                throw new java.lang.IllegalStateException("Did not write as much data as expected.");
            }
            if (vuVar.b() >= 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Wrote more data than expected.");
        } catch (java.io.IOException e) {
            dev.epro.r0.Z3383101362411723454.m(dev.epro.r0.G6547577305291411977.s("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final void a(java.io.OutputStream outputStream) {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) this;
        int iA = cu0Var.a((dev.epro.r0.G18207276409179303092) null);
        if (iA > 4096) {
            iA = 4096;
        }
        ads_mobile_sdk.xu xuVar = new ads_mobile_sdk.xu(iA, outputStream);
        cu0Var.a(xuVar);
        int i = xuVar.d;
        if (i > 0) {
            outputStream.write(xuVar.b, 0, i);
            xuVar.d = 0;
        }
    }
}
