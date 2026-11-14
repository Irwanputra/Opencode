package ads_mobile_sdk;

import dev.epro.r0.C5867465274389968370;
import dev.epro.r0.G842859980338292746;
import dev.epro.r0.I11613337141824465265;
import dev.epro.r0.I1581330382723795749;
import dev.epro.r0.T15504973625601650233;
import dev.epro.r0.V14323974914327418545;
import dev.epro.r0.X7410747940286448830;
import dev.epro.r0.Z17877815202129479382;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y11 {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final bn0 e;
    public final C5867465274389968370 f;

    public y11(URL url, String str, Map map, byte[] bArr, bn0 bn0Var, C5867465274389968370 c5867465274389968370) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = bn0Var;
        this.f = c5867465274389968370;
    }

    public final G842859980338292746 h() {
        I1581330382723795749 i1581330382723795749 = new I1581330382723795749((byte) 5);
        String string = this.a.toString();
        string.getClass();
        Z17877815202129479382 z17877815202129479382 = new Z17877815202129479382();
        I11613337141824465265 i11613337141824465265B = null;
        z17877815202129479382.c(null, string);
        i1581330382723795749.a = z17877815202129479382.a();
        byte[] bArr = this.d;
        if (bArr != null) {
            int i = I11613337141824465265.d;
            i11613337141824465265B = T15504973625601650233.b(7, null, bArr);
        }
        i1581330382723795749.n(this.b, i11613337141824465265B);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            V14323974914327418545 v14323974914327418545 = (V14323974914327418545) i1581330382723795749.c;
            v14323974914327418545.getClass();
            X7410747940286448830.k(str);
            X7410747940286448830.l(str2, str);
            X7410747940286448830.c(v14323974914327418545, str, str2);
        }
        return new G842859980338292746(i1581330382723795749);
    }

    public final String toString() {
        return "HttpRequest{method=" + this.b + ", url=" + this.a + ", headers=" + this.c + "}";
    }
}
