package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A1443918367825261584 implements android.text.TextWatcher, android.text.SpanWatcher {
    public final java.lang.Object a;
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);

    public A1443918367825261584(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        ((android.text.TextWatcher) this.a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof dev.epro.r0.A7769137806217985202)) {
            ((android.text.SpanWatcher) this.a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.b
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r10 instanceof dev.epro.r0.A7769137806217985202
            if (r0 == 0) goto Ld
            return
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1c
            r0 = 0
            if (r11 <= r12) goto L17
            r11 = r0
        L17:
            if (r13 <= r14) goto L1c
            r4 = r11
            r6 = r0
            goto L1e
        L1c:
            r4 = r11
            r6 = r13
        L1e:
            java.lang.Object r8 = r8.a
            r1 = r8
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A1443918367825261584.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (this.b.get() <= 0 || !(obj instanceof dev.epro.r0.A7769137806217985202)) {
            ((android.text.SpanWatcher) this.a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        ((android.text.TextWatcher) this.a).onTextChanged(charSequence, i, i2, i3);
    }
}
