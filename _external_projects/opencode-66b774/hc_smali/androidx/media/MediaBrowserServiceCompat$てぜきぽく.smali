.class public final Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3066\u305c\u304d\u307d\u304f"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat;

.field public final げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .registers 3

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    invoke-direct {v0, p1}, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    iget v3, v1, Landroid/os/Message;->what:I

    const-string v4, "data_callback_token"

    const-string v5, "data_calling_uid"

    const-string v6, "data_calling_pid"

    const-string v7, "data_package_name"

    const-string v8, "data_root_hints"

    const-string v9, "data_result_receiver"

    const-string v10, "data_media_item_id"

    packed-switch v3, :pswitch_data_1f6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unhandled message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n  Service version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\n  Client version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto/16 :goto_1f5

    :pswitch_40
    const-string v3, "data_custom_action_extras"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    invoke-static {v14}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v11, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    const-string v3, "data_custom_action"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/support/v4/os/ResultReceiver;

    new-instance v12, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v12, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f5

    if-nez v15, :cond_6c

    goto/16 :goto_1f5

    :cond_6c
    iget-object v1, v11, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v2, Lづざかべべ/おぐぴう〸ず/ぇぬぎばつ;

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lづざかべべ/おぐぴう〸ず/ぇぬぎばつ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/ResultReceiver;)V

    invoke-virtual {v1, v2}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    :pswitch_7b
    const-string v3, "data_search_extras"

    .line 2
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    invoke-static {v14}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v11, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    const-string v3, "data_search_query"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/support/v4/os/ResultReceiver;

    new-instance v12, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v12, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f5

    if-nez v15, :cond_a7

    goto/16 :goto_1f5

    :cond_a7
    iget-object v1, v11, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v2, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/ResultReceiver;)V

    invoke-virtual {v1, v2}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 4
    :pswitch_b6
    iget-object v2, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    new-instance v3, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v3, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 5
    iget-object v1, v2, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v4, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;

    invoke-direct {v4, v2, v3}, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;)V

    invoke-virtual {v1, v4}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 6
    :pswitch_cd
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v11

    invoke-static {v11}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v3, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    new-instance v4, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v4, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 7
    iget-object v1, v3, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v2, Lづざかべべ/おぐぴう〸ず/のぷのちつ;

    move-object v5, v2

    move-object v6, v3

    move-object v7, v4

    invoke-direct/range {v5 .. v11}, Lづざかべべ/おぐぴう〸ず/のぷのちつ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;IILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 8
    :pswitch_fa
    iget-object v3, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/support/v4/os/ResultReceiver;

    new-instance v5, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v5, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1f5

    if-nez v2, :cond_11a

    goto/16 :goto_1f5

    :cond_11a
    iget-object v1, v3, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v6, Lづざかべべ/おぐぴう〸ず/てぜきぽく;

    invoke-direct {v6, v3, v5, v4, v2}, Lづざかべべ/おぐぴう〸ず/てぜきぽく;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/support/v4/os/ResultReceiver;)V

    invoke-virtual {v1, v6}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 10
    :pswitch_128
    iget-object v3, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    new-instance v4, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v4, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 11
    iget-object v1, v3, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v6, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;

    invoke-direct {v6, v3, v4, v5, v2}, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/IBinder;)V

    invoke-virtual {v1, v6}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    :pswitch_147
    const-string v3, "data_options"

    .line 12
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v12, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v2, v4}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v15

    new-instance v13, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v13, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 13
    iget-object v1, v12, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v2, Lづざかべべ/おぐぴう〸ず/いいにぽつ;

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lづざかべべ/おぐぴう〸ず/いいにぽつ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 14
    :pswitch_170
    iget-object v2, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    new-instance v3, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v3, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 15
    iget-object v1, v2, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v4, Lづざかべべ/おぐぴう〸ず/ぺぁあねじ;

    invoke-direct {v4, v2, v3}, Lづざかべべ/おぐぴう〸ず/ぺぁあねじ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;)V

    invoke-virtual {v1, v4}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto/16 :goto_1f5

    .line 16
    :pswitch_187
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v11

    invoke-static {v11}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v3, v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    invoke-virtual {v2, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v10

    new-instance v7, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    iget-object v1, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-direct {v7, v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;-><init>(Landroid/os/Messenger;)V

    .line 17
    iget-object v1, v3, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    if-nez v8, :cond_1ac

    goto :goto_1c5

    :cond_1ac
    invoke-virtual {v1}, Landroid/app/Service;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v1

    array-length v4, v1

    const/4 v5, 0x0

    :goto_1b6
    if-ge v5, v4, :cond_1c5

    aget-object v6, v1, v5

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c2

    const/4 v2, 0x1

    goto :goto_1c5

    :cond_1c2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1b6

    :cond_1c5
    :goto_1c5
    if-eqz v2, :cond_1d6

    .line 19
    iget-object v1, v3, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    new-instance v2, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;

    move-object v5, v2

    move-object v6, v3

    invoke-direct/range {v5 .. v11}, Lづざかべべ/おぐぴう〸ず/〳ぜぞぜべっ;-><init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;IILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;->げつ〴ぬぐ(Ljava/lang/Runnable;)V

    goto :goto_1f5

    :cond_1d6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Package/uid mismatch: uid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " package="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f5
    :goto_1f5
    return-void

    :pswitch_data_1f6
    .packed-switch 0x1
        :pswitch_187
        :pswitch_170
        :pswitch_147
        :pswitch_128
        :pswitch_fa
        :pswitch_cd
        :pswitch_b6
        :pswitch_7b
        :pswitch_40
    .end packed-switch
.end method

.method public sendMessageAtTime(Landroid/os/Message;J)Z
    .registers 7

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Landroid/support/v4/media/MediaBrowserCompat;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const-string v2, "data_calling_uid"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    const-string v2, "data_calling_pid"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Ljava/lang/Runnable;)V
    .registers 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_12

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_15

    :cond_12
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_15
    return-void
.end method
