package p034.p065.p066;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p065.p066.C1412;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1408 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6632;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6633;

    public RunnableC1408(C1412 c1412, ArrayList arrayList) {
        this.f6633 = c1412;
        this.f6632 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f6632.iterator();
        while (it.hasNext()) {
            C1412.C1414 c1414 = (C1412.C1414) it.next();
            C1412 c1412 = this.f6633;
            c1412.getClass();
            RecyclerView.AbstractC0207 abstractC0207 = c1414.f6667;
            View view = abstractC0207 == null ? null : abstractC0207.f1476;
            RecyclerView.AbstractC0207 abstractC02072 = c1414.f6665;
            View view2 = abstractC02072 != null ? abstractC02072.f1476 : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c1412.f1561);
                c1412.f6654.add(c1414.f6667);
                duration.translationX(c1414.f6668 - c1414.f6666);
                duration.translationY(c1414.f6669 - c1414.f6670);
                duration.alpha(0.0f).setListener(new C1411(c1412, c1414, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c1412.f6654.add(c1414.f6665);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c1412.f1561).alpha(1.0f).setListener(new C1372(c1412, c1414, animate, view2)).start();
            }
        }
        this.f6632.clear();
        this.f6633.f6657.remove(this.f6632);
    }
}
