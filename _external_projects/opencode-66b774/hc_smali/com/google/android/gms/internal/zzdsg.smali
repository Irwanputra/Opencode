.class public final Lcom/google/android/gms/internal/zzdsg;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdsg$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdsg;",
        "Lcom/google/android/gms/internal/zzdsg$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdsg;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzluw:Lcom/google/android/gms/internal/zzdsg;


# instance fields
.field private zzlut:Lcom/google/android/gms/internal/zzdsm;

.field private zzluu:Lcom/google/android/gms/internal/zzdsc;

.field private zzluv:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdsg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsg;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method public static zzbno()Lcom/google/android/gms/internal/zzdsg;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    return-object v0
.end method

.method public static synthetic zzbnp()Lcom/google/android/gms/internal/zzdsg;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdsh;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_11e

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v2

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdsg;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdsg;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdsg;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdsg;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsg;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_da

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_b6

    const/16 v3, 0xa

    if-eq p1, v3, :cond_89

    const/16 v3, 0x12

    if-eq p1, v3, :cond_5c

    const/16 v3, 0x18

    if-eq p1, v3, :cond_55

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_b6

    :cond_55
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    goto :goto_3a

    :cond_5c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    if-eqz p1, :cond_6e

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdsc;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdsc$zza;

    goto :goto_6f

    :cond_6e
    move-object v3, v2

    :goto_6f
    invoke-static {}, Lcom/google/android/gms/internal/zzdsc;->zzbnh()Lcom/google/android/gms/internal/zzdsc;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsc;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsc;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    goto :goto_3a

    :cond_89
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    if-eqz p1, :cond_9b

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdsm;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdsm$zza;

    goto :goto_9c

    :cond_9b
    move-object v3, v2

    :goto_9c
    invoke-static {}, Lcom/google/android/gms/internal/zzdsm;->zzbob()Lcom/google/android/gms/internal/zzdsm;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsm;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsm;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;
    :try_end_b5
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_b5} :catch_ce
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_b5} :catch_ba
    .catchall {:try_start_3c .. :try_end_b5} :catchall_b8

    goto :goto_3a

    :cond_b6
    :goto_b6
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_b8
    move-exception p1

    goto :goto_d9

    :catch_ba
    move-exception p1

    :try_start_bb
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_ce
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_d9
    .catchall {:try_start_bb .. :try_end_d9} :catchall_b8

    :goto_d9
    throw p1

    :cond_da
    :pswitch_da
    sget-object p1, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    return-object p1

    :pswitch_dd
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdsg;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsm;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsc;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    iget p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    if-eqz p1, :cond_ff

    const/4 v2, 0x1

    goto :goto_100

    :cond_ff
    const/4 v2, 0x0

    :goto_100
    iget p3, p3, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    if-eqz p3, :cond_105

    goto :goto_106

    :cond_105
    const/4 v1, 0x0

    :goto_106
    invoke-interface {p2, v2, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    return-object p0

    :pswitch_10d
    new-instance p1, Lcom/google/android/gms/internal/zzdsg$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdsg$zza;-><init>(Lcom/google/android/gms/internal/zzdsh;)V

    return-object p1

    :pswitch_113
    return-object v2

    :pswitch_114
    sget-object p1, Lcom/google/android/gms/internal/zzdsg;->zzluw:Lcom/google/android/gms/internal/zzdsg;

    return-object p1

    :pswitch_117
    new-instance p1, Lcom/google/android/gms/internal/zzdsg;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdsg;-><init>()V

    return-object p1

    nop

    :pswitch_data_11e
    .packed-switch 0x1
        :pswitch_117
        :pswitch_114
        :pswitch_113
        :pswitch_10d
        :pswitch_dd
        :pswitch_33
        :pswitch_da
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    if-eqz v0, :cond_e

    const/4 v1, 0x1

    if-nez v0, :cond_b

    invoke-static {}, Lcom/google/android/gms/internal/zzdsm;->zzbob()Lcom/google/android/gms/internal/zzdsm;

    move-result-object v0

    :cond_b
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    if-eqz v0, :cond_1c

    const/4 v1, 0x2

    if-nez v0, :cond_19

    invoke-static {}, Lcom/google/android/gms/internal/zzdsc;->zzbnh()Lcom/google/android/gms/internal/zzdsc;

    move-result-object v0

    :cond_19
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_1c
    iget v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    sget-object v1, Lcom/google/android/gms/internal/zzdsa;->zzluk:Lcom/google/android/gms/internal/zzdsa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdsa;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_2c

    iget v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbnl()Lcom/google/android/gms/internal/zzdsm;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdsm;->zzbob()Lcom/google/android/gms/internal/zzdsm;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzbnm()Lcom/google/android/gms/internal/zzdsc;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdsc;->zzbnh()Lcom/google/android/gms/internal/zzdsc;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzbnn()Lcom/google/android/gms/internal/zzdsa;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdsa;->zzfn(I)Lcom/google/android/gms/internal/zzdsa;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdsa;->zzlun:Lcom/google/android/gms/internal/zzdsa;

    :cond_a
    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzlut:Lcom/google/android/gms/internal/zzdsm;

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    const/4 v2, 0x1

    if-nez v0, :cond_12

    invoke-static {}, Lcom/google/android/gms/internal/zzdsm;->zzbob()Lcom/google/android/gms/internal/zzdsm;

    move-result-object v0

    :cond_12
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluu:Lcom/google/android/gms/internal/zzdsc;

    if-eqz v0, :cond_27

    const/4 v2, 0x2

    if-nez v0, :cond_22

    invoke-static {}, Lcom/google/android/gms/internal/zzdsc;->zzbnh()Lcom/google/android/gms/internal/zzdsc;

    move-result-object v0

    :cond_22
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_27
    iget v0, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    sget-object v2, Lcom/google/android/gms/internal/zzdsa;->zzluk:Lcom/google/android/gms/internal/zzdsa;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdsa;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_39

    const/4 v0, 0x3

    iget v2, p0, Lcom/google/android/gms/internal/zzdsg;->zzluv:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_39
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
