package p244.p245.p246.p247;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import p034.p035.p041.C1043;
import p244.p245.p246.DialogFragmentC2842;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2833 extends AbstractC2834<Activity> {
    public C2833(Activity activity) {
        super(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: 〺つふすそ */
    public Context mo4938() {
        return (Context) this.f10524;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: げつ〴ぬぐ */
    public void mo4939(int i, String... strArr) {
        C1043.m2381((Activity) this.f10524, strArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: づざかべべ */
    public void mo4942(String str, String str2, String str3, int i, int i2, String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f10524).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof DialogFragmentC2842) {
            return;
        }
        DialogFragmentC2842 dialogFragmentC2842 = new DialogFragmentC2842();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i2);
        bundle.putStringArray("permissions", strArr);
        dialogFragmentC2842.setArguments(bundle);
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !dialogFragmentC2842.f10535) {
            dialogFragmentC2842.show(fragmentManager, "RationaleDialogFragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: びぐびあび */
    public boolean mo4941(String str) {
        return C1043.m2380((Activity) this.f10524, str);
    }
}
