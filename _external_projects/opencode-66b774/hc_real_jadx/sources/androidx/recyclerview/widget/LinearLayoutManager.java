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
import java.util.List;
import p034.p065.p066.AbstractC1385;
import p034.p065.p066.C1380;
import p034.p065.p066.RunnableC1400;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0219 implements RecyclerView.AbstractC0214.InterfaceC0215 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f1336;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final C0197 f1337;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f1338;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f1339;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public AbstractC1385 f1340;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f1341;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f1342;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f1343;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f1344;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final C0199 f1345;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public SavedState f1346;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C0198 f1347;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f1348;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f1349;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int[] f1350;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0196();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1351;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1352;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1353;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0196 implements Parcelable.Creator<SavedState> {
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
            this.f1351 = parcel.readInt();
            this.f1352 = parcel.readInt();
            this.f1353 = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f1351 = savedState.f1351;
            this.f1352 = savedState.f1352;
            this.f1353 = savedState.f1353;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1351);
            parcel.writeInt(this.f1352);
            parcel.writeInt(this.f1353 ? 1 : 0);
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean m676() {
            return this.f1351 >= 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$〺つふすそ, reason: contains not printable characters */
    public static class C0197 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1354;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1355;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f1356;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1357;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0198 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1359;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f1360;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f1361;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1362;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f1364;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean f1365;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f1366;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1367;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f1363 = true;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f1358 = 0;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f1368 = 0;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public List<RecyclerView.AbstractC0207> f1369 = null;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean m677(RecyclerView.C0224 c0224) {
            int i = this.f1367;
            return i >= 0 && i < c0224.m881();
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public View m678(RecyclerView.C0217 c0217) {
            List<RecyclerView.AbstractC0207> list = this.f1369;
            if (list == null) {
                View view = c0217.m809(this.f1367, false, Long.MAX_VALUE).f1476;
                this.f1367 += this.f1364;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f1369.get(i).f1476;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.m753() && this.f1367 == layoutParams.m754()) {
                    m679(view2);
                    return view2;
                }
            }
            return null;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m679(View view) {
            int m754;
            int size = this.f1369.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f1369.get(i2).f1476;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m753() && (m754 = (layoutParams.m754() - this.f1367) * this.f1364) >= 0 && m754 < i) {
                    view2 = view3;
                    if (m754 == 0) {
                        break;
                    } else {
                        i = m754;
                    }
                }
            }
            this.f1367 = view2 == null ? -1 : ((RecyclerView.LayoutParams) view2.getLayoutParams()).m754();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0199 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f1370;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1371;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC1385 f1372;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f1373;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1374;

        public C0199() {
            m683();
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("AnchorInfo{mPosition=");
            m4207.append(this.f1370);
            m4207.append(", mCoordinate=");
            m4207.append(this.f1371);
            m4207.append(", mLayoutFromEnd=");
            m4207.append(this.f1374);
            m4207.append(", mValid=");
            m4207.append(this.f1373);
            m4207.append('}');
            return m4207.toString();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m680(View view, int i) {
            if (this.f1374) {
                this.f1371 = this.f1372.m3136() + this.f1372.mo3127(view);
            } else {
                this.f1371 = this.f1372.mo3133(view);
            }
            this.f1370 = i;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m681(View view, int i) {
            int min;
            int m3136 = this.f1372.m3136();
            if (m3136 >= 0) {
                m680(view, i);
                return;
            }
            this.f1370 = i;
            if (this.f1374) {
                int mo3128 = (this.f1372.mo3128() - m3136) - this.f1372.mo3127(view);
                this.f1371 = this.f1372.mo3128() - mo3128;
                if (mo3128 <= 0) {
                    return;
                }
                int mo3132 = this.f1371 - this.f1372.mo3132(view);
                int mo3140 = this.f1372.mo3140();
                int min2 = mo3132 - (Math.min(this.f1372.mo3133(view) - mo3140, 0) + mo3140);
                if (min2 >= 0) {
                    return;
                }
                min = Math.min(mo3128, -min2) + this.f1371;
            } else {
                int mo3133 = this.f1372.mo3133(view);
                int mo31402 = mo3133 - this.f1372.mo3140();
                this.f1371 = mo3133;
                if (mo31402 <= 0) {
                    return;
                }
                int mo31282 = (this.f1372.mo3128() - Math.min(0, (this.f1372.mo3128() - m3136) - this.f1372.mo3127(view))) - (this.f1372.mo3132(view) + mo3133);
                if (mo31282 >= 0) {
                    return;
                } else {
                    min = this.f1371 - Math.min(mo31402, -mo31282);
                }
            }
            this.f1371 = min;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m682() {
            this.f1371 = this.f1374 ? this.f1372.mo3128() : this.f1372.mo3140();
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m683() {
            this.f1370 = -1;
            this.f1371 = Integer.MIN_VALUE;
            this.f1374 = false;
            this.f1373 = false;
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f1342 = 1;
        this.f1344 = false;
        this.f1349 = false;
        this.f1336 = false;
        this.f1339 = true;
        this.f1338 = -1;
        this.f1348 = Integer.MIN_VALUE;
        this.f1346 = null;
        this.f1345 = new C0199();
        this.f1337 = new C0197();
        this.f1343 = 2;
        this.f1350 = new int[2];
        m675(i);
        mo667(null);
        if (z == this.f1344) {
            return;
        }
        this.f1344 = z;
        m841();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public void mo630(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1346 = (SavedState) parcelable;
            m841();
        }
    }

    /* renamed from: 〲みぃどこ, reason: contains not printable characters */
    public final void m631(int i, int i2) {
        this.f1347.f1362 = this.f1340.mo3128() - i2;
        C0198 c0198 = this.f1347;
        c0198.f1364 = this.f1349 ? -1 : 1;
        c0198.f1367 = i;
        c0198.f1366 = 1;
        c0198.f1359 = i2;
        c0198.f1360 = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〳に〴あぽ */
    public boolean mo591() {
        return this.f1346 == null && this.f1341 == this.f1336;
    }

    /* renamed from: 〴おちすく, reason: contains not printable characters */
    public int m632(RecyclerView.C0217 c0217, C0198 c0198, RecyclerView.C0224 c0224, boolean z) {
        int i = c0198.f1362;
        int i2 = c0198.f1360;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0198.f1360 = i2 + i;
            }
            m641(c0217, c0198);
        }
        int i3 = c0198.f1362 + c0198.f1358;
        C0197 c0197 = this.f1337;
        while (true) {
            if ((!c0198.f1365 && i3 <= 0) || !c0198.m677(c0224)) {
                break;
            }
            c0197.f1356 = 0;
            c0197.f1354 = false;
            c0197.f1355 = false;
            c0197.f1357 = false;
            mo620(c0217, c0224, c0198, c0197);
            if (!c0197.f1354) {
                int i4 = c0198.f1359;
                int i5 = c0197.f1356;
                c0198.f1359 = (c0198.f1366 * i5) + i4;
                if (!c0197.f1355 || c0198.f1369 != null || !c0224.f1543) {
                    c0198.f1362 -= i5;
                    i3 -= i5;
                }
                int i6 = c0198.f1360;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0198.f1360 = i7;
                    int i8 = c0198.f1362;
                    if (i8 < 0) {
                        c0198.f1360 = i7 + i8;
                    }
                    m641(c0217, c0198);
                }
                if (z && c0197.f1357) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0198.f1362;
    }

    /* renamed from: 〵いどうねぢ, reason: contains not printable characters */
    public final int m633(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        m640();
        return C2786.m4786(c0224, this.f1340, m645(!this.f1339, true), m655(!this.f1339, true), this, this.f1339, this.f1349);
    }

    /* renamed from: 〵げとずぐみ */
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
            if (m857 >= 0 && m857 < i3) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: 〺〲に〼へ〸 */
    public void mo594(RecyclerView.C0224 c0224) {
        this.f1346 = null;
        this.f1338 = -1;
        this.f1348 = Integer.MIN_VALUE;
        this.f1345.m683();
    }

    /* renamed from: 〻だくけはく, reason: contains not printable characters */
    public void mo634(RecyclerView.C0224 c0224, int[] iArr) {
        int i;
        int mo3134 = c0224.f1546 != -1 ? this.f1340.mo3134() : 0;
        if (this.f1347.f1366 == -1) {
            i = 0;
        } else {
            i = mo3134;
            mo3134 = 0;
        }
        iArr[0] = mo3134;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public Parcelable mo635() {
        SavedState savedState = this.f1346;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (m836() > 0) {
            m640();
            boolean z = this.f1341 ^ this.f1349;
            savedState2.f1353 = z;
            if (z) {
                View m653 = m653();
                savedState2.f1352 = this.f1340.mo3128() - this.f1340.mo3127(m653);
                savedState2.f1351 = m857(m653);
            } else {
                View m665 = m665();
                savedState2.f1351 = m857(m665);
                savedState2.f1352 = this.f1340.mo3133(m665) - this.f1340.mo3140();
            }
        } else {
            savedState2.f1351 = -1;
        }
        return savedState2;
    }

    /* renamed from: ぃぉみぜす, reason: contains not printable characters */
    public final View m636(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return mo593(c0217, c0224, 0, m836(), c0224.m881());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo637(int i, RecyclerView.AbstractC0219.InterfaceC0221 interfaceC0221) {
        boolean z;
        int i2;
        SavedState savedState = this.f1346;
        if (savedState == null || !savedState.m676()) {
            m654();
            z = this.f1349;
            i2 = this.f1338;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f1346;
            z = savedState2.f1353;
            i2 = savedState2.f1351;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f1343 && i2 >= 0 && i2 < i; i4++) {
            ((RunnableC1400.C1401) interfaceC0221).m3168(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: うでこすぢた, reason: contains not printable characters */
    public final void m638(RecyclerView.C0217 c0217, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m825(i, c0217);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m825(i3, c0217);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぇぬぎばつ */
    public int mo601(RecyclerView.C0224 c0224) {
        return m652(c0224);
    }

    /* renamed from: えげて〱でく, reason: contains not printable characters */
    public int m639() {
        View m650 = m650(0, m836(), false, true);
        if (m650 == null) {
            return -1;
        }
        return m857(m650);
    }

    /* renamed from: ぉいけぐつ, reason: contains not printable characters */
    public void m640() {
        if (this.f1347 == null) {
            this.f1347 = new C0198();
        }
    }

    /* renamed from: ぉさひねい, reason: contains not printable characters */
    public final void m641(RecyclerView.C0217 c0217, C0198 c0198) {
        if (!c0198.f1363 || c0198.f1365) {
            return;
        }
        int i = c0198.f1360;
        int i2 = c0198.f1368;
        if (c0198.f1366 == -1) {
            int m836 = m836();
            if (i < 0) {
                return;
            }
            int mo3135 = (this.f1340.mo3135() - i) + i2;
            if (this.f1349) {
                for (int i3 = 0; i3 < m836; i3++) {
                    View m826 = m826(i3);
                    if (this.f1340.mo3133(m826) < mo3135 || this.f1340.mo3131(m826) < mo3135) {
                        m638(c0217, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = m836 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View m8262 = m826(i5);
                if (this.f1340.mo3133(m8262) < mo3135 || this.f1340.mo3131(m8262) < mo3135) {
                    m638(c0217, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int m8362 = m836();
        if (!this.f1349) {
            for (int i7 = 0; i7 < m8362; i7++) {
                View m8263 = m826(i7);
                if (this.f1340.mo3127(m8263) > i6 || this.f1340.mo3138(m8263) > i6) {
                    m638(c0217, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = m8362 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View m8264 = m826(i9);
            if (this.f1340.mo3127(m8264) > i6 || this.f1340.mo3138(m8264) > i6) {
                m638(c0217, i8, i9);
                return;
            }
        }
    }

    /* renamed from: お〵かぜて, reason: contains not printable characters */
    public boolean m642() {
        return this.f1340.mo3139() == 0 && this.f1340.mo3135() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: おぐぴう〸ず */
    public int mo602(RecyclerView.C0224 c0224) {
        return m633(c0224);
    }

    /* renamed from: おぬぃかはど */
    public void mo603(RecyclerView.C0224 c0224, C0198 c0198, RecyclerView.AbstractC0219.InterfaceC0221 interfaceC0221) {
        int i = c0198.f1367;
        if (i < 0 || i >= c0224.m881()) {
            return;
        }
        ((RunnableC1400.C1401) interfaceC0221).m3168(i, Math.max(0, c0198.f1360));
    }

    /* renamed from: かこあぇ〸〼 */
    public void mo604(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, C0199 c0199, int i) {
    }

    /* renamed from: がぴぽぁぬ, reason: contains not printable characters */
    public View m643(int i, int i2) {
        int i3;
        int i4;
        m640();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m826(i);
        }
        if (this.f1340.mo3133(m826(i)) < this.f1340.mo3140()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f1342 == 0 ? this.f1527 : this.f1529).m3170(i, i2, i3, i4);
    }

    /* renamed from: きづぢばちつ, reason: contains not printable characters */
    public final int m644(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, boolean z) {
        int mo3140;
        int mo31402 = i - this.f1340.mo3140();
        if (mo31402 <= 0) {
            return 0;
        }
        int i2 = -m661(mo31402, c0217, c0224);
        int i3 = i + i2;
        if (!z || (mo3140 = i3 - this.f1340.mo3140()) <= 0) {
            return i2;
        }
        this.f1340.mo3130(-mo3140);
        return i2 - mo3140;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: きぬどぼみ〸 */
    public View mo606(View view, int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        int m668;
        m654();
        if (m836() == 0 || (m668 = m668(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m640();
        m660(m668, (int) (this.f1340.mo3134() * 0.33333334f), false, c0224);
        C0198 c0198 = this.f1347;
        c0198.f1360 = Integer.MIN_VALUE;
        c0198.f1363 = false;
        m632(c0217, c0198, c0224, true);
        View m643 = m668 == -1 ? this.f1349 ? m643(m836() - 1, -1) : m643(0, m836()) : this.f1349 ? m643(0, m836()) : m643(m836() - 1, -1);
        View m665 = m668 == -1 ? m665() : m653();
        if (!m665.hasFocusable()) {
            return m643;
        }
        if (m643 == null) {
            return null;
        }
        return m665;
    }

    /* renamed from: ぎがえべぱど, reason: contains not printable characters */
    public View m645(boolean z, boolean z2) {
        int i;
        int m836;
        if (this.f1349) {
            i = m836() - 1;
            m836 = -1;
        } else {
            i = 0;
            m836 = m836();
        }
        return m650(i, m836, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: く〱なおぎ */
    public int mo607(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (this.f1342 == 0) {
            return 0;
        }
        return m661(i, c0217, c0224);
    }

    /* renamed from: ぐいぎぽぼ, reason: contains not printable characters */
    public final int m646(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, boolean z) {
        int mo3128;
        int mo31282 = this.f1340.mo3128() - i;
        if (mo31282 <= 0) {
            return 0;
        }
        int i2 = -m661(-mo31282, c0217, c0224);
        int i3 = i + i2;
        if (!z || (mo3128 = this.f1340.mo3128() - i3) <= 0) {
            return i2;
        }
        this.f1340.mo3130(mo3128);
        return mo3128 + i2;
    }

    /* renamed from: けいっど〱, reason: contains not printable characters */
    public boolean m647() {
        return m840() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0214.InterfaceC0215
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public PointF mo648(int i) {
        if (m836() == 0) {
            return null;
        }
        int i2 = (i < m857(m826(0))) != this.f1349 ? -1 : 1;
        return this.f1342 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public View mo649(int i) {
        int m836 = m836();
        if (m836 == 0) {
            return null;
        }
        int m857 = i - m857(m826(0));
        if (m857 >= 0 && m857 < m836) {
            View m826 = m826(m857);
            if (m857(m826) == i) {
                return m826;
            }
        }
        return super.mo649(i);
    }

    /* renamed from: さぬうづぃ */
    public void mo608(boolean z) {
        mo667(null);
        if (this.f1336 == z) {
            return;
        }
        this.f1336 = z;
        m841();
    }

    /* renamed from: ざぇぎぱ〺, reason: contains not printable characters */
    public View m650(int i, int i2, boolean z, boolean z2) {
        m640();
        return (this.f1342 == 0 ? this.f1527 : this.f1529).m3170(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ざっざへづ */
    public RecyclerView.LayoutParams mo609() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0222  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: しげにけぃ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo610(androidx.recyclerview.widget.RecyclerView.C0217 r17, androidx.recyclerview.widget.RecyclerView.C0224 r18) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo610(androidx.recyclerview.widget.RecyclerView$ざとぅぼこ〺, androidx.recyclerview.widget.RecyclerView$でどあくず):void");
    }

    /* renamed from: せばぴ〸び, reason: contains not printable characters */
    public final int m651(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        m640();
        return C2786.m4834(c0224, this.f1340, m645(!this.f1339, true), m655(!this.f1339, true), this, this.f1339);
    }

    /* renamed from: っあつぜっ, reason: contains not printable characters */
    public final int m652(RecyclerView.C0224 c0224) {
        if (m836() == 0) {
            return 0;
        }
        m640();
        return C2786.m4779(c0224, this.f1340, m645(!this.f1339, true), m655(!this.f1339, true), this, this.f1339);
    }

    /* renamed from: つなつぼず, reason: contains not printable characters */
    public final View m653() {
        return m826(this.f1349 ? 0 : m836() - 1);
    }

    /* renamed from: つびたくず, reason: contains not printable characters */
    public final void m654() {
        this.f1349 = (this.f1342 == 1 || !m647()) ? this.f1344 : !this.f1344;
    }

    /* renamed from: づ〵ぬきすへ, reason: contains not printable characters */
    public View m655(boolean z, boolean z2) {
        int m836;
        int i;
        if (this.f1349) {
            m836 = 0;
            i = m836();
        } else {
            m836 = m836() - 1;
            i = -1;
        }
        return m650(m836, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: づおぴ〱いづ, reason: contains not printable characters */
    public void mo656(RecyclerView recyclerView, RecyclerView.C0224 c0224, int i) {
        C1380 c1380 = new C1380(recyclerView.getContext());
        c1380.f1499 = i;
        m829(c1380);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo657() {
        return this.f1342 == 0;
    }

    /* renamed from: づふぱぐそ〹, reason: contains not printable characters */
    public final View m658(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        return mo593(c0217, c0224, m836() - 1, -1, c0224.m881());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: てぜきぽく */
    public int mo612(RecyclerView.C0224 c0224) {
        return m633(c0224);
    }

    /* renamed from: でげけけの, reason: contains not printable characters */
    public final void m659(int i, int i2) {
        this.f1347.f1362 = i2 - this.f1340.mo3140();
        C0198 c0198 = this.f1347;
        c0198.f1367 = i;
        c0198.f1364 = this.f1349 ? 1 : -1;
        c0198.f1366 = -1;
        c0198.f1359 = i2;
        c0198.f1360 = Integer.MIN_VALUE;
    }

    /* renamed from: とばあぇが, reason: contains not printable characters */
    public final void m660(int i, int i2, boolean z, RecyclerView.C0224 c0224) {
        int mo3140;
        this.f1347.f1365 = m642();
        this.f1347.f1366 = i;
        int[] iArr = this.f1350;
        iArr[0] = 0;
        iArr[1] = 0;
        mo634(c0224, iArr);
        int max = Math.max(0, this.f1350[0]);
        int max2 = Math.max(0, this.f1350[1]);
        boolean z2 = i == 1;
        C0198 c0198 = this.f1347;
        int i3 = z2 ? max2 : max;
        c0198.f1358 = i3;
        if (!z2) {
            max = max2;
        }
        c0198.f1368 = max;
        if (z2) {
            c0198.f1358 = this.f1340.mo3126() + i3;
            View m653 = m653();
            C0198 c01982 = this.f1347;
            c01982.f1364 = this.f1349 ? -1 : 1;
            int m857 = m857(m653);
            C0198 c01983 = this.f1347;
            c01982.f1367 = m857 + c01983.f1364;
            c01983.f1359 = this.f1340.mo3127(m653);
            mo3140 = this.f1340.mo3127(m653) - this.f1340.mo3128();
        } else {
            View m665 = m665();
            C0198 c01984 = this.f1347;
            c01984.f1358 = this.f1340.mo3140() + c01984.f1358;
            C0198 c01985 = this.f1347;
            c01985.f1364 = this.f1349 ? 1 : -1;
            int m8572 = m857(m665);
            C0198 c01986 = this.f1347;
            c01985.f1367 = m8572 + c01986.f1364;
            c01986.f1359 = this.f1340.mo3133(m665);
            mo3140 = (-this.f1340.mo3133(m665)) + this.f1340.mo3140();
        }
        C0198 c01987 = this.f1347;
        c01987.f1362 = i2;
        if (z) {
            c01987.f1362 = i2 - mo3140;
        }
        c01987.f1360 = mo3140;
    }

    /* renamed from: どつち〻ぎづ, reason: contains not printable characters */
    public int m661(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (m836() == 0 || i == 0) {
            return 0;
        }
        m640();
        this.f1347.f1363 = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m660(i2, abs, true, c0224);
        C0198 c0198 = this.f1347;
        int m632 = m632(c0217, c0198, c0224, false) + c0198.f1360;
        if (m632 < 0) {
            return 0;
        }
        if (abs > m632) {
            i = i2 * m632;
        }
        this.f1340.mo3130(-i);
        this.f1347.f1361 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public void mo662(RecyclerView recyclerView, RecyclerView.C0217 c0217) {
        m843();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean mo663() {
        return this.f1342 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: にぷきなせこ, reason: contains not printable characters */
    public boolean mo664() {
        boolean z;
        if (this.f1524 != 1073741824 && this.f1532 != 1073741824) {
            int m836 = m836();
            int i = 0;
            while (true) {
                if (i >= m836) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = m826(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: のとけっぬ, reason: contains not printable characters */
    public final View m665() {
        return m826(this.f1349 ? m836() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public void mo666(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0217 c0217 = this.f1519.f1411;
        m832(accessibilityEvent);
        if (m836() > 0) {
            accessibilityEvent.setFromIndex(m639());
            accessibilityEvent.setToIndex(m669());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: のぷのちつ */
    public int mo616(RecyclerView.C0224 c0224) {
        return m652(c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: はぁとそぎ */
    public int mo617(int i, RecyclerView.C0217 c0217, RecyclerView.C0224 c0224) {
        if (this.f1342 == 1) {
            return 0;
        }
        return m661(i, c0217, c0224);
    }

    /* renamed from: ひ〲どぼぢだ */
    public void mo620(RecyclerView.C0217 c0217, RecyclerView.C0224 c0224, C0198 c0198, C0197 c0197) {
        int i;
        int i2;
        int i3;
        int i4;
        int mo3137;
        View m678 = c0198.m678(c0217);
        if (m678 == null) {
            c0197.f1354 = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m678.getLayoutParams();
        if (c0198.f1369 == null) {
            if (this.f1349 == (c0198.f1366 == -1)) {
                m845(m678, -1, false);
            } else {
                m845(m678, 0, false);
            }
        } else {
            if (this.f1349 == (c0198.f1366 == -1)) {
                m845(m678, -1, true);
            } else {
                m845(m678, 0, true);
            }
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) m678.getLayoutParams();
        Rect m695 = this.f1519.m695(m678);
        int i5 = m695.left + m695.right + 0;
        int i6 = m695.top + m695.bottom + 0;
        int m813 = RecyclerView.AbstractC0219.m813(this.f1522, this.f1532, m828() + m862() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) layoutParams2).width, mo657());
        int m8132 = RecyclerView.AbstractC0219.m813(this.f1523, this.f1524, m847() + m860() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) layoutParams2).height, mo663());
        if (m859(m678, m813, m8132, layoutParams2)) {
            m678.measure(m813, m8132);
        }
        c0197.f1356 = this.f1340.mo3132(m678);
        if (this.f1342 == 1) {
            if (m647()) {
                mo3137 = this.f1522 - m828();
                i4 = mo3137 - this.f1340.mo3137(m678);
            } else {
                i4 = m862();
                mo3137 = this.f1340.mo3137(m678) + i4;
            }
            int i7 = c0198.f1366;
            int i8 = c0198.f1359;
            if (i7 == -1) {
                i3 = i8;
                i2 = mo3137;
                i = i8 - c0197.f1356;
            } else {
                i = i8;
                i2 = mo3137;
                i3 = c0197.f1356 + i8;
            }
        } else {
            int m860 = m860();
            int mo31372 = this.f1340.mo3137(m678) + m860;
            int i9 = c0198.f1366;
            int i10 = c0198.f1359;
            if (i9 == -1) {
                i2 = i10;
                i = m860;
                i3 = mo31372;
                i4 = i10 - c0197.f1356;
            } else {
                i = m860;
                i2 = c0197.f1356 + i10;
                i3 = mo31372;
                i4 = i10;
            }
        }
        m844(m678, i4, i, i2, i3);
        if (layoutParams.m753() || layoutParams.m752()) {
            c0197.f1355 = true;
        }
        c0197.f1357 = m678.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo667(String str) {
        RecyclerView recyclerView;
        if (this.f1346 != null || (recyclerView = this.f1519) == null) {
            return;
        }
        recyclerView.m750(str);
    }

    /* renamed from: ぴまけ〸だて, reason: contains not printable characters */
    public int m668(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1342 == 1) ? 1 : Integer.MIN_VALUE : this.f1342 == 0 ? 1 : Integer.MIN_VALUE : this.f1342 == 1 ? -1 : Integer.MIN_VALUE : this.f1342 == 0 ? -1 : Integer.MIN_VALUE : (this.f1342 != 1 && m647()) ? -1 : 1 : (this.f1342 != 1 && m647()) ? 1 : -1;
    }

    /* renamed from: へざ〴ばび〻, reason: contains not printable characters */
    public int m669() {
        View m650 = m650(m836() - 1, -1, false, true);
        if (m650 == null) {
            return -1;
        }
        return m857(m650);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int mo670(RecyclerView.C0224 c0224) {
        return m651(c0224);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo671(int i, int i2, RecyclerView.C0224 c0224, RecyclerView.AbstractC0219.InterfaceC0221 interfaceC0221) {
        if (this.f1342 != 0) {
            i = i2;
        }
        if (m836() == 0 || i == 0) {
            return;
        }
        m640();
        m660(i > 0 ? 1 : -1, Math.abs(i), true, c0224);
        mo603(c0224, this.f1347, interfaceC0221);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺぃつぢぼ, reason: contains not printable characters */
    public void mo672(int i) {
        this.f1338 = i;
        this.f1348 = Integer.MIN_VALUE;
        SavedState savedState = this.f1346;
        if (savedState != null) {
            savedState.f1351 = -1;
        }
        m841();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean mo673() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0219
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int mo674(RecyclerView.C0224 c0224) {
        return m651(c0224);
    }

    /* renamed from: ほ〱たうえの, reason: contains not printable characters */
    public void m675(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C2098.m4208("invalid orientation:", i));
        }
        mo667(null);
        if (i != this.f1342 || this.f1340 == null) {
            AbstractC1385 m3125 = AbstractC1385.m3125(this, i);
            this.f1340 = m3125;
            this.f1345.f1372 = m3125;
            this.f1342 = i;
            m841();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1342 = 1;
        this.f1344 = false;
        this.f1349 = false;
        this.f1336 = false;
        this.f1339 = true;
        this.f1338 = -1;
        this.f1348 = Integer.MIN_VALUE;
        this.f1346 = null;
        this.f1345 = new C0199();
        this.f1337 = new C0197();
        this.f1343 = 2;
        this.f1350 = new int[2];
        RecyclerView.AbstractC0219.C0223 m814 = RecyclerView.AbstractC0219.m814(context, attributeSet, i, i2);
        m675(m814.f1539);
        boolean z = m814.f1538;
        mo667(null);
        if (z != this.f1344) {
            this.f1344 = z;
            m841();
        }
        mo608(m814.f1540);
    }
}
