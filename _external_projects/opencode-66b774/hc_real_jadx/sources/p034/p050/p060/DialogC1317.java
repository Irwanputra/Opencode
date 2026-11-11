package p034.p050.p060;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p034.p035.p045.C1116;
import p034.p050.p051.AbstractC1154;
import p034.p080.C1501;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogC1317 extends Dialog implements InterfaceC1301 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1345 f6339;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1116.InterfaceC1117 f6340;

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ざとぅぼこ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1318 implements C1116.InterfaceC1117 {
        public C1318() {
        }

        @Override // p034.p035.p045.C1116.InterfaceC1117
        /* renamed from: ぁごぐすすぃ */
        public boolean mo373(KeyEvent keyEvent) {
            return DialogC1317.this.m2966(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC1317(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = p034.p050.C1264.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            づざかべべ.〺つふすそ.ぺふねづ〺.ざとぅぼこ〺$げつ〴ぬぐ r1 = new づざかべべ.〺つふすそ.ぺふねづ〺.ざとぅぼこ〺$げつ〴ぬぐ
            r1.<init>()
            r4.f6340 = r1
            づざかべべ.〺つふすそ.ぺふねづ〺.ぺふねづ〺 r1 = r4.m2967()
            if (r6 != 0) goto L35
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = p034.p050.C1264.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L35:
            r1.mo2976(r6)
            r5 = 0
            r1.mo3006(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p060.DialogC1317.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2967().mo2986(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m2967().mo3013();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1116.m2559(this.f6340, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m2967().mo2997(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m2967().mo3017();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m2967().mo2974();
        super.onCreate(bundle);
        m2967().mo3006(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m2967().mo3007();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m2967().mo3000(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m2967().mo3011(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2967().mo2971(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m2967().mo3009(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2967().mo3009(charSequence);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m2966(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ぇぬぎばつ */
    public void mo73(AbstractC1154 abstractC1154) {
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1345 m2967() {
        if (this.f6339 == null) {
            C1501<WeakReference<AbstractC1345>> c1501 = AbstractC1345.f6453;
            this.f6339 = new LayoutInflaterFactory2C1320(getContext(), getWindow(), this, this);
        }
        return this.f6339;
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ごづごきえ */
    public AbstractC1154 mo75(AbstractC1154.InterfaceC1155 interfaceC1155) {
        return null;
    }

    @Override // p034.p050.p060.InterfaceC1301
    /* renamed from: ぺふねづ〺 */
    public void mo82(AbstractC1154 abstractC1154) {
    }
}
