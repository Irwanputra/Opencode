package dev.epro.r0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P6762899231197381032 extends U16229988784104357932 {
    public final TextView w;
    public final R7227561122513629522 x;
    public boolean y = true;

    public P6762899231197381032(TextView textView) {
        this.w = textView;
        this.x = new R7227561122513629522(textView);
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        if (!this.y) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof R7227561122513629522) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            R7227561122513629522 r7227561122513629522 = this.x;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = r7227561122513629522;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == r7227561122513629522) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final void O(boolean z) {
        if (z) {
            V();
        }
    }

    @Override // dev.epro.r0.U16229988784104357932
    public final void P(boolean z) {
        this.y = z;
        V();
        TextView textView = this.w;
        textView.setFilters(G(textView.getFilters()));
    }

    public final void V() {
        TextView textView = this.w;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.y) {
            if (!(transformationMethod instanceof T14648075736777701692) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new T14648075736777701692(transformationMethod);
            }
        } else if (transformationMethod instanceof T14648075736777701692) {
            transformationMethod = ((T14648075736777701692) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
