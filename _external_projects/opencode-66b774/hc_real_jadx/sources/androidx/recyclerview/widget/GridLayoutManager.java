package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p034.p035.p045.p046.C1084;
import p034.p065.p066.RunnableC1400;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final SparseIntArray f1324;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public AbstractC0194 f1325;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean f1326;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final SparseIntArray f1327;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public View[] f1328;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final Rect f1329;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f1330;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int[] f1331;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1332;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1333;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1332 = -1;
            this.f1333 = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1332 = -1;
            this.f1333 = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1332 = -1;
            this.f1333 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1332 = -1;
            this.f1333 = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$〺つふすそ, reason: contains not printable characters */
    public static abstract class AbstractC0194 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final SparseIntArray f1335 = new SparseIntArray();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final SparseIntArray f1334 = new SparseIntArray();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int m629(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0195 extends AbstractC0194 {
    }

    public GridLayoutManager(Context context, int i) {
        super(1, false);
        this.f1326 = false;
        this.f1330 = -1;
        this.f1327 = new SparseIntArray();
        this.f1324 = new SparseIntArray();
        this.f1325 = new C0195();
        this.f1329 = new Rect();
        m600(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        this.f1326 = false;
        this.f1330 = -1;
        this.f1327 = new SparseIntArray();
        this.f1324 = new SparseIntArray();
        this.f1325 = new C0195();
        this.f1329 = new Rect();
        m600(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1326 = false;
        this.f1330 = -1;
        this.f1327 = new SparseIntArray();
        this.f1324 = new SparseIntArray();
        this.f1325 = new C0195();
        this.f1329 = new Rect();
        m600(RecyclerView.AbstractC0219.m814(context, attributeSet, i, i2).f1537);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〳に〴あぽ, reason: contains not printable characters */
    public boolean mo591() {
        return this.f1346 == null && !this.f1326;
    }

    /* renamed from: 〵く〵す〺, reason: contains not printable characters */
    public final void m592() {
        int m847;
        int m860;
        if (this.f1342 == 1) {
            m847 = this.f1522 - m828();
            m860 = m862();
        } else {
            m847 = this.f1523 - m847();
            m860 = m860();
        }
        m595(m847 - m860);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: 〵げとずぐみ, reason: contains not printable characters */
    public View mo593(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, int i, int i2, int i3) {
        m640();
        int mo3140 = this.f1340.mo3140();
        int mo3128 = this.f1340.mo3128();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m826 = m826(i);
            int m857 = m857(m826);
            if (m857 >= 0 && m857 < i3 && m625(c0217, c0224, m857) == 0) {
                if (((RecyclerView.LayoutParams) m826.getLayoutParams()).m753()) {
                    if (view2 == null) {
                        view2 = m826;
                    }
                } else {
                    if (this.f1340.mo3133(m826) < mo3128 && this.f1340.mo3127(m826) >= mo3140) {
                        return m826;
                    }
                    if (view == null) {
                        view = m826;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public void mo594(RecyclerView.C0224 c0224) {
        this.f1346 = null;
        this.f1338 = -1;
        this.f1348 = Integer.MIN_VALUE;
        this.f1345.m683();
        this.f1326 = false;
    }

    /* renamed from: ぁこき〸せ, reason: contains not printable characters */
    public final void m595(int i) {
        int i2;
        int[] iArr = this.f1331;
        int i3 = this.f1330;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1331 = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean mo596(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void mo597(RecyclerView recyclerView) {
        this.f1325.f1335.clear();
        this.f1325.f1334.clear();
    }

    /* renamed from: いぐなへねか, reason: contains not printable characters */
    public final int m598(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, int i) {
        if (c0224.f1543) {
            int i2 = this.f1327.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            if (c0217.m801(i) == -1) {
                return 1;
            }
        }
        this.f1325.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public void mo599(RecyclerView recyclerView, int i, int i2) {
        this.f1325.f1335.clear();
        this.f1325.f1334.clear();
    }

    /* renamed from: ぇちひねぐぬ, reason: contains not printable characters */
    public void m600(int i) {
        if (i == this.f1330) {
            return;
        }
        this.f1326 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C2098.m4208("Span count should be at least 1. Provided ", i));
        }
        this.f1330 = i;
        this.f1325.f1335.clear();
        m841();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int mo601(RecyclerView.C0224 c0224) {
        return m652(c0224);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int mo602(RecyclerView.C0224 c0224) {
        return m633(c0224);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: おぬぃかはど, reason: contains not printable characters */
    public void mo603(RecyclerView.C0224 c0224, LinearLayoutManager.C0198 c0198, RecyclerView.AbstractC0219.InterfaceC0221 interfaceC0221) {
        int i = this.f1330;
        for (int i2 = 0; i2 < this.f1330 && c0198.m677(c0224) && i > 0; i2++) {
            ((RunnableC1400.C1401) interfaceC0221).m3168(c0198.f1367, Math.max(0, c0198.f1360));
            this.f1325.getClass();
            i--;
            c0198.f1367 += c0198.f1364;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: かこあぇ〸〼, reason: contains not printable characters */
    public void mo604(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, LinearLayoutManager.C0199 c0199, int i) {
        m592();
        if (c0224.m881() > 0 && !c0224.f1543) {
            boolean z = i == 1;
            int m625 = m625(c0217, c0224, c0199.f1370);
            if (z) {
                while (m625 > 0) {
                    int i2 = c0199.f1370;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0199.f1370 = i3;
                    m625 = m625(c0217, c0224, i3);
                }
            } else {
                int m881 = c0224.m881() - 1;
                int i4 = c0199.f1370;
                while (i4 < m881) {
                    int i5 = i4 + 1;
                    int m6252 = m625(c0217, c0224, i5);
                    if (m6252 <= m625) {
                        break;
                    }
                    i4 = i5;
                    m625 = m6252;
                }
                c0199.f1370 = i4;
            }
        }
        m621();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public void mo605(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f1325.f1335.clear();
        this.f1325.f1334.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        if (r13 == (r2 > r15)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r13 == (r2 > r8)) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo606(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0217 r25, androidx.recyclerview.widget.RecyclerView.C0224 r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo606(android.view.View, int, androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, androidx.recyclerview.widget.RecyclerView$でどあくず):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: く〱なおぎ, reason: contains not printable characters */
    public int mo607(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        m592();
        m621();
        if (this.f1342 == 0) {
            return 0;
        }
        return m661(i, c0217, c0224);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: さぬうづぃ, reason: contains not printable characters */
    public void mo608(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        mo667(null);
        if (this.f1336) {
            this.f1336 = false;
            m841();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public RecyclerView.LayoutParams mo609() {
        return this.f1342 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public void mo610(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (c0224.f1543) {
            int m836 = m836();
            for (int i = 0; i < m836; i++) {
                LayoutParams layoutParams = (LayoutParams) m826(i).getLayoutParams();
                int m754 = layoutParams.m754();
                this.f1327.put(m754, layoutParams.f1333);
                this.f1324.put(m754, layoutParams.f1332);
            }
        }
        super.mo610(c0217, c0224);
        this.f1327.clear();
        this.f1324.clear();
    }

    /* renamed from: ず〱したつ, reason: contains not printable characters */
    public final void m611(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f1454;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int m613 = m613(layoutParams.f1332, layoutParams.f1333);
        if (this.f1342 == 1) {
            i3 = RecyclerView.AbstractC0219.m813(m613, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.AbstractC0219.m813(this.f1340.mo3134(), this.f1524, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int m813 = RecyclerView.AbstractC0219.m813(m613, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int m8132 = RecyclerView.AbstractC0219.m813(this.f1340.mo3134(), this.f1532, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = m813;
            i3 = m8132;
        }
        m619(view, i3, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int mo612(RecyclerView.C0224 c0224) {
        return m633(c0224);
    }

    /* renamed from: てぞま〱ぁ, reason: contains not printable characters */
    public int m613(int i, int i2) {
        if (this.f1342 != 1 || !m647()) {
            int[] iArr = this.f1331;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1331;
        int i3 = this.f1330;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: でどあくず, reason: contains not printable characters */
    public RecyclerView.LayoutParams mo614(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public void mo615(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, View view, C1084 c1084) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            m838(view, c1084);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int m626 = m626(c0217, c0224, layoutParams2.m754());
        if (this.f1342 == 0) {
            i4 = layoutParams2.f1332;
            i = layoutParams2.f1333;
            i3 = 1;
            z = false;
            z2 = false;
            i2 = m626;
        } else {
            i = 1;
            i2 = layoutParams2.f1332;
            i3 = layoutParams2.f1333;
            z = false;
            z2 = false;
            i4 = m626;
        }
        c1084.m2457(C1084.C1086.m2470(i4, i, i2, i3, z, z2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int mo616(RecyclerView.C0224 c0224) {
        return m652(c0224);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: はぁとそぎ, reason: contains not printable characters */
    public int mo617(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        m592();
        m621();
        if (this.f1342 == 1) {
            return 0;
        }
        return m661(i, c0217, c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public int mo618(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (this.f1342 == 0) {
            return this.f1330;
        }
        if (c0224.m881() < 1) {
            return 0;
        }
        return m626(c0217, c0224, c0224.m881() - 1) + 1;
    }

    /* renamed from: ぱぬが〹〹に, reason: contains not printable characters */
    public final void m619(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? m834(view, i, i2, layoutParams) : m859(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r22.f1354 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ひ〲どぼぢだ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo620(androidx.recyclerview.widget.RecyclerView.C0217 r19, androidx.recyclerview.widget.RecyclerView.C0224 r20, androidx.recyclerview.widget.LinearLayoutManager.C0198 r21, androidx.recyclerview.widget.LinearLayoutManager.C0197 r22) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo620(androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, androidx.recyclerview.widget.RecyclerView$でどあくず, androidx.recyclerview.widget.LinearLayoutManager$くし〴〺ぅ, androidx.recyclerview.widget.LinearLayoutManager$〺つふすそ):void");
    }

    /* renamed from: びあぞほ〹, reason: contains not printable characters */
    public final void m621() {
        View[] viewArr = this.f1328;
        if (viewArr == null || viewArr.length != this.f1330) {
            this.f1328 = new View[this.f1330];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int mo622(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (this.f1342 == 1) {
            return this.f1330;
        }
        if (c0224.m881() < 1) {
            return 0;
        }
        return m626(c0217, c0224, c0224.m881() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public RecyclerView.LayoutParams mo623(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public void mo624(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f1325.f1335.clear();
        this.f1325.f1334.clear();
    }

    /* renamed from: へぐこ〺ば, reason: contains not printable characters */
    public final int m625(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, int i) {
        if (!c0224.f1543) {
            AbstractC0194 abstractC0194 = this.f1325;
            int i2 = this.f1330;
            abstractC0194.getClass();
            return i % i2;
        }
        int i3 = this.f1324.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int m801 = c0217.m801(i);
        if (m801 == -1) {
            return 0;
        }
        AbstractC0194 abstractC01942 = this.f1325;
        int i4 = this.f1330;
        abstractC01942.getClass();
        return m801 % i4;
    }

    /* renamed from: へたぁて〻, reason: contains not printable characters */
    public final int m626(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, int i) {
        if (!c0224.f1543) {
            return this.f1325.m629(i, this.f1330);
        }
        int m801 = c0217.m801(i);
        if (m801 == -1) {
            return 0;
        }
        return this.f1325.m629(m801, this.f1330);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public void mo627(RecyclerView recyclerView, int i, int i2) {
        this.f1325.f1335.clear();
        this.f1325.f1334.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺでどぜべ, reason: contains not printable characters */
    public void mo628(Rect rect, int i, int i2) {
        int m812;
        int m8122;
        if (this.f1331 == null) {
            super.mo628(rect, i, i2);
        }
        int m828 = m828() + m862();
        int m847 = m847() + m860();
        if (this.f1342 == 1) {
            m8122 = RecyclerView.AbstractC0219.m812(i2, rect.height() + m847, m823());
            int[] iArr = this.f1331;
            m812 = RecyclerView.AbstractC0219.m812(i, iArr[iArr.length - 1] + m828, m833());
        } else {
            m812 = RecyclerView.AbstractC0219.m812(i, rect.width() + m828, m833());
            int[] iArr2 = this.f1331;
            m8122 = RecyclerView.AbstractC0219.m812(i2, iArr2[iArr2.length - 1] + m847, m823());
        }
        this.f1519.setMeasuredDimension(m812, m8122);
    }
}
