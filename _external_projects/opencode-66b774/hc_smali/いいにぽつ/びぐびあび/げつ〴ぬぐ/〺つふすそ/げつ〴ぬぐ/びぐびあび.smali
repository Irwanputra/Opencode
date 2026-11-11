.class public Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/びぐびあび;
.super Ljava/io/BufferedWriter;
.source ""


# instance fields
.field public 〺つふすそ:[C


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .registers 2

    invoke-direct {p0, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    const/16 p1, 0x40

    new-array p1, p1, [C

    iput-object p1, p0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[C

    const-string p1, "line.separator"

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_14

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    :cond_14
    return-void
.end method


# virtual methods
.method public じぜこほぱ(Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ;)V
    .registers 8

    check-cast p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;

    const-string v0, "-----BEGIN CERTIFICATE-----"

    .line 1
    invoke-virtual {p0, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V

    .line 2
    iget-object v0, p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3a

    .line 4
    iget-object v0, p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/List;

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    const-string v2, ": "

    invoke-virtual {p0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V

    goto :goto_18

    :cond_37
    invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V

    .line 6
    :cond_3a
    iget-object p1, p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:[B

    .line 7
    sget-object v0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Lいいにぽつ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :try_start_4a
    sget-object v0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Lいいにぽつ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    array-length v2, p1

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v2, v1}, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ([BIILjava/io/OutputStream;)I
    :try_end_51
    .catch Ljava/io/IOException; {:try_start_4a .. :try_end_51} :catch_81

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const/4 v0, 0x0

    .line 8
    :goto_56
    array-length v1, p1

    if-ge v0, v1, :cond_78

    const/4 v1, 0x0

    :goto_5a
    iget-object v2, p0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[C

    array-length v4, v2

    if-eq v1, v4, :cond_6d

    add-int v4, v0, v1

    array-length v5, p1

    if-lt v4, v5, :cond_65

    goto :goto_6d

    :cond_65
    aget-byte v4, p1, v4

    int-to-char v4, v4

    aput-char v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5a

    :cond_6d
    :goto_6d
    invoke-virtual {p0, v2, v3, v1}, Ljava/io/BufferedWriter;->write([CII)V

    invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V

    iget-object v1, p0, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[C

    array-length v1, v1

    add-int/2addr v0, v1

    goto :goto_56

    :cond_78
    const-string p1, "-----END CERTIFICATE-----"

    .line 9
    invoke-virtual {p0, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V

    return-void

    :catch_81
    move-exception p1

    .line 10
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception encoding base64 string: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_9a

    :goto_99
    throw v0

    :goto_9a
    goto :goto_99
.end method
