package p131.p221.p222.p224;

import com.codetroopers.betterpickers.calendardatepicker.DayPickerView;

/* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2693 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f10187;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ DayPickerView f10188;

    public RunnableC2693(DayPickerView dayPickerView, int i) {
        this.f10188 = dayPickerView;
        this.f10187 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10188.setSelection(this.f10187);
    }
}
