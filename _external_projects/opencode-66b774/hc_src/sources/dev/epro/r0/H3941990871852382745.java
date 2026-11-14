package dev.epro.r0;

import android.view.View;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H3941990871852382745 extends U15853425786981391261 {
    public final /* synthetic */ byte s;

    public /* synthetic */ H3941990871852382745(byte b) {
        this.s = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.U15853425786981391261
    public final float P(I11571046933844109529 i11571046933844109529) {
        switch (this.s) {
            case 0:
                return ((View) i11571046933844109529).getAlpha();
            case 1:
                return ((View) i11571046933844109529).getScaleX();
            case 2:
                return ((View) i11571046933844109529).getScaleY();
            case 3:
                return ((View) i11571046933844109529).getRotation();
            case 4:
                return ((View) i11571046933844109529).getRotationX();
            default:
                return ((View) i11571046933844109529).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.U15853425786981391261
    public final void d0(I11571046933844109529 i11571046933844109529, float f) {
        switch (this.s) {
            case 0:
                ((View) i11571046933844109529).setAlpha(f);
                break;
            case 1:
                ((View) i11571046933844109529).setScaleX(f);
                break;
            case 2:
                ((View) i11571046933844109529).setScaleY(f);
                break;
            case 3:
                ((View) i11571046933844109529).setRotation(f);
                break;
            case 4:
                ((View) i11571046933844109529).setRotationX(f);
                break;
            default:
                ((View) i11571046933844109529).setRotationY(f);
                break;
        }
    }
}
