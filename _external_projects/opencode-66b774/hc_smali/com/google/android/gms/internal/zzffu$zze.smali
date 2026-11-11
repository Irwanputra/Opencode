.class public final Lcom/google/android/gms/internal/zzffu$zze;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzffu$zzh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzffu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zze"
.end annotation


# instance fields
.field public zzpha:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-void
.end method


# virtual methods
.method public final zza(ZDZD)D
    .registers 7

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p4

    invoke-static {p4, p5}, Lcom/google/android/gms/internal/zzffz;->zzde(J)I

    move-result p4

    add-int/2addr p4, p1

    iput p4, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-wide p2
.end method

.method public final zza(ZIZI)I
    .registers 5

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    add-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return p2
.end method

.method public final zza(ZJZJ)J
    .registers 7

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/zzffz;->zzde(J)I

    move-result p4

    add-int/2addr p4, p1

    iput p4, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-wide p2
.end method

.method public final zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;
    .registers 5

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzfes;->hashCode()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfgc;Lcom/google/android/gms/internal/zzfgc;)Lcom/google/android/gms/internal/zzfgc;
    .registers 4

    iget p2, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p2, p2, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfgd;Lcom/google/android/gms/internal/zzfgd;)Lcom/google/android/gms/internal/zzfgd;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzfgd<",
            "TT;>;",
            "Lcom/google/android/gms/internal/zzfgd<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/zzfgd<",
            "TT;>;"
        }
    .end annotation

    iget p2, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p2, p2, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfgy;Lcom/google/android/gms/internal/zzfgy;)Lcom/google/android/gms/internal/zzfgy;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzfgy<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/zzfgy<",
            "TK;TV;>;)",
            "Lcom/google/android/gms/internal/zzfgy<",
            "TK;TV;>;"
        }
    .end annotation

    iget p2, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p2, p2, 0x35

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfgy;->hashCode()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/zzfhe;",
            ">(TT;TT;)TT;"
        }
    .end annotation

    if-eqz p1, :cond_2d

    instance-of p2, p1, Lcom/google/android/gms/internal/zzffu;

    if-eqz p2, :cond_28

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/zzffu;

    iget v0, p2, Lcom/google/android/gms/internal/zzfek;->zzpfa:I

    if-nez v0, :cond_25

    iget v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphd:I

    invoke-virtual {p2, v1, p0, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p2, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-interface {p0, v1, v1}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfio;Lcom/google/android/gms/internal/zzfio;)Lcom/google/android/gms/internal/zzfio;

    move-result-object v1

    iput-object v1, p2, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    iget v1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    iput v1, p2, Lcom/google/android/gms/internal/zzfek;->zzpfa:I

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    :cond_25
    iget p2, p2, Lcom/google/android/gms/internal/zzfek;->zzpfa:I

    goto :goto_2f

    :cond_28
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    goto :goto_2f

    :cond_2d
    const/16 p2, 0x25

    :goto_2f
    iget v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 v0, v0, 0x35

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfio;Lcom/google/android/gms/internal/zzfio;)Lcom/google/android/gms/internal/zzfio;
    .registers 4

    iget p2, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p2, p2, 0x35

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfio;->hashCode()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p1
.end method

.method public final zza(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    move-object p3, p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {p3}, Lcom/google/android/gms/internal/zzffz;->zzdg(Z)I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .registers 5

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zza(ZZZZ)Z
    .registers 5

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-static {p2}, Lcom/google/android/gms/internal/zzffz;->zzdg(Z)I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return p2
.end method

.method public final zzb(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    move-object p3, p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zzc(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    move-object p3, p2

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffz;->zzde(J)I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zzd(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    move-object p3, p2

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffz;->zzde(J)I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zzdf(Z)V
    .registers 2

    if-nez p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final zze(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zzf(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget p1, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    mul-int/lit8 p1, p1, 0x35

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p3

    add-int/2addr p3, p1

    iput p3, p0, Lcom/google/android/gms/internal/zzffu$zze;->zzpha:I

    return-object p2
.end method

.method public final zzg(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p2, Lcom/google/android/gms/internal/zzfhe;

    check-cast p3, Lcom/google/android/gms/internal/zzfhe;

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/zzffu$zze;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    return-object p1
.end method
