.class public final Lcom/google/android/gms/internal/zzoi;
.super Lcom/google/android/gms/internal/zzpr;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mUri:Landroid/net/Uri;

.field private final zzbtq:Landroid/graphics/drawable/Drawable;

.field private final zzbtr:D


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V
    .registers 5

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzpr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzoi;->zzbtq:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzoi;->mUri:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/google/android/gms/internal/zzoi;->zzbtr:D

    return-void
.end method


# virtual methods
.method public final getScale()D
    .registers 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzoi;->zzbtr:D

    return-wide v0
.end method

.method public final getUri()Landroid/net/Uri;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzoi;->mUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzjr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzoi;->zzbtq:Landroid/graphics/drawable/Drawable;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method
