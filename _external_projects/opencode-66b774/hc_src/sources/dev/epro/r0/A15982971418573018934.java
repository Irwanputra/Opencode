package dev.epro.r0;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
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
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import o.bwmna.gdrqkg.izmyclvb;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
        boolean commitContent;
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        commitContent = this.c.commitContent(inputContentInfo, i, bundle);
        return commitContent;
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
        C8185053590072587931 a = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a.c.length();
        extractedText.partialStartOffset = -1;
        long j = a.d;
        extractedText.selectionStart = F12478849263529740365.g(j);
        extractedText.selectionEnd = F12478849263529740365.f(j);
        extractedText.flags = !M8927913404651150384.M(a, '\n') ? 1 : 0;
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
        C8185053590072587931 a = a();
        return a.c.subSequence(F12478849263529740365.g(a.d), F12478849263529740365.f(a.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        C8185053590072587931 a = a();
        long j = a.d;
        CharSequence charSequence = a.c;
        int f = F12478849263529740365.f(j);
        int f2 = F12478849263529740365.f(a.d);
        int i3 = f2 + i;
        if (((f2 ^ i3) & (i ^ i3)) < 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(f, Math.min(i3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        C8185053590072587931 a = a();
        int g = F12478849263529740365.g(a.d);
        int i3 = g - i;
        if (((i ^ g) & (g ^ i3)) < 0) {
            i3 = 0;
        }
        return a.c.subSequence(Math.max(0, i3), F12478849263529740365.g(a.d)).toString();
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
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
        PointF startPoint;
        PointF endPoint;
        int i;
        PointF insertionPoint;
        String textToInsert;
        PointF joinOrSplitPoint;
        Q17957571128037780363 c;
        int granularity;
        int i2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 34) {
            return;
        }
        int i4 = 2;
        if (i3 >= 34) {
            X9608137461199640409 x9608137461199640409 = this.a;
            N1420218926656397722 n1420218926656397722 = (N1420218926656397722) x9608137461199640409.d;
            I12071840179596922896 i12071840179596922896 = (I12071840179596922896) x9608137461199640409.i;
            B13729205492206812220 b13729205492206812220 = (B13729205492206812220) x9608137461199640409.j;
            K1865709164992808030 k1865709164992808030 = (K1865709164992808030) x9608137461199640409.k;
            if (U16248190607760379657.r(handwritingGesture)) {
                SelectGesture m = U16248190607760379657.m(handwritingGesture);
                selectionArea = m.getSelectionArea();
                S6349823729575121924 w = X7410747940286448830.w(selectionArea);
                granularity4 = m.getGranularity();
                long W = J8045362843799184672.W(i12071840179596922896, w, granularity4 == 1 ? 1 : 0);
                if (F12478849263529740365.d(W)) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(m));
                } else {
                    n1420218926656397722.j(W);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    i4 = 1;
                }
            } else if (J14472086795230312938.w(handwritingGesture)) {
                DeleteGesture m2 = J14472086795230312938.m(handwritingGesture);
                granularity3 = m2.getGranularity();
                i2 = granularity3 == 1 ? 1 : 0;
                deletionArea = m2.getDeletionArea();
                long W2 = J8045362843799184672.W(i12071840179596922896, X7410747940286448830.w(deletionArea), i2);
                if (F12478849263529740365.d(W2)) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(m2));
                } else {
                    if (i2 == 1) {
                        W2 = J8045362843799184672.q(W2, n1420218926656397722.d());
                    }
                    N1420218926656397722.i(n1420218926656397722, "", W2, false, false, 28);
                    i4 = 1;
                }
            } else if (J14472086795230312938.B(handwritingGesture)) {
                SelectRangeGesture o2 = J14472086795230312938.o(handwritingGesture);
                selectionStartArea = o2.getSelectionStartArea();
                S6349823729575121924 w2 = X7410747940286448830.w(selectionStartArea);
                selectionEndArea = o2.getSelectionEndArea();
                S6349823729575121924 w3 = X7410747940286448830.w(selectionEndArea);
                granularity2 = o2.getGranularity();
                long Y = J8045362843799184672.Y(i12071840179596922896, w2, w3, granularity2 == 1 ? 1 : 0);
                if (F12478849263529740365.d(Y)) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(o2));
                } else {
                    n1420218926656397722.j(Y);
                    if (b13729205492206812220 != null) {
                        b13729205492206812220.invoke();
                    }
                    i4 = 1;
                }
            } else if (J14472086795230312938.D(handwritingGesture)) {
                DeleteRangeGesture n = J14472086795230312938.n(handwritingGesture);
                granularity = n.getGranularity();
                i2 = granularity == 1 ? 1 : 0;
                deletionStartArea = n.getDeletionStartArea();
                S6349823729575121924 w4 = X7410747940286448830.w(deletionStartArea);
                deletionEndArea = n.getDeletionEndArea();
                long Y2 = J8045362843799184672.Y(i12071840179596922896, w4, X7410747940286448830.w(deletionEndArea), i2);
                if (F12478849263529740365.d(Y2)) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(n));
                } else {
                    if (i2 == 1) {
                        Y2 = J8045362843799184672.q(Y2, n1420218926656397722.d());
                    }
                    N1420218926656397722.i(n1420218926656397722, "", Y2, false, false, 28);
                    i4 = 1;
                }
            } else if (U16248190607760379657.B(handwritingGesture)) {
                JoinOrSplitGesture k = U16248190607760379657.k(handwritingGesture);
                if (n1420218926656397722.a.d() != n1420218926656397722.a.d()) {
                    i4 = 3;
                } else {
                    joinOrSplitPoint = k.getJoinOrSplitPoint();
                    long w0 = J8045362843799184672.w0(joinOrSplitPoint);
                    Q17957571128037780363 c2 = i12071840179596922896.c();
                    int T = c2 != null ? J8045362843799184672.T(c2.b, w0, i12071840179596922896.e(), k1865709164992808030) : -1;
                    if (T == -1 || ((c = i12071840179596922896.c()) != null && J8045362843799184672.e0(c, T))) {
                        i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(k));
                    } else {
                        long o0 = J8045362843799184672.o0(n1420218926656397722.d(), T);
                        if (F12478849263529740365.d(o0)) {
                            N1420218926656397722.i(n1420218926656397722, " ", o0, false, false, 28);
                        } else {
                            N1420218926656397722.i(n1420218926656397722, "", o0, false, false, 28);
                        }
                        i4 = 1;
                    }
                }
            } else if (U16248190607760379657.w(handwritingGesture)) {
                InsertGesture j = U16248190607760379657.j(handwritingGesture);
                insertionPoint = j.getInsertionPoint();
                long w02 = J8045362843799184672.w0(insertionPoint);
                Q17957571128037780363 c3 = i12071840179596922896.c();
                int T2 = c3 != null ? J8045362843799184672.T(c3.b, w02, i12071840179596922896.e(), k1865709164992808030) : -1;
                if (T2 == -1) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(j));
                } else {
                    textToInsert = j.getTextToInsert();
                    N1420218926656397722.i(n1420218926656397722, textToInsert, T1335862270807194835.d(T2, T2), false, false, 28);
                    i4 = 1;
                }
            } else if (U16248190607760379657.z(handwritingGesture)) {
                RemoveSpaceGesture l = U16248190607760379657.l(handwritingGesture);
                Q17957571128037780363 c4 = i12071840179596922896.c();
                startPoint = l.getStartPoint();
                long w03 = J8045362843799184672.w0(startPoint);
                endPoint = l.getEndPoint();
                long U = J8045362843799184672.U(c4, w03, J8045362843799184672.w0(endPoint), i12071840179596922896.e(), k1865709164992808030);
                if (F12478849263529740365.d(U)) {
                    i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(l));
                } else {
                    A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
                    a8284336046188466534.a = -1;
                    A8284336046188466534 a82843360461884665342 = new A8284336046188466534();
                    a82843360461884665342.a = -1;
                    String g = new H5336160545165318150("\\s+").g(T1335862270807194835.s(U, n1420218926656397722.d()), new H4075047774632263339(a8284336046188466534, a82843360461884665342, (byte) 0));
                    int i5 = a8284336046188466534.a;
                    if (i5 == -1 || (i = a82843360461884665342.a) == -1) {
                        i4 = K5751602218013079365.H(n1420218926656397722, U16248190607760379657.i(l));
                    } else {
                        int i6 = (int) (U >> 32);
                        N1420218926656397722.i(n1420218926656397722, g.substring(a8284336046188466534.a, g.length() - (F12478849263529740365.e(U) - a82843360461884665342.a)), T1335862270807194835.d(i5 + i6, i6 + i), false, false, 28);
                        i4 = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new G12010629111624924329(intConsumer, i4, (byte) 1));
        } else {
            intConsumer.accept(i4);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            X9608137461199640409 x9608137461199640409 = this.a;
            N1420218926656397722 n1420218926656397722 = (N1420218926656397722) x9608137461199640409.d;
            I12071840179596922896 i12071840179596922896 = (I12071840179596922896) x9608137461199640409.i;
            if (U16248190607760379657.r(previewableHandwritingGesture)) {
                SelectGesture m = U16248190607760379657.m(previewableHandwritingGesture);
                selectionArea = m.getSelectionArea();
                S6349823729575121924 w = X7410747940286448830.w(selectionArea);
                granularity4 = m.getGranularity();
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.W(i12071840179596922896, w, granularity4 != 1 ? 0 : 1), 0);
            } else if (J14472086795230312938.w(previewableHandwritingGesture)) {
                DeleteGesture m2 = J14472086795230312938.m(previewableHandwritingGesture);
                deletionArea = m2.getDeletionArea();
                S6349823729575121924 w2 = X7410747940286448830.w(deletionArea);
                granularity3 = m2.getGranularity();
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.W(i12071840179596922896, w2, granularity3 == 1 ? 1 : 0), 1);
            } else if (J14472086795230312938.B(previewableHandwritingGesture)) {
                SelectRangeGesture o2 = J14472086795230312938.o(previewableHandwritingGesture);
                selectionStartArea = o2.getSelectionStartArea();
                S6349823729575121924 w3 = X7410747940286448830.w(selectionStartArea);
                selectionEndArea = o2.getSelectionEndArea();
                S6349823729575121924 w4 = X7410747940286448830.w(selectionEndArea);
                granularity2 = o2.getGranularity();
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.Y(i12071840179596922896, w3, w4, granularity2 != 1 ? 0 : 1), 0);
            } else if (J14472086795230312938.D(previewableHandwritingGesture)) {
                DeleteRangeGesture n = J14472086795230312938.n(previewableHandwritingGesture);
                deletionStartArea = n.getDeletionStartArea();
                S6349823729575121924 w5 = X7410747940286448830.w(deletionStartArea);
                deletionEndArea = n.getDeletionEndArea();
                S6349823729575121924 w6 = X7410747940286448830.w(deletionEndArea);
                granularity = n.getGranularity();
                K5751602218013079365.P(n1420218926656397722, J8045362843799184672.Y(i12071840179596922896, w5, w6, granularity == 1 ? 1 : 0), 1);
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
        CursorAnchorInfo a;
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
        if (z5 && (a = l16033300369903415380.a()) != null) {
            W8455343525638953052 w8455343525638953052 = l16033300369903415380.c;
            w8455343525638953052.L().updateCursorAnchorInfo((View) w8455343525638953052.b, a);
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

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        W1742516786250891319 w1742516786250891319;
        H885820584188137964 h885820584188137964;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj2 : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj2 instanceof BackgroundColorSpan) {
                    w1742516786250891319 = new W1742516786250891319(0L, 0L, (R6694982557896913324) null, (M2626744064473853568) null, (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, J8045362843799184672.e(((BackgroundColorSpan) obj2).getBackgroundColor()), (W7621125212597703960) null, (H7281108764511748709) null, 63487);
                } else if (obj2 instanceof ForegroundColorSpan) {
                    w1742516786250891319 = new W1742516786250891319(J8045362843799184672.e(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, (R6694982557896913324) null, (M2626744064473853568) null, (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, (W7621125212597703960) null, (H7281108764511748709) null, 65534);
                } else if (obj2 instanceof StrikethroughSpan) {
                    w1742516786250891319 = new W1742516786250891319(0L, 0L, (R6694982557896913324) null, (M2626744064473853568) null, (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, W7621125212597703960.d, (H7281108764511748709) null, 61439);
                } else if (obj2 instanceof StyleSpan) {
                    int style = ((StyleSpan) obj2).getStyle();
                    if (style == 1) {
                        w1742516786250891319 = new W1742516786250891319(0L, 0L, R6694982557896913324.f, (M2626744064473853568) null, (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, (W7621125212597703960) null, (H7281108764511748709) null, 65531);
                    } else if (style != 2) {
                        if (style == 3) {
                            w1742516786250891319 = new W1742516786250891319(0L, 0L, R6694982557896913324.f, new M2626744064473853568(1), (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, (W7621125212597703960) null, (H7281108764511748709) null, 65523);
                        }
                        w1742516786250891319 = null;
                    } else {
                        w1742516786250891319 = new W1742516786250891319(0L, 0L, (R6694982557896913324) null, new M2626744064473853568(1), (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, (W7621125212597703960) null, (H7281108764511748709) null, 65527);
                    }
                } else if (obj2 instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                    String family = typefaceSpan.getFamily();
                    if (S10823041268949770285.t(family, "cursive")) {
                        h885820584188137964 = H885820584188137964.e;
                    } else if (S10823041268949770285.t(family, "monospace")) {
                        h885820584188137964 = H885820584188137964.d;
                    } else if (S10823041268949770285.t(family, "sans-serif")) {
                        h885820584188137964 = H885820584188137964.b;
                    } else if (S10823041268949770285.t(family, "serif")) {
                        h885820584188137964 = H885820584188137964.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 != null && family2.length() != 0) {
                            Typeface create = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (S10823041268949770285.t(create, typeface) || S10823041268949770285.t(create, Typeface.create(typeface, 0))) {
                                create = null;
                            }
                            if (create != null) {
                                h885820584188137964 = new K16784123498484085517(new H12843822278061842084(create, (byte) 10));
                            }
                        }
                        h885820584188137964 = null;
                    }
                    w1742516786250891319 = new W1742516786250891319(0L, 0L, (R6694982557896913324) null, (M2626744064473853568) null, (S12008558933731077464) null, h885820584188137964, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, (W7621125212597703960) null, (H7281108764511748709) null, 65503);
                } else {
                    if (obj2 instanceof UnderlineSpan) {
                        w1742516786250891319 = new W1742516786250891319(0L, 0L, (R6694982557896913324) null, (M2626744064473853568) null, (S12008558933731077464) null, (H885820584188137964) null, (String) null, 0L, (V16528451706120227503) null, (T10255414283460940890) null, (A5535629440393075509) null, 0L, W7621125212597703960.c, (H7281108764511748709) null, 61439);
                    }
                    w1742516786250891319 = null;
                }
                if (w1742516786250891319 != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new F14378331124810887321(spanned.getSpanStart(obj2), spanned.getSpanEnd(obj2), w1742516786250891319));
                }
            }
            arrayList = arrayList2;
        }
        this.a.h(new Q16829635822268228021(obj, arrayList, i, false));
        return true;
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
