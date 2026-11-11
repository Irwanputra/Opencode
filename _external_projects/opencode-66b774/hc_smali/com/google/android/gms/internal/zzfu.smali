.class public final Lcom/google/android/gms/internal/zzfu;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private synthetic zzawn:Lcom/google/android/gms/internal/zzft;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzft;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfu;->zzawn:Lcom/google/android/gms/internal/zzft;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzfu;->zzawn:Lcom/google/android/gms/internal/zzft;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzft;->zzl(I)V

    return-void
.end method
