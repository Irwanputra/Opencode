package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y11 {
    public final java.net.URL a;
    public final java.lang.String b;
    public final java.util.Map c;
    public final byte[] d;
    public final ads_mobile_sdk.bn0 e;
    public final dev.epro.r0.C5867465274389968370 f;

    public y11(java.net.URL url, java.lang.String str, java.util.Map map, byte[] bArr, ads_mobile_sdk.bn0 bn0Var, dev.epro.r0.C5867465274389968370 c5867465274389968370) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = bn0Var;
        this.f = c5867465274389968370;
    }

    public final dev.epro.r0.G842859980338292746 h() {
        dev.epro.r0.I1581330382723795749 i1581330382723795749 = new dev.epro.r0.I1581330382723795749((byte) 5);
        java.lang.String string = this.a.toString();
        string.getClass();
        dev.epro.r0.Z17877815202129479382 z17877815202129479382 = new dev.epro.r0.Z17877815202129479382();
        dev.epro.r0.I11613337141824465265 i11613337141824465265B = null;
        z17877815202129479382.c((dev.epro.r0.P10208541982779414550) null, string);
        i1581330382723795749.a = z17877815202129479382.a();
        byte[] bArr = this.d;
        if (bArr != null) {
            int i = dev.epro.r0.I11613337141824465265.d;
            i11613337141824465265B = dev.epro.r0.T15504973625601650233.b(7, (dev.epro.r0.A459791877761184370) null, bArr);
        }
        i1581330382723795749.n(this.b, i11613337141824465265B);
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            str.getClass();
            str2.getClass();
            dev.epro.r0.V14323974914327418545 v14323974914327418545 = (dev.epro.r0.V14323974914327418545) i1581330382723795749.c;
            v14323974914327418545.getClass();
            dev.epro.r0.X7410747940286448830.k(str);
            dev.epro.r0.X7410747940286448830.l(str2, str);
            dev.epro.r0.X7410747940286448830.c(v14323974914327418545, str, str2);
        }
        return new dev.epro.r0.G842859980338292746(i1581330382723795749);
    }

    public final java.lang.String toString() {
        return "HttpRequest{method=" + this.b + ", url=" + this.a + ", headers=" + this.c + "}";
    }
}
