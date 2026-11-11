.class public final Lcom/google/android/gms/internal/zzoo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzoq;


# instance fields
.field private synthetic zzbun:Lcom/google/android/gms/internal/zzon;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzon;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzoo;->zzbun:Lcom/google/android/gms/internal/zzon;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzc(Landroid/view/MotionEvent;)V
    .registers 2

    return-void
.end method

.method public final zzkb()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzoo;->zzbun:Lcom/google/android/gms/internal/zzon;

    const-string v1, "_videoMediaView"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzon;->performClick(Ljava/lang/String;)V

    return-void
.end method
