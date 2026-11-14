package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.C11752927553109765869;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.R6652565090310432558;
import dev.epro.r0.U2595023890546017274;
import dev.epro.r0.V1032539182488810134;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.X7158168662580835393;
import dev.epro.r0.Z14316276734425062790;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class b implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ b(V2597580950516131749 v2597580950516131749, byte b) {
        this.b = b;
        this.a = v2597580950516131749;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.b;
        V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                return new a((vi3) v2597580950516131749.get());
            case 1:
                pr prVar = (pr) v2597580950516131749.get();
                prVar.getClass();
                return new a91(prVar, (byte) 7);
            case 2:
                return new d61(v2597580950516131749, false);
            case 3:
                return new zb3((vi3) v2597580950516131749.get());
            case 4:
                ((O16637889491137121389) v2597580950516131749.get()).getClass();
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 5:
                return new sp3((yp3) v2597580950516131749.get());
            case 6:
                X7158168662580835393 x7158168662580835393 = (X7158168662580835393) v2597580950516131749.get();
                x7158168662580835393.getClass();
                return x7158168662580835393;
            case 7:
                su1 su1Var = (su1) v2597580950516131749.get();
                su1Var.getClass();
                return su1Var;
            case 8:
                return new a1((U2595023890546017274) v2597580950516131749.get());
            case 9:
                return new ag0((xj) v2597580950516131749.get());
            case 10:
                return new ai((g0) v2597580950516131749.get());
            case 11:
                hl hlVar = (hl) v2597580950516131749.get();
                hlVar.getClass();
                return hlVar;
            case 12:
                return new aw((b41) v2597580950516131749.get());
            case 13:
                kt2 kt2Var = (kt2) v2597580950516131749.get();
                kt2Var.getClass();
                return kt2Var;
            case 14:
                return new b00((Q1304841290039450495) v2597580950516131749.get());
            case 15:
                os osVar = (os) v2597580950516131749.get();
                osVar.getClass();
                return new a91(osVar, (byte) 7);
            case 16:
                pz1 pz1Var = (pz1) v2597580950516131749.get();
                pz1Var.getClass();
                return pz1Var;
            case 17:
                return new d61(v2597580950516131749, true);
            case 18:
                DisplayMetrics displayMetrics = ((Context) v2597580950516131749.get()).getResources().getDisplayMetrics();
                Z14316276734425062790.e(displayMetrics);
                return displayMetrics;
            case 19:
                R6652565090310432558 r6652565090310432558 = (R6652565090310432558) v2597580950516131749.get();
                r6652565090310432558.getClass();
                return new a91(r6652565090310432558, (byte) 0);
            case 20:
                gr grVar = (gr) v2597580950516131749.get();
                grVar.getClass();
                return new a91(grVar, (byte) 1);
            case 21:
                C11752927553109765869 c11752927553109765869 = (C11752927553109765869) v2597580950516131749.get();
                c11752927553109765869.getClass();
                return Integer.valueOf(c11752927553109765869.b);
            case 22:
                return new bj3((x12) v2597580950516131749.get());
            case 23:
                kg kgVar = (kg) v2597580950516131749.get();
                kgVar.getClass();
                return new a91(kgVar, (byte) 2);
            case 24:
                ql qlVar = (ql) v2597580950516131749.get();
                qlVar.getClass();
                return qlVar;
            case 25:
                iz2 iz2Var = (iz2) v2597580950516131749.get();
                iz2Var.getClass();
                return iz2Var;
            case 26:
                V1032539182488810134 v1032539182488810134 = (V1032539182488810134) v2597580950516131749.get();
                v1032539182488810134.getClass();
                return new a91(v1032539182488810134, (byte) 7);
            case 27:
                k12 k12Var = (k12) v2597580950516131749.get();
                k12Var.getClass();
                return k12Var;
            case 28:
                return new d61(v2597580950516131749, false);
            default:
                t70 t70Var = (t70) v2597580950516131749.get();
                t70Var.getClass();
                return new a91(t70Var, (byte) 0);
        }
    }
}
