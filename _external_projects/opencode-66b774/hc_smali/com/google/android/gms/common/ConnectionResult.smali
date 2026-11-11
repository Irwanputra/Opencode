.class public final Lcom/google/android/gms/common/ConnectionResult;
.super Lcom/google/android/gms/internal/zzbfm;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final なぎぱいぢぎ:Lcom/google/android/gms/common/ConnectionResult;


# instance fields
.field public 〺つふすそ:I

.field public final くし〴〺ぅ:I

.field public final づざかべべ:Ljava/lang/String;

.field public final びぐびあび:Landroid/app/PendingIntent;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/ConnectionResult;->なぎぱいぢぎ:Lcom/google/android/gms/common/ConnectionResult;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぁごぐすすぃ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぁごぐすすぃ;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/common/ConnectionResult;->〺つふすそ:I

    iput p1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    iput-object p1, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/ConnectionResult;->〺つふすそ:I

    iput p2, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    iput-object p3, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    iput-object p4, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILandroid/app/PendingIntent;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/common/ConnectionResult;->〺つふすそ:I

    iput p1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    iput-object p2, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/google/android/gms/common/ConnectionResult;

    iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    iget v3, p1, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    if-ne v1, v3, :cond_27

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    iget-object v3, p1, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    invoke-static {v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごづごきえ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    invoke-static {v1, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごづごきえ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_27

    return v0

    :cond_27
    return v2
.end method

.method public final hashCode()I
    .registers 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 5

    .line 1
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;-><init>(Ljava/lang/Object;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぉざぅち〻;)V

    .line 2
    iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    const/16 v2, 0x63

    if-eq v1, v2, :cond_74

    const/16 v2, 0x5dc

    if-eq v1, v2, :cond_71

    packed-switch v1, :pswitch_data_8e

    packed-switch v1, :pswitch_data_ac

    const/16 v2, 0x1f

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "UNKNOWN_ERROR_CODE("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_76

    :pswitch_2f
    const-string v1, "LICENSE_CHECK_FAILED"

    goto :goto_76

    :pswitch_32
    const-string v1, "DEVELOPER_ERROR"

    goto :goto_76

    :pswitch_35
    const-string v1, "SERVICE_INVALID"

    goto :goto_76

    :pswitch_38
    const-string v1, "INTERNAL_ERROR"

    goto :goto_76

    :pswitch_3b
    const-string v1, "NETWORK_ERROR"

    goto :goto_76

    :pswitch_3e
    const-string v1, "RESOLUTION_REQUIRED"

    goto :goto_76

    :pswitch_41
    const-string v1, "INVALID_ACCOUNT"

    goto :goto_76

    :pswitch_44
    const-string v1, "SIGN_IN_REQUIRED"

    goto :goto_76

    :pswitch_47
    const-string v1, "SERVICE_DISABLED"

    goto :goto_76

    :pswitch_4a
    const-string v1, "SERVICE_VERSION_UPDATE_REQUIRED"

    goto :goto_76

    :pswitch_4d
    const-string v1, "SERVICE_MISSING"

    goto :goto_76

    :pswitch_50
    const-string v1, "SUCCESS"

    goto :goto_76

    :pswitch_53
    const-string v1, "UNKNOWN"

    goto :goto_76

    :pswitch_56
    const-string v1, "API_VERSION_UPDATE_REQUIRED"

    goto :goto_76

    :pswitch_59
    const-string v1, "RESTRICTED_PROFILE"

    goto :goto_76

    :pswitch_5c
    const-string v1, "SERVICE_MISSING_PERMISSION"

    goto :goto_76

    :pswitch_5f
    const-string v1, "SERVICE_UPDATING"

    goto :goto_76

    :pswitch_62
    const-string v1, "SIGN_IN_FAILED"

    goto :goto_76

    :pswitch_65
    const-string v1, "API_UNAVAILABLE"

    goto :goto_76

    :pswitch_68
    const-string v1, "INTERRUPTED"

    goto :goto_76

    :pswitch_6b
    const-string v1, "TIMEOUT"

    goto :goto_76

    :pswitch_6e
    const-string v1, "CANCELED"

    goto :goto_76

    :cond_71
    const-string v1, "DRIVE_EXTERNAL_STORAGE_REQUIRED"

    goto :goto_76

    :cond_74
    const-string v1, "UNFINISHED"

    :goto_76
    const-string v2, "statusCode"

    .line 4
    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    const-string v2, "resolution"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    const-string v2, "message"

    invoke-virtual {v0, v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ざとぅぼこ〺;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_8e
    .packed-switch -0x1
        :pswitch_53
        :pswitch_50
        :pswitch_4d
        :pswitch_4a
        :pswitch_47
        :pswitch_44
        :pswitch_41
        :pswitch_3e
        :pswitch_3b
        :pswitch_38
        :pswitch_35
        :pswitch_32
        :pswitch_2f
    .end packed-switch

    :pswitch_data_ac
    .packed-switch 0xd
        :pswitch_6e
        :pswitch_6b
        :pswitch_68
        :pswitch_65
        :pswitch_62
        :pswitch_5f
        :pswitch_5c
        :pswitch_59
        :pswitch_56
    .end packed-switch
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 7

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbfp;->zze(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->〺つふすそ:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    .line 1
    iget v1, p0, Lcom/google/android/gms/common/ConnectionResult;->くし〴〺ぅ:I

    const/4 v2, 0x2

    .line 2
    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/ConnectionResult;->びぐびあび:Landroid/app/PendingIntent;

    const/4 v2, 0x3

    const/4 v3, 0x0

    .line 4
    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 5
    iget-object p2, p0, Lcom/google/android/gms/common/ConnectionResult;->づざかべべ:Ljava/lang/String;

    const/4 v1, 0x4

    .line 6
    invoke-static {p1, v1, p2, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzbfp;->zzai(Landroid/os/Parcel;I)V

    return-void
.end method
