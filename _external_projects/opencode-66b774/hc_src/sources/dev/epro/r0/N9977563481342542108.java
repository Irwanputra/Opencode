package dev.epro.r0;

import ads_mobile_sdk.g1;
import ads_mobile_sdk.pe2;
import ads_mobile_sdk.ue2;
import ads_mobile_sdk.wk0;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N9977563481342542108 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N9977563481342542108(Object obj, Object obj2, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        int i;
        int i2;
        byte b = this.i;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                ((Y2066038017114788875) obj).g((Z17471428274427141949) obj3, 0, 0, ((G18158803432570020872) obj2).f252o);
                return O9245300239821758723.a;
            case 1:
                g1 g1Var = (g1) obj;
                g1Var.getClass();
                ue2 ue2Var = (ue2) obj2;
                String name = ue2Var.b.name();
                String str = ue2Var.c;
                String str2 = ue2Var.a;
                ((pe2) obj3).getClass();
                return pe2.a(g1Var, name, str, str2);
            default:
                g1 g1Var2 = (g1) obj;
                g1Var2.getClass();
                wk0 wk0Var = (wk0) obj3;
                String str3 = (String) obj2;
                S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var2.n();
                String str4 = wk0Var.a;
                s2322588539201815831.b();
                ((g1) s2322588539201815831.b).d(str4);
                long j = wk0Var.b;
                s2322588539201815831.b();
                g1 g1Var3 = (g1) s2322588539201815831.b;
                i = g1Var3.bitField0_;
                g1Var3.bitField0_ = i | 2;
                g1Var3.versionCode_ = j;
                String str5 = Build.MODEL;
                str5.getClass();
                s2322588539201815831.b();
                ((g1) s2322588539201815831.b).c(str5);
                int i3 = wk0Var.d;
                s2322588539201815831.b();
                g1 g1Var4 = (g1) s2322588539201815831.b;
                i2 = g1Var4.bitField0_;
                g1Var4.bitField0_ = i2 | 8;
                g1Var4.androidApiVersion_ = i3;
                str3.getClass();
                s2322588539201815831.b();
                ((g1) s2322588539201815831.b).b(str3);
                return (g1) s2322588539201815831.a();
        }
    }
}
