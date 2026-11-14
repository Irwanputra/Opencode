package dev.epro.r0;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R7227561122513629522 implements InputFilter {
    public final TextView a;
    public R13418248517464140008 b;

    public R7227561122513629522(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            dev.epro.r0.D3638978315442423989 r1 = dev.epro.r0.D3638978315442423989.a()
            int r1 = r1.c()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            dev.epro.r0.D3638978315442423989 r3 = dev.epro.r0.D3638978315442423989.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.g(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            dev.epro.r0.D3638978315442423989 r5 = dev.epro.r0.D3638978315442423989.a()
            dev.epro.r0.R13418248517464140008 r6 = r3.b
            if (r6 != 0) goto L58
            dev.epro.r0.R13418248517464140008 r6 = new dev.epro.r0.R13418248517464140008
            r6.<init>(r0, r3)
            r3.b = r6
        L58:
            r5.h(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R7227561122513629522.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
