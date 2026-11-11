.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u305b\u3065\u3063\u3038\u3061\u306d"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;->げつ〴ぬぐ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;->げつ〴ぬぐ:Ljava/util/regex/Pattern;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":matches(%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 3

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;->げつ〴ぬぐ:Ljava/util/regex/Pattern;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->せづっ〸ちね()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    return p1
.end method
