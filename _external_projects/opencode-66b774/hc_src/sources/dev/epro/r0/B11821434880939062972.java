package dev.epro.r0;

import ads_mobile_sdk.ri;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public interface B11821434880939062972 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(dev.epro.r0.B11821434880939062972 r5, ads_mobile_sdk.jy0 r6, ads_mobile_sdk.z1 r7, ads_mobile_sdk.wf0 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.in0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.in0 r0 = (ads_mobile_sdk.in0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.in0 r0 = new ads_mobile_sdk.in0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            ads_mobile_sdk.wf0 r8 = r0.c
            ads_mobile_sdk.z1 r7 = r0.b
            ads_mobile_sdk.jy0 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L73
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L34:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.tx0 r9 = r6.a
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            dev.epro.r0.I16631908410500040363 r1 = new dev.epro.r0.I16631908410500040363
            r1.<init>()
            ads_mobile_sdk.ri r3 = r5.a()
            boolean r3 = r3.d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_muted"
            r1.t(r4, r3)
            ads_mobile_sdk.ri r5 = r5.a()
            float r5 = r5.c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "app_volume"
            r1.t(r3, r5)
            java.lang.String r5 = "volume"
            java.lang.Object r5 = r9.a(r1, r5, r0)
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r9) goto L6f
            goto L70
        L6f:
            r5 = r2
        L70:
            if (r5 != r9) goto L73
            return r9
        L73:
            r6.b = r8
            boolean r5 = r7.c0
            if (r5 == 0) goto Lc8
            ads_mobile_sdk.he3 r5 = new ads_mobile_sdk.he3
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            r5.<init>(r7)
            android.content.res.Resources r7 = r7.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L91
            r8 = 2131822333(0x7f1106fd, float:1.9277434E38)
            java.lang.String r7 = r7.getString(r8)     // Catch: android.content.res.Resources.NotFoundException -> L91
            goto L93
        L91:
            java.lang.String r7 = "Test Ad"
        L93:
            r5.setText(r7)
            r7 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r7)
            r7 = -1
            r5.setTextColor(r7)
            r7 = 5
            r8 = 0
            r5.setPadding(r7, r8, r7, r8)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r7.setShape(r8)
            r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r7.setColor(r8)
            r8 = 1090519040(0x41000000, float:8.0)
            r7.setCornerRadius(r8)
            r5.setBackground(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 49
            r9 = -2
            r7.<init>(r9, r9, r8)
            r6.addView(r5, r7)
            r6.bringChildToFront(r5)
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B11821434880939062972.a(dev.epro.r0.B11821434880939062972, ads_mobile_sdk.jy0, ads_mobile_sdk.z1, ads_mobile_sdk.wf0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    ri a();
}
