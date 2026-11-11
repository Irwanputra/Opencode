.class public final Lcom/google/android/gms/internal/zzdth$zzb;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzdth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdth$zzb$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdth$zzb;",
        "Lcom/google/android/gms/internal/zzdth$zzb$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdth$zzb;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;


# instance fields
.field private zzlwr:I

.field private zzlxc:Lcom/google/android/gms/internal/zzdsy;

.field private zzlxd:I

.field private zzlxe:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdth$zzb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdth$zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdth$zzb;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method public static zzbpl()Lcom/google/android/gms/internal/zzdth$zzb;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    return-object v0
.end method

.method public static synthetic zzbpm()Lcom/google/android/gms/internal/zzdth$zzb;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdti;->zzbbi:[I

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
    return-object v0

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdth$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdth$zzb;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdth$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdth$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdth$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_bf

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_9b

    const/16 v3, 0xa

    if-eq p1, v3, :cond_6e

    const/16 v3, 0x10

    if-eq p1, v3, :cond_67

    const/16 v3, 0x18

    if-eq p1, v3, :cond_60

    const/16 v3, 0x20

    if-eq p1, v3, :cond_59

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_9b

    :cond_59
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    goto :goto_3a

    :cond_60
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    goto :goto_3a

    :cond_67
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    goto :goto_3a

    :cond_6e
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    if-eqz p1, :cond_80

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v0, v0}, Lcom/google/android/gms/internal/zzdsy;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdsy$zza;

    goto :goto_81

    :cond_80
    move-object v3, v0

    :goto_81
    invoke-static {}, Lcom/google/android/gms/internal/zzdsy;->zzbor()Lcom/google/android/gms/internal/zzdsy;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsy;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsy;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;
    :try_end_9a
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_9a} :catch_b3
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_9a} :catch_9f
    .catchall {:try_start_3c .. :try_end_9a} :catchall_9d

    goto :goto_3a

    :cond_9b
    :goto_9b
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_9d
    move-exception p1

    goto :goto_be

    :catch_9f
    move-exception p1

    :try_start_a0
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_b3
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_be
    .catchall {:try_start_a0 .. :try_end_be} :catchall_9d

    :goto_be
    throw p1

    :cond_bf
    :pswitch_bf
    sget-object p1, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    return-object p1

    :pswitch_c2
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdth$zzb;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    iget-object v0, p3, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdsy;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    iget p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    if-eqz p1, :cond_d8

    const/4 v0, 0x1

    goto :goto_d9

    :cond_d8
    const/4 v0, 0x0

    :goto_d9
    iget v3, p3, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    if-eqz v3, :cond_df

    const/4 v4, 0x1

    goto :goto_e0

    :cond_df
    const/4 v4, 0x0

    :goto_e0
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    if-eqz p1, :cond_ec

    const/4 v0, 0x1

    goto :goto_ed

    :cond_ec
    const/4 v0, 0x0

    :goto_ed
    iget v3, p3, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    if-eqz v3, :cond_f3

    const/4 v4, 0x1

    goto :goto_f4

    :cond_f3
    const/4 v4, 0x0

    :goto_f4
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    if-eqz p1, :cond_100

    const/4 v0, 0x1

    goto :goto_101

    :cond_100
    const/4 v0, 0x0

    :goto_101
    iget p3, p3, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    if-eqz p3, :cond_106

    goto :goto_107

    :cond_106
    const/4 v1, 0x0

    :goto_107
    invoke-interface {p2, v0, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    return-object p0

    :pswitch_10e
    new-instance p1, Lcom/google/android/gms/internal/zzdth$zzb$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdth$zzb$zza;-><init>(Lcom/google/android/gms/internal/zzdti;)V

    return-object p1

    :pswitch_114
    return-object v0

    :pswitch_115
    sget-object p1, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxf:Lcom/google/android/gms/internal/zzdth$zzb;

    return-object p1

    :pswitch_118
    new-instance p1, Lcom/google/android/gms/internal/zzdth$zzb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdth$zzb;-><init>()V

    return-object p1

    :pswitch_data_11e
    .packed-switch 0x1
        :pswitch_118
        :pswitch_115
        :pswitch_114
        :pswitch_10e
        :pswitch_c2
        :pswitch_33
        :pswitch_bf
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    if-eqz v0, :cond_e

    const/4 v1, 0x1

    if-nez v0, :cond_b

    invoke-static {}, Lcom/google/android/gms/internal/zzdsy;->zzbor()Lcom/google/android/gms/internal/zzdsy;

    move-result-object v0

    :cond_b
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_e
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    sget-object v1, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdtb;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_1e

    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_1e
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    if-eqz v0, :cond_26

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_26
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    sget-object v1, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_36

    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_36
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbpg()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    return v0

    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public final zzbph()Lcom/google/android/gms/internal/zzdsy;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdsy;->zzbor()Lcom/google/android/gms/internal/zzdsy;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzbpi()Lcom/google/android/gms/internal/zzdtb;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdtb;->zzfu(I)Lcom/google/android/gms/internal/zzdtb;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwp:Lcom/google/android/gms/internal/zzdtb;

    :cond_a
    return-object v0
.end method

.method public final zzbpj()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    return v0
.end method

.method public final zzbpk()Lcom/google/android/gms/internal/zzdtt;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdtt;->zzgd(I)Lcom/google/android/gms/internal/zzdtt;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdtt;->zzlxx:Lcom/google/android/gms/internal/zzdtt;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxc:Lcom/google/android/gms/internal/zzdsy;

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    const/4 v2, 0x1

    if-nez v0, :cond_12

    invoke-static {}, Lcom/google/android/gms/internal/zzdsy;->zzbor()Lcom/google/android/gms/internal/zzdsy;

    move-result-object v0

    :cond_12
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    sget-object v2, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdtb;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_29

    const/4 v0, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxd:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_29
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlxe:I

    if-eqz v0, :cond_33

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_33
    iget v0, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    sget-object v2, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_45

    const/4 v0, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/zzdth$zzb;->zzlwr:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_45
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
