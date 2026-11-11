.class public final Lcom/google/android/gms/internal/zzacs;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final zzcum:J

.field public final zzcun:Lcom/google/android/gms/internal/zzaco;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzacq;Lcom/google/android/gms/internal/zzaco;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iput-wide v0, p0, Lcom/google/android/gms/internal/zzacs;->zzcum:J

    iput-object p2, p0, Lcom/google/android/gms/internal/zzacs;->zzcun:Lcom/google/android/gms/internal/zzaco;

    return-void
.end method
