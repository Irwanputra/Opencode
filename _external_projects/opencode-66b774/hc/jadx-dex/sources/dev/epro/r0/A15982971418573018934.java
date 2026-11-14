package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A15982971418573018934 implements android.view.inputmethod.InputConnection {
    public final dev.epro.r0.X9608137461199640409 a;
    public final dev.epro.r0.D389890677992184566 b = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.F4096073349764486348[16]);
    public final android.view.inputmethod.InputConnection c;

    public A15982971418573018934(dev.epro.r0.X9608137461199640409 x9608137461199640409, android.view.inputmethod.EditorInfo editorInfo) {
        this.a = x9608137461199640409;
        this.c = dev.epro.r0.V12319504402545346730.x(new dev.epro.r0.T5044579568032097231(this, false), editorInfo, new dev.epro.r0.U11450443558875589191(this, (byte) 0));
    }

    public final dev.epro.r0.C8185053590072587931 a() {
        return ((dev.epro.r0.N1420218926656397722) this.a.d).d();
    }

    public final void b(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((dev.epro.r0.O3228356295430981133) this.a.b).a++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.i();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        java.util.Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        java.util.Objects.toString(inputContentInfo);
        java.util.Objects.toString(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return dev.epro.r0.Y10073409303721529419.b(this.c, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i, android.view.inputmethod.TextAttribute textAttribute) {
        java.util.Objects.toString(charSequence);
        java.util.Objects.toString(textAttribute);
        this.a.h(new dev.epro.r0.M18374774969436364933(charSequence.toString(), i, (android.os.Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : dev.epro.r0.K5395552668562208334.g(textAttribute)));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new dev.epro.r0.G3380524581901889884(i, i2, x9608137461199640409, (byte) 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.h(new dev.epro.r0.N8868719937406905418(i, i2, (byte) 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((dev.epro.r0.O3228356295430981133) this.a.b).h();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.h(new dev.epro.r0.U3828252728192849465((byte) 26));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return android.text.TextUtils.getCapsMode(a(), dev.epro.r0.F12478849263529740365.g(a().d), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        java.util.Objects.toString(extractedTextRequest);
        dev.epro.r0.C8185053590072587931 c8185053590072587931A = a();
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        extractedText.text = c8185053590072587931A;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c8185053590072587931A.c.length();
        extractedText.partialStartOffset = -1;
        long j = c8185053590072587931A.d;
        extractedText.selectionStart = dev.epro.r0.F12478849263529740365.g(j);
        extractedText.selectionEnd = dev.epro.r0.F12478849263529740365.f(j);
        extractedText.flags = !dev.epro.r0.M8927913404651150384.M(c8185053590072587931A, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (dev.epro.r0.F12478849263529740365.d(a().d)) {
            return null;
        }
        dev.epro.r0.C8185053590072587931 c8185053590072587931A = a();
        return c8185053590072587931A.c.subSequence(dev.epro.r0.F12478849263529740365.g(c8185053590072587931A.d), dev.epro.r0.F12478849263529740365.f(c8185053590072587931A.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        dev.epro.r0.C8185053590072587931 c8185053590072587931A = a();
        long j = c8185053590072587931A.d;
        java.lang.CharSequence charSequence = c8185053590072587931A.c;
        int iF = dev.epro.r0.F12478849263529740365.f(j);
        int iF2 = dev.epro.r0.F12478849263529740365.f(c8185053590072587931A.d);
        int length = iF2 + i;
        if (((iF2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, java.lang.Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        dev.epro.r0.C8185053590072587931 c8185053590072587931A = a();
        int iG = dev.epro.r0.F12478849263529740365.g(c8185053590072587931A.d);
        int i3 = iG - i;
        if (((i ^ iG) & (iG ^ i3)) < 0) {
            i3 = 0;
        }
        return c8185053590072587931A.c.subSequence(java.lang.Math.max(0, i3), dev.epro.r0.F12478849263529740365.g(c8185053590072587931A.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case android.R.id.selectAll:
                int length = a().c.length();
                dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
                x9608137461199640409.h(new dev.epro.r0.G3380524581901889884(x9608137461199640409, 0, length, (byte) 0));
                break;
            case android.R.id.cut:
                b(277);
                break;
            case android.R.id.copy:
                b(278);
                break;
            case android.R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L6
            switch(r3) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r3 = r0
            goto L13
        L8:
            r3 = 5
            goto L13
        La:
            r3 = 7
            goto L13
        Lc:
            r3 = 6
            goto L13
        Le:
            r3 = 4
            goto L13
        L10:
            r3 = 3
            goto L13
        L12:
            r3 = 2
        L13:
            dev.epro.r0.X9608137461199640409 r2 = r2.a
            java.lang.Object r2 = r2.f
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            if (r2 == 0) goto L23
            dev.epro.r0.R512193971042300889 r1 = new dev.epro.r0.R512193971042300889
            r1.<init>(r3)
            r2.invoke(r1)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A15982971418573018934.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        int i;
        dev.epro.r0.Q17957571128037780363 q17957571128037780363C;
        int i2;
        java.util.Objects.toString(handwritingGesture);
        java.util.Objects.toString(executor);
        java.util.Objects.toString(intConsumer);
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 34) {
            return;
        }
        int iH = 2;
        if (i3 >= 34) {
            dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
            dev.epro.r0.N1420218926656397722 n1420218926656397722 = (dev.epro.r0.N1420218926656397722) x9608137461199640409.d;
            dev.epro.r0.I12071840179596922896 i12071840179596922896 = (dev.epro.r0.I12071840179596922896) x9608137461199640409.i;
            dev.epro.r0.B13729205492206812220 b13729205492206812220 = (dev.epro.r0.B13729205492206812220) x9608137461199640409.j;
            dev.epro.r0.K1865709164992808030 k1865709164992808030 = (dev.epro.r0.K1865709164992808030) x9608137461199640409.k;
            if (dev.epro.r0.U16248190607760379657.r(handwritingGesture)) {
                android.view.inputmethod.SelectGesture selectGestureM = dev.epro.r0.U16248190607760379657.m(handwritingGesture);
                long jW = dev.epro.r0.J8045362843799184672.W(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.h(selectGestureM)), dev.epro.r0.U16248190607760379657.c(selectGestureM) == 1 ? 1 : 0);
                if (dev.epro.r0.F12478849263529740365.d(jW)) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(selectGestureM));
                } else {
                    n1420218926656397722.j(jW);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    iH = 1;
                }
            } else if (dev.epro.r0.J14472086795230312938.w(handwritingGesture)) {
                android.view.inputmethod.DeleteGesture deleteGestureM = dev.epro.r0.J14472086795230312938.m(handwritingGesture);
                i2 = dev.epro.r0.J14472086795230312938.c(deleteGestureM) == 1 ? 1 : 0;
                long jW2 = dev.epro.r0.J8045362843799184672.W(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.j(deleteGestureM)), i2);
                if (dev.epro.r0.F12478849263529740365.d(jW2)) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(deleteGestureM));
                } else {
                    if (i2 == 1) {
                        jW2 = dev.epro.r0.J8045362843799184672.q(jW2, n1420218926656397722.d());
                    }
                    dev.epro.r0.N1420218926656397722.i(n1420218926656397722, "", jW2, false, false, 28);
                    iH = 1;
                }
            } else if (dev.epro.r0.J14472086795230312938.B(handwritingGesture)) {
                android.view.inputmethod.SelectRangeGesture selectRangeGestureO = dev.epro.r0.J14472086795230312938.o(handwritingGesture);
                long jY = dev.epro.r0.J8045362843799184672.Y(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.k(selectRangeGestureO)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.z(selectRangeGestureO)), dev.epro.r0.U16248190607760379657.d(selectRangeGestureO) == 1 ? 1 : 0);
                if (dev.epro.r0.F12478849263529740365.d(jY)) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(selectRangeGestureO));
                } else {
                    n1420218926656397722.j(jY);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    iH = 1;
                }
            } else if (dev.epro.r0.J14472086795230312938.D(handwritingGesture)) {
                android.view.inputmethod.DeleteRangeGesture deleteRangeGestureN = dev.epro.r0.J14472086795230312938.n(handwritingGesture);
                i2 = dev.epro.r0.U16248190607760379657.s(deleteRangeGestureN) == 1 ? 1 : 0;
                long jY2 = dev.epro.r0.J8045362843799184672.Y(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.x(deleteRangeGestureN)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.t(deleteRangeGestureN)), i2);
                if (dev.epro.r0.F12478849263529740365.d(jY2)) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(deleteRangeGestureN));
                } else {
                    if (i2 == 1) {
                        jY2 = dev.epro.r0.J8045362843799184672.q(jY2, n1420218926656397722.d());
                    }
                    dev.epro.r0.N1420218926656397722.i(n1420218926656397722, "", jY2, false, false, 28);
                    iH = 1;
                }
            } else if (dev.epro.r0.U16248190607760379657.B(handwritingGesture)) {
                android.view.inputmethod.JoinOrSplitGesture joinOrSplitGestureK = dev.epro.r0.U16248190607760379657.k(handwritingGesture);
                if (n1420218926656397722.a.d() != n1420218926656397722.a.d()) {
                    iH = 3;
                } else {
                    long jW0 = dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.h(joinOrSplitGestureK));
                    dev.epro.r0.Q17957571128037780363 q17957571128037780363C2 = i12071840179596922896.c();
                    int iT = q17957571128037780363C2 != null ? dev.epro.r0.J8045362843799184672.T(q17957571128037780363C2.b, jW0, i12071840179596922896.e(), k1865709164992808030) : -1;
                    if (iT == -1 || ((q17957571128037780363C = i12071840179596922896.c()) != null && dev.epro.r0.J8045362843799184672.e0(q17957571128037780363C, iT))) {
                        iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(joinOrSplitGestureK));
                    } else {
                        long jO0 = dev.epro.r0.J8045362843799184672.o0(n1420218926656397722.d(), iT);
                        if (dev.epro.r0.F12478849263529740365.d(jO0)) {
                            dev.epro.r0.N1420218926656397722.i(n1420218926656397722, " ", jO0, false, false, 28);
                        } else {
                            dev.epro.r0.N1420218926656397722.i(n1420218926656397722, "", jO0, false, false, 28);
                        }
                        iH = 1;
                    }
                }
            } else if (dev.epro.r0.U16248190607760379657.w(handwritingGesture)) {
                android.view.inputmethod.InsertGesture insertGestureJ = dev.epro.r0.U16248190607760379657.j(handwritingGesture);
                long jW02 = dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.U16248190607760379657.e(insertGestureJ));
                dev.epro.r0.Q17957571128037780363 q17957571128037780363C3 = i12071840179596922896.c();
                int iT2 = q17957571128037780363C3 != null ? dev.epro.r0.J8045362843799184672.T(q17957571128037780363C3.b, jW02, i12071840179596922896.e(), k1865709164992808030) : -1;
                if (iT2 == -1) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(insertGestureJ));
                } else {
                    dev.epro.r0.N1420218926656397722.i(n1420218926656397722, dev.epro.r0.U16248190607760379657.o(insertGestureJ), dev.epro.r0.T1335862270807194835.d(iT2, iT2), false, false, 28);
                    iH = 1;
                }
            } else if (dev.epro.r0.U16248190607760379657.z(handwritingGesture)) {
                android.view.inputmethod.RemoveSpaceGesture removeSpaceGestureL = dev.epro.r0.U16248190607760379657.l(handwritingGesture);
                long jU = dev.epro.r0.J8045362843799184672.U(i12071840179596922896.c(), dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.i(removeSpaceGestureL)), dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.y(removeSpaceGestureL)), i12071840179596922896.e(), k1865709164992808030);
                if (dev.epro.r0.F12478849263529740365.d(jU)) {
                    iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(removeSpaceGestureL));
                } else {
                    dev.epro.r0.A8284336046188466534 a8284336046188466534 = new dev.epro.r0.A8284336046188466534();
                    a8284336046188466534.a = -1;
                    dev.epro.r0.A8284336046188466534 a82843360461884665342 = new dev.epro.r0.A8284336046188466534();
                    a82843360461884665342.a = -1;
                    java.lang.String strG = new dev.epro.r0.H5336160545165318150("\\s+").g(dev.epro.r0.T1335862270807194835.s(jU, n1420218926656397722.d()), new dev.epro.r0.H4075047774632263339(a8284336046188466534, a82843360461884665342, (byte) 0));
                    int i4 = a8284336046188466534.a;
                    if (i4 == -1 || (i = a82843360461884665342.a) == -1) {
                        iH = dev.epro.r0.K5751602218013079365.H(n1420218926656397722, dev.epro.r0.U16248190607760379657.i(removeSpaceGestureL));
                    } else {
                        int i5 = (int) (jU >> 32);
                        dev.epro.r0.N1420218926656397722.i(n1420218926656397722, strG.substring(a8284336046188466534.a, strG.length() - (dev.epro.r0.F12478849263529740365.e(jU) - a82843360461884665342.a)), dev.epro.r0.T1335862270807194835.d(i4 + i5, i5 + i), false, false, 28);
                        iH = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new dev.epro.r0.G12010629111624924329(intConsumer, iH, (byte) 1));
        } else {
            intConsumer.accept(iH);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        java.util.Objects.toString(previewableHandwritingGesture);
        java.util.Objects.toString(cancellationSignal);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
            dev.epro.r0.N1420218926656397722 n1420218926656397722 = (dev.epro.r0.N1420218926656397722) x9608137461199640409.d;
            dev.epro.r0.I12071840179596922896 i12071840179596922896 = (dev.epro.r0.I12071840179596922896) x9608137461199640409.i;
            if (dev.epro.r0.U16248190607760379657.r(previewableHandwritingGesture)) {
                android.view.inputmethod.SelectGesture selectGestureM = dev.epro.r0.U16248190607760379657.m(previewableHandwritingGesture);
                dev.epro.r0.K5751602218013079365.P(n1420218926656397722, dev.epro.r0.J8045362843799184672.W(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.h(selectGestureM)), dev.epro.r0.U16248190607760379657.c(selectGestureM) != 1 ? 0 : 1), 0);
            } else if (dev.epro.r0.J14472086795230312938.w(previewableHandwritingGesture)) {
                android.view.inputmethod.DeleteGesture deleteGestureM = dev.epro.r0.J14472086795230312938.m(previewableHandwritingGesture);
                dev.epro.r0.K5751602218013079365.P(n1420218926656397722, dev.epro.r0.J8045362843799184672.W(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.f(deleteGestureM)), dev.epro.r0.U16248190607760379657.a(deleteGestureM) == 1 ? 1 : 0), 1);
            } else if (dev.epro.r0.J14472086795230312938.B(previewableHandwritingGesture)) {
                android.view.inputmethod.SelectRangeGesture selectRangeGestureO = dev.epro.r0.J14472086795230312938.o(previewableHandwritingGesture);
                dev.epro.r0.K5751602218013079365.P(n1420218926656397722, dev.epro.r0.J8045362843799184672.Y(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.k(selectRangeGestureO)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.z(selectRangeGestureO)), dev.epro.r0.U16248190607760379657.d(selectRangeGestureO) != 1 ? 0 : 1), 0);
            } else if (dev.epro.r0.J14472086795230312938.D(previewableHandwritingGesture)) {
                android.view.inputmethod.DeleteRangeGesture deleteRangeGestureN = dev.epro.r0.J14472086795230312938.n(previewableHandwritingGesture);
                dev.epro.r0.K5751602218013079365.P(n1420218926656397722, dev.epro.r0.J8045362843799184672.Y(i12071840179596922896, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.g(deleteRangeGestureN)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.t(deleteRangeGestureN)), dev.epro.r0.U16248190607760379657.b(deleteRangeGestureN) == 1 ? 1 : 0), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new dev.epro.r0.B9951899438396776027(n1420218926656397722, (byte) 2));
            }
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        android.view.inputmethod.CursorAnchorInfo cursorAnchorInfoA;
        dev.epro.r0.L16033300369903415380 l16033300369903415380 = (dev.epro.r0.L16033300369903415380) this.a.h;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z3 = (i & 16) != 0;
            z4 = (i & 8) != 0;
            z2 = (i & 4) != 0;
            z = i2 >= 34 && (i & 32) != 0;
            if (!z3 && !z4 && !z2 && !z) {
                if (i2 >= 34) {
                    z = true;
                    z3 = true;
                } else {
                    z3 = true;
                }
                z4 = z3;
                z2 = z4;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        l16033300369903415380.f = z3;
        l16033300369903415380.g = z4;
        l16033300369903415380.h = z2;
        l16033300369903415380.i = z;
        if (z5 && (cursorAnchorInfoA = l16033300369903415380.a()) != null) {
            dev.epro.r0.W8455343525638953052 w8455343525638953052 = l16033300369903415380.c;
            w8455343525638953052.L().updateCursorAnchorInfo((android.view.View) w8455343525638953052.b, cursorAnchorInfoA);
        }
        dev.epro.r0.X7175349259954592591 x7175349259954592591 = l16033300369903415380.e;
        if (!z6) {
            if (x7175349259954592591 != null) {
                x7175349259954592591.c((java.util.concurrent.CancellationException) null);
            }
            l16033300369903415380.e = null;
            return true;
        }
        if (x7175349259954592591 != null && x7175349259954592591.b()) {
            return true;
        }
        l16033300369903415380.e = dev.epro.r0.R7033599853981556291.E(l16033300369903415380.d, (dev.epro.r0.G8001132634698687269) null, dev.epro.r0.L856869997670741194.d, new dev.epro.r0.G16212247282630895364(l16033300369903415380, (dev.epro.r0.R4833348786910499294) null, (byte) 0), 1);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        java.util.Objects.toString(keyEvent);
        dev.epro.r0.W8455343525638953052 w8455343525638953052 = (dev.epro.r0.W8455343525638953052) this.a.e;
        w8455343525638953052.L().dispatchKeyEventFromInputMethod((android.view.View) w8455343525638953052.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new dev.epro.r0.G3380524581901889884(i, i2, x9608137461199640409, (byte) 2));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setComposingText(java.lang.CharSequence r35, int r36) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A15982971418573018934.setComposingText(java.lang.CharSequence, int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        dev.epro.r0.X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new dev.epro.r0.G3380524581901889884(x9608137461199640409, i, i2, (byte) 0));
        ((dev.epro.r0.F4096073349764486348) x9608137461199640409.g).invoke(java.lang.Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        java.util.Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.h(new dev.epro.r0.M18374774969436364933(charSequence.toString(), i, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i, android.view.inputmethod.TextAttribute textAttribute) {
        java.util.Objects.toString(charSequence);
        java.util.Objects.toString(textAttribute);
        this.a.h(new dev.epro.r0.Q16829635822268228021(charSequence.toString(), (java.util.List) null, i, (android.os.Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : dev.epro.r0.K5395552668562208334.g(textAttribute)));
        return true;
    }
}
