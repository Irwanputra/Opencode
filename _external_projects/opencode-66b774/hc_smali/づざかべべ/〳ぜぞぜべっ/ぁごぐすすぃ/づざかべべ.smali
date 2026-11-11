.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;
.super Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static くし〴〺ぅ:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public static づざかべべ:Ljava/lang/reflect/Method;

.field public static なぎぱいぢぎ:Z

.field public static びぐびあび:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;-><init>()V

    return-void
.end method

.method public static 〳ぜぞぜべっ(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    .registers 7

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->いいにぽつ()V

    :try_start_3
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->びぐびあび:Ljava/lang/reflect/Method;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, p1

    const/4 p1, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v1, p1

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_23
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_23} :catch_26
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_23} :catch_24

    return p0

    :catch_24
    move-exception p0

    goto :goto_27

    :catch_26
    move-exception p0

    :goto_27
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static いいにぽつ()V
    .registers 9

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->なぎぱいぢぎ:Z

    const/4 v1, 0x0

    :try_start_9
    const-string v2, "android.graphics.FontFamily"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    const-string v5, "addFontWeightStyle"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Class;

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v3

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v0

    const/4 v7, 0x2

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v6, v7

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v6

    const-class v7, Landroid/graphics/Typeface;

    const-string v8, "createFromFamiliesWithDefault"

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v0, v3

    invoke-virtual {v7, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_40
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_40} :catch_45
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_40} :catch_43

    move-object v0, v1

    move-object v1, v4

    goto :goto_50

    :catch_43
    move-exception v0

    goto :goto_46

    :catch_45
    move-exception v0

    :goto_46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-object v0, v1

    move-object v2, v0

    move-object v5, v2

    :goto_50
    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Constructor;

    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->〺つふすそ:Ljava/lang/Class;

    sput-object v5, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->びぐびあび:Ljava/lang/reflect/Method;

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->づざかべべ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Context;Landroid/os/CancellationSignal;[Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;I)Landroid/graphics/Typeface;
    .registers 8

    array-length v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_6

    return-object v1

    .line 1
    :cond_6
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;)V

    invoke-static {p3, p4, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->づざかべべ([Ljava/lang/Object;ILづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p4

    .line 3
    :try_start_15
    iget-object p3, p3, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/net/Uri;

    const-string v0, "r"

    .line 4
    invoke-virtual {p4, p3, v0, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object p2

    if-nez p2, :cond_25

    if-eqz p2, :cond_24

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_24} :catch_58

    :cond_24
    return-object v1

    :cond_25
    :try_start_25
    invoke-virtual {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->ぺぁあねじ(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_3a

    invoke-virtual {p3}, Ljava/io/File;->canRead()Z

    move-result p4

    if-nez p4, :cond_32

    goto :goto_3a

    :cond_32
    invoke-static {p3}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_36
    .catchall {:try_start_25 .. :try_end_36} :catchall_53

    :try_start_36
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_39
    .catch Ljava/io/IOException; {:try_start_36 .. :try_end_39} :catch_58

    return-object p1

    :cond_3a
    :goto_3a
    :try_start_3a
    new-instance p3, Ljava/io/FileInputStream;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p4

    invoke-direct {p3, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_43
    .catchall {:try_start_3a .. :try_end_43} :catchall_53

    :try_start_43
    invoke-virtual {p0, p1, p3}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_47
    .catchall {:try_start_43 .. :try_end_47} :catchall_4e

    :try_start_47
    invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
    :try_end_4a
    .catchall {:try_start_47 .. :try_end_4a} :catchall_53

    :try_start_4a
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4d
    .catch Ljava/io/IOException; {:try_start_4a .. :try_end_4d} :catch_58

    return-object p1

    :catchall_4e
    move-exception p1

    :try_start_4f
    invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
    :try_end_52
    .catchall {:try_start_4f .. :try_end_52} :catchall_52

    :catchall_52
    :try_start_52
    throw p1
    :try_end_53
    .catchall {:try_start_52 .. :try_end_53} :catchall_53

    :catchall_53
    move-exception p1

    :try_start_54
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_57
    .catchall {:try_start_54 .. :try_end_57} :catchall_57

    :catchall_57
    :try_start_57
    throw p1
    :try_end_58
    .catch Ljava/io/IOException; {:try_start_57 .. :try_end_58} :catch_58

    :catch_58
    return-object v1
.end method

.method public げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .registers 13

    .line 1
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->いいにぽつ()V

    :try_start_3
    sget-object p4, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Constructor;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {p4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_c
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_c} :catch_6d
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_c} :catch_6b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_c} :catch_69

    .line 2
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;->げつ〴ぬぐ:[Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;

    .line 3
    array-length v1, p2

    const/4 v2, 0x0

    :goto_10
    const/4 v3, 0x0

    if-ge v2, v1, :cond_46

    aget-object v4, p2, v2

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->えがぐせほち(Landroid/content/Context;)Ljava/io/File;

    move-result-object v5

    if-nez v5, :cond_1c

    return-object v3

    .line 4
    :cond_1c
    :try_start_1c
    iget v6, v4, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->なぎぱいぢぎ:I

    .line 5
    invoke-static {v5, p3, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ざとぅぼこ〺(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result v6
    :try_end_22
    .catch Ljava/lang/RuntimeException; {:try_start_1c .. :try_end_22} :catch_42
    .catchall {:try_start_1c .. :try_end_22} :catchall_3d

    if-nez v6, :cond_28

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    return-object v3

    :cond_28
    :try_start_28
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 6
    iget v7, v4, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->〺つふすそ:I

    .line 7
    iget-boolean v4, v4, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->くし〴〺ぅ:Z

    .line 8
    invoke-static {p4, v6, v7, v4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->〳ぜぞぜべっ(Ljava/lang/Object;Ljava/lang/String;IZ)Z

    move-result v4
    :try_end_34
    .catch Ljava/lang/RuntimeException; {:try_start_28 .. :try_end_34} :catch_42
    .catchall {:try_start_28 .. :try_end_34} :catchall_3d

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    if-nez v4, :cond_3a

    return-object v3

    :cond_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :catchall_3d
    move-exception p1

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    throw p1

    :catch_42
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    return-object v3

    .line 9
    :cond_46
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->いいにぽつ()V

    :try_start_49
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->〺つふすそ:Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0, p4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p3, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/づざかべべ;->づざかべべ:Ljava/lang/reflect/Method;

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    invoke-virtual {p3, v3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;
    :try_end_5f
    .catch Ljava/lang/IllegalAccessException; {:try_start_49 .. :try_end_5f} :catch_62
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_49 .. :try_end_5f} :catch_60

    return-object p1

    :catch_60
    move-exception p1

    goto :goto_63

    :catch_62
    move-exception p1

    :goto_63
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_69
    move-exception p1

    goto :goto_6e

    :catch_6b
    move-exception p1

    goto :goto_6e

    :catch_6d
    move-exception p1

    .line 10
    :goto_6e
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_75

    :goto_74
    throw p2

    :goto_75
    goto :goto_74
.end method

.method public final ぺぁあねじ(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    .registers 4

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/proc/self/fd/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/system/Os;->readlink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/system/Os;->stat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v0

    iget v0, v0, Landroid/system/StructStat;->st_mode:I

    invoke-static {v0}, Landroid/system/OsConstants;->S_ISREG(I)Z

    move-result v0

    if-eqz v0, :cond_2b

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2a
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_2a} :catch_2b

    return-object v0

    :catch_2b
    :cond_2b
    const/4 p1, 0x0

    return-object p1
.end method
