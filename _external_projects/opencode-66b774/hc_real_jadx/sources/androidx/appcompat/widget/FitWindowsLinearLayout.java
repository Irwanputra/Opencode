package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p034.p050.p053.InterfaceC1226;
import p034.p050.p060.C1342;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC1226 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC1226.InterfaceC1227 f407;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC1226.InterfaceC1227 interfaceC1227 = this.f407;
        if (interfaceC1227 != null) {
            rect.top = ((C1342) interfaceC1227).f6449.m2985(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // p034.p050.p053.InterfaceC1226
    public void setOnFitSystemWindowsListener(InterfaceC1226.InterfaceC1227 interfaceC1227) {
        this.f407 = interfaceC1227;
    }
}
