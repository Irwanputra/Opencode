package p034.p105.p106;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1790 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8057;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Map f8058;

    public RunnableC1790(AbstractC1787 abstractC1787, ArrayList arrayList, Map map) {
        this.f8057 = arrayList;
        this.f8058 = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f8057.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f8057.get(i);
            C1096.m2498(view, (String) this.f8058.get(C1096.m2497(view)));
        }
    }
}
