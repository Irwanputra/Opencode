package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p034.p035.p045.C1096;
import p131.p161.p162.p163.p168.InterfaceC2152;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f3628;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewTreeObserverOnPreDrawListenerC0483 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f3629;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f3630;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC2152 f3632;

        public ViewTreeObserverOnPreDrawListenerC0483(View view, int i, InterfaceC2152 interfaceC2152) {
            this.f3629 = view;
            this.f3630 = i;
            this.f3632 = interfaceC2152;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f3629.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3628 == this.f3630) {
                InterfaceC2152 interfaceC2152 = this.f3632;
                expandableBehavior.mo1552((View) interfaceC2152, this.f3629, interfaceC2152.mo1427(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f3628 = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3628 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぁごぐすすぃ */
    public boolean mo346(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC2152 interfaceC2152 = (InterfaceC2152) view2;
        if (!m1553(interfaceC2152.mo1427())) {
            return false;
        }
        this.f3628 = interfaceC2152.mo1427() ? 1 : 2;
        return mo1552((View) interfaceC2152, view, interfaceC2152.mo1427(), true);
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public abstract boolean mo1552(View view, View view2, boolean z, boolean z2);

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final boolean m1553(boolean z) {
        if (!z) {
            return this.f3628 == 1;
        }
        int i = this.f3628;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺふねづ〺 */
    public boolean mo369(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC2152 interfaceC2152;
        if (!C1096.m2517(view)) {
            List<View> m331 = coordinatorLayout.m331(view);
            int size = m331.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC2152 = null;
                    break;
                }
                View view2 = m331.get(i2);
                if (mo365(coordinatorLayout, view, view2)) {
                    interfaceC2152 = (InterfaceC2152) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC2152 != null && m1553(interfaceC2152.mo1427())) {
                int i3 = interfaceC2152.mo1427() ? 1 : 2;
                this.f3628 = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0483(view, i3, interfaceC2152));
            }
        }
        return false;
    }
}
