package dev.epro.r0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C5307487432222052365 implements A17704723979876201899 {
    public final /* synthetic */ R3192876217964974737 a;

    public C5307487432222052365(EmojiCompatInitializer emojiCompatInitializer, R3192876217964974737 r3192876217964974737) {
        this.a = r3192876217964974737;
    }

    @Override // dev.epro.r0.A17704723979876201899
    public final void e(I4293432593871965076 i4293432593871965076) {
        (Build.VERSION.SDK_INT >= 28 ? Q7289989699851480509.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new A8962658062045365505((byte) 1), 500L);
        this.a.b(this);
    }
}
