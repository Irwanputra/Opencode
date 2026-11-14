package dev.epro.r0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J16088445080955867036 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final J196785984016436306 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final C9424689592673022017 e;
    public final String[] g;
    public final J9952912165656250964 h;
    public final R9298828235481065733 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public B13729205492206812220 k = new O4934609777781722916((byte) 3);
    public final LinkedHashMap f = new LinkedHashMap();

    public J16088445080955867036(J196785984016436306 j196785984016436306, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, C9424689592673022017 c9424689592673022017) {
        String str;
        this.a = j196785984016436306;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = c9424689592673022017;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, E4951175994894594588.t0(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new J9952912165656250964(this.g.length);
        this.i = new R9298828235481065733(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.G5610643384273062965 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dev.epro.r0.H6777220120094290104
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.H6777220120094290104 r0 = (dev.epro.r0.H6777220120094290104) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.H6777220120094290104 r0 = new dev.epro.r0.H6777220120094290104
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.u
            int r6 = r0.w
            r1 = 2
            r2 = 1
            dev.epro.r0.Z3437138737604933638 r3 = dev.epro.r0.Z3437138737604933638.a
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.t
            java.util.Set r5 = (java.util.Set) r5
            dev.epro.r0.E17665849472693074628.k(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.t
            dev.epro.r0.G5610643384273062965 r5 = (dev.epro.r0.G5610643384273062965) r5
            dev.epro.r0.E17665849472693074628.k(r4)
            goto L54
        L3d:
            dev.epro.r0.E17665849472693074628.k(r4)
            dev.epro.r0.S11108027743417284456 r4 = new dev.epro.r0.S11108027743417284456
            r6 = 26
            r4.<init>(r6)
            r0.t = r5
            r0.w = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.t = r4
            r0.w = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = dev.epro.r0.E10717724117948616506.j(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16088445080955867036.a(dev.epro.r0.G5610643384273062965, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:11:0x0025, B:12:0x0074, B:14:0x007f, B:17:0x00b5, B:19:0x008b, B:20:0x008d, B:22:0x009a, B:24:0x00a4, B:26:0x00aa, B:27:0x00a8, B:30:0x00af), top: B:10:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof dev.epro.r0.B104622841165056041
            if (r0 == 0) goto L13
            r0 = r11
            dev.epro.r0.B104622841165056041 r0 = (dev.epro.r0.B104622841165056041) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.B104622841165056041 r0 = new dev.epro.r0.B104622841165056041
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            dev.epro.r0.Q7316561721656982910 r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Throwable -> L29
            goto L74
        L29:
            r10 = move-exception
            goto Lc0
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r2
        L32:
            dev.epro.r0.E17665849472693074628.k(r11)
            dev.epro.r0.J196785984016436306 r11 = r10.a
            dev.epro.r0.Q7316561721656982910 r1 = r11.g
            boolean r5 = r1.g()
            dev.epro.r0.H15747516787109764287 r6 = dev.epro.r0.H15747516787109764287.a
            if (r5 == 0) goto Lc4
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.j     // Catch: java.lang.Throwable -> Lbe
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lbe
            if (r5 != 0) goto L4d
            r1.S()
            return r6
        L4d:
            dev.epro.r0.B13729205492206812220 r5 = r10.k     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lbe
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lbe
            if (r5 != 0) goto L5f
            r1.S()
            return r6
        L5f:
            dev.epro.r0.I15284427961769500538 r5 = new dev.epro.r0.I15284427961769500538     // Catch: java.lang.Throwable -> Lbe
            r6 = 16
            r5.<init>(r10, r2, r6)     // Catch: java.lang.Throwable -> Lbe
            r0.t = r1     // Catch: java.lang.Throwable -> Lbe
            r0.w = r4     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r11 = r11.r(r3, r5, r0)     // Catch: java.lang.Throwable -> Lbe
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r11 != r0) goto L73
            return r0
        L73:
            r0 = r1
        L74:
            java.util.Set r11 = (java.util.Set) r11     // Catch: java.lang.Throwable -> L29
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto Lba
            dev.epro.r0.R9298828235481065733 r1 = r10.i     // Catch: java.lang.Throwable -> L29
            r11.getClass()     // Catch: java.lang.Throwable -> L29
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L8b
            goto Lb5
        L8b:
            dev.epro.r0.S17255966974483065294 r1 = r1.a     // Catch: java.lang.Throwable -> L29
        L8d:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L29
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L29
            int r6 = r5.length     // Catch: java.lang.Throwable -> L29
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L29
            r8 = r3
        L98:
            if (r8 >= r6) goto Laf
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L29
            boolean r9 = r11.contains(r9)     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto La8
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L29
            int r9 = r9 + r4
            goto Laa
        La8:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L29
        Laa:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L29
            int r8 = r8 + 1
            goto L98
        Laf:
            boolean r2 = r1.i(r2, r7)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L8d
        Lb5:
            dev.epro.r0.C9424689592673022017 r10 = r10.e     // Catch: java.lang.Throwable -> L29
            r10.invoke(r11)     // Catch: java.lang.Throwable -> L29
        Lba:
            r0.S()
            return r11
        Lbe:
            r10 = move-exception
            r0 = r1
        Lc0:
            r0.S()
            throw r10
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16088445080955867036.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void c(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202) {
        b13729205492206812220.getClass();
        b137292054922068122202.getClass();
        if (this.j.compareAndSet(false, true)) {
            b13729205492206812220.invoke();
            A2789795882633926065 a2789795882633926065 = this.a.a;
            R4833348786910499294 r4833348786910499294 = null;
            if (a2789795882633926065 != null) {
                R7033599853981556291.E(a2789795882633926065, new N14854071629268978730(N14854071629268978730.b), null, new G5547415528770645763((Object) this, (Object) b137292054922068122202, r4833348786910499294, (byte) 16), 2);
            } else {
                S10823041268949770285.b0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d5, code lost:
    
        if (dev.epro.r0.E10717724117948616506.j(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (dev.epro.r0.E10717724117948616506.j(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v6, types: [dev.epro.r0.G5610643384273062965] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d5 -> B:11:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.F6741456026889144139 r18, int r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16088445080955867036.d(dev.epro.r0.F6741456026889144139, int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v5, types: [dev.epro.r0.G5610643384273062965] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0089 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.F6741456026889144139 r8, int r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dev.epro.r0.E1392400786433504945
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.E1392400786433504945 r0 = (dev.epro.r0.E1392400786433504945) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            dev.epro.r0.E1392400786433504945 r0 = new dev.epro.r0.E1392400786433504945
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.x
            int r8 = r0.w
            java.lang.String[] r9 = r0.v
            java.lang.String r1 = r0.u
            dev.epro.r0.G5610643384273062965 r3 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r9
            r9 = r3
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            r7 = 0
            return r7
        L38:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = dev.epro.r0.J16088445080955867036.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L8e
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.t = r9
            r0.u = r1
            r0.v = r10
            r0.w = r8
            r0.x = r7
            r0.A = r2
            java.lang.Object r3 = dev.epro.r0.E10717724117948616506.j(r9, r3, r0)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r3 != r4) goto L8c
            return r4
        L8c:
            int r8 = r8 + r2
            goto L4a
        L8e:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16088445080955867036.e(dev.epro.r0.F6741456026889144139, int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dev.epro.r0.E2228253904057252951
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.E2228253904057252951 r0 = (dev.epro.r0.E2228253904057252951) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.E2228253904057252951 r0 = new dev.epro.r0.E2228253904057252951
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.Q7316561721656982910 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Throwable -> L28
            goto L53
        L28:
            r7 = move-exception
            goto L59
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.J196785984016436306 r7 = r6.a
            dev.epro.r0.Q7316561721656982910 r1 = r7.g
            boolean r4 = r1.g()
            if (r4 == 0) goto L5d
            dev.epro.r0.S14769385926647291222 r4 = new dev.epro.r0.S14769385926647291222     // Catch: java.lang.Throwable -> L57
            r5 = 16
            r4.<init>(r6, r2, r5)     // Catch: java.lang.Throwable -> L57
            r0.t = r1     // Catch: java.lang.Throwable -> L57
            r0.w = r3     // Catch: java.lang.Throwable -> L57
            r6 = 0
            java.lang.Object r6 = r7.r(r6, r4, r0)     // Catch: java.lang.Throwable -> L57
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r7) goto L52
            return r7
        L52:
            r6 = r1
        L53:
            r6.S()
            goto L5d
        L57:
            r7 = move-exception
            r6 = r1
        L59:
            r6.S()
            throw r7
        L5d:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16088445080955867036.f(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
