.class public final Lcom/google/android/gms/ads/VideoOptions;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/VideoOptions$Builder;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Z

.field public final くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/VideoOptions$Builder;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/ぁごぐすすぃ;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-boolean p2, p1, Lcom/google/android/gms/ads/VideoOptions$Builder;->げつ〴ぬぐ:Z

    .line 3
    iput-boolean p2, p0, Lcom/google/android/gms/ads/VideoOptions;->げつ〴ぬぐ:Z

    .line 4
    iget-boolean p2, p1, Lcom/google/android/gms/ads/VideoOptions$Builder;->〺つふすそ:Z

    .line 5
    iput-boolean p2, p0, Lcom/google/android/gms/ads/VideoOptions;->〺つふすそ:Z

    .line 6
    iget-boolean p1, p1, Lcom/google/android/gms/ads/VideoOptions$Builder;->くし〴〺ぅ:Z

    .line 7
    iput-boolean p1, p0, Lcom/google/android/gms/ads/VideoOptions;->くし〴〺ぅ:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzmr;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lcom/google/android/gms/internal/zzmr;->zzbgx:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/VideoOptions;->げつ〴ぬぐ:Z

    iget-boolean v0, p1, Lcom/google/android/gms/internal/zzmr;->zzbgy:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/VideoOptions;->〺つふすそ:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/zzmr;->zzbgz:Z

    iput-boolean p1, p0, Lcom/google/android/gms/ads/VideoOptions;->くし〴〺ぅ:Z

    return-void
.end method


# virtual methods
.method public final getClickToExpandRequested()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/VideoOptions;->くし〴〺ぅ:Z

    return v0
.end method

.method public final getCustomControlsRequested()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/VideoOptions;->〺つふすそ:Z

    return v0
.end method

.method public final getStartMuted()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/VideoOptions;->げつ〴ぬぐ:Z

    return v0
.end method
