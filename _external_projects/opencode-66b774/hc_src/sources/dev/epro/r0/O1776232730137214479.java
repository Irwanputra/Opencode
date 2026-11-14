package dev.epro.r0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O1776232730137214479 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O1776232730137214479(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                T4056244775750501969 t4056244775750501969 = (T4056244775750501969) obj;
                if (!t4056244775750501969.getInternalPopup().b()) {
                    t4056244775750501969.f.m(t4056244775750501969.getTextDirection(), t4056244775750501969.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = t4056244775750501969.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                H13521189488363841561 h13521189488363841561 = (H13521189488363841561) obj;
                T4056244775750501969 t40562447757505019692 = h13521189488363841561.G;
                if (!t40562447757505019692.isAttachedToWindow() || !t40562447757505019692.getGlobalVisibleRect(h13521189488363841561.E)) {
                    h13521189488363841561.dismiss();
                    break;
                } else {
                    h13521189488363841561.s();
                    h13521189488363841561.e();
                    break;
                }
                break;
            case 2:
                T16502368487833955839 t16502368487833955839 = (T16502368487833955839) obj;
                ArrayList arrayList = t16502368487833955839.h;
                if (t16502368487833955839.b() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((A15735106322894363321) arrayList.get(0)).a.y) {
                        View view = t16502368487833955839.f499o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                ((A15735106322894363321) obj2).a.e();
                            }
                            break;
                        } else {
                            t16502368487833955839.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                T2861735882155554692 t2861735882155554692 = (T2861735882155554692) obj;
                P14632972821668659290 p14632972821668659290 = t2861735882155554692.h;
                if (t2861735882155554692.b() && !p14632972821668659290.y) {
                    View view2 = t2861735882155554692.m;
                    if (view2 != null && view2.isShown()) {
                        p14632972821668659290.e();
                        break;
                    } else {
                        t2861735882155554692.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
