.class public Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/おぐぴう〸ず/げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    iput v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    iput v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 12

    instance-of v0, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;

    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    .line 1
    iget v2, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    const/4 v3, 0x1

    if-ne v0, v2, :cond_58

    .line 2
    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    .line 3
    iget v2, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    .line 4
    iget v4, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    const/4 v5, -0x1

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x4

    if-eq v4, v5, :cond_1d

    move v8, v4

    goto :goto_40

    :cond_1d
    iget v5, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    .line 5
    sget-object v9, Landroidx/media/AudioAttributesCompat;->〺つふすそ:Landroid/util/SparseIntArray;

    and-int/lit8 v9, v2, 0x1

    if-ne v9, v3, :cond_27

    const/4 v8, 0x7

    goto :goto_40

    :cond_27
    and-int/lit8 v9, v2, 0x4

    if-ne v9, v8, :cond_2d

    const/4 v8, 0x6

    goto :goto_40

    :cond_2d
    packed-switch v5, :pswitch_data_5a

    :pswitch_30
    goto :goto_3f

    :pswitch_31
    const/4 v8, 0x1

    goto :goto_40

    :pswitch_33
    const/16 v8, 0xa

    goto :goto_40

    :pswitch_36
    const/4 v8, 0x2

    goto :goto_40

    :pswitch_38
    const/4 v8, 0x5

    goto :goto_40

    :pswitch_3a
    const/16 v8, 0x8

    goto :goto_40

    :pswitch_3d
    const/4 v8, 0x0

    goto :goto_40

    :goto_3f
    const/4 v8, 0x3

    :goto_40
    :pswitch_40
    if-ne v8, v7, :cond_45

    or-int/lit8 v2, v2, 0x4

    goto :goto_49

    :cond_45
    if-ne v8, v6, :cond_49

    or-int/lit8 v2, v2, 0x1

    :cond_49
    :goto_49
    and-int/lit16 v2, v2, 0x111

    if-ne v0, v2, :cond_58

    .line 6
    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    .line 7
    iget p1, p1, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    if-ne v0, p1, :cond_58

    .line 8
    iget p1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    if-ne p1, v4, :cond_58

    const/4 v1, 0x1

    :cond_58
    return v1

    nop

    :pswitch_data_5a
    .packed-switch 0x2
        :pswitch_3d
        :pswitch_3a
        :pswitch_40
        :pswitch_38
        :pswitch_36
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_33
        :pswitch_30
        :pswitch_31
    .end packed-switch
.end method

.method public hashCode()I
    .registers 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioAttributesCompat:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1b

    const-string v1, " stream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " derived"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1b
    const-string v1, " usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    .line 1
    sget-object v2, Landroidx/media/AudioAttributesCompat;->〺つふすそ:Landroid/util/SparseIntArray;

    packed-switch v1, :pswitch_data_82

    :pswitch_27
    const-string v2, "unknown usage "

    invoke-static {v2, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_5d

    :pswitch_2e
    const-string v1, "USAGE_ASSISTANT"

    goto :goto_5d

    :pswitch_31
    const-string v1, "USAGE_GAME"

    goto :goto_5d

    :pswitch_34
    const-string v1, "USAGE_ASSISTANCE_SONIFICATION"

    goto :goto_5d

    :pswitch_37
    const-string v1, "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"

    goto :goto_5d

    :pswitch_3a
    const-string v1, "USAGE_ASSISTANCE_ACCESSIBILITY"

    goto :goto_5d

    :pswitch_3d
    const-string v1, "USAGE_NOTIFICATION_EVENT"

    goto :goto_5d

    :pswitch_40
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"

    goto :goto_5d

    :pswitch_43
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"

    goto :goto_5d

    :pswitch_46
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"

    goto :goto_5d

    :pswitch_49
    const-string v1, "USAGE_NOTIFICATION_RINGTONE"

    goto :goto_5d

    :pswitch_4c
    const-string v1, "USAGE_NOTIFICATION"

    goto :goto_5d

    :pswitch_4f
    const-string v1, "USAGE_ALARM"

    goto :goto_5d

    :pswitch_52
    const-string v1, "USAGE_VOICE_COMMUNICATION_SIGNALLING"

    goto :goto_5d

    :pswitch_55
    const-string v1, "USAGE_VOICE_COMMUNICATION"

    goto :goto_5d

    :pswitch_58
    const-string v1, "USAGE_MEDIA"

    goto :goto_5d

    :pswitch_5b
    const-string v1, "USAGE_UNKNOWN"

    .line 2
    :goto_5d
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " flags=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_82
    .packed-switch 0x0
        :pswitch_5b
        :pswitch_58
        :pswitch_55
        :pswitch_52
        :pswitch_4f
        :pswitch_4c
        :pswitch_49
        :pswitch_46
        :pswitch_43
        :pswitch_40
        :pswitch_3d
        :pswitch_3a
        :pswitch_37
        :pswitch_34
        :pswitch_31
        :pswitch_27
        :pswitch_2e
    .end packed-switch
.end method
