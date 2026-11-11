.class public Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

.field public 〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Ljava/nio/charset/Charset;

.field public づざかべべ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/nio/charset/CharsetEncoder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->ぁごぐすすぃ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/ThreadLocal;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iput v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    sget-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

    const-string v0, "UTF8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 1
    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/nio/charset/Charset;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Ljava/nio/charset/CharsetEncoder;
    .registers 4

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "US-ASCII"

    .line 1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    sget-object v1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

    goto :goto_2b

    :cond_1e
    const-string v2, "UTF-"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_29

    sget-object v1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

    goto :goto_2b

    :cond_29
    sget-object v1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;->びぐびあび:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

    .line 2
    :goto_2b
    iput-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

    return-object v0
.end method

.method public げつ〴ぬぐ()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;
    .registers 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;
    :try_end_6
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_6} :catch_22

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 2
    iput-object v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/nio/charset/Charset;

    .line 3
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->valueOf(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    move-result-object v1

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    return-object v0

    :catch_22
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
