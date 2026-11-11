package p034.p095;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import p034.p105.p106.AbstractC1787;

@SuppressLint({"RestrictedApi"})
/* renamed from: づざかべべ.は〲ぱなで.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1727 extends AbstractC1787 {

    /* renamed from: づざかべべ.は〲ぱなで.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public class C1728 implements Transition.InterfaceC0287 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f7898;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ View f7899;

        public C1728(C1727 c1727, View view, ArrayList arrayList) {
            this.f7899 = view;
            this.f7898 = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: 〺つふすそ */
        public void mo991(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: くし〴〺ぅ */
        public void mo992(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: げつ〴ぬぐ */
        public void mo1043(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            transition.mo1038(this);
            this.f7899.setVisibility(8);
            int size = this.f7898.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f7898.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: びぐびあび */
        public void mo994(Transition transition) {
        }
    }

    /* renamed from: づざかべべ.は〲ぱなで.なぎぱいぢぎ$くし〴〺ぅ, reason: contains not printable characters */
    public class C1729 extends C1711 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f7900;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ Object f7902;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Object f7903;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ Object f7904;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f7905;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f7906;

        public C1729(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7903 = obj;
            this.f7900 = arrayList;
            this.f7902 = obj2;
            this.f7906 = arrayList2;
            this.f7904 = obj3;
            this.f7905 = arrayList3;
        }

        @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
        /* renamed from: げつ〴ぬぐ */
        public void mo1043(Transition transition) {
            Object obj = this.f7903;
            if (obj != null) {
                C1727.this.mo3781(obj, this.f7900, null);
            }
            Object obj2 = this.f7902;
            if (obj2 != null) {
                C1727.this.mo3781(obj2, this.f7906, null);
            }
            Object obj3 = this.f7904;
            if (obj3 != null) {
                C1727.this.mo3781(obj3, this.f7905, null);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            transition.mo1038(this);
        }
    }

    /* renamed from: づざかべべ.は〲ぱなで.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1730 extends Transition.AbstractC0285 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Rect f7907;

        public C1730(C1727 c1727, Rect rect) {
            this.f7907 = rect;
        }

        @Override // androidx.transition.Transition.AbstractC0285
        /* renamed from: げつ〴ぬぐ */
        public Rect mo1042(Transition transition) {
            return this.f7907;
        }
    }

    /* renamed from: づざかべべ.は〲ぱなで.なぎぱいぢぎ$びぐびあび, reason: contains not printable characters */
    public class C1731 extends Transition.AbstractC0285 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Rect f7908;

        public C1731(C1727 c1727, Rect rect) {
            this.f7908 = rect;
        }

        @Override // androidx.transition.Transition.AbstractC0285
        /* renamed from: げつ〴ぬぐ */
        public Rect mo1042(Transition transition) {
            Rect rect = this.f7908;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f7908;
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static boolean m3766(Transition transition) {
        return (AbstractC1787.m3830(transition.f1799) && AbstractC1787.m3830(null) && AbstractC1787.m3830(null)) ? false : true;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo3767(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f1812.size();
            while (i < size) {
                mo3767(transitionSet.m1047(i), arrayList);
                i++;
            }
            return;
        }
        if (m3766(transition) || !AbstractC1787.m3830(transition.f1787)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            transition.mo1016(arrayList.get(i));
            i++;
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Object mo3768(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo3769(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo1024(new C1729(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo3770(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo1034(new C1731(this, rect));
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void mo3771(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo1024(new C1728(this, view, arrayList));
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3772(ViewGroup viewGroup, Object obj) {
        C1722.m3765(viewGroup, (Transition) obj);
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3773(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo1016(view);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void mo3774(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f1787.clear();
            transitionSet.f1787.addAll(arrayList2);
            mo3781(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Object mo3775(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m1048((Transition) obj);
        return transitionSet;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo3776(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3831(view, rect);
            ((Transition) obj).mo1034(new C1730(this, rect));
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo3777(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Object mo3778(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m1048((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m1048((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m1048((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo3779(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo1017(view);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void mo3780(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f1787;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1787.m3829(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo3767(transitionSet, arrayList);
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void mo3781(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f1812.size();
            while (i < size) {
                mo3781(transitionSet.m1047(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m3766(transition)) {
            return;
        }
        ArrayList<View> arrayList3 = transition.f1787;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            transition.mo1016(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                transition.mo1017(arrayList.get(size3));
            }
        }
    }
}
