.class public abstract Lcom/google/android/gms/internal/zzxf;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzxe;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzv(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzxe;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzxe;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzxe;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzxg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzxg;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 7

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    packed-switch p1, :pswitch_data_7a

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzxe;->zzk(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_75

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    invoke-interface {p0, p1, p4, p2}, Lcom/google/android/gms/internal/zzxe;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_75

    :pswitch_2d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->zzmu()Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_78

    :pswitch_38
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onBackPressed()V

    goto :goto_75

    :pswitch_3c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->zzbf()V

    goto :goto_75

    :pswitch_40
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onDestroy()V

    goto :goto_75

    :pswitch_44
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onStop()V

    goto :goto_75

    :pswitch_48
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzxe;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto :goto_78

    :pswitch_5a
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onPause()V

    goto :goto_75

    :pswitch_5e
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onResume()V

    goto :goto_75

    :pswitch_62
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onStart()V

    goto :goto_75

    :pswitch_66
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzxe;->onRestart()V

    goto :goto_75

    :pswitch_6a
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzxe;->onCreate(Landroid/os/Bundle;)V

    :goto_75
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_78
    return v0

    nop

    :pswitch_data_7a
    .packed-switch 0x1
        :pswitch_6a
        :pswitch_66
        :pswitch_62
        :pswitch_5e
        :pswitch_5a
        :pswitch_48
        :pswitch_44
        :pswitch_40
        :pswitch_3c
        :pswitch_38
        :pswitch_2d
        :pswitch_19
        :pswitch_d
    .end packed-switch
.end method
