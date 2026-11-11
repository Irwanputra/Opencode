.class public final Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "TT;",
            "Ljava/util/ArrayList<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045<",
            "Ljava/util/ArrayList<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final びぐびあび:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;-><init>(I)V

    iput-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;

    new-instance v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->びぐびあび:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final 〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/util/ArrayList<",
            "TT;>;",
            "Ljava/util/HashSet<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_2c

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_20
    if-ge v1, v2, :cond_2c

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3, p2, p3}, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    :cond_2c
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_33
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_3c

    :goto_3b
    throw p1

    :goto_3c
    goto :goto_3b
.end method

.method public げつ〴ぬぐ(Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    .line 1
    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_13

    .line 2
    iget-object v0, p0, Lづざかべべ/ぁごぐすすぃ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    return-void
.end method
