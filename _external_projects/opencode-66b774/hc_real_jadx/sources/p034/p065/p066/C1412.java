package p034.p065.p066;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1412 extends AbstractC1377 {

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static TimeInterpolator f6648;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6649 = new ArrayList<>();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6658 = new ArrayList<>();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ArrayList<C1413> f6650 = new ArrayList<>();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ArrayList<C1414> f6659 = new ArrayList<>();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ArrayList<ArrayList<RecyclerView.AbstractC0207>> f6655 = new ArrayList<>();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ArrayList<ArrayList<C1413>> f6656 = new ArrayList<>();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ArrayList<ArrayList<C1414>> f6657 = new ArrayList<>();

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6653 = new ArrayList<>();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6651 = new ArrayList<>();

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6652 = new ArrayList<>();

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public ArrayList<RecyclerView.AbstractC0207> f6654 = new ArrayList<>();

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぺふねづ〺$〺つふすそ, reason: contains not printable characters */
    public static class C1413 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6660;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6661;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public RecyclerView.AbstractC0207 f6662;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f6663;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6664;

        public C1413(RecyclerView.AbstractC0207 abstractC0207, int i, int i2, int i3, int i4) {
            this.f6662 = abstractC0207;
            this.f6660 = i;
            this.f6661 = i2;
            this.f6664 = i3;
            this.f6663 = i4;
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1414 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public RecyclerView.AbstractC0207 f6665;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6666;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public RecyclerView.AbstractC0207 f6667;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f6668;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f6669;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6670;

        public C1414(RecyclerView.AbstractC0207 abstractC0207, RecyclerView.AbstractC0207 abstractC02072, int i, int i2, int i3, int i4) {
            this.f6667 = abstractC0207;
            this.f6665 = abstractC02072;
            this.f6666 = i;
            this.f6670 = i2;
            this.f6668 = i3;
            this.f6669 = i4;
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("ChangeInfo{oldHolder=");
            m4207.append(this.f6667);
            m4207.append(", newHolder=");
            m4207.append(this.f6665);
            m4207.append(", fromX=");
            m4207.append(this.f6666);
            m4207.append(", fromY=");
            m4207.append(this.f6670);
            m4207.append(", toX=");
            m4207.append(this.f6668);
            m4207.append(", toY=");
            return C2098.m4203(m4207, this.f6669, '}');
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0231
    /* renamed from: ぁごぐすすぃ */
    public boolean mo894() {
        return (this.f6658.isEmpty() && this.f6659.isEmpty() && this.f6650.isEmpty() && this.f6649.isEmpty() && this.f6651.isEmpty() && this.f6652.isEmpty() && this.f6653.isEmpty() && this.f6654.isEmpty() && this.f6656.isEmpty() && this.f6655.isEmpty() && this.f6657.isEmpty()) ? false : true;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m3178(List<RecyclerView.AbstractC0207> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).f1476.animate().cancel();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0231
    /* renamed from: づざかべべ */
    public void mo897(RecyclerView.AbstractC0207 abstractC0207) {
        View view = abstractC0207.f1476;
        view.animate().cancel();
        int size = this.f6650.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f6650.get(size).f6662 == abstractC0207) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m895(abstractC0207);
                this.f6650.remove(size);
            }
        }
        m3179(this.f6659, abstractC0207);
        if (this.f6649.remove(abstractC0207)) {
            view.setAlpha(1.0f);
            m895(abstractC0207);
        }
        if (this.f6658.remove(abstractC0207)) {
            view.setAlpha(1.0f);
            m895(abstractC0207);
        }
        int size2 = this.f6657.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<C1414> arrayList = this.f6657.get(size2);
            m3179(arrayList, abstractC0207);
            if (arrayList.isEmpty()) {
                this.f6657.remove(size2);
            }
        }
        int size3 = this.f6656.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<C1413> arrayList2 = this.f6656.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f6662 == abstractC0207) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m895(abstractC0207);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6656.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f6655.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f6652.remove(abstractC0207);
                this.f6653.remove(abstractC0207);
                this.f6654.remove(abstractC0207);
                this.f6651.remove(abstractC0207);
                m3182();
                return;
            }
            ArrayList<RecyclerView.AbstractC0207> arrayList3 = this.f6655.get(size5);
            if (arrayList3.remove(abstractC0207)) {
                view.setAlpha(1.0f);
                m895(abstractC0207);
                if (arrayList3.isEmpty()) {
                    this.f6655.remove(size5);
                }
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m3179(List<C1414> list, RecyclerView.AbstractC0207 abstractC0207) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C1414 c1414 = list.get(size);
            if (m3180(c1414, abstractC0207) && c1414.f6667 == null && c1414.f6665 == null) {
                list.remove(c1414);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0231
    /* renamed from: なぎぱいぢぎ */
    public void mo898() {
        int size = this.f6650.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1413 c1413 = this.f6650.get(size);
            View view = c1413.f6662.f1476;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m895(c1413.f6662);
            this.f6650.remove(size);
        }
        int size2 = this.f6649.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m895(this.f6649.get(size2));
            this.f6649.remove(size2);
        }
        int size3 = this.f6658.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0207 abstractC0207 = this.f6658.get(size3);
            abstractC0207.f1476.setAlpha(1.0f);
            m895(abstractC0207);
            this.f6658.remove(size3);
        }
        int size4 = this.f6659.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1414 c1414 = this.f6659.get(size4);
            RecyclerView.AbstractC0207 abstractC02072 = c1414.f6667;
            if (abstractC02072 != null) {
                m3180(c1414, abstractC02072);
            }
            RecyclerView.AbstractC0207 abstractC02073 = c1414.f6665;
            if (abstractC02073 != null) {
                m3180(c1414, abstractC02073);
            }
        }
        this.f6659.clear();
        if (!mo894()) {
            return;
        }
        int size5 = this.f6656.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<C1413> arrayList = this.f6656.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C1413 c14132 = arrayList.get(size6);
                    View view2 = c14132.f6662.f1476;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m895(c14132.f6662);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6656.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f6655.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.AbstractC0207> arrayList2 = this.f6655.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.AbstractC0207 abstractC02074 = arrayList2.get(size8);
                    abstractC02074.f1476.setAlpha(1.0f);
                    m895(abstractC02074);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f6655.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f6657.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m3178(this.f6652);
                m3178(this.f6651);
                m3178(this.f6653);
                m3178(this.f6654);
                m899();
                return;
            }
            ArrayList<C1414> arrayList3 = this.f6657.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    C1414 c14142 = arrayList3.get(size10);
                    RecyclerView.AbstractC0207 abstractC02075 = c14142.f6667;
                    if (abstractC02075 != null) {
                        m3180(c14142, abstractC02075);
                    }
                    RecyclerView.AbstractC0207 abstractC02076 = c14142.f6665;
                    if (abstractC02076 != null) {
                        m3180(c14142, abstractC02076);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f6657.remove(arrayList3);
                    }
                }
            }
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final boolean m3180(C1414 c1414, RecyclerView.AbstractC0207 abstractC0207) {
        if (c1414.f6665 == abstractC0207) {
            c1414.f6665 = null;
        } else {
            if (c1414.f6667 != abstractC0207) {
                return false;
            }
            c1414.f6667 = null;
        }
        abstractC0207.f1476.setAlpha(1.0f);
        abstractC0207.f1476.setTranslationX(0.0f);
        abstractC0207.f1476.setTranslationY(0.0f);
        m895(abstractC0207);
        return true;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m3181(RecyclerView.AbstractC0207 abstractC0207) {
        if (f6648 == null) {
            f6648 = new ValueAnimator().getInterpolator();
        }
        abstractC0207.f1476.animate().setInterpolator(f6648);
        mo897(abstractC0207);
    }

    @Override // p034.p065.p066.AbstractC1377
    /* renamed from: ぺぁあねじ */
    public boolean mo3108(RecyclerView.AbstractC0207 abstractC0207, int i, int i2, int i3, int i4) {
        View view = abstractC0207.f1476;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0207.f1476.getTranslationY());
        m3181(abstractC0207);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m895(abstractC0207);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f6650.add(new C1413(abstractC0207, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3182() {
        if (mo894()) {
            return;
        }
        m899();
    }
}
