package dev.epro.r0;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F2303783146981231864 extends CharacterStyle implements UpdateAppearance {
    public final G2555456398299437723 a;
    public final float b;
    public final V697849047308847220 c = V4416135141588678913.t(new W8572396779607072172(9205357640488583168L));
    public final B4739506393801054036 d = Z3658309082448601011.b(new N8306548196372912291(this, (byte) 24));

    public F2303783146981231864(G2555456398299437723 g2555456398299437723, float f) {
        this.a = g2555456398299437723;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        V12319504402545346730.W(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
