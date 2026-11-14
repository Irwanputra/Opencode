package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F5719092837822460436 {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public F5719092837822460436(int i, Class cls, int i2, int i3, byte b) {
        this.e = b;
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r0 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r0 = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
    
        if (r0 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            byte r1 = r6.e
            byte r2 = r6.c
            if (r0 < r2) goto L25
            switch(r1) {
                case 0: goto L1b;
                case 1: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            dev.epro.r0.V5462261517005869411.d(r7, r6)
            goto L24
        L15:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            dev.epro.r0.V5462261517005869411.e(r7, r8)
            goto L24
        L1b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            dev.epro.r0.V5462261517005869411.f(r7, r6)
        L24:
            return
        L25:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            int r4 = r6.a
            if (r0 < r2) goto L46
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L38;
                default: goto L2f;
            }
        L2f:
            boolean r0 = dev.epro.r0.V5462261517005869411.b(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L54
        L38:
            java.lang.CharSequence r0 = dev.epro.r0.V5462261517005869411.a(r7)
            goto L54
        L3d:
            boolean r0 = dev.epro.r0.V5462261517005869411.c(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L54
        L46:
            java.lang.Object r0 = r7.getTag(r4)
            java.lang.Class r2 = r6.b
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            r2 = 0
            r5 = 1
            switch(r1) {
                case 0: goto L85;
                case 1: goto L7a;
                default: goto L59;
            }
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = r8
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r0 == 0) goto L68
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L68
            r0 = r5
            goto L69
        L68:
            r0 = r2
        L69:
            if (r1 == 0) goto L73
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L73
            r1 = r5
            goto L74
        L73:
            r1 = r2
        L74:
            if (r0 != r1) goto L77
        L76:
            r2 = r5
        L77:
            r0 = r2 ^ 1
            goto La3
        L7a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r0 = r0 ^ r5
            goto La3
        L85:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = r8
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r0 == 0) goto L94
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L94
            r0 = r5
            goto L95
        L94:
            r0 = r2
        L95:
            if (r1 == 0) goto L9f
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L9f
            r1 = r5
            goto La0
        L9f:
            r1 = r2
        La0:
            if (r0 != r1) goto L77
            goto L76
        La3:
            if (r0 == 0) goto Lcc
            android.view.View$AccessibilityDelegate r0 = dev.epro.r0.W10240872260424387225.e(r7)
            if (r0 != 0) goto Lac
            goto Lba
        Lac:
            boolean r1 = r0 instanceof dev.epro.r0.R14550118172745988367
            if (r1 == 0) goto Lb5
            dev.epro.r0.R14550118172745988367 r0 = (dev.epro.r0.R14550118172745988367) r0
            dev.epro.r0.M6658516668915746104 r3 = r0.a
            goto Lba
        Lb5:
            dev.epro.r0.M6658516668915746104 r3 = new dev.epro.r0.M6658516668915746104
            r3.<init>(r0)
        Lba:
            if (r3 != 0) goto Lc1
            dev.epro.r0.M6658516668915746104 r3 = new dev.epro.r0.M6658516668915746104
            r3.<init>()
        Lc1:
            dev.epro.r0.W10240872260424387225.j(r7, r3)
            r7.setTag(r4, r8)
            byte r6 = r6.d
            dev.epro.r0.W10240872260424387225.g(r7, r6)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F5719092837822460436.a(android.view.View, java.lang.Object):void");
    }
}
