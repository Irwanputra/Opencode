package dev.epro.r0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I3583119498707957918 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public I3583119498707957918(AssetManager assetManager, Executor executor, O16368343340005843063 o16368343340005843063, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = o16368343340005843063;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = M9216324016624295870.h;
                    break;
                case 26:
                    bArr = M9216324016624295870.g;
                    break;
                case 27:
                    bArr = M9216324016624295870.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = M9216324016624295870.e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = M9216324016624295870.d;
        }
        this.d = bArr;
    }

    public void a(F10342546226345611902 f10342546226345611902) {
        I1581330382723795749 i1581330382723795749 = (I1581330382723795749) this.g;
        if (i1581330382723795749 == null || f10342546226345611902 != ((F10342546226345611902) this.h) || i1581330382723795749.b()) {
            this.h = f10342546226345611902;
            i1581330382723795749 = new I1581330382723795749((M11181104712105445833) this.b, (R8540738700654750557) this.d, (U14340554418656580554) this.e, H4776669175763245653.l((S16571168858015125610) this.c, f10342546226345611902), (List) this.f, this.a);
        }
        this.g = i1581330382723795749;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void c(final int i, final Serializable serializable) {
        ((Executor) this.b).execute(new Runnable() { // from class: dev.epro.r0.U6626641364987552068
            @Override // java.lang.Runnable
            public final void run() {
                ((O16368343340005843063) this.a.c).m(i, serializable);
            }
        });
    }

    public I3583119498707957918(M11181104712105445833 m11181104712105445833, R8540738700654750557 r8540738700654750557, U14340554418656580554 u14340554418656580554, S16571168858015125610 s16571168858015125610, List list, boolean z) {
        this.b = m11181104712105445833;
        this.c = s16571168858015125610;
        this.a = z;
        this.d = r8540738700654750557;
        this.e = u14340554418656580554;
        this.f = list;
    }
}
