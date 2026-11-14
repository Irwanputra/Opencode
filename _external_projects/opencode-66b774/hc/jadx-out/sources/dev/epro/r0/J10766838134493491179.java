package dev.epro.r0;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J10766838134493491179 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J10766838134493491179(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                I1843037381664720286 i1843037381664720286 = (I1843037381664720286) this.b;
                Context context = view.getContext();
                if (!i1843037381664720286.d) {
                    context.getApplicationContext().registerComponentCallbacks(i1843037381664720286.e);
                    i1843037381664720286.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                I1843037381664720286 i1843037381664720286 = (I1843037381664720286) obj;
                Context context = view.getContext();
                if (i1843037381664720286.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(i1843037381664720286.e);
                    i1843037381664720286.d = false;
                }
                break;
            case 1:
                T16502368487833955839 t16502368487833955839 = (T16502368487833955839) obj;
                ViewTreeObserver viewTreeObserver = t16502368487833955839.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        t16502368487833955839.x = view.getViewTreeObserver();
                    }
                    t16502368487833955839.x.removeGlobalOnLayoutListener(t16502368487833955839.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                T2861735882155554692 t2861735882155554692 = (T2861735882155554692) obj;
                ViewTreeObserver viewTreeObserver2 = t2861735882155554692.f504o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        t2861735882155554692.f504o = view.getViewTreeObserver();
                    }
                    t2861735882155554692.f504o.removeGlobalOnLayoutListener(t2861735882155554692.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                O10944101174480148852 o10944101174480148852 = (O10944101174480148852) obj;
                for (Object obj2 : T2881242016550624223.D(o10944101174480148852.getParent(), Y8430407739249892095.h)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                o10944101174480148852.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((X7175349259954592591) obj).c(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
