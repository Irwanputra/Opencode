package ads_mobile_sdk;

import dev.epro.r0.H2607093550274855851;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S14769385926647291222;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class iq3 extends c61 {
    public final op3 c;
    public final aw d;
    public final jr0 e;
    public final W5797197595347441198 f;
    public final W5797197595347441198 g;
    public final kz2 h;
    public final rg0 i;
    public final K12714355155332733186 j;
    public final R5692663580087387669 k;
    public final O12494175665883759871 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq3(op3 op3Var, aw awVar, jr0 jr0Var, W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, kz2 kz2Var, rg0 rg0Var, K12714355155332733186 k12714355155332733186) {
        super((wv0) null, 1);
        op3Var.getClass();
        awVar.getClass();
        jr0Var.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        kz2Var.getClass();
        k12714355155332733186.getClass();
        this.c = op3Var;
        this.d = awVar;
        this.e = jr0Var;
        this.f = w5797197595347441198;
        this.g = w57971975953474411982;
        this.h = kz2Var;
        this.i = rg0Var;
        this.j = k12714355155332733186;
        this.k = J8045362843799184672.k();
        this.l = new O12494175665883759871(new H2607093550274855851(this, (byte) 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.iq3 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iq3.a(ads_mobile_sdk.iq3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            jr0 jr0Var = this.e;
            jr0Var.getClass();
            W5797197595347441198 w5797197595347441198 = ((Boolean) jr0Var.a("gads:webview_initialization_executor:enabled", Boolean.FALSE, ao.a$11)).booleanValue() ? this.g : this.f;
            S14769385926647291222 s14769385926647291222 = new S14769385926647291222((Object) this, (R4833348786910499294) null, (byte) 3);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(s14769385926647291222, null, (byte) 1), 2);
        } else {
            this.k.f0();
        }
        return new xu0(O9245300239821758723.a);
    }

    public final Object a(K14749510448791472029 k14749510448791472029) {
        boolean booleanValue = ((Boolean) this.l.getValue()).booleanValue();
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (booleanValue) {
            Object v = this.k.v(k14749510448791472029);
            if (v == z3437138737604933638) {
                return v;
            }
        } else {
            Object b = this.j.b(k14749510448791472029);
            if (b == z3437138737604933638) {
                return b;
            }
        }
        return O9245300239821758723.a;
    }
}
