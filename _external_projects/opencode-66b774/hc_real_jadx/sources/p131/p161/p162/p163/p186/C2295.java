package p131.p161.p162.p163.p186;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2295 extends Property<ImageView, Matrix> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Matrix f9512;

    public C2295() {
        super(Matrix.class, "imageMatrixProperty");
        this.f9512 = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        this.f9512.set(imageView.getImageMatrix());
        return this.f9512;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
