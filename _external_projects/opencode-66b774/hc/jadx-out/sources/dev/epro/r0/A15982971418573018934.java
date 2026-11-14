package dev.epro.r0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.view.inputmethod.TextAttribute;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A15982971418573018934 implements InputConnection {
    public final X9608137461199640409 a;
    public final D389890677992184566 b = new D389890677992184566(0, new F4096073349764486348[16]);
    public final InputConnection c;

    public A15982971418573018934(X9608137461199640409 x9608137461199640409, EditorInfo editorInfo) {
        this.a = x9608137461199640409;
        this.c = V12319504402545346730.x(new T5044579568032097231(this, false), editorInfo, new U11450443558875589191(this, (byte) 0));
    }

    public final C8185053590072587931 a() {
        return ((N1420218926656397722) this.a.d).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((O3228356295430981133) this.a.b).a++;
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
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return this.c.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.h(new M18374774969436364933(charSequence.toString(), i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : textAttribute.isTextSuggestionSelected()));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new G3380524581901889884(i, i2, x9608137461199640409, (byte) 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        final byte b = 0;
        this.a.h(new F4096073349764486348() { // from class: dev.epro.r0.N8868719937406905418
            static {
                izmyclvb.dpqpjfpoanwt1(1053);
            }

            @Override // dev.epro.r0.F4096073349764486348
            public final native Object invoke(Object obj);
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((O3228356295430981133) this.a.b).h();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.h(new U3828252728192849465((byte) 26));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), F12478849263529740365.g(a().d), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        C8185053590072587931 c8185053590072587931A = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c8185053590072587931A;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c8185053590072587931A.c.length();
        extractedText.partialStartOffset = -1;
        long j = c8185053590072587931A.d;
        extractedText.selectionStart = F12478849263529740365.g(j);
        extractedText.selectionEnd = F12478849263529740365.f(j);
        extractedText.flags = !M8927913404651150384.M(c8185053590072587931A, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (F12478849263529740365.d(a().d)) {
            return null;
        }
        C8185053590072587931 c8185053590072587931A = a();
        return c8185053590072587931A.c.subSequence(F12478849263529740365.g(c8185053590072587931A.d), F12478849263529740365.f(c8185053590072587931A.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        C8185053590072587931 c8185053590072587931A = a();
        long j = c8185053590072587931A.d;
        CharSequence charSequence = c8185053590072587931A.c;
        int iF = F12478849263529740365.f(j);
        int iF2 = F12478849263529740365.f(c8185053590072587931A.d);
        int length = iF2 + i;
        if (((iF2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        C8185053590072587931 c8185053590072587931A = a();
        int iG = F12478849263529740365.g(c8185053590072587931A.d);
        int i3 = iG - i;
        if (((i ^ iG) & (iG ^ i3)) < 0) {
            i3 = 0;
        }
        return c8185053590072587931A.c.subSequence(Math.max(0, i3), F12478849263529740365.g(c8185053590072587931A.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                int length = a().c.length();
                X9608137461199640409 x9608137461199640409 = this.a;
                x9608137461199640409.h(new G3380524581901889884(x9608137461199640409, 0, length, (byte) 0));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
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
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        Q17957571128037780363 q17957571128037780363C;
        int i2;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 34) {
            return;
        }
        int iH = 2;
        if (i3 >= 34) {
            X9608137461199640409 x9608137461199640409 = this.a;
            N1420218926656397722 n1420218926656397722 = (N1420218926656397722) x9608137461199640409.d;
            I12071840179596922896 i12071840179596922896 = (I12071840179596922896) x9608137461199640409.i;
            B13729205492206812220 b13729205492206812220 = (B13729205492206812220) x9608137461199640409.j;
            K1865709164992808030 k1865709164992808030 = (K1865709164992808030) x9608137461199640409.k;
            if (U16248190607760379657.r(handwritingGesture)) {
                SelectGesture selectGestureM = U16248190607760379657.m(handwritingGesture);
                long jW = J8045362843799184672.W(i12071840179596922896, X7410747940286448830.w(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() == 1 ? 1 : 0);
                if (F12478849263529740365.d(jW)) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(selectGestureM));
                } else {
                    n1420218926656397722.j(jW);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    iH = 1;
                }
            } else if (J14472086795230312938.w(handwritingGesture)) {
                DeleteGesture deleteGestureM = J14472086795230312938.m(handwritingGesture);
                i2 = deleteGestureM.getGranularity() == 1 ? 1 : 0;
                long jW2 = J8045362843799184672.W(i12071840179596922896, X7410747940286448830.w(deleteGestureM.getDeletionArea()), i2);
                if (F12478849263529740365.d(jW2)) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(deleteGestureM));
                } else {
                    if (i2 == 1) {
                        jW2 = J8045362843799184672.q(jW2, n1420218926656397722.d());
                    }
                    N1420218926656397722.i(n1420218926656397722, "", jW2, false, false, 28);
                    iH = 1;
                }
            } else if (J14472086795230312938.B(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureO = J14472086795230312938.o(handwritingGesture);
                long jY = J8045362843799184672.Y(i12071840179596922896, X7410747940286448830.w(selectRangeGestureO.getSelectionStartArea()), X7410747940286448830.w(selectRangeGestureO.getSelectionEndArea()), selectRangeGestureO.getGranularity() == 1 ? 1 : 0);
                if (F12478849263529740365.d(jY)) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(selectRangeGestureO));
                } else {
                    n1420218926656397722.j(jY);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    iH = 1;
                }
            } else if (J14472086795230312938.D(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureN = J14472086795230312938.n(handwritingGesture);
                i2 = deleteRangeGestureN.getGranularity() == 1 ? 1 : 0;
                long jY2 = J8045362843799184672.Y(i12071840179596922896, X7410747940286448830.w(deleteRangeGestureN.getDeletionStartArea()), X7410747940286448830.w(deleteRangeGestureN.getDeletionEndArea()), i2);
                if (F12478849263529740365.d(jY2)) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(deleteRangeGestureN));
                } else {
                    if (i2 == 1) {
                        jY2 = J8045362843799184672.q(jY2, n1420218926656397722.d());
                    }
                    N1420218926656397722.i(n1420218926656397722, "", jY2, false, false, 28);
                    iH = 1;
                }
            } else if (U16248190607760379657.B(handwritingGesture)) {
                JoinOrSplitGesture joinOrSplitGestureK = U16248190607760379657.k(handwritingGesture);
                if (n1420218926656397722.a.d() != n1420218926656397722.a.d()) {
                    iH = 3;
                } else {
                    long jW0 = J8045362843799184672.w0(joinOrSplitGestureK.getJoinOrSplitPoint());
                    Q17957571128037780363 q17957571128037780363C2 = i12071840179596922896.c();
                    int iT = q17957571128037780363C2 != null ? J8045362843799184672.T(q17957571128037780363C2.b, jW0, i12071840179596922896.e(), k1865709164992808030) : -1;
                    if (iT == -1 || ((q17957571128037780363C = i12071840179596922896.c()) != null && J8045362843799184672.e0(q17957571128037780363C, iT))) {
                        iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(joinOrSplitGestureK));
                    } else {
                        long jO0 = J8045362843799184672.o0(n1420218926656397722.d(), iT);
                        if (F12478849263529740365.d(jO0)) {
                            N1420218926656397722.i(n1420218926656397722, " ", jO0, false, false, 28);
                        } else {
                            N1420218926656397722.i(n1420218926656397722, "", jO0, false, false, 28);
                        }
                        iH = 1;
                    }
                }
            } else if (U16248190607760379657.w(handwritingGesture)) {
                InsertGesture insertGestureJ = U16248190607760379657.j(handwritingGesture);
                long jW02 = J8045362843799184672.w0(insertGestureJ.getInsertionPoint());
                Q17957571128037780363 q17957571128037780363C3 = i12071840179596922896.c();
                int iT2 = q17957571128037780363C3 != null ? J8045362843799184672.T(q17957571128037780363C3.b, jW02, i12071840179596922896.e(), k1865709164992808030) : -1;
                if (iT2 == -1) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(insertGestureJ));
                } else {
                    N1420218926656397722.i(n1420218926656397722, insertGestureJ.getTextToInsert(), T1335862270807194835.d(iT2, iT2), false, false, 28);
                    iH = 1;
                }
            } else if (U16248190607760379657.z(handwritingGesture)) {
                RemoveSpaceGesture removeSpaceGestureL = U16248190607760379657.l(handwritingGesture);
                long jU = J8045362843799184672.U(i12071840179596922896.c(), J8045362843799184672.w0(removeSpaceGestureL.getStartPoint()), J8045362843799184672.w0(removeSpaceGestureL.getEndPoint()), i12071840179596922896.e(), k1865709164992808030);
                if (F12478849263529740365.d(jU)) {
                    iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(removeSpaceGestureL));
                } else {
                    A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
                    a8284336046188466534.a = -1;
                    A8284336046188466534 a82843360461884665342 = new A8284336046188466534();
                    a82843360461884665342.a = -1;
                    String strG = new H5336160545165318150("\\s+").g(T1335862270807194835.s(jU, n1420218926656397722.d()), new H4075047774632263339(a8284336046188466534, a82843360461884665342, (byte) 0));
                    int i4 = a8284336046188466534.a;
                    if (i4 == -1 || (i = a82843360461884665342.a) == -1) {
                        iH = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(removeSpaceGestureL));
                    } else {
                        int i5 = (int) (jU >> 32);
                        N1420218926656397722.i(n1420218926656397722, strG.substring(a8284336046188466534.a, strG.length() - (F12478849263529740365.e(jU) - a82843360461884665342.a)), T1335862270807194835.d(i4 + i5, i5 + i), false, false, 28);
                        iH = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new G12010629111624924329(intConsumer, iH, (byte) 1));
        } else {
            intConsumer.accept(iH);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            X9608137461199640409 x9608137461199640409 = this.a;
            N1420218926656397722 n1420218926656397722 = (N1420218926656397722) x9608137461199640409.d;
            I12071840179596922896 i12071840179596922896 = (I12071840179596922896) x9608137461199640409.i;
            if (U16248190607760379657.r(previewableHandwritingGesture)) {
                SelectGesture selectGestureM = U16248190607760379657.m(previewableHandwritingGesture);
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.W(i12071840179596922896, X7410747940286448830.w(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1), 0);
            } else if (J14472086795230312938.w(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureM = J14472086795230312938.m(previewableHandwritingGesture);
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.W(i12071840179596922896, X7410747940286448830.w(deleteGestureM.getDeletionArea()), deleteGestureM.getGranularity() == 1 ? 1 : 0), 1);
            } else if (J14472086795230312938.B(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureO = J14472086795230312938.o(previewableHandwritingGesture);
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.Y(i12071840179596922896, X7410747940286448830.w(selectRangeGestureO.getSelectionStartArea()), X7410747940286448830.w(selectRangeGestureO.getSelectionEndArea()), selectRangeGestureO.getGranularity() != 1 ? 0 : 1), 0);
            } else if (J14472086795230312938.D(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureN = J14472086795230312938.n(previewableHandwritingGesture);
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.Y(i12071840179596922896, X7410747940286448830.w(deleteRangeGestureN.getDeletionStartArea()), X7410747940286448830.w(deleteRangeGestureN.getDeletionEndArea()), deleteRangeGestureN.getGranularity() == 1 ? 1 : 0), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new B9951899438396776027(n1420218926656397722, (byte) 2));
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
        CursorAnchorInfo cursorAnchorInfoA;
        L16033300369903415380 l16033300369903415380 = (L16033300369903415380) this.a.h;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
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
            W8455343525638953052 w8455343525638953052 = l16033300369903415380.c;
            w8455343525638953052.L().updateCursorAnchorInfo((View) w8455343525638953052.b, cursorAnchorInfoA);
        }
        X7175349259954592591 x7175349259954592591 = l16033300369903415380.e;
        if (!z6) {
            if (x7175349259954592591 != null) {
                x7175349259954592591.c(null);
            }
            l16033300369903415380.e = null;
            return true;
        }
        if (x7175349259954592591 != null && x7175349259954592591.b()) {
            return true;
        }
        l16033300369903415380.e = R7033599853981556291.E(l16033300369903415380.d, null, L856869997670741194.d, new G16212247282630895364(l16033300369903415380, null, (byte) 0), 1);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        W8455343525638953052 w8455343525638953052 = (W8455343525638953052) this.a.e;
        w8455343525638953052.L().dispatchKeyEventFromInputMethod((View) w8455343525638953052.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new G3380524581901889884(i, i2, x9608137461199640409, (byte) 2));
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
        X9608137461199640409 x9608137461199640409 = this.a;
        x9608137461199640409.h(new G3380524581901889884(x9608137461199640409, i, i2, (byte) 0));
        ((F4096073349764486348) x9608137461199640409.g).invoke(Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.h(new M18374774969436364933(charSequence.toString(), i, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.h(new Q16829635822268228021(charSequence.toString(), null, i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : textAttribute.isTextSuggestionSelected()));
        return true;
    }
}
