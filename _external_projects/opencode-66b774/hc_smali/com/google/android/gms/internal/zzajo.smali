.class public final Lcom/google/android/gms/internal/zzajo;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private synthetic zzddi:Lcom/google/android/gms/internal/zzajn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzajn;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajo;->zzddi:Lcom/google/android/gms/internal/zzajn;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajo;->zzddi:Lcom/google/android/gms/internal/zzajn;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/zzajn;->zza(Lcom/google/android/gms/internal/zzajn;Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
