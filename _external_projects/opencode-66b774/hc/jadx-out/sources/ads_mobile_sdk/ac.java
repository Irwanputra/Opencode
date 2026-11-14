package ads_mobile_sdk;

import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.K5751602218013079365;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ac implements K4548097313143615345 {
    public final sb a;
    public final List b;

    public ac(jr0 jr0Var, sb sbVar) {
        jr0Var.getClass();
        sbVar.getClass();
        this.a = sbVar;
        this.b = (List) jr0Var.a("gads:logged_adapter_version_classes", K5751602218013079365.V("com.google.ads.mediation.inmobi.InMobiMediationAdapter", "com.google.ads.mediation.imobile.IMobileMediationAdapter", "com.google.ads.mediation.nend.NendMediationAdapter", "com.google.ads.mediation.adcolony.AdColonyMediationAdapter", "com.google.ads.mediation.facebook.FacebookMediationAdapter", "com.google.ads.mediation.mopub.MoPubMediationAdapter", "com.google.ads.mediation.applovin.AppLovinMediationAdapter", "com.google.ads.mediation.tapjoy.TapjoyMediationAdapter", "com.google.ads.mediation.vungle.VungleMediationAdapter", "com.google.ads.mediation.unity.UnityMediationAdapter", "com.google.ads.mediation.chartboost.ChartboostMediationAdapter", "com.google.ads.mediation.mytarget.MyTargetMediationAdapter", "com.google.ads.mediation.maio.MaioMediationAdapter", "com.google.ads.mediation.ironsource.IronSourceMediationAdapter", "com.google.ads.mediation.fyber.FyberMediationAdapter", "com.google.ads.mediation.verizon.VerizonMediationAdapter"), ao.a$3);
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public final cw0 mo19a() {
        return cw0.ADAPTER_VERSIONS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.K4548097313143615345
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.zb
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.zb r0 = (ads_mobile_sdk.zb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.zb r0 = new ads_mobile_sdk.zb
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.util.LinkedHashMap r7 = r0.b
            ads_mobile_sdk.ac r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L67
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L36:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.util.List r8 = r7.b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4e
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            ads_mobile_sdk.yb r8 = new ads_mobile_sdk.yb
            dev.epro.r0.X9852054718446117252 r0 = dev.epro.r0.X9852054718446117252.a
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        L4e:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r0.a = r7
            r0.b = r8
            r0.e = r3
            ads_mobile_sdk.sb r1 = r7.a
            r1.getClass()
            java.lang.Object r0 = ads_mobile_sdk.sb.a$1(r1, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L67
            return r1
        L67:
            java.util.Map r0 = (java.util.Map) r0
            java.util.List r7 = r7.b
            java.util.Iterator r7 = r7.iterator()
        L6f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.get(r1)
            ads_mobile_sdk.ma r3 = (ads_mobile_sdk.ma) r3
            if (r3 == 0) goto L8b
            dev.epro.r0.A10855252310988578378 r3 = r3.a
            java.lang.Object r3 = r3.d
            dev.epro.r0.B10755433227221787048 r3 = (dev.epro.r0.B10755433227221787048) r3
            if (r3 != 0) goto L8d
        L8b:
            dev.epro.r0.B10755433227221787048 r3 = dev.epro.r0.B10755433227221787048.a
        L8d:
            java.lang.Object r4 = r0.get(r1)
            ads_mobile_sdk.ma r4 = (ads_mobile_sdk.ma) r4
            if (r4 == 0) goto L98
            dev.epro.r0.E2617735461520075070 r4 = r4.b
            goto L99
        L98:
            r4 = r2
        L99:
            dev.epro.r0.B10755433227221787048 r5 = dev.epro.r0.B10755433227221787048.c
            if (r3 != r5) goto L6f
            if (r4 == 0) goto L6f
            r8.put(r1, r4)
            goto L6f
        La3:
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            ads_mobile_sdk.yb r0 = new ads_mobile_sdk.yb
            r0.<init>(r8)
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ac.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
