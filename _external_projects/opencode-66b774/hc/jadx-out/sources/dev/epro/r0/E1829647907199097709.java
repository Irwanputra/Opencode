package dev.epro.r0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E1829647907199097709 extends CharacterStyle implements UpdateAppearance {
    public final Q15653065705375360223 a;

    public E1829647907199097709(Q15653065705375360223 q15653065705375360223) {
        this.a = q15653065705375360223;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C10274207051762801329 c10274207051762801329 = C10274207051762801329.a;
            Q15653065705375360223 q15653065705375360223 = this.a;
            if (S10823041268949770285.t(q15653065705375360223, c10274207051762801329)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(q15653065705375360223 instanceof I1470541803076273897)) {
                Z3383101362411723454.g();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            I1470541803076273897 i1470541803076273897 = (I1470541803076273897) q15653065705375360223;
            textPaint.setStrokeWidth(i1470541803076273897.a);
            textPaint.setStrokeMiter(i1470541803076273897.b);
            int i = i1470541803076273897.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = i1470541803076273897.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
