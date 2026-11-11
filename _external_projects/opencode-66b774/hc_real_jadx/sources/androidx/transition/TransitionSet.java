package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p035.p043.p044.C1056;
import p034.p095.AbstractC1738;
import p034.p095.C1696;
import p034.p095.C1700;
import p034.p095.C1711;
import p034.p095.C1712;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TransitionSet extends Transition {

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public int f1811;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public ArrayList<Transition> f1812;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f1813;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f1814;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f1815;

    /* renamed from: androidx.transition.TransitionSet$〺つふすそ, reason: contains not printable characters */
    public static class C0288 extends C1711 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public TransitionSet f1816;

        public C0288(TransitionSet transitionSet) {
            this.f1816 = transitionSet;
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: げつ〴ぬぐ */
        public void mo1043(Transition transition) {
            TransitionSet transitionSet = this.f1816;
            if (transitionSet.f1813) {
                return;
            }
            transitionSet.m1022();
            this.f1816.f1813 = true;
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            TransitionSet transitionSet = this.f1816;
            int i = transitionSet.f1814 - 1;
            transitionSet.f1814 = i;
            if (i == 0) {
                transitionSet.f1813 = false;
                transitionSet.m1035();
            }
            transition.mo1038(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0289 extends C1711 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Transition f1817;

        public C0289(TransitionSet transitionSet, Transition transition) {
            this.f1817 = transition;
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            this.f1817.mo1020();
            transition.mo1038(this);
        }
    }

    public TransitionSet() {
        this.f1812 = new ArrayList<>();
        this.f1815 = true;
        this.f1813 = false;
        this.f1811 = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1812 = new ArrayList<>();
        this.f1815 = true;
        this.f1813 = false;
        this.f1811 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7869);
        m1045(C1056.m2395(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    /* renamed from: 〺つふすそ */
    public Transition mo1016(View view) {
        for (int i = 0; i < this.f1812.size(); i++) {
            this.f1812.get(i).mo1016(view);
        }
        this.f1787.add(view);
        return this;
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public TransitionSet m1044(TimeInterpolator timeInterpolator) {
        this.f1811 |= 1;
        ArrayList<Transition> arrayList = this.f1812;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1812.get(i).mo1032(timeInterpolator);
            }
        }
        this.f1796 = timeInterpolator;
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: 〻ぞまぎな〻 */
    public Transition mo1017(View view) {
        for (int i = 0; i < this.f1812.size(); i++) {
            this.f1812.get(i).mo1017(view);
        }
        this.f1787.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        if (m1025(c1700.f7838)) {
            Iterator<Transition> it = this.f1812.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m1025(c1700.f7838)) {
                    next.mo986(c1700);
                    c1700.f7839.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: いいにぽつ */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f1812 = new ArrayList<>();
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            Transition clone = this.f1812.get(i).clone();
            transitionSet.f1812.add(clone);
            clone.f1788 = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぅみぱぎぎ */
    public void mo1019(PathMotion pathMotion) {
        this.f1798 = pathMotion == null ? Transition.f1782 : pathMotion;
        this.f1811 |= 4;
        if (this.f1812 != null) {
            for (int i = 0; i < this.f1812.size(); i++) {
                this.f1812.get(i).mo1019(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぇ〳〲〺すっ */
    public void mo1020() {
        if (this.f1812.isEmpty()) {
            m1022();
            m1035();
            return;
        }
        C0288 c0288 = new C0288(this);
        Iterator<Transition> it = this.f1812.iterator();
        while (it.hasNext()) {
            it.next().mo1024(c0288);
        }
        this.f1814 = this.f1812.size();
        if (this.f1815) {
            Iterator<Transition> it2 = this.f1812.iterator();
            while (it2.hasNext()) {
                it2.next().mo1020();
            }
            return;
        }
        for (int i = 1; i < this.f1812.size(); i++) {
            this.f1812.get(i - 1).mo1024(new C0289(this, this.f1812.get(i)));
        }
        Transition transition = this.f1812.get(0);
        if (transition != null) {
            transition.mo1020();
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public TransitionSet m1045(int i) {
        if (i == 0) {
            this.f1815 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C2098.m4208("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f1815 = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉ〲なぱぽた */
    public void mo1021(View view) {
        super.mo1021(view);
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            this.f1812.get(i).mo1021(view);
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public TransitionSet m1046(long j) {
        ArrayList<Transition> arrayList;
        this.f1802 = j;
        if (j >= 0 && (arrayList = this.f1812) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1812.get(i).mo1037(j);
            }
        }
        return this;
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public Transition m1047(int i) {
        if (i < 0 || i >= this.f1812.size()) {
            return null;
        }
        return this.f1812.get(i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: げつ〴ぬぐ */
    public Transition mo1024(Transition.InterfaceC0287 interfaceC0287) {
        super.mo1024(interfaceC0287);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: じぜこほぱ */
    public void mo1027(AbstractC1738 abstractC1738) {
        this.f1793 = abstractC1738;
        this.f1811 |= 2;
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            this.f1812.get(i).mo1027(abstractC1738);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: せづっ〸ちね */
    public String mo1028(String str) {
        String mo1028 = super.mo1028(str);
        for (int i = 0; i < this.f1812.size(); i++) {
            StringBuilder m4179 = C2098.m4179(mo1028, "\n");
            m4179.append(this.f1812.get(i).mo1028(str + "  "));
            mo1028 = m4179.toString();
        }
        return mo1028;
    }

    @Override // androidx.transition.Transition
    /* renamed from: てぜきぽく */
    public void mo1030(ViewGroup viewGroup, C1696 c1696, C1696 c16962, ArrayList<C1700> arrayList, ArrayList<C1700> arrayList2) {
        long j = this.f1792;
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f1812.get(i);
            if (j > 0 && (this.f1815 || i == 0)) {
                long j2 = transition.f1792;
                if (j2 > 0) {
                    transition.mo1041(j2 + j);
                } else {
                    transition.mo1041(j);
                }
            }
            transition.mo1030(viewGroup, c1696, c16962, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: でどあくず */
    public void mo1031(View view) {
        super.mo1031(view);
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            this.f1812.get(i).mo1031(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: どぇぞほだ */
    public /* bridge */ /* synthetic */ Transition mo1032(TimeInterpolator timeInterpolator) {
        m1044(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: なぎぱいぢぎ */
    public void mo1033(C1700 c1700) {
        super.mo1033(c1700);
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            this.f1812.get(i).mo1033(c1700);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: なぶひせが */
    public void mo1034(Transition.AbstractC0285 abstractC0285) {
        this.f1794 = abstractC0285;
        this.f1811 |= 8;
        int size = this.f1812.size();
        for (int i = 0; i < size; i++) {
            this.f1812.get(i).mo1034(abstractC0285);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: びえぁぜい */
    public /* bridge */ /* synthetic */ Transition mo1037(long j) {
        m1046(j);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        if (m1025(c1700.f7838)) {
            Iterator<Transition> it = this.f1812.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m1025(c1700.f7838)) {
                    next.mo988(c1700);
                    c1700.f7839.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぶでにく〼〳 */
    public Transition mo1038(Transition.InterfaceC0287 interfaceC0287) {
        super.mo1038(interfaceC0287);
        return this;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public TransitionSet m1048(Transition transition) {
        this.f1812.add(transition);
        transition.f1788 = this;
        long j = this.f1802;
        if (j >= 0) {
            transition.mo1037(j);
        }
        if ((this.f1811 & 1) != 0) {
            transition.mo1032(this.f1796);
        }
        if ((this.f1811 & 2) != 0) {
            transition.mo1027(this.f1793);
        }
        if ((this.f1811 & 4) != 0) {
            transition.mo1019(this.f1798);
        }
        if ((this.f1811 & 8) != 0) {
            transition.mo1034(this.f1794);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺづげぺが */
    public Transition mo1041(long j) {
        this.f1792 = j;
        return this;
    }
}
