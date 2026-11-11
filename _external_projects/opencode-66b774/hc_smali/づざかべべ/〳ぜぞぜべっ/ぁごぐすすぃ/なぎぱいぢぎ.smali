.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;
.super Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;
.source ""


# static fields
.field public static final 〺つふすそ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final くし〴〺ぅ:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public static final づざかべべ:Ljava/lang/reflect/Method;

.field public static final びぐびあび:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    const/4 v0, 0x0

    :try_start_1
    const-string v1, "android.graphics.FontFamily"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const-string v4, "addFontWeightStyle"

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Class;

    const-class v6, Ljava/nio/ByteBuffer;

    aput-object v6, v5, v2

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const/4 v8, 0x2

    const-class v9, Ljava/util/List;

    aput-object v9, v5, v8

    const/4 v8, 0x3

    aput-object v6, v5, v8

    const/4 v6, 0x4

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v5, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v1, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v5

    const-class v6, Landroid/graphics/Typeface;

    const-string v8, "createFromFamiliesWithDefault"

    new-array v7, v7, [Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    aput-object v5, v7, v2

    invoke-virtual {v6, v8, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_41
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_41} :catch_46
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_41} :catch_44

    move-object v2, v0

    move-object v0, v3

    goto :goto_51

    :catch_44
    move-exception v1

    goto :goto_47

    :catch_46
    move-exception v1

    :goto_47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-object v1, v0

    move-object v2, v1

    move-object v4, v2

    :goto_51
    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/reflect/Constructor;

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Class;

    sput-object v4, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Ljava/lang/reflect/Method;

    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->づざかべべ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;-><init>()V

    return-void
.end method

.method public static 〳ぜぞぜべっ(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    .registers 8

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->びぐびあび:Ljava/lang/reflect/Method;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    const/4 p1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x2

    const/4 p2, 0x0

    aput-object p2, v2, p1

    const/4 p1, 0x3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x4

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_2b
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_2b} :catch_2c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_2b} :catch_2c

    return p0

    :catch_2c
    return v0
.end method

.method public static ぺぁあねじ(Ljava/lang/Object;)Landroid/graphics/Typeface;
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3, p0}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->づざかべべ:Ljava/lang/reflect/Method;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-virtual {p0, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;
    :try_end_18
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_18} :catch_19
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_18} :catch_19

    return-object p0

    :catch_19
    return-object v0
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;Landroid/os/CancellationSignal;[Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Landroid/graphics/Typeface;
    .registers 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_2
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/reflect/Constructor;

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_a} :catch_b
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_a} :catch_b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_a} :catch_b

    goto :goto_c

    :catch_b
    move-object v2, v1

    :goto_c
    if-nez v2, :cond_f

    return-object v1

    .line 2
    :cond_f
    new-instance v3, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    array-length v4, p3

    :goto_15
    if-ge v0, v4, :cond_3d

    aget-object v5, p3, v0

    .line 3
    iget-object v6, v5, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    .line 4
    invoke-virtual {v3, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/nio/ByteBuffer;

    if-nez v7, :cond_2a

    invoke-static {p1, p2, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱こか〺ぃせ(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2a
    if-nez v7, :cond_2d

    return-object v1

    .line 5
    :cond_2d
    iget v6, v5, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->〺つふすそ:I

    .line 6
    iget v8, v5, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 7
    iget-boolean v5, v5, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->びぐびあび:Z

    .line 8
    invoke-static {v2, v7, v6, v8, v5}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z

    move-result v5

    if-nez v5, :cond_3a

    return-object v1

    :cond_3a
    add-int/lit8 v0, v0, 0x1

    goto :goto_15

    :cond_3d
    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->ぺぁあねじ(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object p1

    if-nez p1, :cond_44

    return-object v1

    :cond_44
    invoke-static {p1, p4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .registers 21

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :try_start_2
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/reflect/Constructor;

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_a} :catch_b
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_a} :catch_b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_a} :catch_b

    goto :goto_c

    :catch_b
    move-object v2, v1

    :goto_c
    if-nez v2, :cond_f

    return-object v1

    :cond_f
    move-object/from16 v3, p2

    .line 2
    iget-object v3, v3, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;->げつ〴ぬぐ:[Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;

    .line 3
    array-length v4, v3

    const/4 v5, 0x0

    :goto_15
    if-ge v5, v4, :cond_69

    aget-object v6, v3, v5

    .line 4
    iget v0, v6, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->なぎぱいぢぎ:I

    .line 5
    invoke-static/range {p1 .. p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->えがぐせほち(Landroid/content/Context;)Ljava/io/File;

    move-result-object v7

    move-object/from16 v8, p3

    if-nez v7, :cond_24

    goto :goto_2d

    :cond_24
    :try_start_24
    invoke-static {v7, v8, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ざとぅぼこ〺(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result v0
    :try_end_28
    .catchall {:try_start_24 .. :try_end_28} :catchall_64

    if-nez v0, :cond_2f

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :goto_2d
    move-object v0, v1

    goto :goto_51

    .line 6
    :cond_2f
    :try_start_2f
    new-instance v9, Ljava/io/FileInputStream;

    invoke-direct {v9, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_34} :catch_4d
    .catchall {:try_start_2f .. :try_end_34} :catchall_64

    :try_start_34
    invoke-virtual {v9}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v10

    invoke-virtual {v10}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v14

    sget-object v11, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v12, 0x0

    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v0
    :try_end_44
    .catchall {:try_start_34 .. :try_end_44} :catchall_48

    :try_start_44
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_47
    .catch Ljava/io/IOException; {:try_start_44 .. :try_end_47} :catch_4d
    .catchall {:try_start_44 .. :try_end_47} :catchall_64

    goto :goto_4e

    :catchall_48
    move-exception v0

    :try_start_49
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_4c
    .catchall {:try_start_49 .. :try_end_4c} :catchall_4c

    :catchall_4c
    :try_start_4c
    throw v0
    :try_end_4d
    .catch Ljava/io/IOException; {:try_start_4c .. :try_end_4d} :catch_4d
    .catchall {:try_start_4c .. :try_end_4d} :catchall_64

    :catch_4d
    move-object v0, v1

    .line 7
    :goto_4e
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :goto_51
    if-nez v0, :cond_54

    return-object v1

    .line 8
    :cond_54
    iget v7, v6, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->づざかべべ:I

    .line 9
    iget v9, v6, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->〺つふすそ:I

    .line 10
    iget-boolean v6, v6, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->くし〴〺ぅ:Z

    .line 11
    invoke-static {v2, v0, v7, v9, v6}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z

    move-result v0

    if-nez v0, :cond_61

    return-object v1

    :cond_61
    add-int/lit8 v5, v5, 0x1

    goto :goto_15

    :catchall_64
    move-exception v0

    .line 12
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    throw v0

    .line 13
    :cond_69
    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/なぎぱいぢぎ;->ぺぁあねじ(Ljava/lang/Object;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method
