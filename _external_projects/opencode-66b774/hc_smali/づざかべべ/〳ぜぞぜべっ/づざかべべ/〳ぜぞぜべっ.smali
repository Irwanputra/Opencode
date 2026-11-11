.class public Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〳ぜぞぜべっ:Ljava/lang/reflect/Field;

.field public static 〺つふすそ:Ljava/lang/reflect/Field;

.field public static ぁごぐすすぃ:Ljava/lang/reflect/Field;

.field public static くし〴〺ぅ:Z

.field public static final げつ〴ぬぐ:Ljava/lang/Object;

.field public static づざかべべ:Ljava/lang/reflect/Field;

.field public static なぎぱいぢぎ:Ljava/lang/reflect/Field;

.field public static final びぐびあび:Ljava/lang/Object;

.field public static ぺぁあねじ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:Ljava/lang/Object;

    return-void
.end method

.method public static 〳ぜぞぜべっ([Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;)[Landroid/os/Bundle;
    .registers 7

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    array-length v0, p0

    new-array v0, v0, [Landroid/os/Bundle;

    const/4 v1, 0x0

    :goto_8
    array-length v2, p0

    if-ge v1, v2, :cond_66

    aget-object v2, p0, v1

    .line 1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    const-string v5, "resultKey"

    .line 3
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->〺つふすそ:Ljava/lang/CharSequence;

    const-string v5, "label"

    .line 5
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 6
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ:[Ljava/lang/CharSequence;

    const-string v5, "choices"

    .line 7
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 8
    iget-boolean v4, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->びぐびあび:Z

    const-string v5, "allowFreeFormInput"

    .line 9
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ:Landroid/os/Bundle;

    const-string v5, "extras"

    .line 11
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    iget-object v2, v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/Set;

    if-eqz v2, :cond_61

    .line 13
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_61

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4c

    :cond_5c
    const-string v2, "allowedDataTypes"

    invoke-virtual {v3, v2, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 14
    :cond_61
    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_66
    return-object v0
.end method

.method public static 〺つふすそ()Z
    .registers 3

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->ぺぁあねじ:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    const/4 v0, 0x1

    :try_start_7
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/reflect/Field;

    if-nez v1, :cond_39

    const-string v1, "android.app.Notification$Action"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "icon"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->なぎぱいぢぎ:Ljava/lang/reflect/Field;

    const-string v2, "title"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/lang/reflect/Field;

    const-string v2, "actionIntent"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    const-class v1, Landroid/app/Notification;

    const-string v2, "actions"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_36
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_36} :catch_37
    .catch Ljava/lang/NoSuchFieldException; {:try_start_7 .. :try_end_36} :catch_37

    goto :goto_39

    :catch_37
    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->ぺぁあねじ:Z

    :cond_39
    :goto_39
    sget-boolean v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->ぺぁあねじ:Z

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ぁごぐすすぃ(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroidx/core/app/NotificationCompat$〺つふすそ;
    .registers 16

    const/4 v0, 0x0

    if-eqz p3, :cond_21

    const-string v0, "android.support.remoteInputs"

    invoke-static {p3, v0}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ([Landroid/os/Bundle;)[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    move-result-object v0

    const-string v1, "android.support.dataRemoteInputs"

    invoke-static {p3, v1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ([Landroid/os/Bundle;)[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    move-result-object v1

    const-string v2, "android.support.allowGeneratedReplies"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    move-object v5, v0

    move-object v6, v1

    move v7, v2

    goto :goto_25

    :cond_21
    const/4 v1, 0x0

    move-object v5, v0

    move-object v6, v5

    const/4 v7, 0x0

    :goto_25
    new-instance v11, Landroidx/core/app/NotificationCompat$〺つふすそ;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v0, v11

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v10}, Landroidx/core/app/NotificationCompat$〺つふすそ;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;ZIZZ)V

    return-object v11
.end method

.method public static くし〴〺ぅ([Landroid/os/Bundle;)[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;
    .registers 13

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    array-length v0, p0

    new-array v0, v0, [Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    const/4 v1, 0x0

    :goto_8
    array-length v2, p0

    if-ge v1, v2, :cond_58

    aget-object v2, p0, v1

    const-string v3, "allowedDataTypes"

    .line 1
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    if-eqz v3, :cond_2e

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v11, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_2e
    new-instance v3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    const-string v4, "resultKey"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v4, "label"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v6

    const-string v4, "choices"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object v7

    const-string v4, "allowFreeFormInput"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    const-string v4, "extras"

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    move-object v4, v3

    invoke-direct/range {v4 .. v11}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    .line 2
    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_58
    return-object v0
.end method

.method public static げつ〴ぬぐ(Ljava/util/List;)Landroid/util/SparseArray;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)",
            "Landroid/util/SparseArray<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_1d

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    if-eqz v3, :cond_1a

    if-nez v1, :cond_17

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    :cond_17
    invoke-virtual {v1, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_1d
    return-object v1
.end method

.method public static づざかべべ(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
    .registers 5

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    instance-of v1, v0, [Landroid/os/Bundle;

    if-nez v1, :cond_18

    if-nez v0, :cond_b

    goto :goto_18

    :cond_b
    array-length v1, v0

    const-class v2, [Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/os/Bundle;

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    return-object v0

    :cond_18
    :goto_18
    check-cast v0, [Landroid/os/Bundle;

    return-object v0
.end method

.method public static なぎぱいぢぎ(Landroid/app/Notification;)Landroid/os/Bundle;
    .registers 7

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-boolean v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_46

    return-object v2

    :cond_a
    const/4 v1, 0x1

    :try_start_b
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/reflect/Field;

    if-nez v3, :cond_2c

    const-class v3, Landroid/app/Notification;

    const-string v4, "extras"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const-class v4, Landroid/os/Bundle;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_27

    sput-boolean v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ:Z
    :try_end_25
    .catch Ljava/lang/IllegalAccessException; {:try_start_b .. :try_end_25} :catch_42
    .catch Ljava/lang/NoSuchFieldException; {:try_start_b .. :try_end_25} :catch_42
    .catchall {:try_start_b .. :try_end_25} :catchall_46

    :try_start_25
    monitor-exit v0
    :try_end_26
    .catchall {:try_start_25 .. :try_end_26} :catchall_46

    return-object v2

    :cond_27
    :try_start_27
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    sput-object v3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/reflect/Field;

    :cond_2c
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    if-nez v3, :cond_40

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v4, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_40
    .catch Ljava/lang/IllegalAccessException; {:try_start_27 .. :try_end_40} :catch_42
    .catch Ljava/lang/NoSuchFieldException; {:try_start_27 .. :try_end_40} :catch_42
    .catchall {:try_start_27 .. :try_end_40} :catchall_46

    :cond_40
    :try_start_40
    monitor-exit v0

    return-object v3

    :catch_42
    sput-boolean v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    monitor-exit v0

    return-object v2

    :catchall_46
    move-exception p0

    monitor-exit v0
    :try_end_48
    .catchall {:try_start_40 .. :try_end_48} :catchall_46

    throw p0
.end method

.method public static びぐびあび(Landroid/app/Notification;)[Ljava/lang/Object;
    .registers 4

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_c

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_3 .. :try_end_b} :catchall_1b

    return-object v2

    :cond_c
    :try_start_c
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->づざかべべ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;
    :try_end_14
    .catch Ljava/lang/IllegalAccessException; {:try_start_c .. :try_end_14} :catch_16
    .catchall {:try_start_c .. :try_end_14} :catchall_1b

    :try_start_14
    monitor-exit v0

    return-object p0

    :catch_16
    const/4 p0, 0x1

    sput-boolean p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/〳ぜぞぜべっ;->ぺぁあねじ:Z

    monitor-exit v0

    return-object v2

    :catchall_1b
    move-exception p0

    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_14 .. :try_end_1d} :catchall_1b

    throw p0
.end method
