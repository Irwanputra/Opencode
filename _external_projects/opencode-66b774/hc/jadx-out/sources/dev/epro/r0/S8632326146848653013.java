package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S8632326146848653013 implements S7864201625552763331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ S8632326146848653013(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // dev.epro.r0.S7864201625552763331
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, dev.epro.r0.R4833348786910499294 r10) {
        /*
            r8 = this;
            byte r0 = r8.a
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            r2 = 1
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            java.lang.Object r4 = r8.b
            switch(r0) {
                case 0: goto L99;
                case 1: goto L91;
                case 2: goto L7f;
                case 3: goto L69;
                case 4: goto L26;
                case 5: goto L18;
                default: goto Lc;
            }
        Lc:
            java.lang.String r9 = (java.lang.String) r9
            dev.epro.r0.N17102349568798422850 r4 = (dev.epro.r0.N17102349568798422850) r4
            dev.epro.r0.V697849047308847220 r8 = r4.I
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            return r3
        L18:
            java.lang.Number r9 = (java.lang.Number) r9
            float r8 = r9.floatValue()
            dev.epro.r0.J10602487083330765269 r4 = (dev.epro.r0.J10602487083330765269) r4
            dev.epro.r0.O15319392248629494012 r9 = r4.c
            r9.h(r8)
            return r3
        L26:
            boolean r0 = r10 instanceof dev.epro.r0.M228899010923291385
            if (r0 == 0) goto L39
            r0 = r10
            dev.epro.r0.M228899010923291385 r0 = (dev.epro.r0.M228899010923291385) r0
            int r5 = r0.v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L39
            int r5 = r5 - r6
            r0.v = r5
            goto L3e
        L39:
            dev.epro.r0.M228899010923291385 r0 = new dev.epro.r0.M228899010923291385
            r0.<init>(r8, r10)
        L3e:
            java.lang.Object r8 = r0.t
            int r10 = r0.v
            if (r10 == 0) goto L51
            if (r10 != r2) goto L4a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L67
        L4a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r1 = 0
            goto L68
        L51:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.A2558500182237595544 r4 = (dev.epro.r0.A2558500182237595544) r4
            if (r9 != 0) goto L5a
            dev.epro.r0.D14731132657808549702 r9 = dev.epro.r0.V12319504402545346730.g
        L5a:
            r0.v = r2
            dev.epro.r0.J17843656891628349757 r4 = (dev.epro.r0.J17843656891628349757) r4
            dev.epro.r0.H17686692708284905246 r8 = r4.d
            java.lang.Object r8 = r8.r(r0, r9)
            if (r8 != r1) goto L67
            goto L68
        L67:
            r1 = r3
        L68:
            return r1
        L69:
            dev.epro.r0.O9245300239821758723 r9 = (dev.epro.r0.O9245300239821758723) r9
            dev.epro.r0.J7128855986599981135 r4 = (dev.epro.r0.J7128855986599981135) r4
            dev.epro.r0.R9298828235481065733 r8 = r4.h
            dev.epro.r0.T7367429961324727973 r8 = r8.b()
            boolean r8 = r8 instanceof dev.epro.r0.U8053077249905923784
            if (r8 != 0) goto L7e
            java.lang.Object r8 = r4.g(r2, r10)
            if (r8 != r1) goto L7e
            r3 = r8
        L7e:
            return r3
        L7f:
            android.view.inputmethod.CursorAnchorInfo r9 = (android.view.inputmethod.CursorAnchorInfo) r9
            dev.epro.r0.L16033300369903415380 r4 = (dev.epro.r0.L16033300369903415380) r4
            dev.epro.r0.W8455343525638953052 r8 = r4.c
            android.view.inputmethod.InputMethodManager r10 = r8.L()
            java.lang.Object r8 = r8.b
            android.view.View r8 = (android.view.View) r8
            r10.updateCursorAnchorInfo(r8, r9)
            return r3
        L91:
            dev.epro.r0.O9245300239821758723 r9 = (dev.epro.r0.O9245300239821758723) r9
            dev.epro.r0.W8455343525638953052 r4 = (dev.epro.r0.W8455343525638953052) r4
            r4.O()
            return r3
        L99:
            dev.epro.r0.O9245300239821758723 r9 = (dev.epro.r0.O9245300239821758723) r9
            dev.epro.r0.W8455343525638953052 r4 = (dev.epro.r0.W8455343525638953052) r4
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 34
            if (r8 < r9) goto Lae
            android.view.inputmethod.InputMethodManager r8 = r4.B()
            java.lang.Object r9 = r4.b
            android.view.View r9 = (android.view.View) r9
            dev.epro.r0.P12992571626612557236.r(r8, r9)
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S8632326146848653013.emit(java.lang.Object, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
