package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6632305590049854808 implements android.view.inputmethod.InputConnection {
    public final dev.epro.r0.F6942723054099263096 a;
    public final boolean b;
    public final dev.epro.r0.I2076339260272013590 c;
    public final dev.epro.r0.L9852841107405549527 d;
    public final dev.epro.r0.K1865709164992808030 e;
    public int f;
    public dev.epro.r0.F13241018602672925865 g;
    public int h;
    public boolean i;
    public final java.util.ArrayList j = new java.util.ArrayList();
    public boolean k = true;

    public B6632305590049854808(dev.epro.r0.F13241018602672925865 f13241018602672925865, dev.epro.r0.F6942723054099263096 f6942723054099263096, boolean z, dev.epro.r0.I2076339260272013590 i2076339260272013590, dev.epro.r0.L9852841107405549527 l9852841107405549527, dev.epro.r0.K1865709164992808030 k1865709164992808030) {
        this.a = f6942723054099263096;
        this.b = z;
        this.c = i2076339260272013590;
        this.d = l9852841107405549527;
        this.e = k1865709164992808030;
        this.g = f13241018602672925865;
    }

    public final void a(dev.epro.r0.C2322693828285680440 c2322693828285680440) {
        this.f++;
        try {
            this.j.add(c2322693828285680440);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            java.util.ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((dev.epro.r0.B9595992830626540128) this.a.b).c.invoke(new java.util.ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new android.view.KeyEvent(0, i));
        sendKeyEvent(new android.view.KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        java.util.ArrayList arrayList = ((dev.epro.r0.B9595992830626540128) this.a.b).j;
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
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new dev.epro.r0.J14617885194716764421(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.L13686798803278025478(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
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
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.S1181215782212915507());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        dev.epro.r0.F13241018602672925865 f13241018602672925865 = this.g;
        return android.text.TextUtils.getCapsMode(f13241018602672925865.a.b, dev.epro.r0.F12478849263529740365.g(f13241018602672925865.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return dev.epro.r0.T13998044911588922055.m(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        if (dev.epro.r0.F12478849263529740365.d(this.g.b)) {
            return null;
        }
        return dev.epro.r0.E15826830759497041750.j(this.g).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        return dev.epro.r0.E15826830759497041750.k(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        return dev.epro.r0.E15826830759497041750.l(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case android.R.id.selectAll:
                    a(new dev.epro.r0.D4827454800931329865(0, this.g.a.b.length()));
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
            boolean r0 = r2.k
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
            dev.epro.r0.F6942723054099263096 r2 = r2.a
            java.lang.Object r2 = r2.b
            dev.epro.r0.B9595992830626540128 r2 = (dev.epro.r0.B9595992830626540128) r2
            dev.epro.r0.F4096073349764486348 r2 = r2.d
            dev.epro.r0.R512193971042300889 r1 = new dev.epro.r0.R512193971042300889
            r1.<init>(r3)
            r2.invoke(r1)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B6632305590049854808.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture handwritingGesture, java.util.concurrent.Executor executor, java.util.function.IntConsumer intConsumer) {
        dev.epro.r0.M11181104712105445833 m11181104712105445833;
        int i;
        dev.epro.r0.N17980339148608222959 n17980339148608222959D;
        dev.epro.r0.N17980339148608222959 n17980339148608222959D2;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            dev.epro.r0.H8734584053421516944 h8734584053421516944 = new dev.epro.r0.H8734584053421516944(this, (byte) 19);
            dev.epro.r0.I2076339260272013590 i2076339260272013590 = this.c;
            int I = 3;
            if (i2076339260272013590 != null && (m11181104712105445833 = i2076339260272013590.j) != null) {
                dev.epro.r0.N17980339148608222959 n17980339148608222959D3 = i2076339260272013590.d();
                if (m11181104712105445833.equals(n17980339148608222959D3 != null ? n17980339148608222959D3.a.a.a : null)) {
                    boolean zR = dev.epro.r0.U16248190607760379657.r(handwritingGesture);
                    dev.epro.r0.L9852841107405549527 l9852841107405549527 = this.d;
                    if (zR) {
                        android.view.inputmethod.SelectGesture selectGestureM = dev.epro.r0.U16248190607760379657.m(handwritingGesture);
                        long jV = dev.epro.r0.J8045362843799184672.V(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.h(selectGestureM)), dev.epro.r0.U16248190607760379657.c(selectGestureM) != 1 ? 0 : 1);
                        if (dev.epro.r0.F12478849263529740365.d(jV)) {
                            I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(selectGestureM), h8734584053421516944);
                        } else {
                            h8734584053421516944.invoke(new dev.epro.r0.D4827454800931329865((int) (jV >> 32), (int) (jV & 4294967295L)));
                            if (l9852841107405549527 != null) {
                                l9852841107405549527.e(true);
                            }
                            I = 1;
                        }
                    } else if (dev.epro.r0.J14472086795230312938.w(handwritingGesture)) {
                        android.view.inputmethod.DeleteGesture deleteGestureM = dev.epro.r0.J14472086795230312938.m(handwritingGesture);
                        int i2 = dev.epro.r0.J14472086795230312938.c(deleteGestureM) != 1 ? 0 : 1;
                        long jV2 = dev.epro.r0.J8045362843799184672.V(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.j(deleteGestureM)), i2);
                        if (dev.epro.r0.F12478849263529740365.d(jV2)) {
                            I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(deleteGestureM), h8734584053421516944);
                        } else {
                            dev.epro.r0.K5751602218013079365.Z(jV2, m11181104712105445833, i2 == 1, h8734584053421516944);
                            I = 1;
                        }
                    } else if (dev.epro.r0.J14472086795230312938.B(handwritingGesture)) {
                        android.view.inputmethod.SelectRangeGesture selectRangeGestureO = dev.epro.r0.J14472086795230312938.o(handwritingGesture);
                        long jX = dev.epro.r0.J8045362843799184672.X(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.k(selectRangeGestureO)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.z(selectRangeGestureO)), dev.epro.r0.U16248190607760379657.d(selectRangeGestureO) != 1 ? 0 : 1);
                        if (dev.epro.r0.F12478849263529740365.d(jX)) {
                            I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(selectRangeGestureO), h8734584053421516944);
                        } else {
                            h8734584053421516944.invoke(new dev.epro.r0.D4827454800931329865((int) (jX >> 32), (int) (jX & 4294967295L)));
                            if (l9852841107405549527 != null) {
                                l9852841107405549527.e(true);
                            }
                            I = 1;
                        }
                    } else if (dev.epro.r0.J14472086795230312938.D(handwritingGesture)) {
                        android.view.inputmethod.DeleteRangeGesture deleteRangeGestureN = dev.epro.r0.J14472086795230312938.n(handwritingGesture);
                        int i3 = dev.epro.r0.U16248190607760379657.s(deleteRangeGestureN) != 1 ? 0 : 1;
                        long jX2 = dev.epro.r0.J8045362843799184672.X(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.x(deleteRangeGestureN)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.t(deleteRangeGestureN)), i3);
                        if (dev.epro.r0.F12478849263529740365.d(jX2)) {
                            I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(deleteRangeGestureN), h8734584053421516944);
                        } else {
                            dev.epro.r0.K5751602218013079365.Z(jX2, m11181104712105445833, i3 == 1, h8734584053421516944);
                            I = 1;
                        }
                    } else {
                        boolean zB = dev.epro.r0.U16248190607760379657.B(handwritingGesture);
                        dev.epro.r0.K1865709164992808030 k1865709164992808030 = this.e;
                        if (zB) {
                            android.view.inputmethod.JoinOrSplitGesture joinOrSplitGestureK = dev.epro.r0.U16248190607760379657.k(handwritingGesture);
                            if (k1865709164992808030 == null) {
                                I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.u(joinOrSplitGestureK), h8734584053421516944);
                            } else {
                                long jW0 = dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.h(joinOrSplitGestureK));
                                dev.epro.r0.N17980339148608222959 n17980339148608222959D4 = i2076339260272013590.d();
                                int iT = n17980339148608222959D4 != null ? dev.epro.r0.J8045362843799184672.T(n17980339148608222959D4.a.b, jW0, i2076339260272013590.c(), k1865709164992808030) : -1;
                                if (iT == -1 || ((n17980339148608222959D2 = i2076339260272013590.d()) != null && dev.epro.r0.J8045362843799184672.e0(n17980339148608222959D2.a, iT))) {
                                    I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(joinOrSplitGestureK), h8734584053421516944);
                                } else {
                                    long jO0 = dev.epro.r0.J8045362843799184672.o0(m11181104712105445833, iT);
                                    if (dev.epro.r0.F12478849263529740365.d(jO0)) {
                                        int i4 = (int) (jO0 >> 32);
                                        h8734584053421516944.invoke(new dev.epro.r0.F8082984210800855746(new dev.epro.r0.C2322693828285680440[]{new dev.epro.r0.D4827454800931329865(i4, i4), new dev.epro.r0.J14617885194716764421(" ", 1)}));
                                    } else {
                                        dev.epro.r0.K5751602218013079365.Z(jO0, m11181104712105445833, false, h8734584053421516944);
                                    }
                                    I = 1;
                                }
                            }
                        } else if (dev.epro.r0.U16248190607760379657.w(handwritingGesture)) {
                            android.view.inputmethod.InsertGesture insertGestureJ = dev.epro.r0.U16248190607760379657.j(handwritingGesture);
                            if (k1865709164992808030 == null) {
                                I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.u(insertGestureJ), h8734584053421516944);
                            } else {
                                long jW02 = dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.U16248190607760379657.e(insertGestureJ));
                                dev.epro.r0.N17980339148608222959 n17980339148608222959D5 = i2076339260272013590.d();
                                int iT2 = n17980339148608222959D5 != null ? dev.epro.r0.J8045362843799184672.T(n17980339148608222959D5.a.b, jW02, i2076339260272013590.c(), k1865709164992808030) : -1;
                                if (iT2 == -1 || ((n17980339148608222959D = i2076339260272013590.d()) != null && dev.epro.r0.J8045362843799184672.e0(n17980339148608222959D.a, iT2))) {
                                    I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(insertGestureJ), h8734584053421516944);
                                } else {
                                    h8734584053421516944.invoke(new dev.epro.r0.F8082984210800855746(new dev.epro.r0.C2322693828285680440[]{new dev.epro.r0.D4827454800931329865(iT2, iT2), new dev.epro.r0.J14617885194716764421(dev.epro.r0.U16248190607760379657.o(insertGestureJ), 1)}));
                                    I = 1;
                                }
                            }
                        } else if (dev.epro.r0.U16248190607760379657.z(handwritingGesture)) {
                            android.view.inputmethod.RemoveSpaceGesture removeSpaceGestureL = dev.epro.r0.U16248190607760379657.l(handwritingGesture);
                            dev.epro.r0.N17980339148608222959 n17980339148608222959D6 = i2076339260272013590.d();
                            long jU = dev.epro.r0.J8045362843799184672.U(n17980339148608222959D6 != null ? n17980339148608222959D6.a : null, dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.i(removeSpaceGestureL)), dev.epro.r0.J8045362843799184672.w0(dev.epro.r0.J14472086795230312938.y(removeSpaceGestureL)), i2076339260272013590.c(), k1865709164992808030);
                            if (dev.epro.r0.F12478849263529740365.d(jU)) {
                                I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(removeSpaceGestureL), h8734584053421516944);
                            } else {
                                dev.epro.r0.A8284336046188466534 a8284336046188466534 = new dev.epro.r0.A8284336046188466534();
                                a8284336046188466534.a = -1;
                                dev.epro.r0.A8284336046188466534 a82843360461884665342 = new dev.epro.r0.A8284336046188466534();
                                a82843360461884665342.a = -1;
                                java.lang.String strG = new dev.epro.r0.H5336160545165318150("\\s+").g(dev.epro.r0.T1335862270807194835.s(jU, m11181104712105445833), new dev.epro.r0.H4075047774632263339(a8284336046188466534, a82843360461884665342, (byte) 1));
                                int i5 = a8284336046188466534.a;
                                if (i5 == -1 || (i = a82843360461884665342.a) == -1) {
                                    I = dev.epro.r0.K5751602218013079365.I(dev.epro.r0.U16248190607760379657.i(removeSpaceGestureL), h8734584053421516944);
                                } else {
                                    int i6 = (int) (jU >> 32);
                                    h8734584053421516944.invoke(new dev.epro.r0.F8082984210800855746(new dev.epro.r0.C2322693828285680440[]{new dev.epro.r0.D4827454800931329865(i6 + i5, i6 + i), new dev.epro.r0.J14617885194716764421(strG.substring(i5, strG.length() - (dev.epro.r0.F12478849263529740365.e(jU) - a82843360461884665342.a)), 1)}));
                                    I = 1;
                                }
                            }
                        } else {
                            I = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new dev.epro.r0.G12010629111624924329(intConsumer, I, (byte) 0));
            } else {
                intConsumer.accept(I);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        dev.epro.r0.I2076339260272013590 i2076339260272013590;
        dev.epro.r0.M11181104712105445833 m11181104712105445833;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (i2076339260272013590 = this.c) != null && (m11181104712105445833 = i2076339260272013590.j) != null) {
            dev.epro.r0.N17980339148608222959 n17980339148608222959D = i2076339260272013590.d();
            if (m11181104712105445833.equals(n17980339148608222959D != null ? n17980339148608222959D.a.a.a : null)) {
                boolean zR = dev.epro.r0.U16248190607760379657.r(previewableHandwritingGesture);
                dev.epro.r0.I3645473568512758926 i3645473568512758926 = dev.epro.r0.I3645473568512758926.a;
                dev.epro.r0.L9852841107405549527 l9852841107405549527 = this.d;
                if (zR) {
                    android.view.inputmethod.SelectGesture selectGestureM = dev.epro.r0.U16248190607760379657.m(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        long jV = dev.epro.r0.J8045362843799184672.V(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.h(selectGestureM)), dev.epro.r0.U16248190607760379657.c(selectGestureM) != 1 ? 0 : 1);
                        dev.epro.r0.I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
                        if (i20763392602720135902 != null) {
                            i20763392602720135902.f(jV);
                        }
                        dev.epro.r0.I2076339260272013590 i20763392602720135903 = l9852841107405549527.d;
                        if (i20763392602720135903 != null) {
                            i20763392602720135903.e(dev.epro.r0.F12478849263529740365.b);
                        }
                        if (!dev.epro.r0.F12478849263529740365.d(jV)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (dev.epro.r0.J14472086795230312938.w(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteGesture deleteGestureM = dev.epro.r0.J14472086795230312938.m(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        long jV2 = dev.epro.r0.J8045362843799184672.V(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.f(deleteGestureM)), dev.epro.r0.U16248190607760379657.a(deleteGestureM) != 1 ? 0 : 1);
                        dev.epro.r0.I2076339260272013590 i20763392602720135904 = l9852841107405549527.d;
                        if (i20763392602720135904 != null) {
                            i20763392602720135904.e(jV2);
                        }
                        dev.epro.r0.I2076339260272013590 i20763392602720135905 = l9852841107405549527.d;
                        if (i20763392602720135905 != null) {
                            i20763392602720135905.f(dev.epro.r0.F12478849263529740365.b);
                        }
                        if (!dev.epro.r0.F12478849263529740365.d(jV2)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (dev.epro.r0.J14472086795230312938.B(previewableHandwritingGesture)) {
                    android.view.inputmethod.SelectRangeGesture selectRangeGestureO = dev.epro.r0.J14472086795230312938.o(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        long jX = dev.epro.r0.J8045362843799184672.X(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.k(selectRangeGestureO)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.J14472086795230312938.z(selectRangeGestureO)), dev.epro.r0.U16248190607760379657.d(selectRangeGestureO) != 1 ? 0 : 1);
                        dev.epro.r0.I2076339260272013590 i20763392602720135906 = l9852841107405549527.d;
                        if (i20763392602720135906 != null) {
                            i20763392602720135906.f(jX);
                        }
                        dev.epro.r0.I2076339260272013590 i20763392602720135907 = l9852841107405549527.d;
                        if (i20763392602720135907 != null) {
                            i20763392602720135907.e(dev.epro.r0.F12478849263529740365.b);
                        }
                        if (!dev.epro.r0.F12478849263529740365.d(jX)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (dev.epro.r0.J14472086795230312938.D(previewableHandwritingGesture)) {
                    android.view.inputmethod.DeleteRangeGesture deleteRangeGestureN = dev.epro.r0.J14472086795230312938.n(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        long jX2 = dev.epro.r0.J8045362843799184672.X(i2076339260272013590, dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.g(deleteRangeGestureN)), dev.epro.r0.X7410747940286448830.w(dev.epro.r0.U16248190607760379657.t(deleteRangeGestureN)), dev.epro.r0.U16248190607760379657.b(deleteRangeGestureN) != 1 ? 0 : 1);
                        dev.epro.r0.I2076339260272013590 i20763392602720135908 = l9852841107405549527.d;
                        if (i20763392602720135908 != null) {
                            i20763392602720135908.e(jX2);
                        }
                        dev.epro.r0.I2076339260272013590 i20763392602720135909 = l9852841107405549527.d;
                        if (i20763392602720135909 != null) {
                            i20763392602720135909.f(dev.epro.r0.F12478849263529740365.b);
                        }
                        if (!dev.epro.r0.F12478849263529740365.d(jX2)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new dev.epro.r0.B9951899438396776027(l9852841107405549527, (byte) 1));
                }
                return true;
            }
        }
        return false;
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
            boolean r0 = r9.k
            if (r0 == 0) goto L79
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
            dev.epro.r0.F6942723054099263096 r9 = r9.a
            java.lang.Object r9 = r9.b
            dev.epro.r0.B9595992830626540128 r9 = (dev.epro.r0.B9595992830626540128) r9
            dev.epro.r0.Y11675591421631573075 r9 = r9.m
            java.lang.Object r4 = r9.i
            monitor-enter(r4)
            r9.c = r5     // Catch: java.lang.Throwable -> L71
            r9.d = r6     // Catch: java.lang.Throwable -> L71
            r9.e = r1     // Catch: java.lang.Throwable -> L71
            r9.f = r10     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L73
            r9.b = r2     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r9.j     // Catch: java.lang.Throwable -> L71
            dev.epro.r0.F13241018602672925865 r10 = (dev.epro.r0.F13241018602672925865) r10     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L73
            r9.e()     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r9 = move-exception
            goto L77
        L73:
            r9.a = r3     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)
            return r2
        L77:
            monitor-exit(r4)
            throw r9
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B6632305590049854808.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((android.view.inputmethod.BaseInputConnection) ((dev.epro.r0.B9595992830626540128) this.a.b).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new dev.epro.r0.C5725033187322898527(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new dev.epro.r0.X10863724561514067198(java.lang.String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new dev.epro.r0.D4827454800931329865(i, i2));
        return true;
    }
}
