.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;
.super Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public final ぁごぐすすぃ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final いいにぽつ:Ljava/lang/reflect/Method;

.field public final てぜきぽく:Ljava/lang/reflect/Method;

.field public final のぷのちつ:Ljava/lang/reflect/Method;

.field public final ぺぁあねじ:Ljava/lang/reflect/Method;

.field public final ぺふねづ〺:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .registers 10

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;-><init>()V

    const/4 v0, 0x0

    :try_start_4
    const-string v1, "android.graphics.FontFamily"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 3
    invoke-virtual {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぉざぅち〻(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ざとぅぼこ〺(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    new-array v6, v2, [Ljava/lang/Class;

    const-string v7, "freeze"

    .line 4
    invoke-virtual {v1, v7, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v2, v2, [Ljava/lang/Class;

    const-string v7, "abortCreation"

    .line 5
    invoke-virtual {v1, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 6
    invoke-virtual {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->は〲ぱなで(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_2d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_2d} :catch_33
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_2d} :catch_31

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_41

    :catch_31
    move-exception v1

    goto :goto_34

    :catch_33
    move-exception v1

    :goto_34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_41
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/Class;

    iput-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->〳ぜぞぜべっ:Ljava/lang/reflect/Constructor;

    iput-object v4, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    iput-object v5, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->いいにぽつ:Ljava/lang/reflect/Method;

    iput-object v6, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺:Ljava/lang/reflect/Method;

    iput-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->てぜきぽく:Ljava/lang/reflect/Method;

    iput-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->のぷのちつ:Ljava/lang/reflect/Method;

    return-void
.end method

.method private ぇぬぎばつ()Ljava/lang/Object;
    .registers 3

    :try_start_0
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->〳ぜぞぜべっ:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_9} :catch_a
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_9} :catch_a
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_9} :catch_a

    return-object v0

    :catch_a
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;Landroid/os/CancellationSignal;[Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Landroid/graphics/Typeface;
    .registers 16

    array-length v0, p3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_6

    return-object v2

    :cond_6
    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->おぐぴう〸ず()Z

    move-result v0

    if-nez v0, :cond_4e

    .line 1
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;)V

    invoke-static {p3, p4, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->づざかべべ([Ljava/lang/Object;ILづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    .line 3
    :try_start_1b
    iget-object p4, p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    const-string v0, "r"

    .line 4
    invoke-virtual {p1, p4, v0, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    if-nez p1, :cond_2b

    if-eqz p1, :cond_2a

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_2a} :catch_4d

    :cond_2a
    return-object v2

    :cond_2b
    :try_start_2b
    new-instance p2, Landroid/graphics/Typeface$Builder;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p4

    invoke-direct {p2, p4}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V

    .line 5
    iget p4, p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 6
    invoke-virtual {p2, p4}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;

    move-result-object p2

    .line 7
    iget-boolean p3, p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->びぐびあび:Z

    .line 8
    invoke-virtual {p2, p3}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_44
    .catchall {:try_start_2b .. :try_end_44} :catchall_48

    :try_start_44
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_47
    .catch Ljava/io/IOException; {:try_start_44 .. :try_end_47} :catch_4d

    return-object p2

    :catchall_48
    move-exception p2

    :try_start_49
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4c
    .catchall {:try_start_49 .. :try_end_4c} :catchall_4c

    :catchall_4c
    :try_start_4c
    throw p2
    :try_end_4d
    .catch Ljava/io/IOException; {:try_start_4c .. :try_end_4d} :catch_4d

    :catch_4d
    return-object v2

    .line 9
    :cond_4e
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    array-length v3, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_58
    if-ge v5, v3, :cond_74

    aget-object v6, p3, v5

    .line 10
    iget v7, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->づざかべべ:I

    if-eqz v7, :cond_61

    goto :goto_71

    .line 11
    :cond_61
    iget-object v6, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    .line 12
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6a

    goto :goto_71

    :cond_6a
    invoke-static {p1, p2, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱こか〺ぃせ(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_71
    add-int/lit8 v5, v5, 0x1

    goto :goto_58

    :cond_74
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 13
    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぇぬぎばつ()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_7f

    return-object v2

    :cond_7f
    array-length v0, p3

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_82
    if-ge v3, v0, :cond_cb

    aget-object v6, p3, v3

    .line 14
    iget-object v7, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    .line 15
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/nio/ByteBuffer;

    if-nez v7, :cond_91

    goto :goto_c8

    .line 16
    :cond_91
    iget v5, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->〺つふすそ:I

    .line 17
    iget v8, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 18
    iget-boolean v6, v6, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->びぐびあび:Z

    .line 19
    :try_start_97
    iget-object v9, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->いいにぽつ:Ljava/lang/reflect/Method;

    const/4 v10, 0x5

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v7, v10, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v10, v1

    const/4 v5, 0x2

    aput-object v2, v10, v5

    const/4 v5, 0x3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v10, v5

    const/4 v5, 0x4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v10, v5

    invoke-virtual {v9, p2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_bf
    .catch Ljava/lang/IllegalAccessException; {:try_start_97 .. :try_end_bf} :catch_c0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_97 .. :try_end_bf} :catch_c0

    goto :goto_c1

    :catch_c0
    const/4 v5, 0x0

    :goto_c1
    if-nez v5, :cond_c7

    .line 20
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺(Ljava/lang/Object;)V

    return-object v2

    :cond_c7
    const/4 v5, 0x1

    :goto_c8
    add-int/lit8 v3, v3, 0x1

    goto :goto_82

    :cond_cb
    if-nez v5, :cond_d1

    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺(Ljava/lang/Object;)V

    return-object v2

    :cond_d1
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->へぬ〴づぞ(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d8

    return-object v2

    :cond_d8
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->のぷのちつ(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    if-nez p1, :cond_df

    return-object v2

    :cond_df
    invoke-static {p1, p4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public ぉざぅち〻(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/res/AssetManager;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Ljava/lang/String;

    aput-object v2, v0, v1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, 0x7

    const-class v2, [Landroid/graphics/fonts/FontVariationAxis;

    aput-object v2, v0, v1

    const-string v1, "addFontFromAssetManager"

    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final おぐぴう〸ず()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .registers 15

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->おぐぴう〸ず()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-super {p0, p1, p2, p3, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぇぬぎばつ()Ljava/lang/Object;

    move-result-object p3

    const/4 p4, 0x0

    if-nez p3, :cond_13

    return-object p4

    .line 1
    :cond_13
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;->げつ〴ぬぐ:[Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;

    .line 2
    array-length v8, p2

    const/4 v0, 0x0

    const/4 v9, 0x0

    :goto_18
    if-ge v9, v8, :cond_3a

    aget-object v0, p2, v9

    .line 3
    iget-object v3, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    .line 4
    iget v4, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->づざかべべ:I

    .line 5
    iget v5, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->〺つふすそ:I

    .line 6
    iget-boolean v6, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->くし〴〺ぅ:Z

    .line 7
    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->びぐびあび:Ljava/lang/String;

    .line 8
    invoke-static {v0}, Landroid/graphics/fonts/FontVariationAxis;->fromFontVariationSettings(Ljava/lang/String;)[Landroid/graphics/fonts/FontVariationAxis;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    invoke-virtual/range {v0 .. v7}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->てぜきぽく(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    move-result v0

    if-nez v0, :cond_37

    invoke-virtual {p0, p3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺(Ljava/lang/Object;)V

    return-object p4

    :cond_37
    add-int/lit8 v9, v9, 0x1

    goto :goto_18

    :cond_3a
    invoke-virtual {p0, p3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->へぬ〴づぞ(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_41

    return-object p4

    :cond_41
    invoke-virtual {p0, p3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->のぷのちつ(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public ざとぅぼこ〺(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/nio/ByteBuffer;

    aput-object v2, v0, v1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    const-class v3, [Landroid/graphics/fonts/FontVariationAxis;

    aput-object v3, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "addFontFromBuffer"

    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final てぜきぽく(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z
    .registers 11

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    aput-object p1, v2, v0

    const/4 p1, 0x1

    aput-object p3, v2, p1

    const/4 p1, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    const/4 p1, 0x3

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object p3, v2, p1

    const/4 p1, 0x4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    const/4 p1, 0x5

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    const/4 p1, 0x6

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    const/4 p1, 0x7

    aput-object p7, v2, p1

    invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_3e
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_3e} :catch_3f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_3e} :catch_3f

    return p1

    :catch_3f
    return v0
.end method

.method public のぷのちつ(Ljava/lang/Object;)Landroid/graphics/Typeface;
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->のぷのちつ:Ljava/lang/reflect/Method;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v3

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v2

    const/4 v2, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v2

    invoke-virtual {p1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;
    :try_end_27
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_27} :catch_28
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_27} :catch_28

    return-object p1

    :catch_28
    return-object v0
.end method

.method public は〲ぱなで(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-class v1, Landroid/graphics/Typeface;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object p1, v2, v0

    const/4 v3, 0x2

    aput-object p1, v2, v3

    const-string p1, "createFromFamiliesWithDefault"

    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    return-object p1
.end method

.method public びぐびあび(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .registers 14

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->おぐぴう〸ず()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-super/range {p0 .. p5}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぇぬぎばつ()Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_13

    return-object p3

    :cond_13
    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    invoke-virtual/range {v0 .. v7}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->てぜきぽく(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    move-result p1

    if-nez p1, :cond_25

    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺(Ljava/lang/Object;)V

    return-object p3

    :cond_25
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->へぬ〴づぞ(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2c

    return-object p3

    :cond_2c
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->のぷのちつ(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final へぬ〴づぞ(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺふねづ〺:Ljava/lang/reflect/Method;

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_f
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_f} :catch_10
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_f} :catch_10

    return p1

    :catch_10
    return v0
.end method

.method public final ぺふねづ〺(Ljava/lang/Object;)V
    .registers 4

    :try_start_0
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぁごぐすすぃ;->てぜきぽく:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_8} :catch_8
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method
