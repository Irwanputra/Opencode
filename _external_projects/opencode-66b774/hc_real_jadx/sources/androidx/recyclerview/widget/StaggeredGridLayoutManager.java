package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p034.p035.p045.p046.C1084;
import p034.p065.p066.AbstractC1385;
import p034.p065.p066.C1380;
import p034.p065.p066.C1410;
import p034.p065.p066.RunnableC1400;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0219 implements RecyclerView.AbstractC0214.InterfaceC0215 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final C1410 f1566;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int[] f1569;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f1570;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean f1571;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public AbstractC1385 f1575;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public AbstractC1385 f1576;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1577;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public SavedState f1579;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f1580;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C0239[] f1583;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public BitSet f1584;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f1585;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f1586;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean f1587;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f1568 = false;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f1582 = -1;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int f1581 = Integer.MIN_VALUE;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public LazySpanLookup f1567 = new LazySpanLookup();

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f1578 = 2;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final Rect f1573 = new Rect();

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final C0238 f1572 = new C0238();

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public boolean f1565 = true;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final Runnable f1574 = new RunnableC0240();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C0239 f1588;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class LazySpanLookup {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public List<FullSpanItem> f1589;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int[] f1590;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0236();

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public int f1591;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public int f1592;

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public boolean f1593;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public int[] f1594;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$げつ〴ぬぐ, reason: contains not printable characters */
            public static class C0236 implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f1591 = parcel.readInt();
                this.f1592 = parcel.readInt();
                this.f1593 = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1594 = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder m4207 = C2098.m4207("FullSpanItem{mPosition=");
                m4207.append(this.f1591);
                m4207.append(", mGapDir=");
                m4207.append(this.f1592);
                m4207.append(", mHasUnwantedGapAfter=");
                m4207.append(this.f1593);
                m4207.append(", mGapPerSpan=");
                m4207.append(Arrays.toString(this.f1594));
                m4207.append('}');
                return m4207.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1591);
                parcel.writeInt(this.f1592);
                parcel.writeInt(this.f1593 ? 1 : 0);
                int[] iArr = this.f1594;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1594);
                }
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m935(int i) {
            int[] iArr = this.f1590;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1590 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1590 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1590;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public FullSpanItem m936(int i) {
            List<FullSpanItem> list = this.f1589;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1589.get(size);
                if (fullSpanItem.f1591 == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m937() {
            int[] iArr = this.f1590;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1589 = null;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void m938(int i, int i2) {
            int[] iArr = this.f1590;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m935(i3);
            int[] iArr2 = this.f1590;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1590, i, i3, -1);
            List<FullSpanItem> list = this.f1589;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1589.get(size);
                int i4 = fullSpanItem.f1591;
                if (i4 >= i) {
                    fullSpanItem.f1591 = i4 + i2;
                }
            }
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void m939(int i, int i2) {
            int[] iArr = this.f1590;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m935(i3);
            int[] iArr2 = this.f1590;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1590;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<FullSpanItem> list = this.f1589;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1589.get(size);
                int i4 = fullSpanItem.f1591;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1589.remove(size);
                    } else {
                        fullSpanItem.f1591 = i4 - i2;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        /* renamed from: びぐびあび, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m940(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f1590
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f1589
                if (r0 != 0) goto L10
            Le:
                r0 = -1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.m936(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.f1589
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f1589
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f1589
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f1591
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = -1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f1589
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f1589
                r3.remove(r2)
                int r0 = r0.f1591
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f1590
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f1590
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.f1590
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.m940(int):int");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0237();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public List<LazySpanLookup.FullSpanItem> f1595;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1596;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int[] f1597;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f1598;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1599;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int[] f1600;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1601;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1602;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f1603;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f1604;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0237 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f1596 = parcel.readInt();
            this.f1599 = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1602 = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1600 = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1601 = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1597 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f1603 = parcel.readInt() == 1;
            this.f1598 = parcel.readInt() == 1;
            this.f1604 = parcel.readInt() == 1;
            this.f1595 = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f1602 = savedState.f1602;
            this.f1596 = savedState.f1596;
            this.f1599 = savedState.f1599;
            this.f1600 = savedState.f1600;
            this.f1601 = savedState.f1601;
            this.f1597 = savedState.f1597;
            this.f1603 = savedState.f1603;
            this.f1598 = savedState.f1598;
            this.f1604 = savedState.f1604;
            this.f1595 = savedState.f1595;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1596);
            parcel.writeInt(this.f1599);
            parcel.writeInt(this.f1602);
            if (this.f1602 > 0) {
                parcel.writeIntArray(this.f1600);
            }
            parcel.writeInt(this.f1601);
            if (this.f1601 > 0) {
                parcel.writeIntArray(this.f1597);
            }
            parcel.writeInt(this.f1603 ? 1 : 0);
            parcel.writeInt(this.f1598 ? 1 : 0);
            parcel.writeInt(this.f1604 ? 1 : 0);
            parcel.writeList(this.f1595);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$〺つふすそ, reason: contains not printable characters */
    public class C0238 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1605;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1607;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1608;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f1609;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int[] f1610;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1611;

        public C0238() {
            m941();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m941() {
            this.f1608 = -1;
            this.f1605 = Integer.MIN_VALUE;
            this.f1607 = false;
            this.f1611 = false;
            this.f1609 = false;
            int[] iArr = this.f1610;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m942() {
            this.f1605 = this.f1607 ? StaggeredGridLayoutManager.this.f1575.mo3128() : StaggeredGridLayoutManager.this.f1575.mo3140();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$くし〴〺ぅ, reason: contains not printable characters */
    public class C0239 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int f1615;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public ArrayList<View> f1614 = new ArrayList<>();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1612 = Integer.MIN_VALUE;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1613 = Integer.MIN_VALUE;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1617 = 0;

        public C0239(int i) {
            this.f1615 = i;
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int m943(int i) {
            int i2 = this.f1613;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1614.size() == 0) {
                return i;
            }
            m944();
            return this.f1613;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m944() {
            View view = this.f1614.get(r0.size() - 1);
            LayoutParams m946 = m946(view);
            this.f1613 = StaggeredGridLayoutManager.this.f1575.mo3127(view);
            m946.getClass();
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int m945(int i, int i2, boolean z) {
            int mo3140 = StaggeredGridLayoutManager.this.f1575.mo3140();
            int mo3128 = StaggeredGridLayoutManager.this.f1575.mo3128();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1614.get(i);
                int mo3133 = StaggeredGridLayoutManager.this.f1575.mo3133(view);
                int mo3127 = StaggeredGridLayoutManager.this.f1575.mo3127(view);
                boolean z2 = false;
                boolean z3 = !z ? mo3133 >= mo3128 : mo3133 > mo3128;
                if (!z ? mo3127 > mo3140 : mo3127 >= mo3140) {
                    z2 = true;
                }
                if (z3 && z2 && (mo3133 < mo3140 || mo3127 > mo3128)) {
                    return StaggeredGridLayoutManager.this.m857(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public LayoutParams m946(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m947() {
            View view = this.f1614.get(0);
            LayoutParams m946 = m946(view);
            this.f1612 = StaggeredGridLayoutManager.this.f1575.mo3133(view);
            m946.getClass();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m948(View view) {
            LayoutParams m946 = m946(view);
            m946.f1588 = this;
            this.f1614.add(view);
            this.f1613 = Integer.MIN_VALUE;
            if (this.f1614.size() == 1) {
                this.f1612 = Integer.MIN_VALUE;
            }
            if (m946.m753() || m946.m752()) {
                this.f1617 = StaggeredGridLayoutManager.this.f1575.mo3132(view) + this.f1617;
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int m949() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f1570) {
                i = this.f1614.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f1614.size();
            }
            return m945(i, size, true);
        }

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public void m950() {
            int size = this.f1614.size();
            View remove = this.f1614.remove(size - 1);
            LayoutParams m946 = m946(remove);
            m946.f1588 = null;
            if (m946.m753() || m946.m752()) {
                this.f1617 -= StaggeredGridLayoutManager.this.f1575.mo3132(remove);
            }
            if (size == 1) {
                this.f1612 = Integer.MIN_VALUE;
            }
            this.f1613 = Integer.MIN_VALUE;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int m951() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f1570) {
                size = 0;
                i = this.f1614.size();
            } else {
                size = this.f1614.size() - 1;
                i = -1;
            }
            return m945(size, i, true);
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public void m952() {
            View remove = this.f1614.remove(0);
            LayoutParams m946 = m946(remove);
            m946.f1588 = null;
            if (this.f1614.size() == 0) {
                this.f1613 = Integer.MIN_VALUE;
            }
            if (m946.m753() || m946.m752()) {
                this.f1617 -= StaggeredGridLayoutManager.this.f1575.mo3132(remove);
            }
            this.f1612 = Integer.MIN_VALUE;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m953() {
            this.f1614.clear();
            this.f1612 = Integer.MIN_VALUE;
            this.f1613 = Integer.MIN_VALUE;
            this.f1617 = 0;
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public void m954(View view) {
            LayoutParams m946 = m946(view);
            m946.f1588 = this;
            this.f1614.add(0, view);
            this.f1612 = Integer.MIN_VALUE;
            if (this.f1614.size() == 1) {
                this.f1613 = Integer.MIN_VALUE;
            }
            if (m946.m753() || m946.m752()) {
                this.f1617 = StaggeredGridLayoutManager.this.f1575.mo3132(view) + this.f1617;
            }
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public View m955(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1614.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1614.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1570 && staggeredGridLayoutManager.m857(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1570 && staggeredGridLayoutManager2.m857(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1614.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1614.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1570 && staggeredGridLayoutManager3.m857(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1570 && staggeredGridLayoutManager4.m857(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int m956(int i) {
            int i2 = this.f1612;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1614.size() == 0) {
                return i;
            }
            m947();
            return this.f1612;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0240 implements Runnable {
        public RunnableC0240() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m914();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1577 = -1;
        this.f1570 = false;
        RecyclerView.AbstractC0219.C0223 m814 = RecyclerView.AbstractC0219.m814(context, attributeSet, i, i2);
        int i3 = m814.f1539;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo667(null);
        if (i3 != this.f1580) {
            this.f1580 = i3;
            AbstractC1385 abstractC1385 = this.f1575;
            this.f1575 = this.f1576;
            this.f1576 = abstractC1385;
            m841();
        }
        int i4 = m814.f1537;
        mo667(null);
        if (i4 != this.f1577) {
            this.f1567.m937();
            m841();
            this.f1577 = i4;
            this.f1584 = new BitSet(this.f1577);
            this.f1583 = new C0239[this.f1577];
            for (int i5 = 0; i5 < this.f1577; i5++) {
                this.f1583[i5] = new C0239(i5);
            }
            m841();
        }
        boolean z = m814.f1538;
        mo667(null);
        SavedState savedState = this.f1579;
        if (savedState != null && savedState.f1603 != z) {
            savedState.f1603 = z;
        }
        this.f1570 = z;
        m841();
        this.f1566 = new C1410();
        this.f1575 = AbstractC1385.m3125(this, this.f1580);
        this.f1576 = AbstractC1385.m3125(this, 1 - this.f1580);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〱〴なぱへて */
    public void mo816(int i) {
        if (i == 0) {
            m914();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〱〵つてう */
    public void mo630(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1579 = (SavedState) parcelable;
            m841();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〳に〴あぽ */
    public boolean mo591() {
        return this.f1579 == null;
    }

    /* renamed from: 〴おちすく, reason: contains not printable characters */
    public View m904(boolean z) {
        int mo3140 = this.f1575.mo3140();
        int mo3128 = this.f1575.mo3128();
        int m836 = m836();
        View view = null;
        for (int i = 0; i < m836; i++) {
            View m826 = m826(i);
            int mo3133 = this.f1575.mo3133(m826);
            if (this.f1575.mo3127(m826) > mo3140 && mo3133 < mo3128) {
                if (mo3133 >= mo3140 || !z) {
                    return m826;
                }
                if (view == null) {
                    view = m826;
                }
            }
        }
        return view;
    }

    /* renamed from: 〵いどうねぢ, reason: contains not printable characters */
    public final int m905(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        return C2786.m4786(c0224, this.f1575, m904(!this.f1565), m911(!this.f1565), this, this.f1565, this.f1568);
    }

    /* renamed from: 〵げとずぐみ, reason: contains not printable characters */
    public boolean m906() {
        return m840() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〺〲に〼へ〸 */
    public void mo594(RecyclerView.C0224 c0224) {
        this.f1582 = -1;
        this.f1581 = Integer.MIN_VALUE;
        this.f1579 = null;
        this.f1572.m941();
    }

    /* renamed from: 〻だくけはく, reason: contains not printable characters */
    public final int m907(int i) {
        if (m836() == 0) {
            return this.f1568 ? 1 : -1;
        }
        return (i < m918()) != this.f1568 ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁごぐすすぃ */
    public boolean mo596(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁないぼぎへ */
    public void mo597(RecyclerView recyclerView) {
        this.f1567.m937();
        m841();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁにあがあ */
    public Parcelable mo635() {
        int m956;
        int mo3140;
        int[] iArr;
        SavedState savedState = this.f1579;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f1603 = this.f1570;
        savedState2.f1598 = this.f1587;
        savedState2.f1604 = this.f1571;
        LazySpanLookup lazySpanLookup = this.f1567;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f1590) == null) {
            savedState2.f1601 = 0;
        } else {
            savedState2.f1597 = iArr;
            savedState2.f1601 = iArr.length;
            savedState2.f1595 = lazySpanLookup.f1589;
        }
        if (m836() > 0) {
            savedState2.f1596 = this.f1587 ? m910() : m918();
            View m911 = this.f1568 ? m911(true) : m904(true);
            savedState2.f1599 = m911 != null ? m857(m911) : -1;
            int i = this.f1577;
            savedState2.f1602 = i;
            savedState2.f1600 = new int[i];
            for (int i2 = 0; i2 < this.f1577; i2++) {
                if (this.f1587) {
                    m956 = this.f1583[i2].m943(Integer.MIN_VALUE);
                    if (m956 != Integer.MIN_VALUE) {
                        mo3140 = this.f1575.mo3128();
                        m956 -= mo3140;
                        savedState2.f1600[i2] = m956;
                    } else {
                        savedState2.f1600[i2] = m956;
                    }
                } else {
                    m956 = this.f1583[i2].m956(Integer.MIN_VALUE);
                    if (m956 != Integer.MIN_VALUE) {
                        mo3140 = this.f1575.mo3140();
                        m956 -= mo3140;
                        savedState2.f1600[i2] = m956;
                    } else {
                        savedState2.f1600[i2] = m956;
                    }
                }
            }
        } else {
            savedState2.f1596 = -1;
            savedState2.f1599 = -1;
            savedState2.f1602 = 0;
        }
        return savedState2;
    }

    /* renamed from: ぃぉみぜす, reason: contains not printable characters */
    public final void m908(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, boolean z) {
        int mo3128;
        int m928 = m928(Integer.MIN_VALUE);
        if (m928 != Integer.MIN_VALUE && (mo3128 = this.f1575.mo3128() - m928) > 0) {
            int i = mo3128 - (-m909(-mo3128, c0217, c0224));
            if (!z || i <= 0) {
                return;
            }
            this.f1575.mo3130(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぅばづそほせ */
    public void mo599(RecyclerView recyclerView, int i, int i2) {
        m916(i, i2, 2);
    }

    /* renamed from: うでこすぢた, reason: contains not printable characters */
    public int m909(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (m836() == 0 || i == 0) {
            return 0;
        }
        m930(i, c0224);
        int m932 = m932(c0217, this.f1566, c0224);
        if (this.f1566.f6636 >= m932) {
            i = i < 0 ? -m932 : m932;
        }
        this.f1575.mo3130(-i);
        this.f1587 = this.f1568;
        C1410 c1410 = this.f1566;
        c1410.f6636 = 0;
        m920(c0217, c1410);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぇぬぎばつ */
    public int mo601(RecyclerView.C0224 c0224) {
        return m924(c0224);
    }

    /* renamed from: えげて〱でく, reason: contains not printable characters */
    public int m910() {
        int m836 = m836();
        if (m836 == 0) {
            return 0;
        }
        return m857(m826(m836 - 1));
    }

    /* renamed from: ぉいけぐつ, reason: contains not printable characters */
    public View m911(boolean z) {
        int mo3140 = this.f1575.mo3140();
        int mo3128 = this.f1575.mo3128();
        View view = null;
        for (int m836 = m836() - 1; m836 >= 0; m836--) {
            View m826 = m826(m836);
            int mo3133 = this.f1575.mo3133(m826);
            int mo3127 = this.f1575.mo3127(m826);
            if (mo3127 > mo3140 && mo3133 < mo3128) {
                if (mo3127 <= mo3128 || !z) {
                    return m826;
                }
                if (view == null) {
                    view = m826;
                }
            }
        }
        return view;
    }

    /* renamed from: ぉさひねい, reason: contains not printable characters */
    public final void m912() {
        this.f1568 = (this.f1580 == 1 || !m906()) ? this.f1570 : !this.f1570;
    }

    /* renamed from: お〵かぜて, reason: contains not printable characters */
    public final void m913(int i) {
        C1410 c1410 = this.f1566;
        c1410.f6640 = i;
        c1410.f6642 = this.f1568 != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: おぐぴう〸ず */
    public int mo602(RecyclerView.C0224 c0224) {
        return m905(c0224);
    }

    /* renamed from: おぬぃかはど, reason: contains not printable characters */
    public boolean m914() {
        int m918;
        if (m836() != 0 && this.f1578 != 0 && this.f1533) {
            if (this.f1568) {
                m918 = m910();
                m918();
            } else {
                m918 = m918();
                m910();
            }
            if (m918 == 0 && m922() != null) {
                this.f1567.m937();
                this.f1518 = true;
                m841();
                return true;
            }
        }
        return false;
    }

    /* renamed from: かこあぇ〸〼, reason: contains not printable characters */
    public final void m915(RecyclerView.C0217 c0217, int i) {
        while (m836() > 0) {
            View m826 = m826(0);
            if (this.f1575.mo3127(m826) > i || this.f1575.mo3138(m826) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) m826.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.f1588.f1614.size() == 1) {
                return;
            }
            layoutParams.f1588.m952();
            m835(m826, c0217);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: かづげぃぁ〺 */
    public void mo842(int i) {
        super.mo842(i);
        for (int i2 = 0; i2 < this.f1577; i2++) {
            C0239 c0239 = this.f1583[i2];
            int i3 = c0239.f1612;
            if (i3 != Integer.MIN_VALUE) {
                c0239.f1612 = i3 + i;
            }
            int i4 = c0239.f1613;
            if (i4 != Integer.MIN_VALUE) {
                c0239.f1613 = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: がぐくいおす */
    public void mo605(RecyclerView recyclerView, int i, int i2, Object obj) {
        m916(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: がぴぽぁぬ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m916(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1568
            if (r0 == 0) goto L9
            int r0 = r6.m910()
            goto Ld
        L9:
            int r0 = r6.m918()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f1567
            r4.m940(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1567
            r9.m939(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f1567
            r7.m938(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1567
            r9.m939(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f1567
            r9.m938(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f1568
            if (r7 == 0) goto L4d
            int r7 = r6.m918()
            goto L51
        L4d:
            int r7 = r6.m910()
        L51:
            if (r3 > r7) goto L56
            r6.m841()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m916(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x03f9, code lost:
    
        if (m914() != false) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* renamed from: きづぢばちつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m917(androidx.recyclerview.widget.RecyclerView.C0217 r12, androidx.recyclerview.widget.RecyclerView.C0224 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m917(androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, androidx.recyclerview.widget.RecyclerView$でどあくず, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0038, code lost:
    
        if (r8.f1580 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x003d, code lost:
    
        if (r8.f1580 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x004c, code lost:
    
        if (m906() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0058, code lost:
    
        if (m906() == false) goto L46;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: きぬどぼみ〸 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo606(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0217 r11, androidx.recyclerview.widget.RecyclerView.C0224 r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo606(android.view.View, int, androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, androidx.recyclerview.widget.RecyclerView$でどあくず):android.view.View");
    }

    /* renamed from: ぎがえべぱど, reason: contains not printable characters */
    public int m918() {
        if (m836() == 0) {
            return 0;
        }
        return m857(m826(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: く〱なおぎ */
    public int mo607(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return m909(i, c0217, c0224);
    }

    /* renamed from: ぐいぎぽぼ, reason: contains not printable characters */
    public final void m919(View view, int i, int i2, boolean z) {
        Rect rect = this.f1573;
        RecyclerView recyclerView = this.f1519;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m695(view));
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect2 = this.f1573;
        int m921 = m921(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect3 = this.f1573;
        int m9212 = m921(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect3.bottom);
        if (z ? m834(view, m921, m9212, layoutParams) : m859(view, m921, m9212, layoutParams)) {
            view.measure(m921, m9212);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r6.f6640 == (-1)) goto L11;
     */
    /* renamed from: けいっど〱, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m920(androidx.recyclerview.widget.RecyclerView.C0217 r5, p034.p065.p066.C1410 r6) {
        /*
            r4 = this;
            boolean r0 = r6.f6639
            if (r0 == 0) goto L7c
            boolean r0 = r6.f6643
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f6636
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f6640
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f6637
        L15:
            r4.m931(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f6641
        L1b:
            r4.m915(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f6640
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f6641
            androidx.recyclerview.widget.StaggeredGridLayoutManager$くし〴〺ぅ[] r1 = r4.f1583
            r1 = r1[r2]
            int r1 = r1.m956(r0)
        L2f:
            int r2 = r4.f1577
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$くし〴〺ぅ[] r2 = r4.f1583
            r2 = r2[r3]
            int r2 = r2.m956(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f6637
            int r6 = r6.f6636
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f6637
            androidx.recyclerview.widget.StaggeredGridLayoutManager$くし〴〺ぅ[] r1 = r4.f1583
            r1 = r1[r2]
            int r1 = r1.m943(r0)
        L5a:
            int r2 = r4.f1577
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$くし〴〺ぅ[] r2 = r4.f1583
            r2 = r2[r3]
            int r2 = r2.m943(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f6637
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f6641
            int r6 = r6.f6636
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m920(androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0214.InterfaceC0215
    /* renamed from: げつ〴ぬぐ */
    public PointF mo648(int i) {
        int m907 = m907(i);
        PointF pointF = new PointF();
        if (m907 == 0) {
            return null;
        }
        if (this.f1580 == 0) {
            pointF.x = m907;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m907;
        }
        return pointF;
    }

    /* renamed from: さぬうづぃ, reason: contains not printable characters */
    public final int m921(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* renamed from: ざぇぎぱ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m922() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m922():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ざっざへづ */
    public RecyclerView.LayoutParams mo609() {
        return this.f1580 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: しげにけぃ */
    public void mo610(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        m917(c0217, c0224, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ずまげせび〳 */
    public void mo854(int i) {
        super.mo854(i);
        for (int i2 = 0; i2 < this.f1577; i2++) {
            C0239 c0239 = this.f1583[i2];
            int i3 = c0239.f1612;
            if (i3 != Integer.MIN_VALUE) {
                c0239.f1612 = i3 + i;
            }
            int i4 = c0239.f1613;
            if (i4 != Integer.MIN_VALUE) {
                c0239.f1613 = i4 + i;
            }
        }
    }

    /* renamed from: せばぴ〸び, reason: contains not printable characters */
    public final int m923(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        return C2786.m4834(c0224, this.f1575, m904(!this.f1565), m911(!this.f1565), this, this.f1565);
    }

    /* renamed from: っあつぜっ, reason: contains not printable characters */
    public final int m924(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        return C2786.m4779(c0224, this.f1575, m904(!this.f1565), m911(!this.f1565), this, this.f1565);
    }

    /* renamed from: つなつぼず, reason: contains not printable characters */
    public final boolean m925(int i) {
        if (this.f1580 == 0) {
            return (i == -1) != this.f1568;
        }
        return ((i == -1) == this.f1568) == m906();
    }

    /* renamed from: つびたくず, reason: contains not printable characters */
    public final void m926(int i, int i2) {
        for (int i3 = 0; i3 < this.f1577; i3++) {
            if (!this.f1583[i3].f1614.isEmpty()) {
                m934(this.f1583[i3], i, i2);
            }
        }
    }

    /* renamed from: づ〵ぬきすへ, reason: contains not printable characters */
    public final void m927(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, boolean z) {
        int mo3140;
        int m933 = m933(Integer.MAX_VALUE);
        if (m933 != Integer.MAX_VALUE && (mo3140 = m933 - this.f1575.mo3140()) > 0) {
            int m909 = mo3140 - m909(mo3140, c0217, c0224);
            if (!z || m909 <= 0) {
                return;
            }
            this.f1575.mo3130(-m909);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: づおぴ〱いづ */
    public void mo656(RecyclerView recyclerView, RecyclerView.C0224 c0224, int i) {
        C1380 c1380 = new C1380(recyclerView.getContext());
        c1380.f1499 = i;
        m829(c1380);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: づざかべべ */
    public boolean mo657() {
        return this.f1580 == 0;
    }

    /* renamed from: づふぱぐそ〹, reason: contains not printable characters */
    public final int m928(int i) {
        int m943 = this.f1583[0].m943(i);
        for (int i2 = 1; i2 < this.f1577; i2++) {
            int m9432 = this.f1583[i2].m943(i);
            if (m9432 > m943) {
                m943 = m9432;
            }
        }
        return m943;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: てぜきぽく */
    public int mo612(RecyclerView.C0224 c0224) {
        return m905(c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: でどあくず */
    public RecyclerView.LayoutParams mo614(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* renamed from: どつち〻ぎづ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m929(int r5, androidx.recyclerview.widget.RecyclerView.C0224 r6) {
        /*
            r4 = this;
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r0 = r4.f1566
            r1 = 0
            r0.f6636 = r1
            r0.f6638 = r5
            androidx.recyclerview.widget.RecyclerView$ざっざへづ r0 = r4.f1520
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f1500
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L33
            int r6 = r6.f1546
            r0 = -1
            if (r6 == r0) goto L33
            boolean r0 = r4.f1568
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r0 != r5) goto L2a
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r5 = r4.f1575
            int r5 = r5.mo3134()
            goto L34
        L2a:
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r5 = r4.f1575
            int r5 = r5.mo3134()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1519
            if (r0 == 0) goto L3f
            boolean r0 = r0.f1385
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L59
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r0 = r4.f1566
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r3 = r4.f1575
            int r3 = r3.mo3140()
            int r3 = r3 - r6
            r0.f6641 = r3
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r6 = r4.f1566
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r0 = r4.f1575
            int r0 = r0.mo3128()
            int r0 = r0 + r5
            r6.f6637 = r0
            goto L69
        L59:
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r0 = r4.f1566
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r3 = r4.f1575
            int r3 = r3.mo3135()
            int r3 = r3 + r5
            r0.f6637 = r3
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r5 = r4.f1566
            int r6 = -r6
            r5.f6641 = r6
        L69:
            づざかべべ.ぇぬぎばつ.びぐびあび.へぬ〴づぞ r5 = r4.f1566
            r5.f6635 = r1
            r5.f6639 = r2
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r6 = r4.f1575
            int r6 = r6.mo3139()
            if (r6 != 0) goto L80
            づざかべべ.ぇぬぎばつ.びぐびあび.ごづごきえ r6 = r4.f1575
            int r6 = r6.mo3135()
            if (r6 != 0) goto L80
            r1 = 1
        L80:
            r5.f6643 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m929(int, androidx.recyclerview.widget.RecyclerView$でどあくず):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: な〱ちぉじ */
    public void mo662(RecyclerView recyclerView, RecyclerView.C0217 c0217) {
        m843();
        Runnable runnable = this.f1574;
        RecyclerView recyclerView2 = this.f1519;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f1577; i++) {
            this.f1583[i].m953();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: なぎぱいぢぎ */
    public boolean mo663() {
        return this.f1580 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: にぢ〱ぁな */
    public void mo615(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, View view, C1084 c1084) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            m838(view, c1084);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f1580 == 0) {
            C0239 c0239 = layoutParams2.f1588;
            i2 = c0239 == null ? -1 : c0239.f1615;
            i3 = 1;
            i = -1;
            i4 = -1;
        } else {
            C0239 c02392 = layoutParams2.f1588;
            i = c02392 == null ? -1 : c02392.f1615;
            i2 = -1;
            i3 = -1;
            i4 = 1;
        }
        c1084.m2457(C1084.C1086.m2470(i2, i3, i, i4, false, false));
    }

    /* renamed from: のとけっぬ, reason: contains not printable characters */
    public void m930(int i, RecyclerView.C0224 c0224) {
        int m918;
        int i2;
        if (i > 0) {
            m918 = m910();
            i2 = 1;
        } else {
            m918 = m918();
            i2 = -1;
        }
        this.f1566.f6639 = true;
        m929(m918, c0224);
        m913(i2);
        C1410 c1410 = this.f1566;
        c1410.f6638 = m918 + c1410.f6642;
        c1410.f6636 = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: のびぶけせ */
    public void mo666(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0217 c0217 = this.f1519.f1411;
        m832(accessibilityEvent);
        if (m836() > 0) {
            View m904 = m904(false);
            View m911 = m911(false);
            if (m904 == null || m911 == null) {
                return;
            }
            int m857 = m857(m904);
            int m8572 = m857(m911);
            if (m857 < m8572) {
                accessibilityEvent.setFromIndex(m857);
                accessibilityEvent.setToIndex(m8572);
            } else {
                accessibilityEvent.setFromIndex(m8572);
                accessibilityEvent.setToIndex(m857);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: のぷのちつ */
    public int mo616(RecyclerView.C0224 c0224) {
        return m924(c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: はぁとそぎ */
    public int mo617(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return m909(i, c0217, c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ばおぢでぎか */
    public int mo618(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return this.f1580 == 0 ? this.f1577 : super.mo618(c0217, c0224);
    }

    /* renamed from: ひ〲どぼぢだ, reason: contains not printable characters */
    public final void m931(RecyclerView.C0217 c0217, int i) {
        for (int m836 = m836() - 1; m836 >= 0; m836--) {
            View m826 = m826(m836);
            if (this.f1575.mo3133(m826) < i || this.f1575.mo3131(m826) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) m826.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.f1588.f1614.size() == 1) {
                return;
            }
            layoutParams.f1588.m950();
            m835(m826, c0217);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: びえぁぜい */
    public int mo622(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return this.f1580 == 1 ? this.f1577 : super.mo622(c0217, c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: びぐびあび */
    public void mo667(String str) {
        RecyclerView recyclerView;
        if (this.f1579 != null || (recyclerView = this.f1519) == null) {
            return;
        }
        recyclerView.m750(str);
    }

    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* renamed from: ぴまけ〸だて, reason: contains not printable characters */
    public final int m932(RecyclerView.C0217 c0217, C1410 c1410, RecyclerView.C0224 c0224) {
        int i;
        C0239 c0239;
        ?? r2;
        int m813;
        boolean z;
        int m8132;
        int m956;
        int mo3132;
        int mo3140;
        int mo31322;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = false;
        this.f1584.set(0, this.f1577, true);
        if (this.f1566.f6643) {
            i = c1410.f6640 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c1410.f6640 == 1 ? c1410.f6637 + c1410.f6636 : c1410.f6641 - c1410.f6636;
        }
        m926(c1410.f6640, i);
        int mo3128 = this.f1568 ? this.f1575.mo3128() : this.f1575.mo3140();
        boolean z3 = false;
        while (true) {
            int i8 = c1410.f6638;
            if (!(i8 >= 0 && i8 < c0224.m881()) || (!this.f1566.f6643 && this.f1584.isEmpty())) {
                break;
            }
            View view = c0217.m809(c1410.f6638, z2, Long.MAX_VALUE).f1476;
            c1410.f6638 += c1410.f6642;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int m754 = layoutParams.m754();
            int[] iArr = this.f1567.f1590;
            int i9 = (iArr == null || m754 >= iArr.length) ? -1 : iArr[m754];
            if (i9 == -1) {
                if (m925(c1410.f6640)) {
                    i6 = this.f1577 - 1;
                    i5 = -1;
                    i7 = -1;
                } else {
                    i5 = this.f1577;
                    i6 = 0;
                    i7 = 1;
                }
                C0239 c02392 = null;
                if (c1410.f6640 == 1) {
                    int mo31402 = this.f1575.mo3140();
                    int i10 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        C0239 c02393 = this.f1583[i6];
                        int m943 = c02393.m943(mo31402);
                        if (m943 < i10) {
                            c02392 = c02393;
                            i10 = m943;
                        }
                        i6 += i7;
                    }
                } else {
                    int mo31282 = this.f1575.mo3128();
                    int i11 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        C0239 c02394 = this.f1583[i6];
                        int m9562 = c02394.m956(mo31282);
                        if (m9562 > i11) {
                            c02392 = c02394;
                            i11 = m9562;
                        }
                        i6 += i7;
                    }
                }
                c0239 = c02392;
                LazySpanLookup lazySpanLookup = this.f1567;
                lazySpanLookup.m935(m754);
                lazySpanLookup.f1590[m754] = c0239.f1615;
            } else {
                c0239 = this.f1583[i9];
            }
            C0239 c02395 = c0239;
            layoutParams.f1588 = c02395;
            if (c1410.f6640 == 1) {
                r2 = 0;
                m845(view, -1, false);
            } else {
                r2 = 0;
                m845(view, 0, false);
            }
            if (this.f1580 == 1) {
                m813 = RecyclerView.AbstractC0219.m813(this.f1585, this.f1532, r2, ((ViewGroup.MarginLayoutParams) layoutParams).width, r2);
                m8132 = RecyclerView.AbstractC0219.m813(this.f1523, this.f1524, m847() + m860(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
                z = false;
            } else {
                m813 = RecyclerView.AbstractC0219.m813(this.f1522, this.f1532, m828() + m862(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
                z = false;
                m8132 = RecyclerView.AbstractC0219.m813(this.f1585, this.f1524, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            }
            m919(view, m813, m8132, z);
            if (c1410.f6640 == 1) {
                mo3132 = c02395.m943(mo3128);
                m956 = this.f1575.mo3132(view) + mo3132;
            } else {
                m956 = c02395.m956(mo3128);
                mo3132 = m956 - this.f1575.mo3132(view);
            }
            int i12 = c1410.f6640;
            C0239 c02396 = layoutParams.f1588;
            if (i12 == 1) {
                c02396.m948(view);
            } else {
                c02396.m954(view);
            }
            if (m906() && this.f1580 == 1) {
                mo31322 = this.f1576.mo3128() - (((this.f1577 - 1) - c02395.f1615) * this.f1585);
                mo3140 = mo31322 - this.f1576.mo3132(view);
            } else {
                mo3140 = this.f1576.mo3140() + (c02395.f1615 * this.f1585);
                mo31322 = this.f1576.mo3132(view) + mo3140;
            }
            if (this.f1580 == 1) {
                i3 = mo31322;
                i2 = m956;
                i4 = mo3140;
                mo3140 = mo3132;
            } else {
                i2 = mo31322;
                i3 = m956;
                i4 = mo3132;
            }
            m844(view, i4, mo3140, i3, i2);
            m934(c02395, this.f1566.f6640, i);
            m920(c0217, this.f1566);
            if (this.f1566.f6635 && view.hasFocusable()) {
                this.f1584.set(c02395.f1615, false);
            }
            z3 = true;
            z2 = false;
        }
        if (!z3) {
            m920(c0217, this.f1566);
        }
        int mo31403 = this.f1566.f6640 == -1 ? this.f1575.mo3140() - m933(this.f1575.mo3140()) : m928(this.f1575.mo3128()) - this.f1575.mo3128();
        if (mo31403 > 0) {
            return Math.min(c1410.f6636, mo31403);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぶでにく〼〳 */
    public RecyclerView.LayoutParams mo623(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へえどぜせ */
    public void mo624(RecyclerView recyclerView, int i, int i2, int i3) {
        m916(i, i2, 8);
    }

    /* renamed from: へざ〴ばび〻, reason: contains not printable characters */
    public final int m933(int i) {
        int m956 = this.f1583[0].m956(i);
        for (int i2 = 1; i2 < this.f1577; i2++) {
            int m9562 = this.f1583[i2].m956(i);
            if (m9562 < m956) {
                m956 = m9562;
            }
        }
        return m956;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へぬ〴づぞ */
    public int mo670(RecyclerView.C0224 c0224) {
        return m923(c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へぼ〳〻び */
    public void mo627(RecyclerView recyclerView, int i, int i2) {
        m916(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺぁあねじ */
    public void mo671(int i, int i2, RecyclerView.C0224 c0224, RecyclerView.AbstractC0219.InterfaceC0221 interfaceC0221) {
        int m943;
        int i3;
        if (this.f1580 != 0) {
            i = i2;
        }
        if (m836() == 0 || i == 0) {
            return;
        }
        m930(i, c0224);
        int[] iArr = this.f1569;
        if (iArr == null || iArr.length < this.f1577) {
            this.f1569 = new int[this.f1577];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f1577; i5++) {
            C1410 c1410 = this.f1566;
            if (c1410.f6642 == -1) {
                m943 = c1410.f6641;
                i3 = this.f1583[i5].m956(m943);
            } else {
                m943 = this.f1583[i5].m943(c1410.f6637);
                i3 = this.f1566.f6637;
            }
            int i6 = m943 - i3;
            if (i6 >= 0) {
                this.f1569[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.f1569, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.f1566.f6638;
            if (!(i8 >= 0 && i8 < c0224.m881())) {
                return;
            }
            ((RunnableC1400.C1401) interfaceC0221).m3168(this.f1566.f6638, this.f1569[i7]);
            C1410 c14102 = this.f1566;
            c14102.f6638 += c14102.f6642;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺぃつぢぼ */
    public void mo672(int i) {
        SavedState savedState = this.f1579;
        if (savedState != null && savedState.f1596 != i) {
            savedState.f1600 = null;
            savedState.f1602 = 0;
            savedState.f1596 = -1;
            savedState.f1599 = -1;
        }
        this.f1582 = i;
        this.f1581 = Integer.MIN_VALUE;
        m841();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺがぅす〹ち */
    public boolean mo673() {
        return this.f1578 != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺでどぜべ */
    public void mo628(Rect rect, int i, int i2) {
        int m812;
        int m8122;
        int m828 = m828() + m862();
        int m847 = m847() + m860();
        if (this.f1580 == 1) {
            m8122 = RecyclerView.AbstractC0219.m812(i2, rect.height() + m847, m823());
            m812 = RecyclerView.AbstractC0219.m812(i, (this.f1585 * this.f1577) + m828, m833());
        } else {
            m812 = RecyclerView.AbstractC0219.m812(i, rect.width() + m828, m833());
            m8122 = RecyclerView.AbstractC0219.m812(i2, (this.f1585 * this.f1577) + m847, m823());
        }
        this.f1519.setMeasuredDimension(m812, m8122);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺふねづ〺 */
    public int mo674(RecyclerView.C0224 c0224) {
        return m923(c0224);
    }

    /* renamed from: ほ〱たうえの, reason: contains not printable characters */
    public final void m934(C0239 c0239, int i, int i2) {
        int i3 = c0239.f1617;
        if (i == -1) {
            int i4 = c0239.f1612;
            if (i4 == Integer.MIN_VALUE) {
                c0239.m947();
                i4 = c0239.f1612;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c0239.f1613;
            if (i5 == Integer.MIN_VALUE) {
                c0239.m944();
                i5 = c0239.f1613;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f1584.set(c0239.f1615, false);
    }
}
