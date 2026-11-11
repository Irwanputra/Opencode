package p034.p094;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import p034.p094.AbstractC1680;

/* renamed from: づざかべべ.のぷのちつ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class FragmentC1668 extends Fragment {
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3639(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1668(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3640(AbstractC1680.EnumC1682.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m3640(AbstractC1680.EnumC1682.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m3640(AbstractC1680.EnumC1682.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m3640(AbstractC1680.EnumC1682.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m3640(AbstractC1680.EnumC1682.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m3640(AbstractC1680.EnumC1682.ON_STOP);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3640(AbstractC1680.EnumC1682 enumC1682) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC1684) {
            ((InterfaceC1684) activity).mo36().m3627(enumC1682);
        } else if (activity instanceof InterfaceC1664) {
            AbstractC1680 mo36 = ((InterfaceC1664) activity).mo36();
            if (mo36 instanceof C1661) {
                ((C1661) mo36).m3627(enumC1682);
            }
        }
    }
}
