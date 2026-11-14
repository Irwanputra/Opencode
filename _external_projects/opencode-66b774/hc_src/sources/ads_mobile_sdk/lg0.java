package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.Y4798753258822141670;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class lg0 implements Y4798753258822141670 {
    public final H15186625828076266306 a = new H15186625828076266306();
    public int b;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r7.a(r3, r0) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005c, code lost:
    
        if (r9.c(r0) == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:26:0x005f, B:28:0x0067, B:29:0x007b, B:31:0x007f, B:34:0x0085, B:40:0x006d, B:42:0x0075), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:26:0x005f, B:28:0x0067, B:29:0x007b, B:31:0x007f, B:34:0x0085, B:40:0x006d, B:42:0x0075), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:26:0x005f, B:28:0x0067, B:29:0x007b, B:31:0x007f, B:34:0x0085, B:40:0x006d, B:42:0x0075), top: B:25:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v12, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [dev.epro.r0.R8015591507171738907] */
    @Override // dev.epro.r0.Y4798753258822141670
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r7, java.util.Map r8, dev.epro.r0.R4833348786910499294 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.kg0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.kg0 r0 = (ads_mobile_sdk.kg0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.kg0 r0 = new ads_mobile_sdk.kg0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r6 = r0.a
            dev.epro.r0.R8015591507171738907 r6 = (dev.epro.r0.R8015591507171738907) r6
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Throwable -> L30
            goto L99
        L30:
            r7 = move-exception
            goto L9f
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L39:
            dev.epro.r0.H15186625828076266306 r6 = r0.d
            java.util.Map r8 = r0.c
            ads_mobile_sdk.tx0 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.lg0 r1 = (ads_mobile_sdk.lg0) r1
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r6
            r6 = r1
            goto L5f
        L49:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r6
            r0.b = r7
            r0.c = r8
            dev.epro.r0.H15186625828076266306 r9 = r6.a
            r0.d = r9
            r0.g = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L5f
            goto L95
        L5f:
            java.lang.String r1 = "start"
            boolean r1 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L6d
            int r8 = r6.b     // Catch: java.lang.Throwable -> L96
            int r8 = r8 + r3
            r6.b = r8     // Catch: java.lang.Throwable -> L96
            goto L7b
        L6d:
            java.lang.String r1 = "stop"
            boolean r8 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> L96
            if (r8 == 0) goto L7b
            int r8 = r6.b     // Catch: java.lang.Throwable -> L96
            int r8 = r8 + (-1)
            r6.b = r8     // Catch: java.lang.Throwable -> L96
        L7b:
            ads_mobile_sdk.et0 r7 = r7.f113o     // Catch: java.lang.Throwable -> L96
            if (r7 == 0) goto L98
            int r6 = r6.b     // Catch: java.lang.Throwable -> L96
            if (r6 <= 0) goto L84
            goto L85
        L84:
            r3 = 0
        L85:
            r0.a = r9     // Catch: java.lang.Throwable -> L96
            r0.b = r4     // Catch: java.lang.Throwable -> L96
            r0.c = r4     // Catch: java.lang.Throwable -> L96
            r0.d = r4     // Catch: java.lang.Throwable -> L96
            r0.g = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Object r6 = r7.a(r3, r0)     // Catch: java.lang.Throwable -> L96
            if (r6 != r5) goto L98
        L95:
            return r5
        L96:
            r6 = move-exception
            goto La1
        L98:
            r6 = r9
        L99:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L30
            r6.b(r4)
            return r7
        L9f:
            r9 = r6
            goto La2
        La1:
            r7 = r6
        La2:
            r9.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lg0.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 9;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final boolean c() {
        return true;
    }
}
