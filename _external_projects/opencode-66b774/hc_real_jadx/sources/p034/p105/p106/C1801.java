package p034.p105.p106;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1801 extends AbstractC1787 {

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.でどあくず$〺つふすそ, reason: contains not printable characters */
    public class C1802 implements Transition.TransitionListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f8103;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ View f8104;

        public C1802(C1801 c1801, View view, ArrayList arrayList) {
            this.f8104 = view;
            this.f8103 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f8104.setVisibility(8);
            int size = this.f8103.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f8103.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.でどあくず$くし〴〺ぅ, reason: contains not printable characters */
    public class C1803 implements Transition.TransitionListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f8105;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ Object f8107;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Object f8108;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ Object f8109;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f8110;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f8111;

        public C1803(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f8108 = obj;
            this.f8105 = arrayList;
            this.f8107 = obj2;
            this.f8111 = arrayList2;
            this.f8109 = obj3;
            this.f8110 = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f8108;
            if (obj != null) {
                C1801.this.mo3781(obj, this.f8105, null);
            }
            Object obj2 = this.f8107;
            if (obj2 != null) {
                C1801.this.mo3781(obj2, this.f8111, null);
            }
            Object obj3 = this.f8109;
            if (obj3 != null) {
                C1801.this.mo3781(obj3, this.f8110, null);
            }
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.でどあくず$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1804 extends Transition.EpicenterCallback {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Rect f8112;

        public C1804(C1801 c1801, Rect rect) {
            this.f8112 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f8112;
        }
    }

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.でどあくず$びぐびあび, reason: contains not printable characters */
    public class C1805 extends Transition.EpicenterCallback {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Rect f8113;

        public C1805(C1801 c1801, Rect rect) {
            this.f8113 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f8113;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f8113;
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static boolean m3866(Transition transition) {
        return (AbstractC1787.m3830(transition.getTargetIds()) && AbstractC1787.m3830(transition.getTargetNames()) && AbstractC1787.m3830(transition.getTargetTypes())) ? false : true;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: 〺つふすそ */
    public void mo3767(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3767(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m3866(transition) || !AbstractC1787.m3830(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぁごぐすすぃ */
    public Object mo3768(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぇぬぎばつ */
    public void mo3769(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1803(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ぉざぅち〻 */
    public void mo3770(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1805(this, rect));
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: おぐぴう〸ず */
    public void mo3771(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1802(this, view, arrayList));
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: くし〴〺ぅ */
    public void mo3772(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: げつ〴ぬぐ */
    public void mo3773(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ごづごきえ */
    public void mo3774(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3781(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ざっざへづ */
    public Object mo3775(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: ざとぅぼこ〺 */
    public void mo3776(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m3831(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1804(this, rect));
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: づざかべべ */
    public boolean mo3777(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: てぜきぽく */
    public Object mo3778(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: のぷのちつ */
    public void mo3779(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: は〲ぱなで */
    public void mo3780(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1787.m3829(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3767(transitionSet, arrayList);
    }

    @Override // p034.p105.p106.AbstractC1787
    /* renamed from: へぬ〴づぞ */
    public void mo3781(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3781(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m3866(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}
