package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I17300838719998789664 {
    public static final I17300838719998789664 e;
    public static final I17300838719998789664 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        F2833317347889062771 f2833317347889062771 = F2833317347889062771.r;
        F2833317347889062771 f28333173478890627712 = F2833317347889062771.s;
        F2833317347889062771 f28333173478890627713 = F2833317347889062771.t;
        F2833317347889062771 f28333173478890627714 = F2833317347889062771.l;
        F2833317347889062771 f28333173478890627715 = F2833317347889062771.n;
        F2833317347889062771 f28333173478890627716 = F2833317347889062771.m;
        F2833317347889062771 f28333173478890627717 = F2833317347889062771.f237o;
        F2833317347889062771 f28333173478890627718 = F2833317347889062771.q;
        F2833317347889062771 f28333173478890627719 = F2833317347889062771.p;
        List V = K5751602218013079365.V(f2833317347889062771, f28333173478890627712, f28333173478890627713, f28333173478890627714, f28333173478890627715, f28333173478890627716, f28333173478890627717, f28333173478890627718, f28333173478890627719);
        List V2 = K5751602218013079365.V(f2833317347889062771, f28333173478890627712, f28333173478890627713, f28333173478890627714, f28333173478890627715, f28333173478890627716, f28333173478890627717, f28333173478890627718, f28333173478890627719, F2833317347889062771.j, F2833317347889062771.k, F2833317347889062771.h, F2833317347889062771.i, F2833317347889062771.f, F2833317347889062771.g, F2833317347889062771.e);
        L11462694090053902638 l11462694090053902638 = new L11462694090053902638();
        F2833317347889062771[] f2833317347889062771Arr = (F2833317347889062771[]) V.toArray(new F2833317347889062771[0]);
        l11462694090053902638.b((F2833317347889062771[]) Arrays.copyOf(f2833317347889062771Arr, f2833317347889062771Arr.length));
        K5454855350570310837 k5454855350570310837 = K5454855350570310837.TLS_1_3;
        K5454855350570310837 k54548553505703108372 = K5454855350570310837.TLS_1_2;
        l11462694090053902638.c(k5454855350570310837, k54548553505703108372);
        l11462694090053902638.b = true;
        l11462694090053902638.a();
        L11462694090053902638 l114626940900539026382 = new L11462694090053902638();
        F2833317347889062771[] f2833317347889062771Arr2 = (F2833317347889062771[]) V2.toArray(new F2833317347889062771[0]);
        l114626940900539026382.b((F2833317347889062771[]) Arrays.copyOf(f2833317347889062771Arr2, f2833317347889062771Arr2.length));
        l114626940900539026382.c(k5454855350570310837, k54548553505703108372);
        l114626940900539026382.b = true;
        e = l114626940900539026382.a();
        L11462694090053902638 l114626940900539026383 = new L11462694090053902638();
        F2833317347889062771[] f2833317347889062771Arr3 = (F2833317347889062771[]) V2.toArray(new F2833317347889062771[0]);
        l114626940900539026383.b((F2833317347889062771[]) Arrays.copyOf(f2833317347889062771Arr3, f2833317347889062771Arr3.length));
        l114626940900539026383.c(k5454855350570310837, k54548553505703108372, K5454855350570310837.TLS_1_1, K5454855350570310837.TLS_1_0);
        l114626940900539026383.b = true;
        l114626940900539026383.a();
        f = new I17300838719998789664(false, false, null, null);
    }

    public I17300838719998789664(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = L14928198200995638215.i(strArr, enabledCipherSuites, F2833317347889062771.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = L14928198200995638215.i(enabledProtocols2, strArr2, J16924082299779570240.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        J10770752472956524045 j10770752472956524045 = F2833317347889062771.c;
        byte[] bArr = L14928198200995638215.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (j10770752472956524045.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            S10973172697741180971.j("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            S10973172697741180971.j("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            S10973172697741180971.j("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            S10973172697741180971.j("At least one TLS version is required");
            return;
        }
        I17300838719998789664 i17300838719998789664 = new I17300838719998789664(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (i17300838719998789664.c() != null) {
            sSLSocket.setEnabledProtocols(i17300838719998789664.d);
        }
        if (i17300838719998789664.b() != null) {
            sSLSocket.setEnabledCipherSuites(i17300838719998789664.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(F2833317347889062771.b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            K5454855350570310837.b.getClass();
            arrayList.add(Y2677586711477821327.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I17300838719998789664)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        I17300838719998789664 i17300838719998789664 = (I17300838719998789664) obj;
        boolean z = i17300838719998789664.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, i17300838719998789664.c) && Arrays.equals(this.d, i17300838719998789664.d) && this.b == i17300838719998789664.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
