package p107.p108.p109.p110.p113;

import android.content.DialogInterface;
import java.io.File;
import team.dev.epro.apkcustom.widgets.FileChooser;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnDismissListenerC1856 implements DialogInterface.OnDismissListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ File[] f8241;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ FileChooser f8242;

    public DialogInterfaceOnDismissListenerC1856(FileChooser fileChooser, File[] fileArr) {
        this.f8242 = fileChooser;
        this.f8241 = fileArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        FileChooser fileChooser = this.f8242;
        String path = this.f8241[0].getPath();
        String parent = this.f8241[0].getParent();
        int i = FileChooser.f4132;
        fileChooser.m1707(path, parent);
    }
}
