package p034.p105.p106;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import p034.p105.p106.LayoutInflaterFactory2C1815.C1825;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnCancelListenerC1781 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public boolean f8010;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public Dialog f8012;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public boolean f8014;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public boolean f8019;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public Handler f8020;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public Runnable f8018 = new RunnableC1782();

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public int f8016 = 0;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public int f8011 = 0;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public boolean f8015 = true;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public boolean f8017 = true;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public int f8013 = -1;

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1782 implements Runnable {
        public RunnableC1782() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1781 dialogInterfaceOnCancelListenerC1781 = DialogInterfaceOnCancelListenerC1781.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC1781.f8012;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC1781.onDismiss(dialog);
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8019) {
            return;
        }
        m3827(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: 〺でおいここ */
    public void mo480() {
        this.f1196 = true;
        Dialog dialog = this.f8012;
        if (dialog != null) {
            this.f8019 = true;
            dialog.setOnDismissListener(null);
            this.f8012.dismiss();
            if (!this.f8010) {
                onDismiss(this.f8012);
            }
            this.f8012 = null;
        }
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m3825(AbstractC1780 abstractC1780, String str) {
        this.f8010 = false;
        this.f8014 = true;
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) abstractC1780;
        layoutInflaterFactory2C1815.getClass();
        C1794 c1794 = new C1794(layoutInflaterFactory2C1815);
        c1794.mo3839(0, this, str, 1);
        c1794.mo3837();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
        if (this.f8014 || this.f8010) {
            return;
        }
        this.f8010 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: えがぐせほち */
    public void mo489(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.f8012;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f8016;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f8011;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f8015;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f8017;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f8013;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        if (this.f8014) {
            return;
        }
        this.f8010 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: げがぴうあだ */
    public LayoutInflater mo502(Bundle bundle) {
        Context context;
        if (!this.f8017) {
            return super.mo502(bundle);
        }
        Dialog mo3826 = mo3826(bundle);
        this.f8012 = mo3826;
        if (mo3826 != null) {
            mo3026(mo3826, this.f8016);
            context = this.f8012.getContext();
        } else {
            context = this.f1192.f8025;
        }
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ごまけがぢは */
    public void mo505() {
        this.f1196 = true;
        Dialog dialog = this.f8012;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public Dialog mo3826(Bundle bundle) {
        return new Dialog(m476(), this.f8011);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: じぜこほぱ */
    public void mo508(Bundle bundle) {
        Bundle bundle2;
        this.f1196 = true;
        if (this.f8017) {
            View view = this.f1186;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f8012.setContentView(view);
            }
            FragmentActivity m525 = m525();
            if (m525 != null) {
                this.f8012.setOwnerActivity(m525);
            }
            this.f8012.setCancelable(this.f8015);
            this.f8012.setOnCancelListener(this);
            this.f8012.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f8012.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        this.f8020 = new Handler();
        this.f8017 = this.f1175 == 0;
        if (bundle != null) {
            this.f8016 = bundle.getInt("android:style", 0);
            this.f8011 = bundle.getInt("android:theme", 0);
            this.f8015 = bundle.getBoolean("android:cancelable", true);
            this.f8017 = bundle.getBoolean("android:showsDialog", this.f8017);
            this.f8013 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public void m3827(boolean z, boolean z2) {
        if (this.f8010) {
            return;
        }
        this.f8010 = true;
        this.f8014 = false;
        Dialog dialog = this.f8012;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f8012.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f8020.getLooper()) {
                    onDismiss(this.f8012);
                } else {
                    this.f8020.post(this.f8018);
                }
            }
        }
        this.f8019 = true;
        if (this.f8013 < 0) {
            C1794 c1794 = new C1794((LayoutInflaterFactory2C1815) m499());
            c1794.mo3836(this);
            if (z) {
                c1794.m3842(true);
                return;
            } else {
                c1794.mo3837();
                return;
            }
        }
        AbstractC1780 m499 = m499();
        int i = this.f8013;
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) m499;
        if (i < 0) {
            throw new IllegalArgumentException(C2098.m4208("Bad id: ", i));
        }
        layoutInflaterFactory2C1815.m3917(layoutInflaterFactory2C1815.new C1825(null, i, 1), false);
        this.f8013 = -1;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ばおぢでぎか */
    public void mo523() {
        this.f1196 = true;
        Dialog dialog = this.f8012;
        if (dialog != null) {
            this.f8019 = false;
            dialog.show();
        }
    }

    /* renamed from: へぼ〳〻び */
    public void mo3026(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
}
