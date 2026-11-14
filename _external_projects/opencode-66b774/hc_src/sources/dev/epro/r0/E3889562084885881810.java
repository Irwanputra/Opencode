package dev.epro.r0;

import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E3889562084885881810 extends N5230833122018532994 {
    public final View B;
    public final P13832034982779129365 C;
    public R11800251031747375035 D;
    public F4096073349764486348 E;
    public F4096073349764486348 F;
    public F4096073349764486348 G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E3889562084885881810(android.content.Context r8, dev.epro.r0.F4096073349764486348 r9, dev.epro.r0.N4308732927120516147 r10, dev.epro.r0.P14826151584039718691 r11, int r12, dev.epro.r0.Y633750919412282388 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            dev.epro.r0.P13832034982779129365 r4 = new dev.epro.r0.P13832034982779129365
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.B = r5
            r0.C = r4
            r7 = 0
            r0.setClipChildren(r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r8 = 0
            if (r11 == 0) goto L28
            java.lang.Object r9 = r11.e(r7)
            goto L29
        L28:
            r9 = r8
        L29:
            boolean r10 = r9 instanceof android.util.SparseArray
            if (r10 == 0) goto L30
            r8 = r9
            android.util.SparseArray r8 = (android.util.SparseArray) r8
        L30:
            if (r8 == 0) goto L35
            r5.restoreHierarchyState(r8)
        L35:
            if (r11 == 0) goto L44
            dev.epro.r0.T1769843459973694375 r8 = new dev.epro.r0.T1769843459973694375
            r9 = 2
            r8.<init>(r0, r9)
            dev.epro.r0.R11800251031747375035 r7 = r11.f(r7, r8)
            r0.setSavableRegistryEntry(r7)
        L44:
            dev.epro.r0.M14716691558468128220 r7 = dev.epro.r0.S10823041268949770285.a
            r0.E = r7
            r0.F = r7
            r0.G = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E3889562084885881810.<init>(android.content.Context, dev.epro.r0.F4096073349764486348, dev.epro.r0.N4308732927120516147, dev.epro.r0.P14826151584039718691, int, dev.epro.r0.Y633750919412282388):void");
    }

    public static final void n(E3889562084885881810 e3889562084885881810) {
        e3889562084885881810.G.invoke(e3889562084885881810.B);
        e3889562084885881810.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(R11800251031747375035 r11800251031747375035) {
        R11800251031747375035 r118002510317473750352 = this.D;
        if (r118002510317473750352 != null) {
            ((I1632105416032993715) r118002510317473750352).x();
        }
        this.D = r11800251031747375035;
    }

    public final P13832034982779129365 getDispatcher() {
        return this.C;
    }

    public final F4096073349764486348 getReleaseBlock() {
        return this.G;
    }

    public final F4096073349764486348 getResetBlock() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ O10944101174480148852 getSubCompositionView() {
        return null;
    }

    public final F4096073349764486348 getUpdateBlock() {
        return this.E;
    }

    public final void setReleaseBlock(F4096073349764486348 f4096073349764486348) {
        this.G = f4096073349764486348;
        setRelease(new T1769843459973694375(this, (byte) 3));
    }

    public final void setResetBlock(F4096073349764486348 f4096073349764486348) {
        this.F = f4096073349764486348;
        setReset(new T1769843459973694375(this, (byte) 4));
    }

    public final void setUpdateBlock(F4096073349764486348 f4096073349764486348) {
        this.E = f4096073349764486348;
        setUpdate(new T1769843459973694375(this, (byte) 5));
    }

    public View getViewRoot() {
        return this;
    }
}
