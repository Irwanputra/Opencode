.class public final Lcom/google/android/gms/internal/zzdsw;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdsw$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdsw;",
        "Lcom/google/android/gms/internal/zzdsw$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdsw;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlvz:Lcom/google/android/gms/internal/zzdsw;


# instance fields
.field private zzlvx:I

.field private zzlvy:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdsw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsw;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method public static zzbol()Lcom/google/android/gms/internal/zzdsw;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    return-object v0
.end method

.method public static synthetic zzbom()Lcom/google/android/gms/internal/zzdsw;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdsx;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_c2

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v0

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdsw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdsw;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdsw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdsw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2b
    monitor-exit p1

    goto :goto_30

    :catchall_2d
    move-exception p2

    monitor-exit p1
    :try_end_2f
    .catchall {:try_start_1e .. :try_end_2f} :catchall_2d

    throw p2

    :cond_30
    :goto_30
    sget-object p1, Lcom/google/android/gms/internal/zzdsw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_83

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_5f

    const/16 p3, 0x8

    if-eq p1, p3, :cond_58

    const/16 p3, 0x10

    if-eq p1, p3, :cond_51

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_5f

    :cond_51
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    goto :goto_3a

    :cond_58
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I
    :try_end_5e
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_5e} :catch_77
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_5e} :catch_63
    .catchall {:try_start_3c .. :try_end_5e} :catchall_61

    goto :goto_3a

    :cond_5f
    :goto_5f
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_61
    move-exception p1

    goto :goto_82

    :catch_63
    move-exception p1

    :try_start_64
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_77
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_82
    .catchall {:try_start_64 .. :try_end_82} :catchall_61

    :goto_82
    throw p1

    :cond_83
    :pswitch_83
    sget-object p1, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    return-object p1

    :pswitch_86
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdsw;

    iget p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    if-eqz p1, :cond_90

    const/4 v0, 0x1

    goto :goto_91

    :cond_90
    const/4 v0, 0x0

    :goto_91
    iget v3, p3, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    if-eqz v3, :cond_97

    const/4 v4, 0x1

    goto :goto_98

    :cond_97
    const/4 v4, 0x0

    :goto_98
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    if-eqz p1, :cond_a4

    const/4 v0, 0x1

    goto :goto_a5

    :cond_a4
    const/4 v0, 0x0

    :goto_a5
    iget p3, p3, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    if-eqz p3, :cond_aa

    goto :goto_ab

    :cond_aa
    const/4 v1, 0x0

    :goto_ab
    invoke-interface {p2, v0, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    return-object p0

    :pswitch_b2
    new-instance p1, Lcom/google/android/gms/internal/zzdsw$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdsw$zza;-><init>(Lcom/google/android/gms/internal/zzdsx;)V

    return-object p1

    :pswitch_b8
    return-object v0

    :pswitch_b9
    sget-object p1, Lcom/google/android/gms/internal/zzdsw;->zzlvz:Lcom/google/android/gms/internal/zzdsw;

    return-object p1

    :pswitch_bc
    new-instance p1, Lcom/google/android/gms/internal/zzdsw;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdsw;-><init>()V

    return-object p1

    :pswitch_data_c2
    .packed-switch 0x1
        :pswitch_bc
        :pswitch_b9
        :pswitch_b8
        :pswitch_b2
        :pswitch_86
        :pswitch_33
        :pswitch_83
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    sget-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdsq;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_10

    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_10
    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    if-eqz v0, :cond_18

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzboj()Lcom/google/android/gms/internal/zzdsq;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdsq;->zzfr(I)Lcom/google/android/gms/internal/zzdsq;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvs:Lcom/google/android/gms/internal/zzdsq;

    :cond_a
    return-object v0
.end method

.method public final zzbok()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    return v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    sget-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdsq;->zzhq()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_19

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvx:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v2, v0

    :cond_19
    iget v0, p0, Lcom/google/android/gms/internal/zzdsw;->zzlvy:I

    if-eqz v0, :cond_23

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v2, v0

    :cond_23
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
