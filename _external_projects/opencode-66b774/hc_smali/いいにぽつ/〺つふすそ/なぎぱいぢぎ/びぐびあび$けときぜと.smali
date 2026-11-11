.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3051\u3068\u304d\u305c\u3068"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;->げつ〴ぬぐ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;->げつ〴ぬぐ:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 3

    .line 1
    iget-object p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    .line 2
    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 3
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
