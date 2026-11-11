package p034.p065.p066;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p065.p066.C1412;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1381 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6544;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6545;

    public RunnableC1381(C1412 c1412, ArrayList arrayList) {
        this.f6545 = c1412;
        this.f6544 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f6544.iterator();
        while (it.hasNext()) {
            C1412.C1413 c1413 = (C1412.C1413) it.next();
            C1412 c1412 = this.f6545;
            RecyclerView.AbstractC0207 abstractC0207 = c1413.f6662;
            int i = c1413.f6660;
            int i2 = c1413.f6661;
            int i3 = c1413.f6664;
            int i4 = c1413.f6663;
            c1412.getClass();
            View view = abstractC0207.f1476;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c1412.f6651.add(abstractC0207);
            animate.setDuration(c1412.f1560).setListener(new C1365(c1412, abstractC0207, i5, view, i6, animate)).start();
        }
        this.f6544.clear();
        this.f6545.f6656.remove(this.f6544);
    }
}
