package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1829647907199097709 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final dev.epro.r0.Q15653065705375360223 a;

    public E1829647907199097709(dev.epro.r0.Q15653065705375360223 q15653065705375360223) {
        this.a = q15653065705375360223;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            dev.epro.r0.C10274207051762801329 c10274207051762801329 = dev.epro.r0.C10274207051762801329.a;
            dev.epro.r0.I1470541803076273897 i1470541803076273897 = this.a;
            if (dev.epro.r0.S10823041268949770285.t(i1470541803076273897, c10274207051762801329)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (!(i1470541803076273897 instanceof dev.epro.r0.I1470541803076273897)) {
                dev.epro.r0.Z3383101362411723454.g();
                return;
            }
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
            dev.epro.r0.I1470541803076273897 i14705418030762738972 = i1470541803076273897;
            textPaint.setStrokeWidth(i14705418030762738972.a);
            textPaint.setStrokeMiter(i14705418030762738972.b);
            int i = i14705418030762738972.d;
            textPaint.setStrokeJoin(i == 0 ? android.graphics.Paint.Join.MITER : i == 1 ? android.graphics.Paint.Join.ROUND : i == 2 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.MITER);
            int i2 = i14705418030762738972.c;
            textPaint.setStrokeCap(i2 == 0 ? android.graphics.Paint.Cap.BUTT : i2 == 1 ? android.graphics.Paint.Cap.ROUND : i2 == 2 ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
