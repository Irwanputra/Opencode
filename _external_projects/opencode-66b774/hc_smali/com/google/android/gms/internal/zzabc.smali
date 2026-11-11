.class public abstract Lcom/google/android/gms/internal/zzabc;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzabb;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.request.IAdRequestService"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
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
    if-eq p1, v0, :cond_62

    const/4 p4, 0x2

    const/4 v1, 0x0

    if-eq p1, p4, :cond_39

    const/4 p4, 0x4

    if-eq p1, p4, :cond_13

    const/4 p1, 0x0

    return p1

    :cond_13
    sget-object p1, Lcom/google/android/gms/internal/zzabm;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzabm;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_22

    goto :goto_35

    :cond_22
    const-string p4, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"

    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v1, p4, Lcom/google/android/gms/internal/zzabh;

    if-eqz v1, :cond_30

    move-object v1, p4

    check-cast v1, Lcom/google/android/gms/internal/zzabh;

    goto :goto_35

    :cond_30
    new-instance v1, Lcom/google/android/gms/internal/zzabi;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/zzabi;-><init>(Landroid/os/IBinder;)V

    :goto_35
    invoke-interface {p0, p1, v1}, Lcom/google/android/gms/internal/zzabb;->zza(Lcom/google/android/gms/internal/zzabm;Lcom/google/android/gms/internal/zzabh;)V

    goto :goto_5e

    :cond_39
    sget-object p1, Lcom/google/android/gms/internal/zzaat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzaat;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_48

    goto :goto_5b

    :cond_48
    const-string p4, "com.google.android.gms.ads.internal.request.IAdResponseListener"

    invoke-interface {p2, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v1, p4, Lcom/google/android/gms/internal/zzabe;

    if-eqz v1, :cond_56

    move-object v1, p4

    check-cast v1, Lcom/google/android/gms/internal/zzabe;

    goto :goto_5b

    :cond_56
    new-instance v1, Lcom/google/android/gms/internal/zzabg;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/zzabg;-><init>(Landroid/os/IBinder;)V

    :goto_5b
    invoke-interface {p0, p1, v1}, Lcom/google/android/gms/internal/zzabb;->zza(Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzabe;)V

    :goto_5e
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_74

    :cond_62
    sget-object p1, Lcom/google/android/gms/internal/zzaat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzaat;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzabb;->zzb(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzaax;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    :goto_74
    return v0
.end method
