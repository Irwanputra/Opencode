package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q6911235926820683234 implements A10838822263452390785 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public Q6911235926820683234(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void f(ArrayList arrayList, A8284336046188466534 a8284336046188466534, I5164649337253478959 i5164649337253478959, float f, ArrayList arrayList2, ArrayList arrayList3, A8284336046188466534 a82843360461884665342, ArrayList arrayList4, A8284336046188466534 a82843360461884665343, A8284336046188466534 a82843360461884665344) {
        if (!arrayList.isEmpty()) {
            a8284336046188466534.a = i5164649337253478959.g0(f) + a8284336046188466534.a;
        }
        arrayList.add(0, R9411874267597469228.d1(arrayList2));
        arrayList3.add(Integer.valueOf(a82843360461884665342.a));
        arrayList4.add(Integer.valueOf(a8284336046188466534.a));
        a8284336046188466534.a += a82843360461884665342.a;
        a82843360461884665343.a = Math.max(a82843360461884665343.a, a82843360461884665344.a);
        arrayList2.clear();
        a82843360461884665344.a = 0;
        a82843360461884665342.a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[SYNTHETIC] */
    @Override // dev.epro.r0.A10838822263452390785
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.H11646813293457574213 c(final dev.epro.r0.I5164649337253478959 r21, java.util.List r22, long r23) {
        /*
            r20 = this;
            r0 = r20
            r3 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            dev.epro.r0.A8284336046188466534 r9 = new dev.epro.r0.A8284336046188466534
            r9.<init>()
            dev.epro.r0.A8284336046188466534 r2 = new dev.epro.r0.A8284336046188466534
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            dev.epro.r0.A8284336046188466534 r10 = new dev.epro.r0.A8284336046188466534
            r10.<init>()
            dev.epro.r0.A8284336046188466534 r7 = new dev.epro.r0.A8284336046188466534
            r7.<init>()
            int r11 = r22.size()
            r4 = 0
            r12 = r4
        L32:
            if (r12 >= r11) goto L9f
            r13 = r22
            java.lang.Object r4 = r13.get(r12)
            dev.epro.r0.G17613326942144185441 r4 = (dev.epro.r0.G17613326942144185441) r4
            r14 = r23
            dev.epro.r0.Z17471428274427141949 r4 = r4.d(r14)
            boolean r16 = r5.isEmpty()
            r17 = r11
            float r11 = r0.a
            if (r16 != 0) goto L66
            r16 = r1
            int r1 = r10.a
            int r18 = r3.g0(r11)
            int r18 = r18 + r1
            int r1 = r4.a
            int r1 = r18 + r1
            r18 = r2
            int r2 = dev.epro.r0.I16980768508151520658.i(r14)
            if (r1 > r2) goto L6a
            r1 = r16
            r2 = r18
        L66:
            r19 = r12
            r12 = r4
            goto L77
        L6a:
            r1 = r4
            float r4 = r0.b
            r19 = r12
            r2 = r18
            r12 = r1
            r1 = r16
            f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L77:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L86
            int r4 = r10.a
            int r11 = r3.g0(r11)
            int r11 = r11 + r4
            r10.a = r11
        L86:
            r5.add(r12)
            int r4 = r10.a
            int r11 = r12.a
            int r4 = r4 + r11
            r10.a = r4
            int r4 = r7.a
            int r11 = r12.b
            int r4 = java.lang.Math.max(r4, r11)
            r7.a = r4
            int r12 = r19 + 1
            r11 = r17
            goto L32
        L9f:
            r14 = r23
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto Lac
            float r4 = r0.b
            f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        Lac:
            int r3 = r9.a
            int r4 = dev.epro.r0.I16980768508151520658.k(r14)
            int r4 = java.lang.Math.max(r3, r4)
            int r2 = r2.a
            int r3 = dev.epro.r0.I16980768508151520658.j(r14)
            int r6 = java.lang.Math.max(r2, r3)
            dev.epro.r0.J7398561734545154932 r2 = new dev.epro.r0.J7398561734545154932
            float r3 = r0.a
            r0 = r2
            r5 = r8
            r2 = r21
            r0.<init>()
            r3 = r2
            dev.epro.r0.X9852054718446117252 r1 = dev.epro.r0.X9852054718446117252.a
            dev.epro.r0.H11646813293457574213 r0 = r3.m(r4, r6, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q6911235926820683234.c(dev.epro.r0.I5164649337253478959, java.util.List, long):dev.epro.r0.H11646813293457574213");
    }
}
