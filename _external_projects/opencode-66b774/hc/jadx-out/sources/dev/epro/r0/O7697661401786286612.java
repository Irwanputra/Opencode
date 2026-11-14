package dev.epro.r0;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O7697661401786286612 extends U16229988784104357932 {
    public final P6762899231197381032 w;

    public O7697661401786286612(TextView textView) {
        this.w = new P6762899231197381032(textView);
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return !D3638978315442423989.d() ? inputFilterArr : this.w.G(inputFilterArr);
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final void O(boolean z) {
        if (D3638978315442423989.d()) {
            this.w.O(z);
        }
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final void P(boolean z) {
        boolean zD = D3638978315442423989.d();
        P6762899231197381032 p6762899231197381032 = this.w;
        if (zD) {
            p6762899231197381032.P(z);
        } else {
            p6762899231197381032.y = z;
        }
    }
}
