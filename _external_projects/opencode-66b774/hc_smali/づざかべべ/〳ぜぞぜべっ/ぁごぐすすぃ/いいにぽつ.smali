.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static ぁごぐすすぃ(Landroid/graphics/Typeface;)J
    .registers 5

    const-wide/16 v0, 0x0

    if-nez p0, :cond_5

    return-wide v0

    :cond_5
    :try_start_5
    const-class v2, Landroid/graphics/Typeface;

    const-string v3, "native_instance"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldException; {:try_start_5 .. :try_end_1b} :catch_1b
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_1b} :catch_1b

    :catch_1b
    return-wide v0
.end method

.method public static づざかべべ([Ljava/lang/Object;ILづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)Ljava/lang/Object;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3041\u3054\u3050\u3059\u3059\u3043/\u3044\u3044\u306b\u307d\u3064$\u303a\u3064\u3075\u3059\u305d<",
            "TT;>;)TT;"
        }
    .end annotation

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_7

    const/16 v0, 0x190

    goto :goto_9

    :cond_7
    const/16 v0, 0x2bc

    :goto_9
    and-int/lit8 p1, p1, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_11

    const/4 p1, 0x1

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    const/4 v3, 0x0

    const v4, 0x7fffffff

    array-length v5, p0

    const/4 v6, 0x0

    :goto_18
    if-ge v6, v5, :cond_3a

    aget-object v7, p0, v6

    invoke-interface {p2, v7}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/Object;)I

    move-result v8

    sub-int/2addr v8, v0

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    mul-int/lit8 v8, v8, 0x2

    invoke-interface {p2, v7}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->〺つふすそ(Ljava/lang/Object;)Z

    move-result v9

    if-ne v9, p1, :cond_2f

    const/4 v9, 0x0

    goto :goto_30

    :cond_2f
    const/4 v9, 0x1

    :goto_30
    add-int/2addr v8, v9

    if-eqz v3, :cond_35

    if-le v4, v8, :cond_37

    :cond_35
    move-object v3, v7

    move v4, v8

    :cond_37
    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    :cond_3a
    return-object v3
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;Landroid/os/CancellationSignal;[Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Landroid/graphics/Typeface;
    .registers 7

    array-length p2, p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p2, v1, :cond_6

    return-object v0

    :cond_6
    invoke-virtual {p0, p3, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->なぎぱいぢぎ([Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;

    move-result-object p2

    :try_start_a
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    .line 1
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    .line 2
    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_14} :catch_28
    .catchall {:try_start_a .. :try_end_14} :catchall_21

    :try_start_14
    invoke-virtual {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_18} :catch_29
    .catchall {:try_start_14 .. :try_end_18} :catchall_1e

    if-eqz p2, :cond_1d

    .line 3
    :try_start_1a
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1d} :catch_1d

    :catch_1d
    :cond_1d
    return-object p1

    :catchall_1e
    move-exception p1

    move-object v0, p2

    goto :goto_22

    :catchall_21
    move-exception p1

    :goto_22
    if-eqz v0, :cond_27

    :try_start_24
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_27} :catch_27

    .line 4
    :catch_27
    :cond_27
    throw p1

    :catch_28
    move-object p2, v0

    :catch_29
    if-eqz p2, :cond_2e

    .line 5
    :try_start_2b
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2e
    .catch Ljava/io/IOException; {:try_start_2b .. :try_end_2e} :catch_2e

    :catch_2e
    :cond_2e
    return-object v0
.end method

.method public くし〴〺ぅ(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .registers 4

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->えがぐせほち(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_8

    return-object v0

    :cond_8
    :try_start_8
    invoke-static {p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->は〲ぱなで(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p2
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_c} :catch_23
    .catchall {:try_start_8 .. :try_end_c} :catchall_1e

    if-nez p2, :cond_12

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    :cond_12
    :try_start_12
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1a
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_1a} :catch_23
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1e

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_1e
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_23
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .registers 8

    .line 1
    iget-object v0, p2, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;->げつ〴ぬぐ:[Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;

    .line 2
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぺふねづ〺;

    invoke-direct {v1, p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/ぺふねづ〺;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;)V

    invoke-static {v0, p4, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->づざかべべ([Ljava/lang/Object;ILづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;

    if-nez v0, :cond_11

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_11
    iget v1, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->なぎぱいぢぎ:I

    .line 4
    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    .line 5
    invoke-static {p1, p3, v1, v0, p4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->ぁごぐすすぃ(Landroid/graphics/Typeface;)J

    move-result-wide p3

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-eqz v2, :cond_2c

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2c
    return-object p1
.end method

.method public なぎぱいぢぎ([Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;
    .registers 4

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;)V

    invoke-static {p1, p2, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->づざかべべ([Ljava/lang/Object;ILづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;

    return-object p1
.end method

.method public びぐびあび(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .registers 6

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->えがぐせほち(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_8

    return-object p4

    :cond_8
    :try_start_8
    invoke-static {p1, p2, p3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ざとぅぼこ〺(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_c} :catch_23
    .catchall {:try_start_8 .. :try_end_c} :catchall_1e

    if-nez p2, :cond_12

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    :cond_12
    :try_start_12
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1a
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_1a} :catch_23
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1e

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_1e
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_23
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method
