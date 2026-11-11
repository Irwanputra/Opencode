.class public final Lcom/google/android/gms/internal/zztn;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final zzcal:Lcom/google/android/gms/internal/zztk;

.field private static final zzcam:F

.field private static final zzcan:J

.field private static final zzcao:F

.field private static final zzcap:J


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    invoke-static {}, Lcom/google/android/gms/internal/zztk;->zzlc()Lcom/google/android/gms/internal/zztk;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zztn;->zzcal:Lcom/google/android/gms/internal/zztk;

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmg:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sput v0, Lcom/google/android/gms/internal/zztn;->zzcam:F

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbme:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/zztn;->zzcan:J

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmh:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sput v0, Lcom/google/android/gms/internal/zztn;->zzcao:F

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbmf:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/gms/internal/zztn;->zzcap:J

    return-void
.end method

.method private static zzb(JI)I
    .registers 5

    rem-int/lit8 p2, p2, 0x10

    mul-int/lit8 p2, p2, 0x4

    ushr-long/2addr p0, p2

    const-wide/16 v0, 0xf

    and-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method public static zzlm()Z
    .registers 12

    sget-object v0, Lcom/google/android/gms/internal/zztn;->zzcal:Lcom/google/android/gms/internal/zztk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztk;->zzlj()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztk;->zzlk()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztk;->zzli()I

    move-result v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztk;->zzlh()I

    move-result v0

    add-int/2addr v0, v3

    const/4 v3, 0x1

    const v4, 0x7fffffff

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x10

    if-ge v1, v8, :cond_29

    sget-wide v9, Lcom/google/android/gms/internal/zztn;->zzcap:J

    cmp-long v11, v9, v5

    if-eqz v11, :cond_29

    invoke-static {v9, v10, v1}, Lcom/google/android/gms/internal/zztn;->zzb(JI)I

    move-result v9

    goto :goto_38

    :cond_29
    sget v9, Lcom/google/android/gms/internal/zztn;->zzcao:F

    cmpl-float v10, v9, v7

    if-eqz v10, :cond_35

    int-to-float v10, v1

    mul-float v9, v9, v10

    float-to-int v9, v9

    add-int/2addr v9, v3

    goto :goto_38

    :cond_35
    const v9, 0x7fffffff

    :goto_38
    if-gt v2, v9, :cond_54

    if-ge v1, v8, :cond_47

    sget-wide v8, Lcom/google/android/gms/internal/zztn;->zzcan:J

    cmp-long v2, v8, v5

    if-eqz v2, :cond_47

    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/zztn;->zzb(JI)I

    move-result v4

    goto :goto_51

    :cond_47
    sget v2, Lcom/google/android/gms/internal/zztn;->zzcam:F

    cmpl-float v5, v2, v7

    if-eqz v5, :cond_51

    int-to-float v1, v1

    mul-float v2, v2, v1

    float-to-int v4, v2

    :cond_51
    :goto_51
    if-gt v0, v4, :cond_54

    return v3

    :cond_54
    const/4 v0, 0x0

    return v0
.end method
