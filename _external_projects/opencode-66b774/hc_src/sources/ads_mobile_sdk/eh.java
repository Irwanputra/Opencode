package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.C11752927553109765869;
import dev.epro.r0.G6575252167976303972;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.K182608585094072039;
import dev.epro.r0.O14838623545224379975;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X9852054718446117252;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class eh implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final B8427392651679410143 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ eh(V2597580950516131749 v2597580950516131749, B8427392651679410143 b8427392651679410143, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = b8427392651679410143;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        Map map;
        long j;
        C11752927553109765869 c11752927553109765869;
        switch (this.c) {
            case 0:
                return new dh((ed1) this.a.get(), (J4422749016291691854) ((az1) this.b).get());
            case 1:
                c7 c7Var = (c7) ((ff) this.b).get();
                jr0 jr0Var = (jr0) this.a.get();
                jr0Var.getClass();
                return new x32(c7Var, 2, 2, O14838623545224379975.f(jr0Var, cw0.DEVICE_TIER));
            case 2:
                return new zx1((y2) ((rg0) this.a).get(), (kx2) ((z2) this.b).get());
            case 3:
                ib1 ib1Var = (ib1) ((d6) this.b).get();
                jr0 jr0Var2 = (jr0) this.a.get();
                jr0Var2.getClass();
                return new x32(ib1Var, 2, 2, O14838623545224379975.f(jr0Var2, cw0.DISPLAY_COUNT));
            case 4:
                c7 c7Var2 = (c7) ((da) this.b).get();
                jr0 jr0Var3 = (jr0) this.a.get();
                jr0Var3.getClass();
                return new x32(c7Var2, 2, 2, O14838623545224379975.f(jr0Var3, cw0.INSPECTOR_SIGNAL));
            case 5:
                jr0 jr0Var4 = (jr0) this.a.get();
                c7 c7Var3 = (c7) ((lv) this.b).get();
                jr0Var4.getClass();
                return new x32(c7Var3, 2, 2, O14838623545224379975.f(jr0Var4, cw0.MEMORY));
            case 6:
                G6575252167976303972 g6575252167976303972 = (G6575252167976303972) ((rk) this.b).get();
                jr0 jr0Var5 = (jr0) this.a.get();
                jr0Var5.getClass();
                return new x32(g6575252167976303972, 1, 2, O14838623545224379975.f(jr0Var5, cw0.NATIVE_AD));
            case 7:
                f8 f8Var = (f8) ((g8) this.b).get();
                jr0 jr0Var6 = (jr0) this.a.get();
                jr0Var6.getClass();
                return new x32(f8Var, 1, 1, O14838623545224379975.f(jr0Var6, cw0.AD_SIZE));
            case 8:
                f8 f8Var2 = (f8) ((h0) this.b).get();
                jr0 jr0Var7 = (jr0) this.a.get();
                jr0Var7.getClass();
                return new x32(f8Var2, 2, 2, O14838623545224379975.f(jr0Var7, cw0.RTB_SIGNAL));
            case 9:
                c7 c7Var4 = (c7) ((o7) this.b).get();
                jr0 jr0Var8 = (jr0) this.a.get();
                jr0Var8.getClass();
                return new x32(c7Var4, 1, 2, O14838623545224379975.f(jr0Var8, cw0.AD_SPAM));
            case 10:
                w8 w8Var = (w8) ((b7) this.b).get();
                jr0 jr0Var9 = (jr0) this.a.get();
                jr0Var9.getClass();
                return new x32(w8Var, 1, 1, O14838623545224379975.f(jr0Var9, cw0.AD_TYPE));
            case 11:
                ck ckVar = (ck) this.a.get();
                qw2 qw2Var = (qw2) this.b.get();
                ckVar.getClass();
                qw2Var.getClass();
                synchronized (ckVar.c) {
                    try {
                        if (ckVar.g == null) {
                            ckVar.a.getClass();
                            ckVar.g = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        ckVar.d++;
                        ckVar.e++;
                        String name = qw2Var.name();
                        int intValue = ((Number) ckVar.f.getOrDefault(name, 0)).intValue();
                        jr0 jr0Var10 = ckVar.b;
                        jr0Var10.getClass();
                        if (((Boolean) jr0Var10.a("gads:enable_per_format_prior_requests_signal", Boolean.FALSE, ao.a$11)).booleanValue()) {
                            map = new LinkedHashMap(ckVar.f);
                            map.put(name, Integer.valueOf(intValue));
                        } else {
                            map = X9852054718446117252.a;
                        }
                        Map map2 = map;
                        ckVar.f.put(name, Integer.valueOf(intValue + 1));
                        Long l = ckVar.g;
                        if (l != null) {
                            long longValue = l.longValue();
                            ckVar.a.getClass();
                            j = SystemClock.elapsedRealtime() - longValue;
                        } else {
                            j = 0;
                        }
                        c11752927553109765869 = new C11752927553109765869(String.valueOf(ckVar.d), ckVar.d, ckVar.e, j, map2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c11752927553109765869;
            case 12:
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) ((rg0) this.a).get();
                Map map3 = (Map) this.b.get();
                w5797197595347441198.getClass();
                map3.getClass();
                return new K182608585094072039(w5797197595347441198, map3);
            default:
                ls lsVar = (ls) ((ev) this.b).get();
                jr0 jr0Var11 = (jr0) this.a.get();
                jr0Var11.getClass();
                return new x32(lsVar, 2, 2, O14838623545224379975.f(jr0Var11, cw0.CLD));
        }
    }

    public /* synthetic */ eh(B8427392651679410143 b8427392651679410143, V2597580950516131749 v2597580950516131749, byte b) {
        this.c = b;
        this.b = b8427392651679410143;
        this.a = v2597580950516131749;
    }
}
