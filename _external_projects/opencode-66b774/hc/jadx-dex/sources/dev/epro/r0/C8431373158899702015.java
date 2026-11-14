package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C8431373158899702015 implements android.view.inputmethod.InputConnection {
    public final dev.epro.r0.M9197813449740923653 a;
    public final boolean b;
    public int c;
    public dev.epro.r0.F13241018602672925865 d;
    public int e;
    public boolean f;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public boolean h = true;

    public C8431373158899702015(dev.epro.r0.F13241018602672925865 f13241018602672925865, dev.epro.r0.M9197813449740923653 m9197813449740923653, boolean z) {
        this.a = m9197813449740923653;
        this.b = z;
        this.d = f13241018602672925865;
    }

    public final void a(dev.epro.r0.C2322693828285680440 c2322693828285680440) {
        this.c++;
        try {
            this.g.add(c2322693828285680440);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            java.util.ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                ((dev.epro.r0.J17256830230353952700) this.a.b).e.invoke(new java.util.ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.c++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        java.util.ArrayList arrayList = ((dev.epro.r0.J17256830230353952700) this.a.b).i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (dev.epro.r0.S10823041268949770285.t(((java.lang.ref.WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new dev.epro.r0.J14617885194716764421(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.L13686798803278025478(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.D17975288941580018327(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.S1181215782212915507());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        dev.epro.r0.F13241018602672925865 f13241018602672925865 = this.d;
        return android.text.TextUtils.getCapsMode(f13241018602672925865.a.b, dev.epro.r0.F12478849263529740365.g(f13241018602672925865.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return dev.epro.r0.B11964701839924937722.I(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (dev.epro.r0.F12478849263529740365.d(this.d.b)) {
            return null;
        }
        return dev.epro.r0.E15826830759497041750.j(this.d).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        return dev.epro.r0.E15826830759497041750.k(this.d, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        return dev.epro.r0.E15826830759497041750.l(this.d, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case android.R.id.selectAll:
                    a(new dev.epro.r0.D4827454800931329865(0, this.d.a.b.length()));
                    break;
                case android.R.id.cut:
                    c(277);
                    return false;
                case android.R.id.copy:
                    c(278);
                    return false;
                case android.R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L27
            r0 = 1
            if (r3 == 0) goto La
            switch(r3) {
                case 2: goto L16;
                case 3: goto L14;
                case 4: goto L12;
                case 5: goto L10;
                case 6: goto Le;
                case 7: goto Lc;
                default: goto La;
            }
        La:
            r3 = r0
            goto L17
        Lc:
            r3 = 5
            goto L17
        Le:
            r3 = 7
            goto L17
        L10:
            r3 = 6
            goto L17
        L12:
            r3 = 4
            goto L17
        L14:
            r3 = 3
            goto L17
        L16:
            r3 = 2
        L17:
            dev.epro.r0.M9197813449740923653 r2 = r2.a
            java.lang.Object r2 = r2.b
            dev.epro.r0.J17256830230353952700 r2 = (dev.epro.r0.J17256830230353952700) r2
            dev.epro.r0.F4096073349764486348 r2 = r2.f
            dev.epro.r0.R512193971042300889 r1 = new dev.epro.r0.R512193971042300889
            r1.<init>(r3)
            r2.invoke(r1)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C8431373158899702015.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            dev.epro.r0.M9197813449740923653 r9 = r9.a
            java.lang.Object r9 = r9.b
            dev.epro.r0.J17256830230353952700 r9 = (dev.epro.r0.J17256830230353952700) r9
            dev.epro.r0.B16573717784043534404 r9 = r9.l
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            dev.epro.r0.F13241018602672925865 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C8431373158899702015.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        ((android.view.inputmethod.BaseInputConnection) ((dev.epro.r0.J17256830230353952700) this.a.b).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new dev.epro.r0.C5725033187322898527(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new dev.epro.r0.X10863724561514067198(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.D4827454800931329865(i, i2));
        return true;
    }
}
