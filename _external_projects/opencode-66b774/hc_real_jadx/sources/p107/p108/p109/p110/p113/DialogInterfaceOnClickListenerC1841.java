package p107.p108.p109.p110.p113;

import android.content.DialogInterface;
import java.io.File;
import team.dev.epro.apkcustom.widgets.FileChooser;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class DialogInterfaceOnClickListenerC1841 implements DialogInterface.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ File f8210;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ File[] f8211;

    public DialogInterfaceOnClickListenerC1841(FileChooser fileChooser, File file, File[] fileArr) {
        this.f8210 = file;
        this.f8211 = fileArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1860.m3980(this.f8210, this.f8211[0])) {
            this.f8210.delete();
        } else {
            this.f8211[0] = this.f8210;
        }
    }
}
