package p244.p245.p246;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogFragmentC2842 extends DialogFragment {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC2837 f10533;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC2839 f10534;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10535 = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT >= 17 && getParentFragment() != null) {
            if (getParentFragment() instanceof InterfaceC2837) {
                this.f10533 = (InterfaceC2837) getParentFragment();
            }
            if (getParentFragment() instanceof InterfaceC2839) {
                this.f10534 = (InterfaceC2839) getParentFragment();
            }
        }
        if (context instanceof InterfaceC2837) {
            this.f10533 = (InterfaceC2837) context;
        }
        if (context instanceof InterfaceC2839) {
            this.f10534 = (InterfaceC2839) context;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C2841 c2841 = new C2841(getArguments());
        DialogInterfaceOnClickListenerC2843 dialogInterfaceOnClickListenerC2843 = new DialogInterfaceOnClickListenerC2843(this, c2841, this.f10533, this.f10534);
        Activity activity = getActivity();
        return (c2841.f10528 > 0 ? new AlertDialog.Builder(activity, c2841.f10528) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton(c2841.f10529, dialogInterfaceOnClickListenerC2843).setNegativeButton(c2841.f10527, dialogInterfaceOnClickListenerC2843).setMessage(c2841.f10530).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f10533 = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f10535 = true;
        super.onSaveInstanceState(bundle);
    }
}
