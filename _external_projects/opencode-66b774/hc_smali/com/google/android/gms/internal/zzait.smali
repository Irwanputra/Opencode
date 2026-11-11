.class public final Lcom/google/android/gms/internal/zzait;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final count:I

.field public final name:Ljava/lang/String;

.field private zzdcd:D

.field private zzdce:D

.field public final zzdcf:D


# direct methods
.method public constructor <init>(Ljava/lang/String;DDDI)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/internal/zzait;->zzdce:D

    iput-wide p4, p0, Lcom/google/android/gms/internal/zzait;->zzdcd:D

    iput-wide p6, p0, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    iput p8, p0, Lcom/google/android/gms/internal/zzait;->count:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 8

    instance-of v0, p1, Lcom/google/android/gms/internal/zzait;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, Lcom/google/android/gms/internal/zzait;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    invoke-static {v0, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごづごきえ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzait;->zzdcd:D

    iget-wide v4, p1, Lcom/google/android/gms/internal/zzait;->zzdcd:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_34

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzait;->zzdce:D

    iget-wide v4, p1, Lcom/google/android/gms/internal/zzait;->zzdce:D

    cmpl-double v0, v2, v4

    if-nez v0, :cond_34

    iget v0, p0, Lcom/google/android/gms/internal/zzait;->count:I

    iget v2, p1, Lcom/google/android/gms/internal/zzait;->count:I

    if-ne v0, v2, :cond_34

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    iget-wide v4, p1, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-nez p1, :cond_34

    const/4 p1, 0x1

    return p1

    :cond_34
    return v1
.end method

.method public final hashCode()I
    .registers 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdcd:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdce:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/zzait;->count:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;-><init>(Ljava/lang/Object;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぉざぅち〻;)V

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzait;->name:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdce:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "minBound"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdcd:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "maxBound"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget-wide v1, p0, Lcom/google/android/gms/internal/zzait;->zzdcf:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "percent"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget v1, p0, Lcom/google/android/gms/internal/zzait;->count:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "count"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
