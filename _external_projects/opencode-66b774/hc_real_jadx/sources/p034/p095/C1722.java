package p034.p095;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p035.p045.C1096;
import p034.p080.C1502;

/* renamed from: づざかべべ.は〲ぱなで.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1722 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Transition f7888 = new AutoTransition();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static ThreadLocal<WeakReference<C1502<ViewGroup, ArrayList<Transition>>>> f7886 = new ThreadLocal<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static ArrayList<ViewGroup> f7887 = new ArrayList<>();

    /* renamed from: づざかべべ.は〲ぱなで.でどあくず$げつ〴ぬぐ, reason: contains not printable characters */
    public static class ViewTreeObserverOnPreDrawListenerC1723 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Transition f7889;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ViewGroup f7890;

        /* renamed from: づざかべべ.は〲ぱなで.でどあくず$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C1724 extends C1711 {

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final /* synthetic */ C1502 f7892;

            public C1724(C1502 c1502) {
                this.f7892 = c1502;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.Transition.InterfaceC0287
            /* renamed from: づざかべべ */
            public void mo993(Transition transition) {
                ((ArrayList) this.f7892.get(ViewTreeObserverOnPreDrawListenerC1723.this.f7890)).remove(transition);
                transition.mo1038(this);
            }
        }

        public ViewTreeObserverOnPreDrawListenerC1723(Transition transition, ViewGroup viewGroup) {
            this.f7889 = transition;
            this.f7890 = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01f4 A[EDGE_INSN: B:126:0x01f4->B:127:0x01f4 BREAK  A[LOOP:1: B:17:0x009a->B:30:0x01ea], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 694
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p095.C1722.ViewTreeObserverOnPreDrawListenerC1723.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f7890.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7890.removeOnAttachStateChangeListener(this);
            C1722.f7887.remove(this.f7890);
            ArrayList<Transition> arrayList = C1722.m3764().get(this.f7890);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo1021(this.f7890);
                }
            }
            this.f7889.m1040(true);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1502<ViewGroup, ArrayList<Transition>> m3764() {
        C1502<ViewGroup, ArrayList<Transition>> c1502;
        WeakReference<C1502<ViewGroup, ArrayList<Transition>>> weakReference = f7886.get();
        if (weakReference != null && (c1502 = weakReference.get()) != null) {
            return c1502;
        }
        C1502<ViewGroup, ArrayList<Transition>> c15022 = new C1502<>();
        f7886.set(new WeakReference<>(c15022));
        return c15022;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m3765(ViewGroup viewGroup, Transition transition) {
        if (f7887.contains(viewGroup) || !C1096.m2517(viewGroup)) {
            return;
        }
        f7887.add(viewGroup);
        if (transition == null) {
            transition = f7888;
        }
        Transition clone = transition.clone();
        ArrayList<Transition> orDefault = m3764().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<Transition> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().mo1031(viewGroup);
            }
        }
        if (clone != null) {
            clone.m1015(viewGroup, true);
        }
        int i = C1740.transition_current_scene;
        if (((C1698) viewGroup.getTag(i)) != null) {
            throw null;
        }
        viewGroup.setTag(i, null);
        if (clone != null) {
            ViewTreeObserverOnPreDrawListenerC1723 viewTreeObserverOnPreDrawListenerC1723 = new ViewTreeObserverOnPreDrawListenerC1723(clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1723);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1723);
        }
    }
}
