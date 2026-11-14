package ads_mobile_sdk;

import ads_mobile_sdk.rm2;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.yk0;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.L15364388172060466559;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.W6764693637816104089;
import java.io.File;
import java.util.ArrayList;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class o3 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final V2597580950516131749 b;
    public final V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ o3(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, V2597580950516131749 v25975809505161317493, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = v25975809505161317493;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.d;
        final byte b2 = 1;
        final byte b3 = 0;
        V2597580950516131749 v2597580950516131749 = this.c;
        V2597580950516131749 v25975809505161317492 = this.b;
        V2597580950516131749 v25975809505161317493 = this.a;
        switch (b) {
            case 0:
                return new n3((xj) v25975809505161317493.get(), (qw2) v25975809505161317492.get(), (hf2) v2597580950516131749.get());
            case 1:
                return new zi1("WAUAhz2k/QWNP4dzFKOEkBF2UwrOirTUtp74DpjfC+Z1z8qTVjT5/vt9JmMfeN7e", "LRSvg6qV9YPz1X3n0+wpbaEZqpPsDphSAdJdHcHGltg=", (V5431423861497278836) v25975809505161317493.get(), (rp1) v25975809505161317492.get(), ((vi3) v2597580950516131749.get()).a(yk0.EVENT_ID_JAILBREAK_SIGNALS_TASK));
            case 2:
                return new b01((W5797197595347441198) v25975809505161317493.get(), (t02) v25975809505161317492.get(), v2597580950516131749);
            case 3:
                return new e23((W5797197595347441198) v25975809505161317493.get(), gj0.a(v25975809505161317492), (O16637889491137121389) v2597580950516131749.get());
            case 4:
                return new hr1((jr0) v25975809505161317493.get(), (K12714355155332733186) v25975809505161317492.get(), (O12043144740933444288) v2597580950516131749.get());
            case 5:
                return new xm2((File) v25975809505161317493.get(), (uo3) v25975809505161317492.get(), (vi3) v2597580950516131749.get());
            case 6:
                return new js1((bq1) v25975809505161317493.get(), (Optional) v25975809505161317492.get(), (W5797197595347441198) v2597580950516131749.get());
            case 7:
                kz2 kz2Var = (kz2) v25975809505161317493.get();
                O16637889491137121389 o16637889491137121389 = (O16637889491137121389) v25975809505161317492.get();
                jr0 jr0Var = (jr0) v2597580950516131749.get();
                kz2Var.getClass();
                o16637889491137121389.getClass();
                jr0Var.getClass();
                d62 d62Var = new d62();
                int intValue = ((Number) jr0Var.a("gads:maximum_query_json_cache_size", (Object) 200, (F4096073349764486348) ao.a$18)).intValue();
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                new H15186625828076266306();
                new zk0(new ArrayList(), intValue);
                return d62Var;
            case 8:
                return new qw1((L15364388172060466559) v25975809505161317493.get(), (mw1) v25975809505161317492.get(), (zy1) v2597580950516131749.get());
            case 9:
                File file = (File) v25975809505161317493.get();
                gm0 gm0Var = (gm0) v25975809505161317492.get();
                final vi3 vi3Var = (vi3) v2597580950516131749.get();
                rm2 q = rm2.q();
                return new fm0(file, gm0Var.a, new c7(q, (byte) 5), new W6764693637816104089() { // from class: dev.epro.r0.J11152666533199988631
                    @Override // dev.epro.r0.W6764693637816104089
                    public final Object apply(Object obj) {
                        byte b4 = b2;
                        vi3 vi3Var2 = vi3Var;
                        switch (b4) {
                            case 0:
                                Throwable th = (Throwable) obj;
                                yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var2.a.a(20308, -1L, th, null);
                                return new byte[0];
                            case 1:
                                Throwable th2 = (Throwable) obj;
                                yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var2.a.a(20307, -1L, th2, null);
                                return rm2.q();
                            default:
                                Throwable th3 = (Throwable) obj;
                                yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var2.a.a(20309, -1L, th3, null);
                                return new byte[0];
                        }
                    }
                });
            case 10:
                File file2 = (File) v25975809505161317493.get();
                gm0 gm0Var2 = (gm0) v25975809505161317492.get();
                final vi3 vi3Var2 = (vi3) v2597580950516131749.get();
                final byte b4 = 2;
                return new fm0(file2, gm0Var2.a, new c(new byte[0], (byte) 1), new W6764693637816104089() { // from class: dev.epro.r0.J11152666533199988631
                    @Override // dev.epro.r0.W6764693637816104089
                    public final Object apply(Object obj) {
                        byte b42 = b4;
                        vi3 vi3Var22 = vi3Var2;
                        switch (b42) {
                            case 0:
                                Throwable th = (Throwable) obj;
                                yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20308, -1L, th, null);
                                return new byte[0];
                            case 1:
                                Throwable th2 = (Throwable) obj;
                                yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20307, -1L, th2, null);
                                return rm2.q();
                            default:
                                Throwable th3 = (Throwable) obj;
                                yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20309, -1L, th3, null);
                                return new byte[0];
                        }
                    }
                });
            case 11:
                return new x43((G8001132634698687269) v25975809505161317493.get(), (jp0) v25975809505161317492.get(), (x12) v2597580950516131749.get());
            case 12:
                File file3 = (File) v25975809505161317493.get();
                gm0 gm0Var3 = (gm0) v25975809505161317492.get();
                final vi3 vi3Var3 = (vi3) v2597580950516131749.get();
                return new fm0(file3, gm0Var3.a, new c(new byte[0], (byte) 1), new W6764693637816104089() { // from class: dev.epro.r0.J11152666533199988631
                    @Override // dev.epro.r0.W6764693637816104089
                    public final Object apply(Object obj) {
                        byte b42 = b3;
                        vi3 vi3Var22 = vi3Var3;
                        switch (b42) {
                            case 0:
                                Throwable th = (Throwable) obj;
                                yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20308, -1L, th, null);
                                return new byte[0];
                            case 1:
                                Throwable th2 = (Throwable) obj;
                                yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20307, -1L, th2, null);
                                return rm2.q();
                            default:
                                Throwable th3 = (Throwable) obj;
                                yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                                vi3Var22.a.a(20309, -1L, th3, null);
                                return new byte[0];
                        }
                    }
                });
            default:
                return new yz0((W5797197595347441198) v25975809505161317493.get(), (jp0) v25975809505161317492.get(), (x12) v2597580950516131749.get());
        }
    }
}
