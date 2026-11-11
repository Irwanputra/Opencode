.class public abstract Lcom/google/android/gms/internal/zzny;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zznx;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    if-eq p1, v0, :cond_34

    const/4 p4, 0x2

    if-eq p1, p4, :cond_2f

    const/4 p4, 0x3

    if-eq p1, p4, :cond_20

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1c

    const/4 p2, 0x5

    if-eq p1, p2, :cond_18

    const/4 p1, 0x0

    return p1

    :cond_18
    invoke-interface {p0}, Lcom/google/android/gms/internal/zznx;->recordImpression()V

    goto :goto_2b

    :cond_1c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zznx;->recordClick()V

    goto :goto_2b

    :cond_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zznx;->zze(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    :goto_2b
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_3e

    :cond_2f
    invoke-interface {p0}, Lcom/google/android/gms/internal/zznx;->getContent()Ljava/lang/String;

    move-result-object p1

    goto :goto_38

    :cond_34
    invoke-interface {p0}, Lcom/google/android/gms/internal/zznx;->zzjj()Ljava/lang/String;

    move-result-object p1

    :goto_38
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3e
    return v0
.end method
