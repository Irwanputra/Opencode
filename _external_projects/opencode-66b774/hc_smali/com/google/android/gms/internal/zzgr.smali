.class public final Lcom/google/android/gms/internal/zzgr;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private synthetic zzaxn:Lcom/google/android/gms/internal/zzgp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzgp;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgr;->zzaxn:Lcom/google/android/gms/internal/zzgp;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzgr;->zzaxn:Lcom/google/android/gms/internal/zzgp;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzgp;->zza(Lcom/google/android/gms/internal/zzgp;I)V

    return-void
.end method
