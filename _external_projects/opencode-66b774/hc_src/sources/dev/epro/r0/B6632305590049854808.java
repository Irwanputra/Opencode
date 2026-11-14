package dev.epro.r0;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6632305590049854808 implements InputConnection {
    public final F6942723054099263096 a;
    public final boolean b;
    public final I2076339260272013590 c;
    public final L9852841107405549527 d;
    public final K1865709164992808030 e;
    public int f;
    public F13241018602672925865 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public B6632305590049854808(F13241018602672925865 f13241018602672925865, F6942723054099263096 f6942723054099263096, boolean z, I2076339260272013590 i2076339260272013590, L9852841107405549527 l9852841107405549527, K1865709164992808030 k1865709164992808030) {
        this.a = f6942723054099263096;
        this.b = z;
        this.c = i2076339260272013590;
        this.d = l9852841107405549527;
        this.e = k1865709164992808030;
        this.g = f13241018602672925865;
    }

    public final void a(C2322693828285680440 c2322693828285680440) {
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
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((B9595992830626540128) this.a.b).c.invoke(new ArrayList(arrayList));
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
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
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
        ArrayList arrayList = ((B9595992830626540128) this.a.b).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (S10823041268949770285.t(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new J14617885194716764421(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new L13686798803278025478(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new D17975288941580018327(i, i2));
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
        a(new S1181215782212915507());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        F13241018602672925865 f13241018602672925865 = this.g;
        return TextUtils.getCapsMode(f13241018602672925865.a.b, F12478849263529740365.g(f13241018602672925865.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return T13998044911588922055.m(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (F12478849263529740365.d(this.g.b)) {
            return null;
        }
        return E15826830759497041750.j(this.g).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return E15826830759497041750.k(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return E15826830759497041750.l(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new D4827454800931329865(0, this.g.a.b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                }
                ((B9595992830626540128) this.a.b).d.invoke(new R512193971042300889(i2));
            }
            i2 = 1;
            ((B9595992830626540128) this.a.b).d.invoke(new R512193971042300889(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        M11181104712105445833 m11181104712105445833;
        PointF startPoint;
        PointF endPoint;
        int i;
        PointF insertionPoint;
        N17980339148608222959 d;
        String textToInsert;
        PointF joinOrSplitPoint;
        N17980339148608222959 d2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        if (Build.VERSION.SDK_INT >= 34) {
            H8734584053421516944 h8734584053421516944 = new H8734584053421516944(this, (byte) 19);
            I2076339260272013590 i2076339260272013590 = this.c;
            int i2 = 3;
            if (i2076339260272013590 != null && (m11181104712105445833 = i2076339260272013590.j) != null) {
                N17980339148608222959 d3 = i2076339260272013590.d();
                if (m11181104712105445833.equals(d3 != null ? d3.a.a.a : null)) {
                    boolean r = U16248190607760379657.r(handwritingGesture);
                    L9852841107405549527 l9852841107405549527 = this.d;
                    if (r) {
                        SelectGesture m = U16248190607760379657.m(handwritingGesture);
                        selectionArea = m.getSelectionArea();
                        S6349823729575121924 w = X7410747940286448830.w(selectionArea);
                        granularity4 = m.getGranularity();
                        long V = J8045362843799184672.V(i2076339260272013590, w, granularity4 != 1 ? 0 : 1);
                        if (F12478849263529740365.d(V)) {
                            i2 = K5751602218013079365.I(U16248190607760379657.i(m), h8734584053421516944);
                        } else {
                            h8734584053421516944.invoke(new D4827454800931329865((int) (V >> 32), (int) (V & 4294967295L)));
                            if (l9852841107405549527 != null) {
                                l9852841107405549527.e(true);
                            }
                            i2 = 1;
                        }
                    } else if (J14472086795230312938.w(handwritingGesture)) {
                        DeleteGesture m2 = J14472086795230312938.m(handwritingGesture);
                        granularity3 = m2.getGranularity();
                        int i3 = granularity3 != 1 ? 0 : 1;
                        deletionArea = m2.getDeletionArea();
                        long V2 = J8045362843799184672.V(i2076339260272013590, X7410747940286448830.w(deletionArea), i3);
                        if (F12478849263529740365.d(V2)) {
                            i2 = K5751602218013079365.I(U16248190607760379657.i(m2), h8734584053421516944);
                        } else {
                            K5751602218013079365.Z(V2, m11181104712105445833, i3 == 1, h8734584053421516944);
                            i2 = 1;
                        }
                    } else if (J14472086795230312938.B(handwritingGesture)) {
                        SelectRangeGesture o2 = J14472086795230312938.o(handwritingGesture);
                        selectionStartArea = o2.getSelectionStartArea();
                        S6349823729575121924 w2 = X7410747940286448830.w(selectionStartArea);
                        selectionEndArea = o2.getSelectionEndArea();
                        S6349823729575121924 w3 = X7410747940286448830.w(selectionEndArea);
                        granularity2 = o2.getGranularity();
                        long X = J8045362843799184672.X(i2076339260272013590, w2, w3, granularity2 != 1 ? 0 : 1);
                        if (F12478849263529740365.d(X)) {
                            i2 = K5751602218013079365.I(U16248190607760379657.i(o2), h8734584053421516944);
                        } else {
                            h8734584053421516944.invoke(new D4827454800931329865((int) (X >> 32), (int) (X & 4294967295L)));
                            if (l9852841107405549527 != null) {
                                l9852841107405549527.e(true);
                            }
                            i2 = 1;
                        }
                    } else if (J14472086795230312938.D(handwritingGesture)) {
                        DeleteRangeGesture n = J14472086795230312938.n(handwritingGesture);
                        granularity = n.getGranularity();
                        int i4 = granularity != 1 ? 0 : 1;
                        deletionStartArea = n.getDeletionStartArea();
                        S6349823729575121924 w4 = X7410747940286448830.w(deletionStartArea);
                        deletionEndArea = n.getDeletionEndArea();
                        long X2 = J8045362843799184672.X(i2076339260272013590, w4, X7410747940286448830.w(deletionEndArea), i4);
                        if (F12478849263529740365.d(X2)) {
                            i2 = K5751602218013079365.I(U16248190607760379657.i(n), h8734584053421516944);
                        } else {
                            K5751602218013079365.Z(X2, m11181104712105445833, i4 == 1, h8734584053421516944);
                            i2 = 1;
                        }
                    } else {
                        boolean B = U16248190607760379657.B(handwritingGesture);
                        K1865709164992808030 k1865709164992808030 = this.e;
                        if (B) {
                            JoinOrSplitGesture k = U16248190607760379657.k(handwritingGesture);
                            if (k1865709164992808030 == null) {
                                i2 = K5751602218013079365.I(U16248190607760379657.u(k), h8734584053421516944);
                            } else {
                                joinOrSplitPoint = k.getJoinOrSplitPoint();
                                long w0 = J8045362843799184672.w0(joinOrSplitPoint);
                                N17980339148608222959 d4 = i2076339260272013590.d();
                                int T = d4 != null ? J8045362843799184672.T(d4.a.b, w0, i2076339260272013590.c(), k1865709164992808030) : -1;
                                if (T == -1 || ((d2 = i2076339260272013590.d()) != null && J8045362843799184672.e0(d2.a, T))) {
                                    i2 = K5751602218013079365.I(U16248190607760379657.i(k), h8734584053421516944);
                                } else {
                                    long o0 = J8045362843799184672.o0(m11181104712105445833, T);
                                    if (F12478849263529740365.d(o0)) {
                                        int i5 = (int) (o0 >> 32);
                                        h8734584053421516944.invoke(new F8082984210800855746(new C2322693828285680440[]{new D4827454800931329865(i5, i5), new J14617885194716764421(" ", 1)}));
                                    } else {
                                        K5751602218013079365.Z(o0, m11181104712105445833, false, h8734584053421516944);
                                    }
                                    i2 = 1;
                                }
                            }
                        } else if (U16248190607760379657.w(handwritingGesture)) {
                            InsertGesture j = U16248190607760379657.j(handwritingGesture);
                            if (k1865709164992808030 == null) {
                                i2 = K5751602218013079365.I(U16248190607760379657.u(j), h8734584053421516944);
                            } else {
                                insertionPoint = j.getInsertionPoint();
                                long w02 = J8045362843799184672.w0(insertionPoint);
                                N17980339148608222959 d5 = i2076339260272013590.d();
                                int T2 = d5 != null ? J8045362843799184672.T(d5.a.b, w02, i2076339260272013590.c(), k1865709164992808030) : -1;
                                if (T2 == -1 || ((d = i2076339260272013590.d()) != null && J8045362843799184672.e0(d.a, T2))) {
                                    i2 = K5751602218013079365.I(U16248190607760379657.i(j), h8734584053421516944);
                                } else {
                                    textToInsert = j.getTextToInsert();
                                    h8734584053421516944.invoke(new F8082984210800855746(new C2322693828285680440[]{new D4827454800931329865(T2, T2), new J14617885194716764421(textToInsert, 1)}));
                                    i2 = 1;
                                }
                            }
                        } else if (U16248190607760379657.z(handwritingGesture)) {
                            RemoveSpaceGesture l = U16248190607760379657.l(handwritingGesture);
                            N17980339148608222959 d6 = i2076339260272013590.d();
                            Q17957571128037780363 q17957571128037780363 = d6 != null ? d6.a : null;
                            startPoint = l.getStartPoint();
                            long w03 = J8045362843799184672.w0(startPoint);
                            endPoint = l.getEndPoint();
                            long U = J8045362843799184672.U(q17957571128037780363, w03, J8045362843799184672.w0(endPoint), i2076339260272013590.c(), k1865709164992808030);
                            if (F12478849263529740365.d(U)) {
                                i2 = K5751602218013079365.I(U16248190607760379657.i(l), h8734584053421516944);
                            } else {
                                A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
                                a8284336046188466534.a = -1;
                                A8284336046188466534 a82843360461884665342 = new A8284336046188466534();
                                a82843360461884665342.a = -1;
                                String g = new H5336160545165318150("\\s+").g(T1335862270807194835.s(U, m11181104712105445833), new H4075047774632263339(a8284336046188466534, a82843360461884665342, (byte) 1));
                                int i6 = a8284336046188466534.a;
                                if (i6 == -1 || (i = a82843360461884665342.a) == -1) {
                                    i2 = K5751602218013079365.I(U16248190607760379657.i(l), h8734584053421516944);
                                } else {
                                    int i7 = (int) (U >> 32);
                                    h8734584053421516944.invoke(new F8082984210800855746(new C2322693828285680440[]{new D4827454800931329865(i7 + i6, i7 + i), new J14617885194716764421(g.substring(i6, g.length() - (F12478849263529740365.e(U) - a82843360461884665342.a)), 1)}));
                                    i2 = 1;
                                }
                            }
                        } else {
                            i2 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new G12010629111624924329(intConsumer, i2, (byte) 0));
            } else {
                intConsumer.accept(i2);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        I2076339260272013590 i2076339260272013590;
        M11181104712105445833 m11181104712105445833;
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
        if (Build.VERSION.SDK_INT >= 34 && (i2076339260272013590 = this.c) != null && (m11181104712105445833 = i2076339260272013590.j) != null) {
            N17980339148608222959 d = i2076339260272013590.d();
            if (m11181104712105445833.equals(d != null ? d.a.a.a : null)) {
                boolean r = U16248190607760379657.r(previewableHandwritingGesture);
                I3645473568512758926 i3645473568512758926 = I3645473568512758926.a;
                L9852841107405549527 l9852841107405549527 = this.d;
                if (r) {
                    SelectGesture m = U16248190607760379657.m(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        selectionArea = m.getSelectionArea();
                        S6349823729575121924 w = X7410747940286448830.w(selectionArea);
                        granularity4 = m.getGranularity();
                        long V = J8045362843799184672.V(i2076339260272013590, w, granularity4 != 1 ? 0 : 1);
                        I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
                        if (i20763392602720135902 != null) {
                            i20763392602720135902.f(V);
                        }
                        I2076339260272013590 i20763392602720135903 = l9852841107405549527.d;
                        if (i20763392602720135903 != null) {
                            i20763392602720135903.e(F12478849263529740365.b);
                        }
                        if (!F12478849263529740365.d(V)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (J14472086795230312938.w(previewableHandwritingGesture)) {
                    DeleteGesture m2 = J14472086795230312938.m(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        deletionArea = m2.getDeletionArea();
                        S6349823729575121924 w2 = X7410747940286448830.w(deletionArea);
                        granularity3 = m2.getGranularity();
                        long V2 = J8045362843799184672.V(i2076339260272013590, w2, granularity3 != 1 ? 0 : 1);
                        I2076339260272013590 i20763392602720135904 = l9852841107405549527.d;
                        if (i20763392602720135904 != null) {
                            i20763392602720135904.e(V2);
                        }
                        I2076339260272013590 i20763392602720135905 = l9852841107405549527.d;
                        if (i20763392602720135905 != null) {
                            i20763392602720135905.f(F12478849263529740365.b);
                        }
                        if (!F12478849263529740365.d(V2)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (J14472086795230312938.B(previewableHandwritingGesture)) {
                    SelectRangeGesture o2 = J14472086795230312938.o(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        selectionStartArea = o2.getSelectionStartArea();
                        S6349823729575121924 w3 = X7410747940286448830.w(selectionStartArea);
                        selectionEndArea = o2.getSelectionEndArea();
                        S6349823729575121924 w4 = X7410747940286448830.w(selectionEndArea);
                        granularity2 = o2.getGranularity();
                        long X = J8045362843799184672.X(i2076339260272013590, w3, w4, granularity2 != 1 ? 0 : 1);
                        I2076339260272013590 i20763392602720135906 = l9852841107405549527.d;
                        if (i20763392602720135906 != null) {
                            i20763392602720135906.f(X);
                        }
                        I2076339260272013590 i20763392602720135907 = l9852841107405549527.d;
                        if (i20763392602720135907 != null) {
                            i20763392602720135907.e(F12478849263529740365.b);
                        }
                        if (!F12478849263529740365.d(X)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                } else if (J14472086795230312938.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture n = J14472086795230312938.n(previewableHandwritingGesture);
                    if (l9852841107405549527 != null) {
                        deletionStartArea = n.getDeletionStartArea();
                        S6349823729575121924 w5 = X7410747940286448830.w(deletionStartArea);
                        deletionEndArea = n.getDeletionEndArea();
                        S6349823729575121924 w6 = X7410747940286448830.w(deletionEndArea);
                        granularity = n.getGranularity();
                        long X2 = J8045362843799184672.X(i2076339260272013590, w5, w6, granularity != 1 ? 0 : 1);
                        I2076339260272013590 i20763392602720135908 = l9852841107405549527.d;
                        if (i20763392602720135908 != null) {
                            i20763392602720135908.e(X2);
                        }
                        I2076339260272013590 i20763392602720135909 = l9852841107405549527.d;
                        if (i20763392602720135909 != null) {
                            i20763392602720135909.f(F12478849263529740365.b);
                        }
                        if (!F12478849263529740365.d(X2)) {
                            l9852841107405549527.u(false);
                            l9852841107405549527.r(i3645473568512758926);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new B9951899438396776027(l9852841107405549527, (byte) 1));
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((B9595992830626540128) this.a.b).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new C5725033187322898527(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new X10863724561514067198(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new D4827454800931329865(i, i2));
        return true;
    }
}
