package p131.p221.p222.p224;

import com.codetroopers.betterpickers.calendardatepicker.YearPickerView;

/* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2695 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f10189;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f10190;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ YearPickerView f10191;

    public RunnableC2695(YearPickerView yearPickerView, int i, int i2) {
        this.f10191 = yearPickerView;
        this.f10189 = i;
        this.f10190 = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10191.setSelectionFromTop(this.f10189, this.f10190);
        this.f10191.requestLayout();
    }
}
