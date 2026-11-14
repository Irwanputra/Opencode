package dev.epro.r0;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J7128855986599981135 implements A5401921815192175371 {
    public final D802963587922796009 a;
    public final I6255327262428024138 b;
    public final W5797197595347441198 c;
    public final G6219617120344415229 d;
    public int f;
    public X7175349259954592591 g;
    public final J15730374346044043770 i;
    public final O12494175665883759871 j;
    public final O12494175665883759871 k;
    public final J15730374346044043770 l;
    public final H15186625828076266306 e = new H15186625828076266306();
    public final R9298828235481065733 h = new R9298828235481065733();

    public J7128855986599981135(D802963587922796009 d802963587922796009, List list, I6255327262428024138 i6255327262428024138, W5797197595347441198 w5797197595347441198) {
        this.a = d802963587922796009;
        this.b = i6255327262428024138;
        this.c = w5797197595347441198;
        R4833348786910499294 r4833348786910499294 = null;
        this.d = new G6219617120344415229(new S14769385926647291222((Object) this, r4833348786910499294, (byte) 12), (byte) 5);
        this.i = new J15730374346044043770(this, list);
        final byte b = 0;
        this.j = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.I4702353490392705805
            public final /* synthetic */ J7128855986599981135 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                J7128855986599981135 j7128855986599981135 = this.b;
                switch (b2) {
                    case 0:
                        D802963587922796009 d8029635879227960092 = j7128855986599981135.a;
                        File canonicalFile = ((File) d8029635879227960092.c.invoke()).getCanonicalFile();
                        synchronized (D802963587922796009.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = D802963587922796009.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new L14581996005245038060(canonicalFile, d8029635879227960092.a, (I8259692294117767977) d8029635879227960092.b.invoke(canonicalFile), new S464754454553842217(canonicalFile, (byte) 26));
                    default:
                        return ((L14581996005245038060) j7128855986599981135.j.getValue()).c;
                }
            }
        });
        final byte b2 = 1;
        this.k = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.I4702353490392705805
            public final /* synthetic */ J7128855986599981135 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                J7128855986599981135 j7128855986599981135 = this.b;
                switch (b22) {
                    case 0:
                        D802963587922796009 d8029635879227960092 = j7128855986599981135.a;
                        File canonicalFile = ((File) d8029635879227960092.c.invoke()).getCanonicalFile();
                        synchronized (D802963587922796009.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = D802963587922796009.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new L14581996005245038060(canonicalFile, d8029635879227960092.a, (I8259692294117767977) d8029635879227960092.b.invoke(canonicalFile), new S464754454553842217(canonicalFile, (byte) 26));
                    default:
                        return ((L14581996005245038060) j7128855986599981135.j.getValue()).c;
                }
            }
        });
        this.l = new J15730374346044043770(w5797197595347441198, new A6662317080022852970(this, (byte) 23), new X4712621039624176170((byte) 27), new Y14354959068095823168((Object) this, r4833348786910499294, (byte) 21));
    }

    @Override // dev.epro.r0.A5401921815192175371
    public final Object a(L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        A9351041829071350263 a9351041829071350263 = (A9351041829071350263) k14749510448791472029.getContext().get(T13350664027331345869.G);
        if (a9351041829071350263 != null) {
            a9351041829071350263.a(this);
        }
        return R7033599853981556291.d0(new A9351041829071350263(a9351041829071350263, this), new C288342651169725874((Object) this, (Object) l12639328004344855510, (R4833348786910499294) null, (byte) 4), k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004d, B:16:0x0053), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dev.epro.r0.B16631989409179977921
            if (r0 == 0) goto L13
            r0 = r5
            dev.epro.r0.B16631989409179977921 r0 = (dev.epro.r0.B16631989409179977921) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.B16631989409179977921 r0 = new dev.epro.r0.B16631989409179977921
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            int r1 = r0.w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dev.epro.r0.H15186625828076266306 r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.e
            r0.t = r5
            r0.w = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.f     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + (-1)
            r4.f = r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L55
            dev.epro.r0.X7175349259954592591 r5 = r4.g     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            r5.c(r3)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            r4.g = r3     // Catch: java.lang.Throwable -> L51
        L55:
            r0.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L5b:
            r0.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final I8259692294117767977 c() {
        return (I8259692294117767977) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.Y17552568327163695994 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dev.epro.r0.Y14524717098189840571
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.Y14524717098189840571 r0 = (dev.epro.r0.Y14524717098189840571) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.Y14524717098189840571 r0 = new dev.epro.r0.Y14524717098189840571
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.A18119328133183277592 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Throwable -> L28
            goto L5e
        L28:
            r8 = move-exception
            goto L59
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.A18119328133183277592 r9 = r8.b
            dev.epro.r0.G8001132634698687269 r1 = r8.d     // Catch: java.lang.Throwable -> L57
            dev.epro.r0.G8001132634698687269 r4 = r0.getContext()     // Catch: java.lang.Throwable -> L57
            dev.epro.r0.G8001132634698687269 r1 = r1.plus(r4)     // Catch: java.lang.Throwable -> L57
            dev.epro.r0.I15284427961769500538 r4 = new dev.epro.r0.I15284427961769500538     // Catch: java.lang.Throwable -> L57
            r5 = 11
            r4.<init>(r7, r8, r2, r5)     // Catch: java.lang.Throwable -> L57
            r0.t = r9     // Catch: java.lang.Throwable -> L57
            r0.w = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = dev.epro.r0.R7033599853981556291.d0(r1, r4, r0)     // Catch: java.lang.Throwable -> L57
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L53
            return r8
        L53:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5e
        L57:
            r8 = move-exception
            r7 = r9
        L59:
            dev.epro.r0.C10696704014433963524 r9 = new dev.epro.r0.C10696704014433963524
            r9.<init>(r8)
        L5e:
            java.lang.Throwable r8 = dev.epro.r0.I11772848013184437928.a(r9)
            if (r8 != 0) goto L68
            r7.S(r9)
            goto L6b
        L68:
            r7.f0(r8)
        L6b:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.d(dev.epro.r0.Y17552568327163695994, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:11:0x0041, B:13:0x0048), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dev.epro.r0.A8064939401148413392
            if (r0 == 0) goto L13
            r0 = r5
            dev.epro.r0.A8064939401148413392 r0 = (dev.epro.r0.A8064939401148413392) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.A8064939401148413392 r0 = new dev.epro.r0.A8064939401148413392
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            int r1 = r0.w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            dev.epro.r0.H15186625828076266306 r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.e
            r0.t = r5
            r0.w = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.f     // Catch: java.lang.Throwable -> L58
            int r5 = r5 + r2
            r4.f = r5     // Catch: java.lang.Throwable -> L58
            if (r5 != r2) goto L5a
            dev.epro.r0.W5797197595347441198 r5 = r4.c     // Catch: java.lang.Throwable -> L58
            dev.epro.r0.E14539443365786243486 r1 = new dev.epro.r0.E14539443365786243486     // Catch: java.lang.Throwable -> L58
            r2 = 0
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L58
            r2 = 3
            dev.epro.r0.X7175349259954592591 r5 = dev.epro.r0.R7033599853981556291.E(r5, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L58
            r4.g = r5     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L60
        L5a:
            r0.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L60:
            r0.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.S(r0) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dev.epro.r0.Z11727734943095677090
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.Z11727734943095677090 r0 = (dev.epro.r0.Z11727734943095677090) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.Z11727734943095677090 r0 = new dev.epro.r0.Z11727734943095677090
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L35:
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L49
        L39:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.I8259692294117767977 r7 = r6.c()
            r0.w = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            dev.epro.r0.J15730374346044043770 r1 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.t = r7     // Catch: java.lang.Throwable -> L5f
            r0.w = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.S(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            dev.epro.r0.K4010471808440187464 r1 = new dev.epro.r0.K4010471808440187464
            r1.<init>(r0, r7)
            dev.epro.r0.R9298828235481065733 r6 = r6.h
            r6.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.f(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r10, dev.epro.r0.R4833348786910499294 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dev.epro.r0.O7635213225549806449
            if (r0 == 0) goto L13
            r0 = r11
            dev.epro.r0.O7635213225549806449 r0 = (dev.epro.r0.O7635213225549806449) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.O7635213225549806449 r0 = new dev.epro.r0.O7635213225549806449
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            int r1 = r0.x
            dev.epro.r0.R9298828235481065733 r2 = r9.h
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            dev.epro.r0.E17665849472693074628.k(r11)
            goto La3
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r6
        L37:
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L8c
        L3b:
            boolean r10 = r0.t
            dev.epro.r0.T7367429961324727973 r1 = r0.u
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L5f
        L43:
            dev.epro.r0.E17665849472693074628.k(r11)
            dev.epro.r0.T7367429961324727973 r1 = r2.b()
            boolean r11 = r1 instanceof dev.epro.r0.C17704515812253391758
            if (r11 != 0) goto Lb7
            dev.epro.r0.I8259692294117767977 r11 = r9.c()
            r0.u = r1
            r0.t = r10
            r0.x = r5
            java.lang.Integer r11 = r11.a()
            if (r11 != r7) goto L5f
            goto La2
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r1 instanceof dev.epro.r0.F2942794012393580692
            if (r5 == 0) goto L6f
            r8 = r1
            dev.epro.r0.F2942794012393580692 r8 = (dev.epro.r0.F2942794012393580692) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r1
        L75:
            r11 = 0
            if (r10 == 0) goto L8f
            dev.epro.r0.I8259692294117767977 r10 = r9.c()
            dev.epro.r0.H2730750034712003316 r1 = new dev.epro.r0.H2730750034712003316
            r1.<init>(r9, r6, r11)
            r0.u = r6
            r0.x = r4
            java.lang.Object r11 = r10.b(r1, r0)
            if (r11 != r7) goto L8c
            goto La2
        L8c:
            dev.epro.r0.H9390398899829886498 r11 = (dev.epro.r0.H9390398899829886498) r11
            goto La5
        L8f:
            dev.epro.r0.I8259692294117767977 r10 = r9.c()
            dev.epro.r0.Z3054745840431352264 r1 = new dev.epro.r0.Z3054745840431352264
            r1.<init>(r9, r8, r6, r11)
            r0.u = r6
            r0.x = r3
            java.lang.Object r11 = r10.c(r1, r0)
            if (r11 != r7) goto La3
        La2:
            return r7
        La3:
            dev.epro.r0.H9390398899829886498 r11 = (dev.epro.r0.H9390398899829886498) r11
        La5:
            java.lang.Object r9 = r11.a
            dev.epro.r0.T7367429961324727973 r9 = (dev.epro.r0.T7367429961324727973) r9
            java.lang.Object r10 = r11.b
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb6
            r2.c(r9)
        Lb6:
            return r9
        Lb7:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.g(boolean, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.A5401921815192175371
    public final J12043550928838212009 getData() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|73|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0057, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:27:0x0113, B:29:0x0123, B:33:0x0128), top: B:26:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #2 {all -> 0x014c, blocks: (B:27:0x0113, B:29:0x0123, B:33:0x0128), top: B:26:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096 A[Catch: G6332201275426833390 -> 0x0057, TryCatch #3 {G6332201275426833390 -> 0x0057, blocks: (B:37:0x0052, B:38:0x00ed, B:41:0x005c, B:42:0x00d2, B:57:0x0071, B:59:0x0096, B:60:0x009c, B:66:0x007b, B:69:0x00c3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.h(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r10, boolean r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof dev.epro.r0.D9626736047757333000
            if (r0 == 0) goto L13
            r0 = r12
            dev.epro.r0.D9626736047757333000 r0 = (dev.epro.r0.D9626736047757333000) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.D9626736047757333000 r0 = new dev.epro.r0.D9626736047757333000
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.u
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            dev.epro.r0.A8284336046188466534 r9 = r0.t
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L55
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            r9 = 0
            return r9
        L2e:
            dev.epro.r0.E17665849472693074628.k(r12)
            dev.epro.r0.A8284336046188466534 r4 = new dev.epro.r0.A8284336046188466534
            r4.<init>()
            dev.epro.r0.O12494175665883759871 r12 = r9.j
            java.lang.Object r12 = r12.getValue()
            dev.epro.r0.L14581996005245038060 r12 = (dev.epro.r0.L14581996005245038060) r12
            dev.epro.r0.U9077732032884938013 r3 = new dev.epro.r0.U9077732032884938013
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.t = r4
            r0.w = r2
            java.lang.Object r9 = r12.b(r3, r0)
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r4
        L55:
            int r9 = r9.a
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J7128855986599981135.i(java.lang.Object, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
