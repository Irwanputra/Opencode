package dev.epro.r0;

import java.lang.reflect.InvocationHandler;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.zetetic.database.R;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M10846389789027735899 implements X6460762560403092052, B13906740428466697912, A6527624962738679687, S76089685918653100, C1267176524613794288, P14632082186738269386, W14715101850940949422, B4013457034958673222, R17143752899285419206, J4847702399749976603, L15260231637027815334, SpeculativeLoadingParametersBoundaryInterface {
    public static volatile M10846389789027735899 b;
    public final /* synthetic */ byte a;

    public M10846389789027735899(U193383160337433046 u193383160337433046, T15504973625601650233 t15504973625601650233) {
        this.a = (byte) 21;
    }

    public static F2833317347889062771 c(String str) {
        F2833317347889062771 f2833317347889062771 = new F2833317347889062771(str);
        F2833317347889062771.d.put(str, f2833317347889062771);
        return f2833317347889062771;
    }

    @Override // dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687
    public float a() {
        return 0.0f;
    }

    public synchronized F2833317347889062771 b(String str) {
        F2833317347889062771 f2833317347889062771;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = F2833317347889062771.d;
            f2833317347889062771 = (F2833317347889062771) linkedHashMap.get(str);
            if (f2833317347889062771 == null) {
                f2833317347889062771 = (F2833317347889062771) linkedHashMap.get(Z13168519540281190457.F(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : Z13168519540281190457.F(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (f2833317347889062771 == null) {
                    f2833317347889062771 = new F2833317347889062771(str);
                }
                linkedHashMap.put(str, f2833317347889062771);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2833317347889062771;
    }

    @Override // dev.epro.r0.C1267176524613794288
    public long d(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = I6511330419983954851.a;
            return jFloatToRawIntBits;
        }
        float fR = R7033599853981556291.r(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR)) & 4294967295L);
        int i2 = I6511330419983954851.a;
        return jFloatToRawIntBits2;
    }

    @Override // dev.epro.r0.P14632082186738269386
    public Object e(String str, Provider provider) {
        switch (this.a) {
            case 11:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // dev.epro.r0.B13906740428466697912
    public void f(R8540738700654750557 r8540738700654750557, int i, int[] iArr, F10342546226345611902 f10342546226345611902, int[] iArr2) {
        if (f10342546226345611902 == F10342546226345611902.a) {
            V1475975160983963926.L(i, iArr, iArr2, false);
        } else {
            V1475975160983963926.L(i, iArr, iArr2, true);
        }
    }

    @Override // dev.epro.r0.X6460762560403092052
    public long g(float f) {
        return 0L;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public Map getAdditionalHeaders() {
        return new HashMap();
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public InvocationHandler getNoVarySearchData() {
        return null;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float h() {
        return 0.0f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float i(float f, float f2) {
        return 0.0f;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
        return false;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float j(float f, long j) {
        return 0.0f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float k(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // dev.epro.r0.B4013457034958673222
    public int l() {
        return R.id.view_tree_view_model_store_owner;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.util.List r7, dev.epro.r0.S7454866759162510445 r8, dev.epro.r0.K14749510448791472029 r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof dev.epro.r0.P8408614107071943981
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.P8408614107071943981 r0 = (dev.epro.r0.P8408614107071943981) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.P8408614107071943981 r0 = new dev.epro.r0.P8408614107071943981
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.v
            int r9 = r0.x
            r1 = 0
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r9 == 0) goto L41
            if (r9 == r3) goto L39
            if (r9 != r2) goto L33
            java.util.Iterator r7 = r0.u
            java.io.Serializable r8 = r0.t
            dev.epro.r0.A7209497065939201693 r8 = (dev.epro.r0.A7209497065939201693) r8
            dev.epro.r0.E17665849472693074628.k(r6)     // Catch: java.lang.Throwable -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L7e
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r1
        L39:
            java.io.Serializable r7 = r0.t
            java.util.List r7 = (java.util.List) r7
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L5b
        L41:
            dev.epro.r0.E17665849472693074628.k(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            dev.epro.r0.I5566604416186847280 r9 = new dev.epro.r0.I5566604416186847280
            r5 = 0
            r9.<init>(r7, r6, r1, r5)
            r0.t = r6
            r0.x = r3
            java.lang.Object r7 = r8.a(r9, r0)
            if (r7 != r4) goto L5a
            goto L7d
        L5a:
            r7 = r6
        L5b:
            dev.epro.r0.A7209497065939201693 r6 = new dev.epro.r0.A7209497065939201693
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
            r8 = r6
        L65:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r7.next()
            dev.epro.r0.F4096073349764486348 r6 = (dev.epro.r0.F4096073349764486348) r6
            r0.t = r8     // Catch: java.lang.Throwable -> L31
            r0.u = r7     // Catch: java.lang.Throwable -> L31
            r0.x = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != r4) goto L65
        L7d:
            return r4
        L7e:
            java.lang.Object r9 = r8.a
            if (r9 != 0) goto L85
            r8.a = r6
            goto L65
        L85:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            dev.epro.r0.O8620973563946607355.m(r9, r6)
            goto L65
        L8b:
            java.lang.Object r6 = r8.a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M10846389789027735899.m(java.util.List, dev.epro.r0.S7454866759162510445, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.A6527624962738679687
    public void o(R8540738700654750557 r8540738700654750557, int i, int[] iArr, int[] iArr2) {
        V1475975160983963926.L(i, iArr, iArr2, false);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Arrangement#SpaceEvenly";
            case 28:
                int iHashCode = hashCode();
                M9216324016624295870.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return E12098517352909843120.m("CreationExtras.Key@", string, "<", J17975719213314763068.a(J5715778638296486773.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ M10846389789027735899(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int p(int i) {
        return i;
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int s(int i) {
        return i;
    }
}
