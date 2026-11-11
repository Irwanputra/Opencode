.class public final Lcom/google/android/gms/internal/zzapa;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public final heightPixels:I

.field private final type:I

.field public final widthPixels:I


# direct methods
.method private constructor <init>(III)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/zzapa;->type:I

    iput p2, p0, Lcom/google/android/gms/internal/zzapa;->widthPixels:I

    iput p3, p0, Lcom/google/android/gms/internal/zzapa;->heightPixels:I

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/zzjn;)Lcom/google/android/gms/internal/zzapa;
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzjn;->zzbel:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    new-instance p0, Lcom/google/android/gms/internal/zzapa;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzapa;-><init>(III)V

    return-object p0

    :cond_c
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzjn;->zzbeo:Z

    if-eqz v0, :cond_17

    new-instance p0, Lcom/google/android/gms/internal/zzapa;

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/zzapa;-><init>(III)V

    return-object p0

    :cond_17
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzjn;->zzben:Z

    if-eqz v0, :cond_20

    invoke-static {}, Lcom/google/android/gms/internal/zzapa;->zzuf()Lcom/google/android/gms/internal/zzapa;

    move-result-object p0

    return-object p0

    :cond_20
    iget v0, p0, Lcom/google/android/gms/internal/zzjn;->widthPixels:I

    iget p0, p0, Lcom/google/android/gms/internal/zzjn;->heightPixels:I

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzapa;->zzi(II)Lcom/google/android/gms/internal/zzapa;

    move-result-object p0

    return-object p0
.end method

.method public static zzi(II)Lcom/google/android/gms/internal/zzapa;
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zzapa;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/zzapa;-><init>(III)V

    return-object v0
.end method

.method public static zzuf()Lcom/google/android/gms/internal/zzapa;
    .registers 2

    new-instance v0, Lcom/google/android/gms/internal/zzapa;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/google/android/gms/internal/zzapa;-><init>(III)V

    return-object v0
.end method

.method public static zzug()Lcom/google/android/gms/internal/zzapa;
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzapa;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzapa;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final isFluid()Z
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzapa;->type:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    return v0

    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public final zzuh()Z
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzapa;->type:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    return v0

    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public final zzui()Z
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzapa;->type:I

    if-nez v0, :cond_6

    const/4 v0, 0x1

    return v0

    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public final zzuj()Z
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzapa;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    return v0

    :cond_7
    const/4 v0, 0x0

    return v0
.end method
