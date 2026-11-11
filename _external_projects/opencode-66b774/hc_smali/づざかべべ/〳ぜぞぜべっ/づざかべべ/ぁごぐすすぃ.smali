.class public Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Landroid/widget/RemoteViews;

.field public final 〺つふすそ:Landroidx/core/app/NotificationCompat$Builder;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Landroid/widget/RemoteViews;

.field public final げつ〴ぬぐ:Landroid/app/Notification$Builder;

.field public final づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final なぎぱいぢぎ:Landroid/os/Bundle;

.field public びぐびあび:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>(Landroidx/core/app/NotificationCompat$Builder;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->づざかべべ:Ljava/util/List;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    iput-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Landroidx/core/app/NotificationCompat$Builder;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v3, Landroid/app/Notification$Builder;

    iget-object v4, v1, Landroidx/core/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;

    const/16 v5, 0x1a

    if-lt v2, v5, :cond_27

    iget-object v6, v1, Landroidx/core/app/NotificationCompat$Builder;->mChannelId:Ljava/lang/String;

    invoke-direct {v3, v4, v6}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2a

    :cond_27
    invoke-direct {v3, v4}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_2a
    iput-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-object v4, v1, Landroidx/core/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iget-wide v6, v4, Landroid/app/Notification;->when:J

    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->icon:I

    iget v8, v4, Landroid/app/Notification;->iconLevel:I

    invoke-virtual {v6, v7, v8}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v4, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iget-object v8, v1, Landroidx/core/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;

    invoke-virtual {v6, v7, v8}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v4, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->ledARGB:I

    iget v8, v4, Landroid/app/Notification;->ledOnMS:I

    iget v9, v4, Landroid/app/Notification;->ledOffMS:I

    invoke-virtual {v6, v7, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->flags:I

    const/4 v8, 0x2

    and-int/2addr v7, v8

    if-eqz v7, :cond_62

    const/4 v7, 0x1

    goto :goto_63

    :cond_62
    const/4 v7, 0x0

    :goto_63
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->flags:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_6f

    const/4 v7, 0x1

    goto :goto_70

    :cond_6f
    const/4 v7, 0x0

    :goto_70
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->flags:I

    const/16 v11, 0x10

    and-int/2addr v7, v11

    if-eqz v7, :cond_7d

    const/4 v7, 0x1

    goto :goto_7e

    :cond_7d
    const/4 v7, 0x0

    :goto_7e
    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v4, Landroid/app/Notification;->defaults:I

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v4, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;

    iget v12, v4, Landroid/app/Notification;->flags:I

    and-int/lit16 v12, v12, 0x80

    if-eqz v12, :cond_b0

    const/4 v12, 0x1

    goto :goto_b1

    :cond_b0
    const/4 v12, 0x0

    :goto_b1
    invoke-virtual {v6, v7, v12}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v6

    iget-object v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mNumber:I

    invoke-virtual {v6, v7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v6

    iget v7, v1, Landroidx/core/app/NotificationCompat$Builder;->mProgressMax:I

    iget v12, v1, Landroidx/core/app/NotificationCompat$Builder;->mProgress:I

    iget-boolean v13, v1, Landroidx/core/app/NotificationCompat$Builder;->mProgressIndeterminate:Z

    invoke-virtual {v6, v7, v12, v13}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    const/16 v6, 0x15

    if-ge v2, v6, :cond_d5

    iget-object v7, v4, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v12, v4, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v3, v7, v12}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    :cond_d5
    const/16 v7, 0x18

    const/16 v12, 0x1d

    const-string v13, "android.support.allowGeneratedReplies"

    const/16 v14, 0x14

    if-lt v2, v11, :cond_265

    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;

    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-boolean v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mUseChronometer:Z

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mPriority:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/core/app/NotificationCompat$〺つふすそ;

    .line 1
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v8, v14, :cond_1ca

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v16

    const/16 v10, 0x17

    if-lt v8, v10, :cond_120

    new-instance v8, Landroid/app/Notification$Action$Builder;

    if-eqz v16, :cond_117

    invoke-virtual/range {v16 .. v16}, Landroidx/core/graphics/drawable/IconCompat;->てぜきぽく()Landroid/graphics/drawable/Icon;

    move-result-object v10

    goto :goto_118

    :cond_117
    const/4 v10, 0x0

    .line 2
    :goto_118
    iget-object v15, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->いいにぽつ:Ljava/lang/CharSequence;

    .line 3
    iget-object v5, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺふねづ〺:Landroid/app/PendingIntent;

    .line 4
    invoke-direct {v8, v10, v15, v5}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    goto :goto_131

    :cond_120
    new-instance v8, Landroid/app/Notification$Action$Builder;

    if-eqz v16, :cond_129

    invoke-virtual/range {v16 .. v16}, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび()I

    move-result v5

    goto :goto_12a

    :cond_129
    const/4 v5, 0x0

    .line 5
    :goto_12a
    iget-object v10, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->いいにぽつ:Ljava/lang/CharSequence;

    .line 6
    iget-object v15, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺふねづ〺:Landroid/app/PendingIntent;

    .line 7
    invoke-direct {v8, v5, v10, v15}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 8
    :goto_131
    iget-object v5, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->くし〴〺ぅ:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    if-eqz v5, :cond_17e

    .line 9
    array-length v10, v5

    new-array v15, v10, [Landroid/app/RemoteInput;

    const/4 v6, 0x0

    :goto_139
    array-length v9, v5

    if-ge v6, v9, :cond_173

    aget-object v9, v5, v6

    .line 10
    new-instance v14, Landroid/app/RemoteInput$Builder;

    .line 11
    iget-object v11, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 12
    invoke-direct {v14, v11}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    .line 13
    iget-object v11, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->〺つふすそ:Ljava/lang/CharSequence;

    .line 14
    invoke-virtual {v14, v11}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v11

    .line 15
    iget-object v14, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ:[Ljava/lang/CharSequence;

    .line 16
    invoke-virtual {v11, v14}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v11

    .line 17
    iget-boolean v14, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->びぐびあび:Z

    .line 18
    invoke-virtual {v11, v14}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    move-result-object v11

    .line 19
    iget-object v14, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ:Landroid/os/Bundle;

    .line 20
    invoke-virtual {v11, v14}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    move-result-object v11

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v14, v12, :cond_166

    .line 21
    iget v9, v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->づざかべべ:I

    .line 22
    invoke-virtual {v11, v9}, Landroid/app/RemoteInput$Builder;->setEditChoicesBeforeSending(I)Landroid/app/RemoteInput$Builder;

    :cond_166
    invoke-virtual {v11}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    move-result-object v9

    .line 23
    aput-object v9, v15, v6

    add-int/lit8 v6, v6, 0x1

    const/16 v11, 0x10

    const/16 v14, 0x14

    goto :goto_139

    :cond_173
    const/4 v5, 0x0

    :goto_174
    if-ge v5, v10, :cond_17e

    .line 24
    aget-object v6, v15, v5

    invoke-virtual {v8, v6}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_174

    .line 25
    :cond_17e
    iget-object v5, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    if-eqz v5, :cond_18a

    .line 26
    new-instance v5, Landroid/os/Bundle;

    .line 27
    iget-object v6, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    .line 28
    invoke-direct {v5, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_18f

    :cond_18a
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 29
    :goto_18f
    iget-boolean v6, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->づざかべべ:Z

    .line 30
    invoke-virtual {v5, v13, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v7, :cond_19d

    .line 31
    iget-boolean v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->づざかべべ:Z

    .line 32
    invoke-virtual {v8, v9}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 33
    :cond_19d
    iget v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぁごぐすすぃ:I

    const-string v10, "android.support.action.semanticAction"

    .line 34
    invoke-virtual {v5, v10, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/16 v9, 0x1c

    if-lt v6, v9, :cond_1ad

    .line 35
    iget v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぁごぐすすぃ:I

    .line 36
    invoke-virtual {v8, v9}, Landroid/app/Notification$Action$Builder;->setSemanticAction(I)Landroid/app/Notification$Action$Builder;

    :cond_1ad
    if-lt v6, v12, :cond_1b4

    .line 37
    iget-boolean v6, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->〳ぜぞぜべっ:Z

    .line 38
    invoke-virtual {v8, v6}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;

    .line 39
    :cond_1b4
    iget-boolean v3, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->なぎぱいぢぎ:Z

    const-string v6, "android.support.action.showsUserInterface"

    .line 40
    invoke-virtual {v5, v6, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v8, v5}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v8}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    const/16 v5, 0x10

    goto :goto_210

    :cond_1ca
    const/16 v5, 0x10

    if-lt v8, v5, :cond_210

    iget-object v6, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->づざかべべ:Ljava/util/List;

    iget-object v8, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    .line 41
    sget-object v9, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v9

    if-eqz v9, :cond_1df

    invoke-virtual {v9}, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび()I

    move-result v9

    goto :goto_1e0

    :cond_1df
    const/4 v9, 0x0

    .line 42
    :goto_1e0
    iget-object v10, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->いいにぽつ:Ljava/lang/CharSequence;

    .line 43
    iget-object v11, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺふねづ〺:Landroid/app/PendingIntent;

    .line 44
    invoke-virtual {v8, v9, v10, v11}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    new-instance v8, Landroid/os/Bundle;

    .line 45
    iget-object v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    .line 46
    invoke-direct {v8, v9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 47
    iget-object v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->くし〴〺ぅ:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    if-eqz v9, :cond_1fb

    .line 48
    invoke-static {v9}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ([Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;)[Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "android.support.remoteInputs"

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 49
    :cond_1fb
    iget-object v9, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->びぐびあび:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    if-eqz v9, :cond_208

    .line 50
    invoke-static {v9}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ([Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;)[Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "android.support.dataRemoteInputs"

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 51
    :cond_208
    iget-boolean v3, v3, Landroidx/core/app/NotificationCompat$〺つふすそ;->づざかべべ:Z

    .line 52
    invoke-virtual {v8, v13, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 53
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_210
    :goto_210
    const/16 v5, 0x1a

    const/16 v6, 0x15

    const/4 v8, 0x2

    const/16 v11, 0x10

    const/16 v14, 0x14

    goto/16 :goto_f6

    .line 54
    :cond_21b
    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    if-eqz v2, :cond_224

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_224
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x14

    if-ge v2, v3, :cond_25d

    iget-boolean v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mLocalOnly:Z

    if-eqz v2, :cond_236

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v3, "android.support.localOnly"

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_236
    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;

    if-eqz v2, :cond_252

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v5, "android.support.groupKey"

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupSummary:Z

    if-eqz v2, :cond_24a

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v3, "android.support.isGroupSummary"

    goto :goto_24e

    :cond_24a
    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v3, "android.support.useSideChannel"

    :goto_24e
    const/4 v5, 0x1

    invoke-virtual {v2, v3, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_252
    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;

    if-eqz v2, :cond_25d

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v5, "android.support.sortKey"

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_25d
    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentView:Landroid/widget/RemoteViews;

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/widget/RemoteViews;

    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mBigContentView:Landroid/widget/RemoteViews;

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->びぐびあび:Landroid/widget/RemoteViews;

    :cond_265
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v2, v3, :cond_295

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-boolean v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mShowWhen:Z

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    const/16 v3, 0x15

    if-ge v2, v3, :cond_295

    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mPeople:Ljava/util/ArrayList;

    if-eqz v3, :cond_295

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_295

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mPeople:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-array v6, v6, [Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/String;

    const-string v6, "android.people"

    invoke-virtual {v3, v6, v5}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_295
    const/16 v3, 0x14

    if-lt v2, v3, :cond_2b6

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-boolean v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mLocalOnly:Z

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-boolean v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupSummary:Z

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupAlertBehavior:I

    iput v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    :cond_2b6
    const/16 v3, 0x15

    if-lt v2, v3, :cond_39b

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mCategory:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mColor:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mVisibility:I

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mPublicVersion:Landroid/app/Notification;

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, v4, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v5, v4, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-virtual {v2, v3, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mPeople:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2e1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2f3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v5, v3}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_2e1

    :cond_2f3
    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mHeadsUpContentView:Landroid/widget/RemoteViews;

    iput-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/widget/RemoteViews;

    iget-object v2, v1, Landroidx/core/app/NotificationCompat$Builder;->mInvisibleActions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_39b

    invoke-virtual/range {p1 .. p1}, Landroidx/core/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "android.car.EXTENSIONS"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_310

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_310
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const/4 v6, 0x0

    :goto_316
    iget-object v8, v1, Landroidx/core/app/NotificationCompat$Builder;->mInvisibleActions:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_38a

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v1, Landroidx/core/app/NotificationCompat$Builder;->mInvisibleActions:Ljava/util/ArrayList;

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/core/app/NotificationCompat$〺つふすそ;

    .line 55
    sget-object v10, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v9}, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v11

    if-eqz v11, :cond_33c

    invoke-virtual {v11}, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび()I

    move-result v11

    goto :goto_33d

    :cond_33c
    const/4 v11, 0x0

    :goto_33d
    const-string v14, "icon"

    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 56
    iget-object v11, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->いいにぽつ:Ljava/lang/CharSequence;

    const-string v14, "title"

    .line 57
    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 58
    iget-object v11, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺふねづ〺:Landroid/app/PendingIntent;

    const-string v14, "actionIntent"

    .line 59
    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 60
    iget-object v11, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    if-eqz v11, :cond_35c

    .line 61
    new-instance v11, Landroid/os/Bundle;

    .line 62
    iget-object v14, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    .line 63
    invoke-direct {v11, v14}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_361

    :cond_35c
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 64
    :goto_361
    iget-boolean v14, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->づざかべべ:Z

    .line 65
    invoke-virtual {v11, v13, v14}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v14, "extras"

    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 66
    iget-object v11, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->くし〴〺ぅ:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    .line 67
    invoke-static {v11}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ([Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;)[Landroid/os/Bundle;

    move-result-object v11

    const-string v14, "remoteInputs"

    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 68
    iget-boolean v11, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->なぎぱいぢぎ:Z

    const-string v14, "showsUserInterface"

    .line 69
    invoke-virtual {v10, v14, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 70
    iget v9, v9, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぁごぐすすぃ:I

    const-string v11, "semanticAction"

    .line 71
    invoke-virtual {v10, v11, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 72
    invoke-virtual {v5, v8, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_316

    :cond_38a
    const-string v6, "invisible_actions"

    invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual/range {p1 .. p1}, Landroidx/core/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->なぎぱいぢぎ:Landroid/os/Bundle;

    invoke-virtual {v5, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_39b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v7, :cond_3c7

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mRemoteInputHistory:[Ljava/lang/CharSequence;

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mContentView:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_3b5

    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v5, v3}, Landroid/app/Notification$Builder;->setCustomContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_3b5
    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mBigContentView:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_3be

    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v5, v3}, Landroid/app/Notification$Builder;->setCustomBigContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_3be
    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mHeadsUpContentView:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_3c7

    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v5, v3}, Landroid/app/Notification$Builder;->setCustomHeadsUpContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_3c7
    const/16 v3, 0x1a

    if-lt v2, v3, :cond_40b

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mBadgeIcon:I

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mShortcutId:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-wide v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mTimeout:J

    invoke-virtual {v3, v5, v6}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupAlertBehavior:I

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    iget-boolean v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mColorizedSet:Z

    if-eqz v3, :cond_3ef

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-boolean v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mColorized:Z

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setColorized(Z)Landroid/app/Notification$Builder;

    :cond_3ef
    iget-object v3, v1, Landroidx/core/app/NotificationCompat$Builder;->mChannelId:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_40b

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v3

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, v6, v6, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    goto :goto_40c

    :cond_40b
    const/4 v6, 0x0

    :goto_40c
    if-lt v2, v12, :cond_468

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-boolean v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mAllowSystemGeneratedContextualActions:Z

    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget-object v5, v1, Landroidx/core/app/NotificationCompat$Builder;->mBubbleMetadata:Landroidx/core/app/NotificationCompat$くし〴〺ぅ;

    if-nez v5, :cond_41f

    const/4 v5, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x2

    goto :goto_464

    .line 73
    :cond_41f
    new-instance v7, Landroid/app/Notification$BubbleMetadata$Builder;

    invoke-direct {v7}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>()V

    .line 74
    iget v8, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->なぎぱいぢぎ:I

    const/4 v9, 0x1

    and-int/2addr v8, v9

    if-eqz v8, :cond_42c

    const/4 v8, 0x1

    goto :goto_42d

    :cond_42c
    const/4 v8, 0x0

    .line 75
    :goto_42d
    invoke-virtual {v7, v8}, Landroid/app/Notification$BubbleMetadata$Builder;->setAutoExpandBubble(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v7

    .line 76
    iget-object v8, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->〺つふすそ:Landroid/app/PendingIntent;

    .line 77
    invoke-virtual {v7, v8}, Landroid/app/Notification$BubbleMetadata$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v7

    .line 78
    iget-object v8, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->くし〴〺ぅ:Landroidx/core/graphics/drawable/IconCompat;

    .line 79
    invoke-virtual {v8}, Landroidx/core/graphics/drawable/IconCompat;->てぜきぽく()Landroid/graphics/drawable/Icon;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/app/Notification$BubbleMetadata$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v7

    .line 80
    iget-object v8, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/app/PendingIntent;

    .line 81
    invoke-virtual {v7, v8}, Landroid/app/Notification$BubbleMetadata$Builder;->setIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v7

    .line 82
    iget v8, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->なぎぱいぢぎ:I

    const/4 v10, 0x2

    and-int/2addr v8, v10

    if-eqz v8, :cond_44e

    const/4 v6, 0x1

    .line 83
    :cond_44e
    invoke-virtual {v7, v6}, Landroid/app/Notification$BubbleMetadata$Builder;->setSuppressNotification(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v6

    .line 84
    iget v7, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->びぐびあび:I

    if-eqz v7, :cond_459

    .line 85
    invoke-virtual {v6, v7}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeight(I)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 86
    :cond_459
    iget v5, v5, Landroidx/core/app/NotificationCompat$くし〴〺ぅ;->づざかべべ:I

    if-eqz v5, :cond_460

    .line 87
    invoke-virtual {v6, v5}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeightResId(I)Landroid/app/Notification$BubbleMetadata$Builder;

    :cond_460
    invoke-virtual {v6}, Landroid/app/Notification$BubbleMetadata$Builder;->build()Landroid/app/Notification$BubbleMetadata;

    move-result-object v5

    .line 88
    :goto_464
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    goto :goto_46a

    :cond_468
    const/4 v9, 0x1

    const/4 v10, 0x2

    :goto_46a
    iget-boolean v1, v1, Landroidx/core/app/NotificationCompat$Builder;->mSilent:Z

    if-eqz v1, :cond_4af

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Landroidx/core/app/NotificationCompat$Builder;

    iget-boolean v1, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupSummary:Z

    if-eqz v1, :cond_476

    const/4 v8, 0x2

    goto :goto_477

    :cond_476
    const/4 v8, 0x1

    :goto_477
    iput v8, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v1, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    iget v1, v4, Landroid/app/Notification;->defaults:I

    and-int/lit8 v1, v1, -0x2

    iput v1, v4, Landroid/app/Notification;->defaults:I

    and-int/lit8 v1, v1, -0x3

    iput v1, v4, Landroid/app/Notification;->defaults:I

    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    invoke-virtual {v3, v1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    const/16 v1, 0x1a

    if-lt v2, v1, :cond_4af

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, v1, Landroidx/core/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4a8

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    const-string v2, "silent"

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_4a8
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/app/Notification$Builder;

    iget v2, v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぁごぐすすぃ;->ぁごぐすすぃ:I

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    :cond_4af
    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(Landroid/app/Notification;)V
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    iget v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p1, Landroid/app/Notification;->defaults:I

    return-void
.end method
