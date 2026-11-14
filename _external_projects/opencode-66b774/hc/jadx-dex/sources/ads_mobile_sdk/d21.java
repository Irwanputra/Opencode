package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d21 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.O12043144740933444288 a;

    public d21(dev.epro.r0.O12043144740933444288 o12043144740933444288) {
        o12043144740933444288.getClass();
        this.a = o12043144740933444288;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r5, java.util.Map r6, dev.epro.r0.R4833348786910499294 r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof ads_mobile_sdk.c21
            if (r5 == 0) goto L13
            r5 = r7
            ads_mobile_sdk.c21 r5 = (ads_mobile_sdk.c21) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            ads_mobile_sdk.c21 r5 = new ads_mobile_sdk.c21
            r5.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r5.a
            int r0 = r5.c
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L2a
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Exception -> L28
            return r1
        L28:
            r4 = move-exception
            goto L65
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.String r7 = "u"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "URL is missing from an httpTrack GMSG: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5 = 6
            ads_mobile_sdk.zi3.a(r5, r4, r2)
            return r1
        L50:
            dev.epro.r0.O12043144740933444288 r4 = r4.a     // Catch: java.lang.Exception -> L28
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> L28
            r6.<init>(r7)     // Catch: java.lang.Exception -> L28
            r5.c = r3     // Catch: java.lang.Exception -> L28
            r7 = 30
            java.lang.Object r4 = dev.epro.r0.O12043144740933444288.a(r4, r6, r2, r5, r7)     // Catch: java.lang.Exception -> L28
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L64
            return r5
        L64:
            return r1
        L65:
            r5 = 0
            ads_mobile_sdk.zi3.a(r3, r2, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d21.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final int b() {
        return 6;
    }
}
