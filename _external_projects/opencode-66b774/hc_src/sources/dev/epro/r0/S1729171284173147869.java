package dev.epro.r0;

import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class S1729171284173147869 extends BaseMovementMethod {
    public static final S1729171284173147869 a;

    static {
        int xzutvxuxmpuv;
        izmyclvb.qgayjvbiagej2(810);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                xzutvxuxmpuv = xzutvxuxmpuv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (xzutvxuxmpuv != 0) {
                switch (xzutvxuxmpuv) {
                    case 1:
                        a = (S1729171284173147869) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void qsjtapyithth();

    private static native int xzutvxuxmpuv(Object[] objArr);

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final native boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent);

    private S1729171284173147869() {
        qsjtapyithth();
    }
}
