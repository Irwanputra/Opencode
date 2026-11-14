package dev.epro.r0;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L14581996005245038060 implements N8011592092801627539 {
    public final File a;
    public final C8804068735739007381 b;
    public final I8259692294117767977 c;
    public final S464754454553842217 d;
    public final AtomicBoolean e;
    public final H15186625828076266306 f;

    public L14581996005245038060(File file, C8804068735739007381 c8804068735739007381, I8259692294117767977 i8259692294117767977, S464754454553842217 s464754454553842217) {
        i8259692294117767977.getClass();
        this.a = file;
        this.b = c8804068735739007381;
        this.c = i8259692294117767977;
        this.d = s464754454553842217;
        this.e = new AtomicBoolean(false);
        this.f = new H15186625828076266306();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:21:0x0071, B:28:0x0082, B:31:0x007f, B:27:0x007a), top: B:7:0x0020, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [dev.epro.r0.L14581996005245038060] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [dev.epro.r0.N8649773526746213350] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.N8649773526746213350 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dev.epro.r0.N5043982455315504032
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.N5043982455315504032 r0 = (dev.epro.r0.N5043982455315504032) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.N5043982455315504032 r0 = new dev.epro.r0.N5043982455315504032
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.x
            dev.epro.r0.H15186625828076266306 r2 = r6.f
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            boolean r6 = r0.t
            dev.epro.r0.D7689865999397106918 r7 = r0.u
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2c
            goto L63
        L2c:
            r8 = move-exception
            goto L7a
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L34:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.e
            boolean r8 = r8.get()
            if (r8 != 0) goto L8a
            boolean r8 = r2.g()
            dev.epro.r0.D7689865999397106918 r1 = new dev.epro.r0.D7689865999397106918     // Catch: java.lang.Throwable -> L83
            java.io.File r5 = r6.a     // Catch: java.lang.Throwable -> L83
            dev.epro.r0.C8804068735739007381 r6 = r6.b     // Catch: java.lang.Throwable -> L83
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.u = r1     // Catch: java.lang.Throwable -> L75
            r0.t = r8     // Catch: java.lang.Throwable -> L75
            r0.x = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r7.invoke(r1, r6, r0)     // Catch: java.lang.Throwable -> L75
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r7) goto L5f
            return r7
        L5f:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L68
            r7 = r4
            goto L69
        L68:
            r7 = move-exception
        L69:
            if (r7 != 0) goto L71
            if (r6 == 0) goto L70
            r2.b(r4)
        L70:
            return r8
        L71:
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r7 = move-exception
            r8 = r6
            goto L84
        L75:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L7a:
            r7.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r7 = move-exception
            dev.epro.r0.O8620973563946607355.m(r8, r7)     // Catch: java.lang.Throwable -> L72
        L82:
            throw r8     // Catch: java.lang.Throwable -> L72
        L83:
            r7 = move-exception
        L84:
            if (r8 == 0) goto L89
            r2.b(r4)
        L89:
            throw r7
        L8a:
            java.lang.String r6 = "StorageConnection has already been disposed."
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L14581996005245038060.a(dev.epro.r0.N8649773526746213350, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0090, code lost:
    
        if (r11.c(r1) == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[Catch: all -> 0x0105, IOException -> 0x0108, TRY_ENTER, TryCatch #8 {IOException -> 0x0108, all -> 0x0105, blocks: (B:19:0x00ce, B:21:0x00d4, B:23:0x00da, B:26:0x00e6, B:27:0x0104, B:29:0x00df, B:32:0x0112, B:38:0x0120, B:41:0x011d), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112 A[Catch: all -> 0x0105, IOException -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0108, all -> 0x0105, blocks: (B:19:0x00ce, B:21:0x00d4, B:23:0x00da, B:26:0x00e6, B:27:0x0104, B:29:0x00df, B:32:0x0112, B:38:0x0120, B:41:0x011d), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v9, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.U9077732032884938013 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L14581996005245038060.b(dev.epro.r0.U9077732032884938013, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.N8011592092801627539
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
