package p034.p095;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Visibility;
import java.util.ArrayList;

/* renamed from: づざかべべ.は〲ぱなで.ながふずは, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1726 extends C1711 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f7894;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f7895;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f7896;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Visibility f7897;

    public C1726(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f7897 = visibility;
        this.f7896 = viewGroup;
        this.f7894 = view;
        this.f7895 = view2;
    }

    @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
    /* renamed from: くし〴〺ぅ */
    public void mo992(Transition transition) {
        C1713.m3759(this.f7896).mo3745(this.f7894);
    }

    @Override // androidx.transition.Transition.InterfaceC0287
    /* renamed from: づざかべべ */
    public void mo993(Transition transition) {
        this.f7895.setTag(C1740.save_overlay_view, null);
        C1713.m3759(this.f7896).mo3745(this.f7894);
        transition.mo1038(this);
    }

    @Override // p034.p095.C1711, androidx.transition.Transition.InterfaceC0287
    /* renamed from: びぐびあび */
    public void mo994(Transition transition) {
        if (this.f7894.getParent() == null) {
            C1713.m3759(this.f7896).mo3746(this.f7894);
            return;
        }
        Visibility visibility = this.f7897;
        int size = visibility.f1803.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                visibility.f1803.get(size).cancel();
            }
        }
        ArrayList<Transition.InterfaceC0287> arrayList = visibility.f1795;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) visibility.f1795.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((Transition.InterfaceC0287) arrayList2.get(i)).mo991(visibility);
        }
    }
}
