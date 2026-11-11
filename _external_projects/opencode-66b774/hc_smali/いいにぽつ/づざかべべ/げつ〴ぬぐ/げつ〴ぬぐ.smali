.class public Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ぺぁあねじ:Ljava/lang/String;


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/Runnable;

.field public final 〺つふすそ:Ljava/lang/Process;

.field public ぁごぐすすぃ:Ljava/lang/Runnable;

.field public final くし〴〺ぅ:Ljava/io/BufferedReader;

.field public final づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:Ljava/io/DataOutputStream;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "LD_LIBRARY_PATH"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    new-instance v1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iput-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    new-instance v1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;

    invoke-direct {v1, p0}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;-><init>(Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iput-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    .line 1
    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v2

    new-array v2, v3, [Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_64

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v0, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    move v0, v4

    goto :goto_32

    :cond_64
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_68
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    add-int/lit8 v3, v0, 0x1

    aput-object v1, v2, v0

    move v0, v3

    goto :goto_68

    :cond_7a
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p2

    if-nez p3, :cond_86

    const/4 p3, 0x0

    invoke-virtual {p2, p1, v2, p3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;

    move-result-object p1

    goto :goto_8f

    :cond_86
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1, v2, v0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;

    move-result-object p1

    .line 2
    :goto_8f
    iput-object p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    new-instance p2, Ljava/io/BufferedReader;

    new-instance p3, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, p3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/BufferedReader;

    new-instance p2, Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Ljava/io/DataOutputStream;

    const-string p1, "echo Started\n"

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {p2}, Ljava/io/DataOutputStream;->flush()V

    :goto_b8
    iget-object p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/BufferedReader;

    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_103

    const-string p2, ""

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c9

    goto :goto_b8

    :cond_c9
    const-string p2, "Started"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_ea

    new-instance p1, Ljava/lang/Thread;

    iget-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    const-string p3, "Shell Input"

    invoke-direct {p1, p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance p1, Ljava/lang/Thread;

    iget-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    const-string p3, "Shell Output"

    invoke-direct {p1, p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    .line 3
    :cond_ea
    :try_start_ea
    iget-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {p2}, Ljava/lang/Process;->exitValue()I
    :try_end_ef
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_ea .. :try_end_ef} :catch_f0

    goto :goto_f5

    :catch_f0
    iget-object p2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {p2}, Ljava/lang/Process;->destroy()V

    .line 4
    :goto_f5
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Unable to start shell, unexpected output \""

    const-string v0, "\""

    invoke-static {p3, p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_103
    new-instance p1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/くし〴〺ぅ/〺つふすそ;

    const-string p2, "stdout line is null! Access was denied or this executeable is not a shell!"

    invoke-direct {p1, p2}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/くし〴〺ぅ/〺つふすそ;-><init>(Ljava/lang/String;)V

    goto :goto_10c

    :goto_10b
    throw p1

    :goto_10c
    goto :goto_10b
.end method

.method public static じぜこほぱ(Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_4
    :try_start_4
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    monitor-enter v1
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_7} :catch_74

    :goto_7
    :try_start_7
    iget-boolean v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez v2, :cond_19

    iget-object v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_19

    iget-object v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    goto :goto_7

    :cond_19
    iget-object v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Ljava/io/DataOutputStream;

    monitor-exit v1
    :try_end_1c
    .catchall {:try_start_7 .. :try_end_1c} :catchall_71

    :try_start_1c
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_52

    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v1, v2}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/io/OutputStream;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\necho F*D^W@#FGF "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " $?\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_52
    iget-boolean v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v1, :cond_6b

    const-string v0, "\nexit 0\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    iget-object p0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {p0}, Ljava/lang/Process;->waitFor()I

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    goto :goto_74

    :cond_6b
    const-wide/16 v1, 0x32

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_70
    .catch Ljava/lang/InterruptedException; {:try_start_1c .. :try_end_70} :catch_74

    goto :goto_4

    :catchall_71
    move-exception p0

    :try_start_72
    monitor-exit v1
    :try_end_73
    .catchall {:try_start_72 .. :try_end_73} :catchall_71

    :try_start_73
    throw p0
    :try_end_74
    .catch Ljava/lang/InterruptedException; {:try_start_73 .. :try_end_74} :catch_74

    :catch_74
    :goto_74
    return-void
.end method

.method public static せづっ〸ちね()Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;
    .registers 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "LD_LIBRARY_PATH="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 2
    sget-object v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1d
    const-string v5, "su"

    if-ge v4, v3, :cond_3a

    aget-object v6, v2, v4

    new-instance v7, Ljava/io/File;

    invoke-static {v6, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_37

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    goto :goto_3a

    :cond_37
    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_3a
    :goto_3a
    const/4 v2, 0x0

    .line 3
    invoke-direct {v1, v5, v0, v2}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object v1
.end method

.method public static ぺづげぺが(Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    const/4 v3, 0x0

    .line 1
    :cond_4
    :goto_4
    iget-object v4, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/BufferedReader;

    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_d

    goto :goto_1b

    :cond_d
    if-nez v2, :cond_55

    iget-object v5, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_4d

    iget-boolean v4, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v4, :cond_4

    :goto_1b
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {v1}, Ljava/lang/Process;->waitFor()I

    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/BufferedReader;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 2
    :try_start_25
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {v1}, Ljava/lang/Process;->exitValue()I
    :try_end_2a
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_25 .. :try_end_2a} :catch_2b

    goto :goto_30

    :catch_2b
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Process;

    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    .line 3
    :goto_30
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_4c

    if-nez v2, :cond_43

    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    :cond_43
    const-string v1, "Unexpected Termination!"

    invoke-virtual {v2, v1}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    move-object v2, v0

    goto :goto_30

    :cond_4c
    return-void

    :cond_4d
    iget-object v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    :cond_55
    const-string v5, "F*D^W@#FGF"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x1

    if-lez v5, :cond_74

    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "Value too large for defined data type"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_6f

    iput-boolean v6, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    :cond_6f
    iget v8, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v2, v8, v7}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    :cond_74
    if-ltz v5, :cond_a0

    .line 5
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v7, v5, v6

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    if-ne v7, v3, :cond_a0

    const/4 v4, 0x2

    aget-object v4, v5, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 6
    monitor-enter v2

    :try_start_90
    iput v4, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びぐびあび:I

    iput-boolean v6, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2

    add-int/lit8 v3, v3, 0x1

    move-object v2, v0

    goto/16 :goto_4

    :catchall_9d
    move-exception p0

    monitor-exit v2
    :try_end_9f
    .catchall {:try_start_90 .. :try_end_9f} :catchall_9d

    throw p0

    .line 7
    :cond_a0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "Value too large for defined data type"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_ad

    iput-boolean v6, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    :cond_ad
    iget v5, v2, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v2, v5, v4}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    goto/16 :goto_4
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-object v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_d
    move-exception v1

    monitor-exit v0
    :try_end_f
    .catchall {:try_start_4 .. :try_end_f} :catchall_d

    throw v1
.end method

.method public ぉひのべい(Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;)Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
    .registers 4

    iget-boolean v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_22

    iget-object v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    monitor-enter v0

    :try_start_7
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1
    iput-object p0, p1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    iput v1, p1, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->づざかべべ:I

    .line 2
    iget-object v1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-object p1

    :catchall_1f
    move-exception p1

    monitor-exit v0
    :try_end_21
    .catchall {:try_start_7 .. :try_end_21} :catchall_1f

    throw p1

    :cond_22
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unable to add commands to a closed shell"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
