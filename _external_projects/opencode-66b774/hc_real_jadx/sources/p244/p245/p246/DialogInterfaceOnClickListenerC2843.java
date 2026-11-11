package p244.p245.p246;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import p244.p245.p246.p247.AbstractC2834;
import p244.p245.p246.p247.C2835;
import p244.p245.p246.p247.C2836;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnClickListenerC2843 implements DialogInterface.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object f10536;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2841 f10537;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC2839 f10538;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InterfaceC2837 f10539;

    public DialogInterfaceOnClickListenerC2843(C2838 c2838, C2841 c2841, InterfaceC2837 interfaceC2837, InterfaceC2839 interfaceC2839) {
        Object obj = c2838.f1202;
        this.f10536 = obj == null ? c2838.m525() : obj;
        this.f10537 = c2841;
        this.f10539 = interfaceC2837;
        this.f10538 = interfaceC2839;
    }

    public DialogInterfaceOnClickListenerC2843(DialogFragmentC2842 dialogFragmentC2842, C2841 c2841, InterfaceC2837 interfaceC2837, InterfaceC2839 interfaceC2839) {
        this.f10536 = dialogFragmentC2842.getActivity();
        this.f10537 = c2841;
        this.f10539 = interfaceC2837;
        this.f10538 = interfaceC2839;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        C2841 c2841 = this.f10537;
        int i2 = c2841.f10532;
        if (i != -1) {
            InterfaceC2839 interfaceC2839 = this.f10538;
            if (interfaceC2839 != null) {
                interfaceC2839.m4944(i2);
            }
            InterfaceC2837 interfaceC2837 = this.f10539;
            if (interfaceC2837 != null) {
                C2841 c28412 = this.f10537;
                interfaceC2837.mo1638(c28412.f10532, Arrays.asList(c28412.f10531));
                return;
            }
            return;
        }
        String[] strArr = c2841.f10531;
        InterfaceC2839 interfaceC28392 = this.f10538;
        if (interfaceC28392 != null) {
            interfaceC28392.m4945(i2);
        }
        Object obj = this.f10536;
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            (Build.VERSION.SDK_INT < 23 ? new C2836(fragment) : new C2835(fragment)).mo4939(i2, strArr);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            AbstractC2834.m4943((Activity) obj).mo4939(i2, strArr);
        }
    }
}
